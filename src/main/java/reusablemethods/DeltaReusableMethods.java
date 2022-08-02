package reusablemethods;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.DeltaPages;
import utilities.DriverFactory;
import utilities.ReportConfiguration;

import static pages.DeltaPages.*;

public class DeltaReusableMethods {
    WebDriver driver=null;
    BasePage basePage=new BasePage();
    ReportConfiguration report=new ReportConfiguration();

    public DeltaReusableMethods(){
        driver= DriverFactory.getDriver();
       DeltaPages deltaPages= new DeltaPages(driver);

    }

    //Reusable Method
    public void navigateToURL(){
        driver.get(DeltaPages.DeltaURL);
        basePage.waitForSeconds(3);
        report.takeScreenshot(driver, "Navigated to the Application");
        basePage.waitForSeconds(10);
        if(basePage.checkElementExists(Book)){
            report.logResult("After Navigating to the Application", LogStatus.PASS);
        }
        else{
            report.logResult("Failed to navigate to the application", LogStatus.FAIL);
        }
    }

    public void signUp(String firstName, String lastName, String month, String date, String year, String gender, String country, String state, String securityquestion1, String securityquestion2){
        try{
            //below step is useful to click/perform any action on web elements with javascript executor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.getElementsByClassName('sign-up')[0].click();");
            report.takeScreenshot(driver, "After clicking on SignUp button");
            //Basic information
            basePage.waitForSeconds(10);
            basePage.enterText(DeltaPages.SignUpPageFirstName, firstName);
            basePage.enterText(DeltaPages.SignUpPageLastName, lastName);
              //dropdown without using select
            basePage.click(DeltaPages.Month);
            basePage.waitForSeconds(1);
            WebElement monthValue= driver.findElement(By.xpath("//li[contains(text(), '"+month+"')]"));
            basePage.click(monthValue);
            basePage.waitForSeconds(1);
            basePage.click(DeltaPages.Date);
            WebElement dateValue=driver.findElement(By.xpath("//li[@id='dateoption-"+date+"']"));
            basePage.click(dateValue);
            basePage.waitForSeconds(1);
            basePage.click(DeltaPages.Year);
            WebElement yearValue=driver.findElement(By.xpath("//li[@data-value="+year+"]"));
            basePage.click(yearValue);
            basePage.waitForSeconds(1);
            basePage.click(DeltaPages.Gender);
            WebElement selectGender=driver.findElement(By.xpath("//li[@id='genderoption-"+gender+"']"));
            basePage.click(selectGender);
            report.takeScreenshot(driver,"All mandatory fields of Basic Info is Entered");
            basePage.click(DeltaPages.NextButtonOfBasicInfo);
            basePage.waitForSeconds(1);
            //Contact information
            basePage.click(DeltaPages.CountryOrRegion);
            WebElement countryName=driver.findElement(By.xpath("//li[@data-label='"+country+"']"));
            basePage.click(countryName);
            basePage.waitForSeconds(1);
            basePage.enterText(DeltaPages.Address,"Collins Colony");
            basePage.enterText(DeltaPages.CityName,"Texas");
            basePage.click(DeltaPages.State);
            WebElement stateName=driver.findElement(By.xpath("//li[@data-label='"+state+"']"));
            basePage.click(stateName);
            basePage.enterText(DeltaPages.PostCode,"3000");
            basePage.enterText(DeltaPages.PhoneNumber,"0987654321");
            basePage.enterText(DeltaPages.EmailAddress,"jhon.joe@gmail.com");
            basePage.enterText(DeltaPages.ConfirmEmailAddress,"jhon.joe@gmail.com");
            report.takeScreenshot(driver,"All mandatory fields of Contact Info is Entered");
            basePage.click(DeltaPages.NextButtonOfContactInfo);
            //Login information
            basePage.enterText(DeltaPages.Username,"JhonJoe");
            basePage.enterText(DeltaPages.Password,"Jhon@1234");
            basePage.enterText(DeltaPages.ConfirmPassword,"Jhon@1234");
            basePage.click(DeltaPages.SecurityQuestion1);
            WebElement securityQue1=driver.findElement(By.xpath("//li[@id='securityQs1option-"+securityquestion1+"']"));
            basePage.click(securityQue1);
            basePage.enterText(DeltaPages.SecurityAnswer1,"Dove");
            basePage.click(DeltaPages.SecurityQuestion2);
            WebElement securityQue2=driver.findElement(By.xpath("//li[@id='securityQs2option-"+securityquestion2+"']"));
            basePage.click(securityQue2);
            basePage.enterText(DeltaPages.SecurityAnswer2,"ZPHS");
            report.takeScreenshot(driver,"All mandatory fields of Login Info is Entered");
        }catch (Exception e){
            report.logResult("Failed to signUp application", LogStatus.FAIL);
        }
    }

