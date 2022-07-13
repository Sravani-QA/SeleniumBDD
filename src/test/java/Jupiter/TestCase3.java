package Jupiter;

import org.testng.annotations.Test;

public class TestCase3 {
    @Test
    public void test3(){
        JupiterPagesPractice jupiterPagesPractice=new JupiterPagesPractice();
       // jupiterPagesPractice.createDriver();
        jupiterPagesPractice.navigateToURL();
        jupiterPagesPractice.navigateToShopPage();
        jupiterPagesPractice.buyFunnyCow();
        jupiterPagesPractice.buyFunnyCow();
        jupiterPagesPractice.buyFluffyBunny();
        jupiterPagesPractice.clickOnCartButton();
        jupiterPagesPractice.VerifyingItemsInCart();
        jupiterPagesPractice.quit();
//        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver");
//        WebDriver driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//
//        driver.navigate().to("https://jupiter.cloud.planittesting.com/");
//        //navigate to shop
//        driver.findElement(By.linkText("Shop")).click();
//        //Funny cow
//        driver.findElement(By.xpath("//li[6]/div[1]/p[1]/a")).click();
//        driver.findElement(By.xpath("//li[6]/div[1]/p[1]/a")).click();
//        //Fluffy Bunny
//        driver.findElement(By.xpath("//li[4]/div[1]/p[1]/a")).click();
//        //click on cart
//        driver.findElement(By.xpath("//div[1]/ul[2]/li[4]/a")).click();
//        //Verify
//        driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).isEnabled();
//        driver.findElement(By.xpath("//tbody/tr[2]/td[3]/input[1]")).isEnabled();
//
//        driver.quit();
    }
}
