package JupiterPractice;

import org.testng.annotations.Test;
import pages.JupiterPagesPractice;

public class TestCase2 {
    @Test
    public void test2(){
        JupiterPagesPractice jupiterPagesPractice=new JupiterPagesPractice();
        //jupiterPagesPractice.createDriver();
        jupiterPagesPractice.navigateToURL();
        jupiterPagesPractice.IAmOnHomePage();
        jupiterPagesPractice.navigateToContactPage();
        jupiterPagesPractice.enterMandatoryFieldsInContactPage("Anu","anu@gmail.com","Hello");
        jupiterPagesPractice.submitButton();
        jupiterPagesPractice.validateSuccessMessage();


//        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver");
//        WebDriver driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//
//        driver.get("https://jupiter.cloud.planittesting.com/");
//
//        driver.findElement(By.linkText("Contact")).click();
//
//        driver.findElement(By.cssSelector("#forename")).sendKeys("Anu");
//        driver.findElement(By.cssSelector("#email")).sendKeys("anu.malle@gmail.com");
//        driver.findElement(By.cssSelector("#message")).sendKeys("Love this Toys");
//
//        driver.findElement(By.linkText("Submit")).click();
//        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]")).isEnabled();
//
//        driver.quit();

    }
}
