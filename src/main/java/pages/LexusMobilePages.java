package pages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverFactory;
import utilities.ReportConfiguration;

import java.util.HashMap;
import java.util.List;

public class LexusMobilePages {

    public static  WebDriver driver=null;
    ReportConfiguration report=new ReportConfiguration();
    BasePage basePage = new BasePage();
    public static int redemptionsRemaining;
    public static String selectedBookingLocation;
    public static String selectedTimeAndDate;
    public static String selectedVehicleModel;

    public LexusMobilePages(){
        driver= DriverFactory.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private static String email=System.getProperty("Email");
    private static String password=System.getProperty("Password");
    private static String startDate=System.getProperty("StartDate");
    private static String endDate=System.getProperty("EndDate");

    @AndroidFindBy(accessibility = "BtnSignIn_Container")
    private MobileElement SignInButton;

    @AndroidFindBy(accessibility = "BtnRegister_Container")
    private MobileElement RegisterButton;

    @AndroidFindBy(className = "android.widget.EditText")
    private MobileElement UserName;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    private MobileElement PassWord;

    @AndroidFindBy(className = "android.widget.Button")
    private MobileElement LoginButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private MobileElement ONDEMANDImage;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[3]")
    private  MobileElement RedemptionsRemaining;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup)[15]")
    private  MobileElement LoanPeriodDatePicker;

    @AndroidFindBy(xpath = "(//android.widget.Button)[1]")
    private MobileElement CollectTimeExpandButton;

    @AndroidFindBy(xpath = "(//android.widget.Button)[2]")
    private MobileElement ReturnTimeExpandButton;

