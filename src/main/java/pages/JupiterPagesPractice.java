package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverFactory;
import utilities.ReportConfiguration;

import java.util.concurrent.TimeUnit;

public class JupiterPagesPractice {
    WebDriver driver;
    BasePage basePage= new BasePage();
    ReportConfiguration report=new ReportConfiguration();

    public JupiterPagesPractice(){
        driver= DriverFactory.getDriver();
        PageFactory.initElements(driver,this);
    }

    public static String JupiterURL="https://jupiter.cloud.planittesting.com/";

    @FindBy(linkText = "Contact")
    public static WebElement ContactPage;

    @FindBy(xpath = "//a[contains(text(),'Start Shopping »')]")
    public static WebElement ShopPage;

    @FindBy(linkText = "Submit")
    public static WebElement SubmitButton;

    @FindBy(xpath = "//span[@id='forename-err']")
    public static WebElement ForeNameError;

    @FindBy(xpath = "//span[@id='email-err']")
    public static WebElement EmailError;

    @FindBy(xpath = "//span[@id='message-err']")
    public static WebElement MessageError;

    @FindBy(xpath = "//input[@id='forename']")
    public static WebElement ForeName;

    @FindBy(xpath = "//input[@id='email']")
    public static WebElement Email;

    @FindBy(xpath = "//textarea[@id='message']")
    public static WebElement Message;

    @FindBy(xpath = "//div[2]/div[1]/div[1]")
    public static WebElement SuccessMessage;

    @FindBy(xpath = "//li[6]/div[1]/p[1]/a")
    public static WebElement FunnyCow;

    @FindBy(xpath = "//li[4]/div[1]/p[1]/a")
    public static WebElement FluffyBunny;

    @FindBy(xpath = "//li[2]/div[1]/p[1]/a")
    public static WebElement StuffedFrog;

    @FindBy(xpath = "//li[7]/div[1]/p[1]/a")
    public static WebElement ValentineBear;

    @FindBy(xpath = "//div[1]/ul[2]/li[4]/a")
    public static WebElement CartButton;

    //StuffedFrog Details
    @FindBy(css = "tbody:nth-child(2) tr:nth-child(1) > td:nth-child(2)")
    public static WebElement ActualPriceOfStuffedFrog;
    @FindBy(css = "tr:nth-child(1) td:nth-child(3) > input.input-mini")
    public static WebElement QtyOfStuffedFrog;
    @FindBy(css = "tbody:nth-child(2) tr:nth-child(1) > td:nth-child(4)")
    public static WebElement SubTotalOfStuffedFrog;

    //FluffyBunny Details
    @FindBy(css = "tbody:nth-child(2) tr:nth-child(2) > td:nth-child(2)")
    public static WebElement ActualPriceOfFluffyBunny;
    @FindBy(css = "tr:nth-child(2) td:nth-child(3) > input.input-mini")
    public static WebElement QtyOfFluffyBunny;
    @FindBy(css = "tbody:nth-child(2) tr:nth-child(2) > td:nth-child(4)")
    public static WebElement SubTotalOfFluffyBunny;

    //ValentineBear Details
    @FindBy(css = "tbody:nth-child(2) tr:nth-child(3) > td:nth-child(2)")
    public static WebElement ActualPriceOfValentineBear;
    @FindBy(css = "tbody:nth-child(2) tr:nth-child(3) td:nth-child(3) > input.input-mini")
    public static WebElement QtyOfValentineBear;
    @FindBy(css = "tbody:nth-child(2) tr:nth-child(3) > td:nth-child(4)")
    public static WebElement SubtotalOfValentineBear;

    //FunnyCow Details
    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public static WebElement FunnyCowInCart;
    @FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
    public static WebElement QtyOfFunnyCow;

    //FluffyBunny Details
    @FindBy(xpath = "//tbody/tr[2]/td[1]")
    public static WebElement FluffyBunnyInCart;
    @FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
    public static WebElement qtyOfFluffyBunny;
    @FindBy(css = "tfoot:nth-child(3) tr:nth-child(1) td:nth-child(1) > strong.total.ng-binding")
    public static WebElement Total;


    public void navigateToURL(){
        try{
            driver.get(JupiterURL);
            basePage.waitForSeconds(3);
            report.takeScreenshot(driver,"After navigating to Application URL");
        }catch (Exception ex){
            report.log("Exception Found-"+ex);
        }
    }

    public  void  navigateToContactPage(){
        try{
            basePage.click(ContactPage);
            basePage.waitForSeconds(3);
            report.takeScreenshot(driver,"Navigated to contact page");
        } catch (Exception ex){
           report.log("Exception Found-"+ex);
        }
    }

    public void navigateToShopPage(){
        try {
            basePage.click(ShopPage);
            basePage.waitForSeconds(3);
            report.takeScreenshot(driver,"Navigated to shop page");
        }catch (Exception ex){
            report.log("Exception Found-"+ex);
        }
    }

