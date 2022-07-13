package pages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Configuration;
import utilities.DriverFactory;
import utilities.ReportConfiguration;

import java.util.List;

public class LexusSPAPages {

    public static WebDriver driver=null;
    ReportConfiguration report=new ReportConfiguration();
    BasePage basePage = new BasePage();

    public LexusSPAPages(){
        driver= DriverFactory.getDriver();
        PageFactory.initElements(driver,this);
    }

    //Get SPA URL
    private static String SPAURL= Configuration.getValue(System.getProperty("Environment"));
    private static String email=System.getProperty("Email");
    private static String password=System.getProperty("Password");
    private static String startDate=System.getProperty("StartDate");
    private static String endDate=System.getProperty("EndDate");

    @FindBy(css = ".lxs-login-form ")
    public static WebElement LoginForm;

    @FindBy(className = "lxs-text-field__input-element")
    public static List<WebElement> SignInElements;

    @FindBy(xpath = "//input[@id='gigya-loginID-75511288974477060']")
    public static WebElement EmailTextField;

    @FindBy(xpath = "//input[@id='gigya-password-102973039381416400']")
    public static WebElement PasswordTextField;

    @FindBy(className = "lxs-button--primary")
    public static WebElement SignInButtonOld;

    @FindBy(css = ".lx-signin-button.pos-submit:nth-child(7)")
    public static WebElement SignInButtonNew;

    @FindBy(className = "lxs-logo__image")
    public static WebElement LexusLogoImage;

    @FindBy(css = ".secondary-navigation__main .secondary-navigation-link:nth-child(3)")
    public static WebElement AccountSetting;

    @FindBy(className = "account-settings-desktop__signout-container")
    public static WebElement SignOutButton;

    @FindBy(className = "service-overview-tile-no-caption__content")
    public static List<WebElement> PlatinumBenefitTiles;

    @FindBy(className = "on-demand-landing-left__redemptions-remaining-number-text")
    public static WebElement RedemptionsRemaining;

    @FindBy(className = "on-demand-landing-left__book-vehicle-button")
    public static WebElement BookAVehicleButton;

    @FindBy(className = "on-demand-landing-left__my-bookings-button")
    public static WebElement MyBookingsButton;

    @FindBy(className = "book-vehicle-landing-tile__please-select")
    public static WebElement PleaseSelect;

    @FindBy(className = "booking-location__select")
    public static List<WebElement> SelectLocationsList;

    @FindBy(css = ".DateRangePicker.DateRangePicker_1")
    public static WebElement DatePicker;

    @FindBy(className = "lxs-date-picker-next-button")
    public static WebElement DatePickerNextButton;

    @FindBy(id = "react-select-2-input")
    public static WebElement CollectTime;

    @FindBy(id = "react-select-3-input")
    public static WebElement ReturnTime;

    @FindBy(className = "lxs-button--primary")
    public static WebElement ContinueButton;

    @FindBy(className = "booking-vehicle-select-button")
    public static List<WebElement> SelectVehiclesList;