    public void bookDomesticAirlines(){
        try {
            basePage.click(Book);
            basePage.click(ExploreDestinationTravelRequirementsBanner);
            basePage.waitForSeconds(1);
            report.log("Clicked on Explore Destination Travel Requirements Banner");
            report.takeScreenshot(driver,"Clicked on Explore Destination Travel Requirements Banner");
            basePage.click(USDomestic);
            basePage.waitForSeconds(1);
            basePage.click(OneWayTripType);
            basePage.enterText(Origin,"DAL");
            basePage.enterText(Destination,"MLB");
            basePage.click(VaccinationStatusButton);
            basePage.waitForSeconds(1);

            Actions actions=new Actions(driver);
            actions.sendKeys(Keys.ARROW_DOWN);
            actions.sendKeys(Keys.ARROW_DOWN);
            actions.build().perform();

            actions.sendKeys(Keys.ENTER);
            actions.build().perform();
            basePage.waitForSeconds(1);
            basePage.click(SearchButton);

        }catch (Exception ex){
            report.logResult("Failed To book Domestic airlines"+ex.getMessage(), LogStatus.FAIL);
        }
    }
    public void myTrips(String FindUrTrip){
        try {
            basePage.click(MyTrip);
            basePage.waitForSeconds(3);
            report.takeScreenshot(driver,"Mytrips page");
            basePage.click(DropdownButton);
            basePage.waitForSeconds(3);
            WebElement FindUrTripBySelectOption=driver.findElement(By.xpath("//li[@id='ui-list-searchOption"+FindUrTrip+"']"));
            basePage.waitForSeconds(2);
            basePage.click(FindUrTripBySelectOption);
            report.logResult("clicked on FindYourTripBy", LogStatus.PASS);
            report.takeScreenshot(driver,"Option selected to find the trip");
            basePage.enterText(CheckInNumberEditField,"SFTBOP");
            basePage.enterText(MyTripsPageFirstName,"Jhon");
            basePage.enterText(LastName,"Joe");
            basePage.click(MyTripSubmitButton);
            basePage.waitForSeconds(1);
            report.takeScreenshot(driver,"Finding MyTrips");
            basePage.checkElementExists(MyTripErrorMessage);
            report.log("Error Message Displayed");
            report.takeScreenshot(driver,"Error Message Displayed");
        }catch (Exception ex){
            report.logResult("Failed to check my trips", LogStatus.FAIL);
        }
    }

    public void checkInProcess(String inputType, String inputValue,
                               String lastName, String departureAirportName ){
        try{
            basePage.waitForSeconds(10);
            basePage.click(CheckIn);
            basePage.waitForSeconds(10);
            report.takeScreenshot(driver,"Clicked On Check-In icon");
            basePage.click(DropdownButton);
            basePage.waitForSeconds(2);

            //switch case for all
            switch (inputType){
                case "Confirmation Number":
                    basePage.click(ConfirmationNumberType);
                    break;

                case "CreditCard Number":
                    basePage.click(CreditCardNumberType);
                    basePage.waitForSeconds(2);
                    basePage.enterText(LastName,lastName);
                    break;

                case "Ticket Number":
                    basePage.click(TicketNumberType);
                    break;

                case "SkyMiles Number":
                    basePage.click(SkyMilesNumberType);
                    break;
            }
            //common actions
            basePage.enterText(CheckInNumberEditField,inputValue);
            basePage.click(DepartureAirport);
            basePage.waitForSeconds(1);
            basePage.enterText(SearchCityOrAirportInCheckInProcess,departureAirportName);
            basePage.waitForSeconds(2);
            basePage.click(FirstOptionInDepartureList);
            basePage.waitForSeconds(3);
           // SearchCityOrAirportInCheckInProcess.sendKeys(Keys.ENTER);
            report.takeScreenshot(driver,"Check in Screen with input data");

            //To submit check in Process
            basePage.click(CheckInSubmitButton);
            basePage.waitForSeconds(3);
            report.takeScreenshot(driver,"Check in process result");
        }catch (Exception ex){
            report.logResult("Failed in Check-In Process", LogStatus.FAIL);
        }
    }
}