    public void buyFunnyCow(){
        try {
            basePage.click(FunnyCow);
        }catch (Exception ex){
            report.log("Exception Found-"+ex);
        }
    }

    public void buyFluffyBunny(){
        try {
            basePage.click(FluffyBunny);
        }catch (Exception ex){
            report.log("Exception Found-"+ex);
        }
    }

    public void buyStuffedFrog(){
        try {
            basePage.click(StuffedFrog);
        }catch (Exception ex){
            report.log("Exception Found-"+ex);
        }
    }

    public void buyValentineBear(){
        try {
            basePage.click(ValentineBear);
        }catch (Exception ex){
            report.log("Exception Found-"+ex);
        }
    }

    public void clickOnCartButton(){
        try {
            basePage.click(CartButton);
            basePage.waitForSeconds(3);
            report.takeScreenshot(driver,"After clicking on cart button");
        }catch (Exception ex){
            report.log("Exception Found-"+ex);
        }
    }

    public void submitButton(){
        try{
            basePage.click(SubmitButton);
        } catch (Exception ex){
            report.log("Exception Found-"+ex);
        }
    }

    public void validateContactPageMandatoryErrors(){
        try {
            if (basePage.checkElementExists(ForeNameError) &&
                    basePage.checkElementExists(EmailError) &&
                            basePage.checkElementExists(MessageError))
            //if(ForeNameError.isEnabled() && EmailError.isEnabled() && MessageError.isEnabled())
            {
                basePage.waitForSeconds(3);
                report.takeScreenshot(driver, "Mandatory error exist in Contact page");
                report.log("Error Exist");
            }
            else {
                report.log("Error doesnot Exist");
            }
        } catch (Exception ex){
         report.log("Exception Found-"+ex);
        }
    }

    public void enterMandatoryFieldsInContactPage(String forename, String email, String message){
        try {
         // ForeName.sendKeys(forename);
          basePage.enterText(ForeName, forename);
          basePage.enterText(Email, email);
          basePage.enterText(Message, message);
        } catch (Exception ex){
         report.log("Exception Found-"+ex);
        }
    }

    public void validateSuccessMessage(){
        try{
            //SuccessMessage.isDisplayed();
            basePage.checkElementExists(SuccessMessage);
            basePage.waitForSeconds(3);
            report.takeScreenshot(driver,"Success message");
        }catch (Exception ex){
            //System.out.println("Exception Found-"+ex);
            report.log("Exception Found-"+ex);
        }
    }

    public void VerifyingItemsInCart(){
        try {
            basePage.checkElementExists(FunnyCowInCart);
            basePage.checkElementExists(QtyOfFunnyCow);
            basePage.checkElementExists(FluffyBunnyInCart);
            basePage.checkElementExists(qtyOfFluffyBunny);
        }catch (Exception ex){
            report.log("Exception Found-"+ex);
        }
    }

    public void actualPriceAndQtyOfStuffedFrog(){
        try{
            String PriceOfStuffedFrog= String.valueOf(ActualPriceOfStuffedFrog.getText());
            String NewPrice1=PriceOfStuffedFrog.substring(1,6);
            double ProductPriceOfStuffedFrog=Double.parseDouble(NewPrice1);
            report.log("Stuffed Frog ActualPrice-"+ProductPriceOfStuffedFrog);

            String quantityOfStuffedFrog=String.valueOf(QtyOfStuffedFrog.getAttribute("value"));
            int Qty1=Integer.parseInt(quantityOfStuffedFrog);
            report.log("QtyOfStuffedFrog-"+Qty1);
            double ExpectedSubtotal1 =ProductPriceOfStuffedFrog*Qty1;
            report.log("Expected Subtotal of StuffedFrog-"+ ExpectedSubtotal1);
            String Subtotal=String.valueOf(SubTotalOfStuffedFrog.getText());
            String NewSubtotal=Subtotal.substring(1,6);
            double ActualSubtotal =Double.parseDouble(NewSubtotal);
            report.log("Actual Subtotal of Stuffed frog-"+ActualSubtotal);
            if(ActualSubtotal == ExpectedSubtotal1){
                report.log("Both are equal");
            } else{
                report.log("Both are not equal");
            }
        }catch (Exception ex){
            report.log("Exception Found-"+ex);
        }
    }

    public void actualPriceAndQtyOfFluffyBunny(){
        try{
            String PriceOfFluffyBunny= String.valueOf(ActualPriceOfFluffyBunny.getText());
            String NewPrice2=PriceOfFluffyBunny.substring(1,5);
            double ProductPriceOfFluffyBunny = Double.parseDouble(NewPrice2);
            report.log("Fluffy Bunny ActualPrice-"+ProductPriceOfFluffyBunny);

            String quantityOfFluffyBunny=String.valueOf(QtyOfFluffyBunny.getAttribute("value"));
            int Qty2=Integer.parseInt(quantityOfFluffyBunny);
            report.log("QtyOfFluffyBunny-"+Qty2);
            double ExpectedSubtotal2 =ProductPriceOfFluffyBunny*Qty2;
            report.log("Expected Subtotal of FluffyBunny-"+ ExpectedSubtotal2);
            String Subtotal=String.valueOf(SubTotalOfFluffyBunny.getText());
            String NewSubTotal=Subtotal.substring(1,6);
            double ActualSubTotal=Double.parseDouble(NewSubTotal);
            report.log("Actual Subtotal of Fluffy Bunny-"+ActualSubTotal);
            if (ExpectedSubtotal2==ActualSubTotal){
                report.log("Both are equal");
            }else{
                report.log("Both are not equal");
            }
        }catch (Exception ex){
            report.log("Exception Found-"+ex);
        }
    }

