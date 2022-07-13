package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class YourLogoPages {
    WebDriver driver;
     public YourLogoPages(){
         createDriver();
         PageFactory.initElements(driver,this);
     }
     public static String YourLogoURL="http://automationpractice.com/index.php";
     @FindBy(xpath ="//a[contains(text(),'Sign in')]")
     public static WebElement SignInButton;
     @FindBy(xpath = "//input[@id='email_create']")
     public static WebElement EnterEmailAddressToCreateAccount;
     @FindBy(xpath = "//div[3]/button[1]/span[1]")
     public static WebElement CreateAccountButton;
     @FindBy(xpath = "//div[2]/label[1]/div[1]")
     public static WebElement Title;
     @FindBy(xpath = "//input[@id='customer_firstname']")
     public static WebElement FirstName;
     @FindBy(xpath = "//input[@id='customer_lastname']")
     public static WebElement LastName;
     @FindBy(xpath = "//input[@id='passwd']")
     public static WebElement Password;
     @FindBy(xpath = "//select[@id='days']")
     public static WebElement DOBDay;
     @FindBy(xpath="//select[@id='days']")
     public static WebElement Date;
     @FindBy(id = "months")
     public static WebElement Month;
     @FindBy(xpath = "//select[@id='years']")
     public static WebElement Year;
     @FindBy(xpath = "//input[@id='firstname']")
     public static WebElement FirstNameInAddress;
     @FindBy(xpath = "//input[@id='lastname']")
     public static WebElement LastNameInAddress;
     @FindBy(xpath = "//input[@id='address1']")
     public static WebElement Address;
     @FindBy(xpath = "//input[@id='city']")
     public static WebElement City;
     @FindBy(xpath="//select[@id='id_state']")
     public static WebElement State;
     @FindBy(xpath = "//input[@id='postcode']")
     public static WebElement Postcode;
     @FindBy(xpath = "//input[@id='phone_mobile']")
     public static WebElement MobileNumber;
     @FindBy(xpath = "//input[@id='alias']")
     public static WebElement Alias;
     @FindBy(xpath = "//div[4]/button[1]/span[1]")
     public static WebElement RegisterButton;
     @FindBy(xpath = "//input[@id='email']")
     public static WebElement EnterEmailForLogin;
     @FindBy(xpath = "//p/button[1]/span[1]")
     public static WebElement SignInToRegister;
     @FindBy(linkText = "Women")
     public static WebElement Women;
     @FindBy(xpath = "//div[@id='page']//li[1]/div[1]/a[1]/img[1]")
     public static WebElement Tops;
     @FindBy(xpath = "//select[@id='selectProductSort']")
     public static WebElement Sort;
     @FindBy(xpath = "//li[2]//div[3]//a[2]")
     public static WebElement MoreAboutProduct;
     @FindBy(xpath = "//select[@id='group_1']")
     public static WebElement TopSize;
     @FindBy(partialLinkText = "Add to wishli")
     public static WebElement AddToWishlist;
     @FindBy(xpath = "//p[contains(text(),'Added to your wishlist.')]")
     public static WebElement AddedToWishListMessage;
     @FindBy(xpath = "//body/div[2]//a[1]")
     public static WebElement RemoveWishlistMessage;
     @FindBy(xpath = "//span[contains(text(),'Anu Anusha')]")
     public static WebElement MyAccount;
     @FindBy(xpath = "//span[contains(text(),'My wishlists')]")
     public static  WebElement MyWishlist;
     @FindBy(xpath = "//li[3]/a[1]/img[1]")
     public static WebElement ClickOnProduct;
     @FindBy(xpath = "//div[1]/p[1]/button[1]")
     public static  WebElement AddToCartTop;
     @FindBy(xpath = "//div[4]/span[1]")
     public static WebElement ContinueShopping;
     @FindBy(xpath = "//div[6]/ul[1]/li[2]/a[1]")
     public static WebElement Dresses;
     @FindBy(xpath = "//div[@id='page']//li[2]/div[1]/a[1]")
     public static WebElement EveningDresses;
     @FindBy(xpath = "//li[3]/a[1]/i[1]")
     public static WebElement View;
     @FindBy(xpath = "//div[2]/a[1]/span[1]")
     public static WebElement AddToCartDresses;
     @FindBy(xpath = "//div[4]/a[1]")
     public static WebElement ProceedToCheckOut;
     @FindBy(xpath = "//div[1]/a[2]")
     public static WebElement IncreasingQuantity;
    @FindBy(xpath = "//tr[1]/td[5]/input[2]")
    public static WebElement Quantity;
    @FindBy(xpath = "//tbody[1]/tr[1]/td[4]/span[1]")
    public static WebElement ActualUnitPriceOfDresse;
    @FindBy(xpath = "//td[@id='total_shipping']")
    public static WebElement Shipping;
    @FindBy(xpath = "//span[@id='total_price']")
    public static WebElement ActualPrice;
    @FindBy(xpath = "//div[3]/div[1]/p[2]/a[1]/span[1]")
    public static WebElement ProceedButton;
    @FindBy(xpath = "//textarea[1]")
    public static WebElement Text;
    @FindBy(xpath = "//p[1]/button[1]")
    public static WebElement ProceedWithAddress;
    @FindBy(xpath = "//input[@id='cgv']")
    public static WebElement Agree;
    @FindBy(partialLinkText = "Pay by che")
    public static WebElement AddPaymentMethod;
    @FindBy(xpath = "//p[contains(text(),'Your order on My Store is complete.')]")
    public static WebElement ConfirmationMessage;
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver103");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
    }

    public void navigateToURL(){
        try {
            driver.get(YourLogoURL);
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
    }

   public void signUp(){
        try{
            YourLogoPages.SignInButton.click();
            YourLogoPages.EnterEmailAddressToCreateAccount.sendKeys("anusha125@gmail.com");
            YourLogoPages.CreateAccountButton.click();
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
            //Assert.fail("Fail inside this method");
        }
   }

   public void enterPersonalDetails(){
        try {
            YourLogoPages.Title.click();
            YourLogoPages.FirstName.sendKeys("Anu");
            YourLogoPages.LastName.sendKeys("Anusha");
            YourLogoPages.Password.sendKeys("Anu@125");
            YourLogoPages.DOBDay.click();
//            WebElement DOBdropdown= driver.findElement(By.xpath("//select[@id='days']"));
//            Select ObjDate=new Select(DOBdropdown);
//            ObjDate.selectByValue("4");
            Select drpDate=new Select(Date);
            drpDate.selectByValue("4");
            Select drpMonth=new Select(Month);
            drpMonth.selectByIndex(5);
            Select drpYear=new Select(Year);
            drpYear.selectByValue("2000");
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
   }

   public void enterAddressDetails(){
        try {
            YourLogoPages.FirstNameInAddress.sendKeys("Anu");
            YourLogoPages.LastNameInAddress.sendKeys("Anusha");
            YourLogoPages.Address.sendKeys("599 Collin's Street");
            YourLogoPages.City.sendKeys("Hyderabad");
            Select drpState=new Select(State);
            drpState.selectByVisibleText("Ohio");
            YourLogoPages.Postcode.sendKeys("30000");
            YourLogoPages.MobileNumber.sendKeys("4356543567");
            YourLogoPages.Alias.sendKeys("House");
            YourLogoPages.RegisterButton.click();
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
   }

   public void login(){
        try {
            YourLogoPages.SignInButton.click();
            YourLogoPages.EnterEmailForLogin.sendKeys("anu125@gmail.com");
            YourLogoPages.Password.sendKeys("Anu@125");
            YourLogoPages.SignInToRegister.click();
        }catch(Exception ex){
            System.out.println("Exception Found-"+ex);
        }
   }

   public void womenShopping(){
        try {
            YourLogoPages.Women.click();
            YourLogoPages.Tops.click();
            Select drpSort=new Select(Sort);
            drpSort.selectByIndex(1);
            View.click();
            MoreAboutProduct.click();
            AddToWishlist.click();
            if(AddedToWishListMessage.isDisplayed()){
                System.out.println("Added to WishList");
            }else {
                System.out.println("Not Added to WishList");
            }
            RemoveWishlistMessage.click();
            MyAccount.click();
            MyWishlist.click();
            ClickOnProduct.click();
            Select drpSize=new Select(TopSize);
            drpSize.selectByVisibleText("L");
            AddToCartTop.click();
            ContinueShopping.click();
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
   }

   public void DressesShopping(){
        try{
            YourLogoPages.Dresses.click();
            YourLogoPages.EveningDresses.click();
            YourLogoPages.View.click();
            YourLogoPages.AddToCartDresses.click();
            YourLogoPages.ProceedToCheckOut.click();
            YourLogoPages.IncreasingQuantity.click();
            YourLogoPages.IncreasingQuantity.click();
            Thread.sleep(6000);

        }catch(Exception ex){
            System.out.println("Exception Found-"+ex);
        }
   }

   public void VerifyPrice(){
        try {
            String Price=String.valueOf(ActualUnitPriceOfDresse.getText());
            String PriceOfDress=Price.substring(1,6);
            double UnitPrice=Double.parseDouble(PriceOfDress);
            System.out.println("UnitPrice="+UnitPrice);

            String QtyOfDress=String.valueOf(Quantity.getAttribute("value"));
            int Qty=Integer.parseInt(QtyOfDress);
            System.out.println("Quantity of dress="+Qty);

            double ExpectedProductTotal=(UnitPrice*Qty);
            System.out.println("ExpectedTotal="+ExpectedProductTotal);

            String shipping=String.valueOf(Shipping.getText());
            String ShippingCharges=shipping.substring(1,5);
            double TotalShipping=Double.parseDouble(ShippingCharges);
            System.out.println("Shipping charges-"+TotalShipping);

            double ExpectedTotalPrice=(ExpectedProductTotal+TotalShipping);
            System.out.println("ExpectedTotalPrice-"+ExpectedTotalPrice);

            String Total=String.valueOf(ActualPrice.getText());
            String TotalPrice=Total.substring(1,7);
            double ActualTotalPrice=Double.parseDouble(TotalPrice);
            System.out.println("ActualTotalPrice-"+ActualTotalPrice);

            if (ActualTotalPrice==ExpectedTotalPrice){
                System.out.println("Equal");
            }else {
                System.out.println("Not Equal");
            }

            ProceedButton.click();
            Text.sendKeys("Deliver the Product Carefully");
            ProceedWithAddress.click();
            Agree.click();
            ProceedWithAddress.click();
            AddPaymentMethod.click();
            ProceedWithAddress.click();
            if (ConfirmationMessage.isDisplayed()){
                System.out.println("Confirmation message is Displayed");
            }else {
                System.out.println("Confirmation message is Not Displayed");
            }
        }catch (Exception ex){
            System.out.println("Exception Found-"+ex);
        }
   }
   public void  quit(){
        driver.quit();
   }

}

