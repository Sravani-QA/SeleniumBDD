package utilities;
import io.appium.java_client.android.AndroidDriver;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//Singleton class for driver
public class DriverFactory {

    private static WebDriver driver=null;
    private DriverFactory(){
    }

    public static WebDriver getDriver(){
        //String browser = System.getProperty("Browser");
        String browser = "chrome";
       // String browser = "firefox";
        System.out.println("Run Configuration provided from testng->"+browser);
        if(driver==null) {
            if (browser.contains("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver103");
                driver = new ChromeDriver();
            } else if (browser.contains("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/main/resources/Drivers/geckodriver");
                driver = new FirefoxDriver();
            }
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.close();
           // driver.quit();
            driver=null;
        }
    }

}
