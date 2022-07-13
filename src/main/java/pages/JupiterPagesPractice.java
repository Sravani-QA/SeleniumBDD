package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class JupiterPagesPractice {
    WebDriver driver;
//    BasePage basePage= new BasePage();

    public JupiterPagesPractice(){
        createDriver();
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

    public  void createDriver(){
         System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver103");
         driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void navigateToURL(){
        try{
            driver.get(JupiterURL);
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public  void  navigateToContactPage(){
        try{
           JupiterPagesPractice.ContactPage.click();
        } catch (Exception ex){
           System.out.println("Exception Found-"+ex);
        }
    }

    public void navigateToShopPage(){
        try {
            JupiterPagesPractice.ShopPage.click();
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public void buyFunnyCow(){
        try {
            JupiterPagesPractice.FunnyCow.click();
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public void buyFluffyBunny(){
        try {
            JupiterPagesPractice.FluffyBunny.click();
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public void buyStuffedFrog(){
        try {
            JupiterPagesPractice.StuffedFrog.click();
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public void buyValentineBear(){
        try {
            JupiterPagesPractice.ValentineBear.click();
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public void clickOnCartButton(){
        try {
            JupiterPagesPractice.CartButton.click();
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public void submitButton(){
        try{
            JupiterPagesPractice.SubmitButton.click();
        } catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public void validateContactPageMandatoryErrors(){
        try {
            if(ForeNameError.isEnabled() && EmailError.isEnabled() && MessageError.isEnabled())
            {
                System.out.println("Error Exist");
            } else {
                System.out.println("Error doesnot Exist");
            }
        } catch (Exception ex){
         System.out.println("Exception Found-"+ex);
        }
    }

    public void enterMandatoryFieldsInContactPage(String forename, String email, String message){
        try {
          ForeName.sendKeys(forename);
          Email.sendKeys(email);
          Message.sendKeys(message);
        } catch (Exception ex){
         System.out.println("Exception Found-"+ex);
        }
    }

    public void validateSuccessMessage(){
        try{
            SuccessMessage.isDisplayed();
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public void VerifyingItemsInCart(){
        try {
            FunnyCowInCart.isDisplayed();
            QtyOfFunnyCow.isDisplayed();
            FluffyBunnyInCart.isDisplayed();
            qtyOfFluffyBunny.isDisplayed();
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public void actualPriceAndQtyOfStuffedFrog(){
        try{
            String PriceOfStuffedFrog= String.valueOf(ActualPriceOfStuffedFrog.getText());
            String NewPrice1=PriceOfStuffedFrog.substring(1,6);
            double ProductPriceOfStuffedFrog=Double.parseDouble(NewPrice1);
            System.out.println("Stuffed Frog ActualPrice-"+ProductPriceOfStuffedFrog);

            String quantityOfStuffedFrog=String.valueOf(QtyOfStuffedFrog.getAttribute("value"));
            int Qty1=Integer.parseInt(quantityOfStuffedFrog);
            System.out.println("QtyOfStuffedFrog-"+Qty1);
            double ExpectedSubtotal1 =ProductPriceOfStuffedFrog*Qty1;
            System.out.println("Expected Subtotal of StuffedFrog-"+ ExpectedSubtotal1);
            String Subtotal=String.valueOf(SubTotalOfStuffedFrog.getText());
            String NewSubtotal=Subtotal.substring(1,6);
            double ActualSubtotal =Double.parseDouble(NewSubtotal);
            System.out.println("Actual Subtotal of Stuffed frog-"+ActualSubtotal);
            if(ActualSubtotal == ExpectedSubtotal1){
                System.out.println("Both are equal");
            } else{
                System.out.println("Both are not equal");
            }
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public void actualPriceAndQtyOfFluffyBunny(){
        try{
            String PriceOfFluffyBunny= String.valueOf(ActualPriceOfFluffyBunny.getText());
            String NewPrice2=PriceOfFluffyBunny.substring(1,5);
            double ProductPriceOfFluffyBunny = Double.parseDouble(NewPrice2);
            System.out.println("Fluffy Bunny ActualPrice-"+ProductPriceOfFluffyBunny);

            String quantityOfFluffyBunny=String.valueOf(QtyOfFluffyBunny.getAttribute("value"));
            int Qty2=Integer.parseInt(quantityOfFluffyBunny);
            System.out.println("QtyOfFluffyBunny-"+Qty2);
            double ExpectedSubtotal2 =ProductPriceOfFluffyBunny*Qty2;
            System.out.println("Expected Subtotal of FluffyBunny-"+ ExpectedSubtotal2);
            String Subtotal=String.valueOf(SubTotalOfFluffyBunny.getText());
            String NewSubTotal=Subtotal.substring(1,6);
            double ActualSubTotal=Double.parseDouble(NewSubTotal);
            System.out.println("Actual Subtotal of Fluffy Bunny-"+ActualSubTotal);
            if (ExpectedSubtotal2==ActualSubTotal){
                System.out.println("Both are equal");
            }else{
                System.out.println("Both are not equal");
            }
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public void actualPriceAndQtyOfValentineBear(){
        try{
            String PriceOfValentineBear=String.valueOf(ActualPriceOfValentineBear.getText());
            String NewPrice3=PriceOfValentineBear.substring(1,6);
            double ProductPriceOfValentineBear=Double.parseDouble(NewPrice3);
            System.out.println("Valentine Bear ActualPrice-"+ProductPriceOfValentineBear);

            String quantityOfValentineBear=String.valueOf(QtyOfValentineBear.getAttribute("value"));
            int Qty3=Integer.parseInt(quantityOfValentineBear);
            System.out.println("QtyOfValentineBear-"+Qty3);
            double ExpectedSubtotal3=ProductPriceOfValentineBear*Qty3;
            System.out.println("Expected Subtotal of ValentineBear-"+ExpectedSubtotal3);
            String Subtotal=String.valueOf(SubtotalOfValentineBear.getText());
            String NewSubTotal=Subtotal.substring(1,6);
            double ActualSubTotal=Double.parseDouble(NewSubTotal);
            System.out.println("Actual Subtotal of Valentine Bear-"+ActualSubTotal);
            if (ExpectedSubtotal3==ActualSubTotal){
                System.out.println("Both are equal");
            }else{
                System.out.println("Both are not equal");
            }
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public void verifyingTotalWithSumOfSubtotal(){
        try{
            String total=String.valueOf(Total.getText());
            String TotalValue =total.substring(7,12);
            double ActualTotal=Double.parseDouble(TotalValue);
            System.out.println("Total="+ ActualTotal);
               //Expected value of StuffedFrog
            String PriceOfStuffedFrog= String.valueOf(ActualPriceOfStuffedFrog.getText());
            String NewPrice1=PriceOfStuffedFrog.substring(1,6);
            double ProductPriceOfStuffedFrog=Double.parseDouble(NewPrice1);
            System.out.println("Stuffed Frog ActualPrice-"+ProductPriceOfStuffedFrog);
            String quantityOfStuffedFrog=String.valueOf(QtyOfStuffedFrog.getAttribute("value"));
            int Qty1=Integer.parseInt(quantityOfStuffedFrog);
            System.out.println("QtyOfStuffedFrog-"+Qty1);
            double ExpectedSubtotal1 =ProductPriceOfStuffedFrog*Qty1;
                //Expected value of FluffyBunny
            String PriceOfFluffyBunny= String.valueOf(ActualPriceOfFluffyBunny.getText());
            String NewPrice2=PriceOfFluffyBunny.substring(1,5);
            double ProductPriceOfFluffyBunny = Double.parseDouble(NewPrice2);
            System.out.println("Fluffy Bunny ActualPrice-"+ProductPriceOfFluffyBunny);
            String quantityOfFluffyBunny=String.valueOf(QtyOfFluffyBunny.getAttribute("value"));
            int Qty2=Integer.parseInt(quantityOfFluffyBunny);
            System.out.println("QtyOfFluffyBunny-"+Qty2);
            double ExpectedSubtotal2 =ProductPriceOfFluffyBunny*Qty2;
                //Expected value of ValentineBear
            String PriceOfValentineBear=String.valueOf(ActualPriceOfValentineBear.getText());
            String NewPrice3=PriceOfValentineBear.substring(1,6);
            double ProductPriceOfValentineBear=Double.parseDouble(NewPrice3);
            System.out.println("Valentine Bear ActualPrice-"+ProductPriceOfValentineBear);
            String quantityOfValentineBear=String.valueOf(QtyOfValentineBear.getAttribute("value"));
            int Qty3=Integer.parseInt(quantityOfValentineBear);
            System.out.println("QtyOfValentineBear-"+Qty3);
            double ExpectedSubtotal3=ProductPriceOfValentineBear*Qty3;
                 //Sum of Subtotal
            double sumOfSubtotal=(ExpectedSubtotal1+ExpectedSubtotal2+ExpectedSubtotal3);
            System.out.println("Sum of Subtotal="+sumOfSubtotal);
            if (ActualTotal == sumOfSubtotal){
                System.out.println("Both are equal");
            } else{
                System.out.println("Both are not equal");
            }
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

    public void quit(){
        driver.close();
    }

}