    @AndroidFindBy(xpath = "(//android.widget.ImageView)[5]")
    private MobileElement NextMonthNavigationLink;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[5]")
    private  MobileElement CollectAndReturnLocation;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[7]")
    private MobileElement TimeAndDateValue;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[9]")
    private MobileElement VehicleSelectionValue;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup/android.widget.ImageView)[3]")
    private MobileElement FirstBooking;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    private MobileElement CardHolderName;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    private MobileElement CardNumber;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
    private MobileElement CardExpiryDetails;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[4]")
    private MobileElement CardCVCDetails;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[5]")
    private MobileElement POSTCODE;

    //Mobile Elements related to Register Page
    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    private MobileElement FirstName;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    private MobileElement LastName;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
    private MobileElement Email;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[4]")
    private MobileElement MobilePhone;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    private MobileElement SetPassword;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    private MobileElement ConfirmPassword;

    @AndroidFindBy(xpath = "//android.widget.Button")
    private MobileElement AcceptTermsButton;

    @AndroidFindBy(xpath = "//android.widget.Button")
    private MobileElement SignOutButton;

    /*****************************************/
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView")
    private MobileElement ValetParkingSlotsWidget;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]")
    private List<MobileElement> ValetParkingSlots;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"ENCORE\"]")
    private MobileElement ENCOREButton;

    @AndroidFindBy(xpath =" //android.widget.FrameLayout[@content-desc=\"VEHICLES\"]/android.widget.ImageView")
    private MobileElement VEHICLESButton;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup/android.widget.ImageView)[3]")
    private MobileElement ValetParkingImage;

    @AndroidFindBy(className = "android.widget.Button")
    private MobileElement GetStarted;

    @AndroidFindBy(xpath = "(//android.widget.ImageButton)[1]")
    private MobileElement CloseButton;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup/android.widget.TextView)[7]")
    private MobileElement ValetBalance;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[4]/android.view.ViewGroup[1]")
    private  MobileElement ExclusiveOffersLink;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    private  MobileElement FirstOffer;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    private  MobileElement SecondOffer;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private MobileElement MoreButton1;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private MobileElement MoreButton2;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private MobileElement MoreButton3;

    @AndroidFindBy(id = "com.sec.android.app.sbrowser:id/customtab_close")
    private MobileElement EncoreLinksCloseButton;

    @AndroidFindBy(xpath="(//android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[1])[1]")
    private  MobileElement BackButton;

    public void clickOnText(String text){
        try{
            WebElement element = driver.findElement(
                    MobileBy.AndroidUIAutomator("text(\""+text+"\")"));
            element.click();
            report.log("Clicked on->"+text);
        }catch (Exception e){
            report.logResult("Failed to click On Text"+text, LogStatus.FAIL);
        }
    }

    public WebElement getElementWithText(String text){
        List<WebElement> elements = null;
        try{
            elements = driver.findElements(
                    MobileBy.AndroidUIAutomator("text(\""+text+"\")"));
            if(elements.size()>0){
                report.logResult("Elements found with text:"+text, LogStatus.PASS);
            }else{
                report.logResult("No elements found with text:"+text, LogStatus.FAIL);
            }
        }catch (Exception e){
            report.logResult("Failed to get Element With Text", LogStatus.FAIL);
        }
        return elements.get(0);
    }

    public void validateTextOnPage(String text) {
        try{
            WebElement element = driver.findElement(
                    MobileBy.AndroidUIAutomator("text(\""+text+"\")"));
            if(basePage.checkElementExists(element)){
                report.logResult("Validated ->"+text+"-text in Lexus App",LogStatus.PASS);
            }else{
                report.logResult("Failed to validate text->"+text, LogStatus.FAIL);
            }
        }catch (Exception e){
            report.logResult("Failed to validate text->"+text+" \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public boolean checkTextVisibleOnPage(String text){
        try{
            WebElement element = driver.findElement(
                    MobileBy.AndroidUIAutomator("text(\""+text+"\")"));
            report.log("Element is visible with text->"+text);
            return true;
        }catch (Exception e){
            report.log("Element is not visible with text->"+text);
            return false;
        }
    }

    public void scrollToElementByText(String text) {
         driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)." +
                "instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))"));
         //old code for scrolling to text
        // driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
        //                        ".scrollIntoView(new UiSelector().text(\"" + visibleText + "\"));"));
    }

    public void scrollDownInAndroidApp(){
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
    }

    public void handleUpdateAvailableAlert() {
        try{
            basePage.waitForSeconds(4);
            if(checkTextVisibleOnPage("Update available")){
                validateTextOnPage("Later");
                report.takeScreenshot(driver,"Update available Alert");
                clickOnText("Later");
                report.log("Update available Alert handled");
            }
        }catch (Exception e){
            report.logResult("Failed to handle Update Available Alert\n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void verifyLaunchPage() {
        try{
            basePage.waitForSeconds(5);
            validateTextOnPage("DISCOVER");
            validateTextOnPage("THE WORLD");
            validateTextOnPage("OF LEXUS");
            report.takeScreenshot(driver,"Launch page elements verified successfully");
        }catch (Exception e){
            report.logResult("Failed to verify Launch page elements  \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void verifyLoginPage() {
        try{
            basePage.waitForSeconds(5);
            validateTextOnPage("SIGN IN");
            basePage.checkElementExists(UserName);
            basePage.checkElementExists(PassWord);
            validateTextOnPage("Forgot password?");
            validateTextOnPage("Not registered yet?");
            basePage.checkElementExists(LoginButton);
            report.takeScreenshot(driver,"Sign In page elements verified successfully");
        }catch (Exception e){
            report.logResult("Failed to verify Sign In page elements \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void login() {
        try{
            if(System.getProperty("Environment").equalsIgnoreCase("QA")){
                loginNewVersion();//For QA versions --Forgerock migration in QA
            }else {
                loginToOldVersionAPP(); //for Alpha & Prod versions
            }
        }catch (Exception e){
            report.logResult("Failed to sign In into Mobile App, \n Exception:"+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void loginNewVersion(){
        try{
            if(basePage.checkElementExists(SignInButton)){
                basePage.click(SignInButton);
                basePage.waitForSeconds(5);
                report.takeScreenshot(driver,"Login Screen");
                ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.TAB));
                ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.TAB));
                //Enter Username
                ((AndroidDriver<?>) driver).getKeyboard().sendKeys(email);
                report.log("Entered username as-"+email);
                ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.TAB));
                //Enter Password
                ((AndroidDriver<?>) driver).getKeyboard().sendKeys(password);
                report.log("Entered password as-"+password);
                ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.TAB));
                ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.TAB));
                ((AndroidDriver<?>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
                basePage.waitForSeconds(10);
            }else if(checkTextVisibleOnPage("ON DEMAND")) {
                   report.log("Already Logged In, Please check & log out");
            }
//           if(checkTextVisibleOnPage("ON DEMAND")){
//               report.takeScreenshot(driver,"Home Page");
//           }else{
//               report.logResult("Failed to sign In into Mobile App", LogStatus.FAIL);
//           }
        }catch (Exception e){
            report.logResult("Failed to sign In into Mobile App, \n Exception:"+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void loginToOldVersionAPP() {
        try{
            basePage.click(SignInButton);
            basePage.waitForSeconds(5);
            basePage.enterText(UserName,email);
            basePage.enterText(PassWord,password);
            report.takeScreenshot(driver,"Sign In Page with username & password");
            basePage.click(LoginButton);
            basePage.waitForSeconds(5);
            report.takeScreenshot(driver,"Sign In Successful");
        }catch (Exception e){
            report.logResult("Failed to sign In into Mobile App, \n Exception:"+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void navigateToEncorePage() {
        try{
            basePage.click(ENCOREButton);
            validateTextOnPage("VIEW BOOKINGS");
            report.takeScreenshot(driver,"Encore Page");
        }catch (Exception e){
            report.logResult("Failed to navigate To EncorePage \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void navigateToMorePage() {
        try{
            basePage.waitForSeconds(5);
            clickOnText("MORE");
            basePage.waitForSeconds(2);
            report.takeScreenshot(driver,"More Details Page1");
        }catch (Exception e){
            report.logResult("Failed to navigate To More Page \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void navigateToOnDemandBooking() {
        try{
            //validateTextOnPage("ON DEMAND");
            //    clickOnText("ON DEMAND");
            basePage.click(ONDEMANDImage);
            basePage.waitForSeconds(5);
            report.takeScreenshot(driver,"Lexus ON DEMAND Page");

            basePage.waitForSeconds(5);
            validateTextOnPage("REDEMPTIONS REMAINING");
            redemptionsRemaining = Integer.parseInt(basePage.getText(RedemptionsRemaining));
            report.log("Redemptions Remaining->"+redemptionsRemaining);

            validateTextOnPage("LOAN A LEXUS VEHICLE");
            validateTextOnPage("Encore Platinum members can loan an additional Lexus for up to 8 days at no cost.*");
            validateTextOnPage("MORE INFORMATION");
            report.logResult("Validated texts on -OnDemand Booking Page-",LogStatus.PASS);
            report.takeScreenshot(driver,"OnDemand Booking Page with REDEMPTIONS REMAINING");
        }catch (Exception e){
            report.logResult("Failed to navigate To OnDemand Booking Page  \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void navigateToMyBookings() {
        try{
            validateTextOnPage("MY BOOKINGS");
            clickOnText("MY BOOKINGS");
            basePage.waitForSeconds(2);
            validateTextOnPage("ENCORE BOOKINGS");
            report.takeScreenshot(driver,"ENCORE BOOKINGS PAGE");
            if(checkTextVisibleOnPage("Upcoming")){
                report.logResult("Current Bookings Exists",LogStatus.PASS);
            }else{
                report.logResult("No Current Bookings Exists",LogStatus.FAIL);
            }
        }catch (Exception e){
            report.logResult("Failed to navigate To My Bookings Section: Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void bookingVehicle() {
        try{
            validateTextOnPage("BOOK A VEHICLE");
            clickOnText("BOOK A VEHICLE");
            basePage.waitForSeconds(5);
            report.takeScreenshot(driver,"BOOK A VEHICLE Page");
            validateTextOnPage("Complete each section below to finalise your booking:");

            // Select Location
            clickOnText("Please Select");
            validateTextOnPage("Select a region to view locations.");
            validateTextOnPage("Vehicle availability varies by Australian state, not by collection location.");
            report.takeScreenshot(driver,"Select Location page");
            clickOnText("NSW");
            WebElement selectElement = getElementWithText("SELECT");
            basePage.click(selectElement);
            basePage.waitForSeconds(3);
            selectedBookingLocation= basePage.getText(CollectAndReturnLocation);
            report.logResult("Selected Collect And Return Location->"+selectedBookingLocation,LogStatus.PASS);
            report.takeScreenshot(driver,"Vehicle Collect And Return Location Selected");

            //Select Time And Date
            clickOnText("Please Select");
            basePage.waitForSeconds(3);
            validateTextOnPage("The maximum loan period is 8 days, including collection day");
            basePage.click(LoanPeriodDatePicker);
            basePage.click(NextMonthNavigationLink);
            clickOnText(startDate);//Start Date
            clickOnText(endDate);//End Date
            basePage.waitForSeconds(3);

            basePage.click(CollectTimeExpandButton);
            clickOnText("11:00AM");//Collect Time
            basePage.click(ReturnTimeExpandButton);
            clickOnText("11:30AM");//Return Time
            clickOnText("CONTINUE");
            basePage.waitForSeconds(3);
            selectedTimeAndDate= basePage.getText(TimeAndDateValue);
            report.logResult("Selected Time And Date->"+selectedTimeAndDate,LogStatus.PASS);
            report.takeScreenshot(driver,"Selected- Time And Date for booking");

            //VEHICLE Selection
            clickOnText("Please Select");
            report.takeScreenshot(driver,"VEHICLE Selection Page1");
            validateTextOnPage("Which vehicle would you like to drive?");
            scrollToElementByText("SELECT");
            report.takeScreenshot(driver,"VEHICLE Selection Page2");
            selectElement = getElementWithText("SELECT");
            basePage.click(selectElement);
            basePage.waitForSeconds(3);
            selectedVehicleModel= basePage.getText(VehicleSelectionValue);
            report.logResult("Selected Vehicle->"+selectedVehicleModel,LogStatus.PASS);
            report.takeScreenshot(driver,"Selected- Vehicle Model for booking");

            scrollToElementByText("CONTINUE");
            clickOnText("CONTINUE");

            clickOnText("CONTINUE");
            basePage.waitForSeconds(10);
            report.takeScreenshot(driver,"TERMS AND CONDITIONS Page");
            validateTextOnPage("TERMS AND CONDITIONS");

            clickOnText("ACCEPT & COMPLETE BOOKING");
            basePage.waitForSeconds(10);
            validateTextOnPage("BOOKING SUCCESS");
            report.takeScreenshot(driver,"Vehicle booking success");
            clickOnText("BACK TO ENCORE");
            basePage.waitForSeconds(10);
            report.takeScreenshot(driver,"ENCORE Home Page");
            report.logResult("OnDemand Booking Page With details",LogStatus.PASS);
        }catch (Exception e){
            report.logResult("Failed in Booking Vehicle Page \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void addCardDetails(){
        try{
            //Add payment details-->Provide Dummy Card details
            clickOnText("Add credit or debit card");
            basePage.waitForSeconds(3);
            basePage.enterText(CardHolderName,"Testing");
            basePage.enterText(CardNumber,"4242424242424242");
            basePage.click(CardExpiryDetails);
            basePage.enterText(CardExpiryDetails,"0223");
            basePage.click((CardCVCDetails));
            basePage.enterText(CardCVCDetails,"158");
            basePage.click((POSTCODE));
            basePage.enterText(POSTCODE,"3000");
            ((AppiumDriver)driver).hideKeyboard();
            report.takeScreenshot(driver,"Provided- Payment details for booking");
            clickOnText("ADD TO ACCOUNT");
        }catch (Exception e){
            report.logResult("Failed to add Card Details \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void logOut() {
        try{
            basePage.waitForSeconds(2);
            scrollToElementByText("SIGN OUT");
            report.takeScreenshot(driver,"More Details Page2");
            basePage.click(SignOutButton);
            basePage.waitForSeconds(4);
            validateTextOnPage("DISCOVER");
            report.takeScreenshot(driver,"Sign In Page");
            report.logResult("Successfully Logged out from Mobile App",LogStatus.PASS);
        }catch (Exception e){
            report.logResult("Failed to logOut from Lexus Mobile App \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void register() {
        try{
            validateTextOnPage("REGISTER");
            clickOnText("REGISTER");
            basePage.enterText(FirstName,"Automation");
            basePage.enterText(LastName,"Test");
            basePage.enterText(Email,"testLast@mailinator.com");
            basePage.enterText(MobilePhone,"0444444444");

            clickOnText("CONTINUE");
            basePage.enterText(SetPassword,"Test12345!");
            basePage.enterText(ConfirmPassword,"Test12345!");
            ((AppiumDriver)driver).hideKeyboard();
            basePage.waitForSeconds(4);
            basePage.click(AcceptTermsButton);
            report.logResult("Successfully Registered User",LogStatus.PASS);
        }catch (Exception e){
            report.logResult("Failed to register user:  Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void validateBookingDetails() {
        try{
            basePage.click(FirstBooking);
            basePage.waitForSeconds(4);
            report.takeScreenshot(driver,"View Booking Page");
            scrollToElementByText("CANCEL BOOKING");
            report.takeScreenshot(driver,"After scrolling down -Current Booking  Record Page");
        }catch (Exception e){
            report.logResult("Failed to validate Booking Details \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void cancelBooking() {
        try{
           List<WebElement> bookingsList= driver.findElements(MobileBy.xpath("//android.widget.TextView[1]"));
           if(bookingsList.size()>2){
               bookingsList.get(2).click();
               basePage.waitForSeconds(3);
               report.takeScreenshot(driver,"Current Booking  Record Page");
               scrollToElementByText("CANCEL BOOKING");
               report.takeScreenshot(driver,"After scrolling down -Current Booking  Record Page");
               clickOnText("CANCEL BOOKING");
               basePage.waitForSeconds(3);
               scrollToElementByText("YES");
               clickOnText("YES");
               basePage.waitForSeconds(7);
               report.takeScreenshot(driver,"Cancel Booking Submitted");
               validateTextOnPage("RESERVATION CANCELLED");
               clickOnText("BACK TO ALL BOOKINGS");
               basePage.waitForSeconds(5);
               report.takeScreenshot(driver,"Encore Bookings Page");
           }else{
               report.logResult("No Booking Exists to Cancel, Please check ", LogStatus.FAIL);
           }
         }catch (Exception e){
            report.logResult("Failed to Cancel Booking: Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void navigateToValetParking() {
        try{
            basePage.click(ENCOREButton);
            basePage.waitForSeconds(4);
            report.takeScreenshot(driver,"Encore Page");
            basePage.click(ValetParkingImage);
            if(basePage.checkElementExists(GetStarted)){
                report.takeScreenshot(driver,"GetStarted page details");
                basePage.click(GetStarted);
            }
        }catch (Exception e){
            report.logResult("Failed to navigate To Valet Parking \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void validateValetParkingAvailability() {
        try{
            report.takeScreenshot(driver,"Valet parking location page");
           validateTextOnPage("VALET PARKING");
           validateTextOnPage("MORE INFO");
           if(basePage.checkElementExists(ValetParkingSlotsWidget)) {
               report.logResult("ValetParkingSlots are available",LogStatus.PASS);
               List<MobileElement> slotElements = ValetParkingSlots;
               int i=0;
               while(i<slotElements.size()){
                   report.log("Valet parking location:"+slotElements.get(i).getText());
                   slotElements.get(i).click();
                   basePage.waitForSeconds(2);
                   report.takeScreenshot(driver,"Valet location page details");
                   driver.navigate().back();
                   basePage.waitForSeconds(2);
                   i++;
               }
           }else{
               report.logResult("ValetParkingSlots are not available",LogStatus.FAIL);
           }
        }catch (Exception e){
            report.logResult("Failed to validate Valet Parking Availability \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void checkValetBalance() {
        try{
            basePage.click(ENCOREButton);
            validateTextOnPage("VIEW BOOKINGS");
            String valetBalance = basePage.getText(ValetBalance);
            report.logResult("Valet Balance->"+valetBalance, LogStatus.PASS);
            report.takeScreenshot(driver,"Encore Page with Valet Balance");
        }catch (Exception e){
            report.logResult("Failed to check Valet Balance \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void navigateToForYouSection() {
        try{
            scrollToElementByText("FOR YOU");
            report.takeScreenshot(driver,"Home Page");
            if(basePage.checkElementExists(ExclusiveOffersLink)){
                basePage.click(ExclusiveOffersLink);
                basePage.waitForSeconds(2);
                report.takeScreenshot(driver,"Home Page-ExclusiveOffersLink");
                validateTextOnPage("EXPLORE ALL FOR YOU");
                clickOnText("EXPLORE ALL FOR YOU");
                basePage.waitForSeconds(5);
                validateTextOnPage("FOR YOU");
                validateTextOnPage("LOCATION");
                validateTextOnPage("INTERESTS");
                report.takeScreenshot(driver,"Exclusive Offers Page");
            }
        }catch (Exception e){
            report.logResult("Failed to navigate To For You Section:\n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void validateExclusiveOffers() {
        try{
            basePage.click(FirstOffer);
            basePage.waitForSeconds(3);
            report.takeScreenshot(driver,"First offers page details");
            driver.navigate().back();
            basePage.click(SecondOffer);
            basePage.waitForSeconds(3);
            report.takeScreenshot(driver,"Second offers page details");
            driver.navigate().back();
            basePage.waitForSeconds(3);
//            scrollDownInAndroidApp();
            report.takeScreenshot(driver,"Exclusive Offers Page");
        }catch (Exception e){
            report.logResult("Failed to validate Exclusive Offers \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void validateCaltexPage() {
        try{
            scrollToElementByText("SAVE 5¢ PER LITRE ON FUEL");
            clickOnText("SAVE 5¢ PER LITRE ON FUEL");
            basePage.waitForSeconds(2);
            report.takeScreenshot(driver,"CALTEX Page");
            driver.navigate().back();
            basePage.waitForSeconds(2);
        }catch (Exception e){
            report.logResult("Failed to validate Caltex Page \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void validateEncorePageLinks() {
        try{
            scrollToElementByText("LEXUS SERVICE EXPERIENCE");
            validateTextOnPage("CAPPED PRICE SERVICING");
            validateTextOnPage("SERVICE LOAN CAR");
            validateTextOnPage("DRIVECARE");
            report.takeScreenshot(driver,"LEXUS SERVICE EXPERIENCE Page");
            basePage.click(MoreButton1);
            basePage.waitForSeconds(4);
            report.takeScreenshot(driver,"CAPPED PRICE SERVICING Page");
            basePage.click(EncoreLinksCloseButton);

            basePage.click(MoreButton2);
            basePage.waitForSeconds(4);
            report.takeScreenshot(driver,"SERVICE LOAN CAR Page");
            basePage.click(EncoreLinksCloseButton);

            basePage.click(MoreButton3);
            basePage.waitForSeconds(4);
            report.takeScreenshot(driver,"DRIVE CARE Page");
            basePage.click(EncoreLinksCloseButton);
        }catch (Exception e){
            report.logResult("Failed to validate Encore Page Links \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void navigateToVehicleDetailsPage() {
        try{
            basePage.click(VEHICLESButton);
            basePage.waitForSeconds(2);
            validateTextOnPage("VEHICLES");
            report.takeScreenshot(driver,"Vehicle Details Page1");
        }catch (Exception e){
            report.logResult("Failed to navigate To Vehicle Details Page \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void validateVehicleDetailsPage() {
        try{
            validateTextOnPage("REGISTRATION NUMBER");
            validateTextOnPage("FACTORY WARRANTY EXPIRY");
//            scrollToElementByText("BOOK A SERVICE");
//            validateTextOnPage("BOOK A SERVICE");
            scrollToElementByText("VEHICLE DETAILS");
            validateTextOnPage( "VEHICLE DETAILS");
            validateTextOnPage("VIN NUMBER");
            scrollToElementByText("PAINT");
            validateTextOnPage("COMPLIANCE PLATE");
            validateTextOnPage("GRADE");
            validateTextOnPage("PAINT");
            report.takeScreenshot(driver,"Vehicle Details Page2");
        }catch (Exception e){
            report.logResult("Failed to validate Vehicle Details Page \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void validateTextsOnMorePage() {
        try{
            validateTextOnPage("Account Details");
            validateTextOnPage("Communication Preferences");
            validateTextOnPage("Payment Methods");
            validateTextOnPage("Privacy Policy");
            validateTextOnPage("Terms of Use");
            report.takeScreenshot(driver,"More Page Texts Validated");
        }catch (Exception e){
            report.logResult("Failed to validate texts On More Page \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

    public void navigateToTabsInMorePage() {
        try{
            String texts[]={"Account Details","Communication Preferences","Payment Methods","Privacy Policy","Terms of Use"};
            int i=0;
            while(i<texts.length){
                clickOnText(texts[i]);
                basePage.waitForSeconds(3);
                report.takeScreenshot(driver,texts[i]+" Page");
                basePage.click(BackButton);
                i++;
            }
        }catch (Exception e){
            report.logResult("Failed to validate texts On More Page \n Exception : "+e.getMessage(), LogStatus.FAIL);
        }
    }

}