    public void selectDate(String date) {
        try{
            List<WebElement> elements=driver.findElements(By.xpath("//td[text()='"+date+"']"));
            elements.get(1).click();
        }catch (Exception e){
            report.logResult("Failed to select Date; \nException:"+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void navigateToSPA() {
        try{
            report.log("SPA URL used->"+SPAURL);
            driver.get(SPAURL);
            if(basePage.checkElementExists(LoginForm)){
                report.takeScreenshot(driver,"Navigated To SPA Application");
            }
        }catch (Exception e){
            report.logResult("Failed to navigate To SPA, \n Exception:"+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void spaLogin() {
        try{
          if(System.getProperty("Environment").equalsIgnoreCase("QA")){
              spaLoginOld();
          }else{
              spaLoginNew();
          }
        }catch (Exception e){
            report.logResult("Failed to sign into SPA Application, \n Exception:"+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void spaLoginOld() {
        try{
            basePage.enterText(SignInElements.get(0),email);
            basePage.enterText(SignInElements.get(1),password);
            report.takeScreenshot(driver,"Sign In Page with username & password");
            basePage.click(SignInButtonOld);
            if(basePage.checkElementExists(LexusLogoImage)){
                report.takeScreenshot(driver,"Sign In Successful");
            }else{
                report.logResult("Failed to Sign In",LogStatus.FAIL);
            }
        }catch (Exception e){
            report.logResult("Failed to sign into SPA Application, \n Exception:"+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void spaLoginNew() {
        try{
            basePage.enterText(EmailTextField,email);
            basePage.enterText(PasswordTextField,password);
            basePage.click(SignInButtonNew);
            if(basePage.checkElementExists(LexusLogoImage)){
                report.takeScreenshot(driver,"Sign In Successful");
            }else{
                report.logResult("Failed to Sign In",LogStatus.FAIL);
            }
        }catch (Exception e){
            report.logResult("Failed to navigate To OnDemandBooking in SPA, \n Exception:"+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void spaLogOut() {
        try{
            basePage.click(AccountSetting);
            basePage.click(SignOutButton);
            basePage.waitForSeconds(3);
//            if(basePage.checkElementExists(SignInButton)) {
            report.takeScreenshot(driver, "Logged out from SPA");
           // }
        }catch (Exception e){
            report.logResult("Failed to Log out from SPA, \n Exception:"+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void navigateToOnDemandBooking() {
        try{
            basePage.click(PlatinumBenefitTiles.get(0));
            basePage.validateElementExists(RedemptionsRemaining);
            report.takeScreenshot(driver,"OnDemand Booking Page");
            report.logResult("Redemptions Remaining->"+RedemptionsRemaining.getText(),LogStatus.PASS);
        }catch (Exception e){
            report.logResult("Failed to navigate To OnDemandBooking in SPA, \n Exception:"+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void bookingVehicle() {
        try{
            basePage.click(BookAVehicleButton);
            report.takeScreenshot(driver,"Book A Vehicle Page");

            //COLLECT & RETURN LOCATION
            basePage.click(PleaseSelect);
            report.takeScreenshot(driver,"Select Location Page");
            basePage.click(SelectLocationsList.get(0));

            //Selecting date and time
            basePage.click(PleaseSelect);
            report.takeScreenshot(driver,"Select Date Page");
            basePage.click(DatePicker);
            basePage.click(DatePickerNextButton);
            basePage.waitForSeconds(2);
            selectDate(startDate);
            selectDate(endDate);
            basePage.enterText(CollectTime,"08:00 am");
            CollectTime.sendKeys(Keys.ENTER);
            basePage.enterText(ReturnTime,"08:00 am");
            ReturnTime.sendKeys(Keys.ENTER);
            report.takeScreenshot(driver,"Select Collect & Return Time Page");
            basePage.click(ContinueButton);
            basePage.waitForSeconds(2);

            // Vehicle Selection

            //get the height of the webpage and scroll to the end
            JavascriptExecutor js = (JavascriptExecutor) driver;
           // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            js.executeScript("window.scrollBy(0,1000)");
            basePage.click(PleaseSelect);
            report.takeScreenshot(driver,"Select Vehicle Page");
            basePage.click(SelectVehiclesList.get(0));
            report.takeScreenshot(driver,"BOOK A VEHICLE Page with Details");
            basePage.click(ContinueButton);

            //payment confirmation page
            report.takeScreenshot(driver,"Payment confirmation page");
            basePage.click(ContinueButton);

            //TERMS AND CONDITIONS
            report.takeScreenshot(driver,"TERMS AND CONDITIONS page");
           // basePage.click(ContinueButton);
            basePage.waitForSeconds(5);
            report.takeScreenshot(driver,"OnDemand Booking submitted");
        }catch (Exception e){
            report.logResult("Failed to navigate To OnDemandBooking in SPA, \n Exception:"+e.getMessage(), LogStatus.FAIL);
        }
    }

}