    public void actualPriceAndQtyOfValentineBear(){
        try{
            String PriceOfValentineBear=String.valueOf(ActualPriceOfValentineBear.getText());
            String NewPrice3=PriceOfValentineBear.substring(1,6);
            double ProductPriceOfValentineBear=Double.parseDouble(NewPrice3);
            report.log("Valentine Bear ActualPrice-"+ProductPriceOfValentineBear);

            String quantityOfValentineBear=String.valueOf(QtyOfValentineBear.getAttribute("value"));
            int Qty3=Integer.parseInt(quantityOfValentineBear);
            report.log("QtyOfValentineBear-"+Qty3);
            double ExpectedSubtotal3=ProductPriceOfValentineBear*Qty3;
            report.log("Expected Subtotal of ValentineBear-"+ExpectedSubtotal3);
            String Subtotal=String.valueOf(SubtotalOfValentineBear.getText());
            String NewSubTotal=Subtotal.substring(1,6);
            double ActualSubTotal=Double.parseDouble(NewSubTotal);
            report.log("Actual Subtotal of Valentine Bear-" + ActualSubTotal);
            if (ExpectedSubtotal3==ActualSubTotal){
                report.log("Both are equal");
            }else{
                report.log("Both are not equal");
            }
        }catch (Exception ex){
            report.log("Exception Found-"+ex);
        }
    }

    public void verifyingTotalWithSumOfSubtotal(){
        try{
            String total=String.valueOf(Total.getText());
            String TotalValue =total.substring(7,12);
            double ActualTotal=Double.parseDouble(TotalValue);
            report.log("Total="+ ActualTotal);
               //Expected value of StuffedFrog
            String PriceOfStuffedFrog= String.valueOf(ActualPriceOfStuffedFrog.getText());
            String NewPrice1=PriceOfStuffedFrog.substring(1,6);
            double ProductPriceOfStuffedFrog=Double.parseDouble(NewPrice1);
            report.log("Stuffed Frog ActualPrice-"+ProductPriceOfStuffedFrog);
            String quantityOfStuffedFrog=String.valueOf(QtyOfStuffedFrog.getAttribute("value"));
            int Qty1=Integer.parseInt(quantityOfStuffedFrog);
            report.log("QtyOfStuffedFrog-"+Qty1);
            double ExpectedSubtotal1 =ProductPriceOfStuffedFrog*Qty1;
                //Expected value of FluffyBunny
            String PriceOfFluffyBunny= String.valueOf(ActualPriceOfFluffyBunny.getText());
            String NewPrice2=PriceOfFluffyBunny.substring(1,5);
            double ProductPriceOfFluffyBunny = Double.parseDouble(NewPrice2);
            report.log("Fluffy Bunny ActualPrice-"+ProductPriceOfFluffyBunny);
            String quantityOfFluffyBunny=String.valueOf(QtyOfFluffyBunny.getAttribute("value"));
            int Qty2=Integer.parseInt(quantityOfFluffyBunny);
            report.log("QtyOfFluffyBunny-"+Qty2);
            double ExpectedSubtotal2 =ProductPriceOfFluffyBunny*Qty2;
                //Expected value of ValentineBear
            String PriceOfValentineBear=String.valueOf(ActualPriceOfValentineBear.getText());
            String NewPrice3=PriceOfValentineBear.substring(1,6);
            double ProductPriceOfValentineBear=Double.parseDouble(NewPrice3);
            report.log("Valentine Bear ActualPrice-"+ProductPriceOfValentineBear);
            String quantityOfValentineBear=String.valueOf(QtyOfValentineBear.getAttribute("value"));
            int Qty3=Integer.parseInt(quantityOfValentineBear);
            report.log("QtyOfValentineBear-"+Qty3);
            double ExpectedSubtotal3=ProductPriceOfValentineBear*Qty3;
                 //Sum of Subtotal
            double sumOfSubtotal=(ExpectedSubtotal1+ExpectedSubtotal2+ExpectedSubtotal3);
            report.log("Sum of Subtotal="+sumOfSubtotal);
            if (ActualTotal == sumOfSubtotal){
                basePage.waitForSeconds(3);
                report.takeScreenshot(driver, "Price chart");
                report.log("Both are equal");
            } else{
                report.log("Both are not equal");
            }
        }catch (Exception ex){
            report.log("Exception Found-"+ex);
        }
    }

}

