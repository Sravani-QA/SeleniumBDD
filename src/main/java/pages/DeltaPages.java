package pages;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.DriverFactory;
import utilities.ReportConfiguration;

public class DeltaPages {
   // WebDriver driver;
    public DeltaPages(WebDriver driver){
       // driver= DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }
    public static String DeltaURL="https://www.delta.com/";

    /*Signup Web Elements **/
    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    public static WebElement SignUpButton;
    @FindBy(css = ".firstName .idp-input:nth-child(2)")
    public static WebElement SignUpPageFirstName;
    @FindBy(css = ".lastName .idp-input:nth-child(2)")
    public static WebElement SignUpPageLastName;

    @FindBy(css = ".month .idp-dropdown__arrow")
    public static WebElement Month;

    @FindBy(css = ".date .idp-dropdown__arrow")
    public static WebElement Date;

    @FindBy(css = ".year .idp-dropdown__arrow")
    public static WebElement Year;

    @FindBy(xpath = "//div[@id=\"idp-gender__selected\"]")
    public static WebElement Gender;

    @FindBy(css = "#basic-info-next")
    public static WebElement NextButtonOfBasicInfo;

    @FindBy(xpath = "//div[@id='idp-addresscountry__selected']")
    public static WebElement CountryOrRegion;

    @FindBy(css = ".addressLine1 .idp-input")
    public static WebElement Address;

    @FindBy(css = ".cityLocalityName .idp-input")
    public static WebElement CityName;

    @FindBy(xpath = "//div[@id='idp-countrySubdivisionCode__selected']")
    public static WebElement State;

    @FindBy(css = ".postalCode .idp-input")
    public static WebElement PostCode;

    @FindBy(css = ".phoneNum .idp-input")
    public static WebElement PhoneNumber;

    @FindBy(xpath = "//input[@aria-label='Email Address']")
    public static WebElement EmailAddress;

    @FindBy(xpath = "//input[@aria-label='Confirm Email Address']")
    public static WebElement ConfirmEmailAddress;

    @FindBy(css = "#contact-info-next")
    public static WebElement NextButtonOfContactInfo;

    @FindBy(css = ".userName .idp-input")
    public static WebElement Username;

    @FindBy(css=".passwordText .idp-input")
    public static WebElement Password;

    @FindBy(css = ".confirmPassword .idp-input")
    public static WebElement ConfirmPassword;

    @FindBy(xpath = "//div[@id='idp-securityQs1__selected']")
    public static WebElement SecurityQuestion1;

    @FindBy(css = ".securityAns1 .idp-input")
    public static WebElement SecurityAnswer1;

    @FindBy(css = ".securityQs2 .idp-dropdown")
    public static WebElement SecurityQuestion2;

    @FindBy(css = ".securityAns2 .idp-input")
    public static WebElement SecurityAnswer2;

    /*BooKing Process Web Elements*/
    @FindBy(css = "#headPrimary1")
    public static WebElement Book;

    @FindBy(xpath = "//span[contains(text(),'EXPLORE DESTINATIONS & TRAVEL REQUIREMENTS')]")
    public static WebElement ExploreDestinationTravelRequirementsBanner;

    @FindBy(xpath = "//span[contains(text(),'U.S. Domestic')]")
    public static WebElement USDomestic;

    @FindBy(xpath = "//label[@for='smt-covwidget-checkbox-oneway']")
    public static WebElement OneWayTripType;

    @FindBy(xpath = "//input[@id='smt-combobox-labeledby-origin']")
    public static WebElement Origin;

    @FindBy(xpath = "//input[@id='smt-combobox-labeledby-destination']")
    public static WebElement Destination;

    @FindBy(id = "smt-combobox-labeledby-list-vaccinated")
    public static WebElement VaccinationStatusButton;

    @FindBy(css = ".smt-button")
    public static WebElement SearchButton;

    /*MyTrips Process Web Elements*/
    @FindBy(xpath = "//a[@id='headPrimary3']")
    public static WebElement MyTrip;
    @FindBy(css = ".select-ui-icon.icon-Dropdown-caret")
    public static WebElement DropdownButton;
    @FindBy(css = ".col-lg-3:nth-child(2)>input.form-control")
    public static WebElement CheckInNumberEditField;
    @FindBy(xpath = "//input[@id='firstName']")
    public static WebElement MyTripsPageFirstName;
    @FindBy(xpath = "//input[@id='lastName']")
    public static WebElement LastName;
    @FindBy(xpath = "//button[@id='btn-mytrip-submit']")
    public static WebElement MyTripSubmitButton;
    @FindBy(css = ".mt-flight-lookup > div.mt-flight-lookup-alert_container")
    public static WebElement MyTripErrorMessage;

    //Check-In Process WebElements
    @FindBy(id = "headPrimary2")
    public static WebElement CheckIn;

    @FindBy(xpath = "//li[@id='ui-list-searchType0']")
    public static WebElement ConfirmationNumberType;

    @FindBy(xpath = "//li[@id='ui-list-searchType1']")
    public static WebElement CreditCardNumberType;

    @FindBy(xpath = "//li[@id='ui-list-searchType2']")
    public static WebElement TicketNumberType;

    @FindBy(xpath = "//li[@id='ui-list-searchType3']")
    public static WebElement SkyMilesNumberType;

    @FindBy(xpath = "//a[@id='departureAirportLink']")
    public static WebElement DepartureAirport;
    @FindBy(xpath = "//input[@id='search_input']")
    public static WebElement SearchCityOrAirportInCheckInProcess;

    @FindBy(css = ".airport-list:nth-child(1)>a")
    public static WebElement FirstOptionInDepartureList;

    @FindBy(id="btn-checkin-submit")
    public static WebElement CheckInSubmitButton;
//
//    //Reusable Methods
//    public void navigateToURL(){
//        driver.get(DeltaURL);
//        basePage.waitForSeconds(3);
//        report.takeScreenshot(driver, "Navigated to the Application");
//        if(basePage.checkElementExists(SignUpButton)){
//            report.logResult("After Navigating to the Application", LogStatus.PASS);
//        }
//        else{
//            report.logResult("Failed to navigate to the application", LogStatus.FAIL);
//        }
//    }
//    public void signUp(String firstName, String lastName, String month, String date, String year, String gender, String country, String state, String securityquestion1, String securityquestion2){
//        try{
//            //below step is useful to click/perform any action on web elements with javascript executor
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("document.getElementsByClassName('sign-up')[0].click();");
//            report.takeScreenshot(driver, "After clicking on SignUp button");
//            //Basic information
//            basePage.enterText(SignUpPageFirstName, firstName);
//            basePage.enterText(SignUpPageLastName, lastName);
//              //dropdown without using select
//            basePage.click(Month);
//            basePage.waitForSeconds(1);
//            WebElement monthValue= driver.findElement(By.xpath("//li[contains(text(), '"+month+"')]"));
//            basePage.click(monthValue);
//            basePage.waitForSeconds(1);
//            basePage.click(Date);
//            WebElement dateValue=driver.findElement(By.xpath("//li[@id='dateoption-"+date+"']"));
//            basePage.click(dateValue);
//            basePage.waitForSeconds(1);
//            basePage.click(Year);
//            WebElement yearValue=driver.findElement(By.xpath("//li[@data-value="+year+"]"));
//            basePage.click(yearValue);
//            basePage.waitForSeconds(1);
//            basePage.click(Gender);
//            WebElement selectGender=driver.findElement(By.xpath("//li[@id='genderoption-"+gender+"']"));
//            basePage.click(selectGender);
//            report.takeScreenshot(driver,"All mandatory fields of Basic Info is Entered");
//            basePage.click(NextButtonOfBasicInfo);
//            basePage.waitForSeconds(1);
//            //Contact information
//            basePage.click(CountryOrRegion);
//            WebElement countryName=driver.findElement(By.xpath("//li[@data-label='"+country+"']"));
//            basePage.click(countryName);
//            basePage.waitForSeconds(1);
//            basePage.enterText(Address,"Collins Colony");
//            basePage.enterText(CityName,"Texas");
//            basePage.click(State);
//            WebElement stateName=driver.findElement(By.xpath("//li[@data-label='"+state+"']"));
//            basePage.click(stateName);
//            basePage.enterText(PostCode,"3000");
//            basePage.enterText(PhoneNumber,"0987654321");
//            basePage.enterText(EmailAddress,"jhon.joe@gmail.com");
//            basePage.enterText(ConfirmEmailAddress,"jhon.joe@gmail.com");
//            report.takeScreenshot(driver,"All mandatory fields of Contact Info is Entered");
//            basePage.click(NextButtonOfContactInfo);
//            //Login information
//            basePage.enterText(Username,"JhonJoe");
//            basePage.enterText(Password,"Jhon@1234");
//            basePage.enterText(ConfirmPassword,"Jhon@1234");
//            basePage.click(SecurityQuestion1);
//            WebElement securityQue1=driver.findElement(By.xpath("//li[@id='securityQs1option-"+securityquestion1+"']"));
//            basePage.click(securityQue1);
//            basePage.enterText(SecurityAnswer1,"Dove");
//            basePage.click(SecurityQuestion2);
//            WebElement securityQue2=driver.findElement(By.xpath("//li[@id='securityQs2option-"+securityquestion2+"']"));
//            basePage.click(securityQue2);
//            basePage.enterText(SecurityAnswer2,"ZPHS");
//            report.takeScreenshot(driver,"All mandatory fields of Login Info is Entered");
//        }catch (Exception e){
//            report.logResult("Failed to signUp application", LogStatus.FAIL);
//        }
//    }
//    public void bookDomesticAirlines(){
//        try {
//            basePage.click(Book);
//            basePage.click(ExploreDestinationTravelRequirementsBanner);
//            basePage.waitForSeconds(1);
//            report.log("Clicked on Explore Destination Travel Requirements Banner");
//            report.takeScreenshot(driver,"Clicked on Explore Destination Travel Requirements Banner");
//            basePage.click(USDomestic);
//            basePage.waitForSeconds(1);
//            basePage.click(OneWayTripType);
//            basePage.enterText(Origin,"DAL");
//            basePage.enterText(Destination,"MLB");
//            basePage.click(VaccinationStatusButton);
//            basePage.waitForSeconds(1);
//
//            Actions actions=new Actions(driver);
//            actions.sendKeys(Keys.ARROW_DOWN);
//            actions.sendKeys(Keys.ARROW_DOWN);
//            actions.build().perform();
//
//            actions.sendKeys(Keys.ENTER);
//            actions.build().perform();
//            basePage.waitForSeconds(1);
//            basePage.click(SearchButton);
//
//        }catch (Exception ex){
//            report.logResult("Failed To book Domestic airlines"+ex.getMessage(), LogStatus.FAIL);
//        }
//    }
//    public void myTrips(String FindUrTrip){
//        try {
//            basePage.click(MyTrip);
//            basePage.waitForSeconds(3);
//            report.takeScreenshot(driver,"Mytrips page");
//            basePage.click(DropdownButton);
//            basePage.waitForSeconds(3);
//            WebElement FindUrTripBySelectOption=driver.findElement(By.xpath("//li[@id='ui-list-searchOption"+FindUrTrip+"']"));
//            basePage.waitForSeconds(2);
//            basePage.click(FindUrTripBySelectOption);
//            report.logResult("clicked on FindYourTripBy", LogStatus.PASS);
//            report.takeScreenshot(driver,"Option selected to find the trip");
//            basePage.enterText(CheckInNumberEditField,"SFTBOP");
//            basePage.enterText(MyTripsPageFirstName,"Jhon");
//            basePage.enterText(LastName,"Joe");
//            basePage.click(MyTripSubmitButton);
//            basePage.waitForSeconds(1);
//            report.takeScreenshot(driver,"Finding MyTrips");
//            basePage.checkElementExists(MyTripErrorMessage);
//            report.log("Error Message Displayed");
//            report.takeScreenshot(driver,"Error Message Displayed");
//        }catch (Exception ex){
//            report.logResult("Failed to check my trips", LogStatus.FAIL);
//        }
//    }
//    public void checkInProcess(String inputType, String inputValue,
//                               String lastName, String departureAirportName ){
//        try{
//            basePage.waitForSeconds(10);
//            basePage.click(CheckIn);
//            basePage.waitForSeconds(10);
//            report.takeScreenshot(driver,"Clicked On Check-In icon");
//            basePage.click(DropdownButton);
//            basePage.waitForSeconds(2);
//
//            //switch case for all
//            switch (inputType){
//                case "Confirmation Number":
//                    basePage.click(ConfirmationNumberType);
//                    break;
//
//                case "CreditCard Number":
//                    basePage.click(CreditCardNumberType);
//                    basePage.waitForSeconds(2);
//                    basePage.enterText(LastName,lastName);
//                    break;
//
//                case "Ticket Number":
//                    basePage.click(TicketNumberType);
//                    break;
//
//                case "SkyMiles Number":
//                    basePage.click(SkyMilesNumberType);
//                    break;
//            }
//            //common actions
//            basePage.enterText(CheckInNumberEditField,inputValue);
//            basePage.click(DepartureAirport);
//            basePage.waitForSeconds(1);
//            basePage.enterText(SearchCityOrAirportInCheckInProcess,departureAirportName);
//            basePage.waitForSeconds(2);
//            basePage.click(FirstOptionInDepartureList);
//            basePage.waitForSeconds(3);
//           // SearchCityOrAirportInCheckInProcess.sendKeys(Keys.ENTER);
//            report.takeScreenshot(driver,"Check in Screen with input data");
//
//            //To submit check in Process
//            basePage.click(CheckInSubmitButton);
//            basePage.waitForSeconds(3);
//            report.takeScreenshot(driver,"Check in process result");
//        }catch (Exception ex){
//            report.logResult("Failed in Check-In Process", LogStatus.FAIL);
//        }
//    }
}
