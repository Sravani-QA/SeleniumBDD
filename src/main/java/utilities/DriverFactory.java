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
    private static final String AUTOMATE_USERNAME = "rajumalle_5MemYq";
    private static final String AUTOMATE_ACCESS_KEY = "w6fjgj8dB6Co2YRuXsy9";
    private static final String BrowserStackURL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    private DriverFactory(){
    }

    public static WebDriver getDriver(){
        String browser = System.getProperty("Browser");
        if(driver==null) {
            System.out.println("Run Configuration provided from testng->"+browser);
            if(browser.contains("web")){
                driver = getWebDriver();
            }else if(browser.contains("mobile")) {
                driver = getMobileDriver();
            }
            assert driver != null;
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static WebDriver getWebDriver(){
        String browser = System.getProperty("Browser");
        if(browser.contains("local")){
            if(browser.contains("chrome")){
                System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver");
                driver= new ChromeDriver();
            }else if(browser.contains("firefox")){
                System.setProperty("webdriver.gecko.driver", "src/main/resources/Drivers/geckodriver");
                driver = new FirefoxDriver();
            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }else if(browser.contains("browserstack")){
            try{
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("browser", "chrome");
                capabilities.setCapability("browser_version", "93");
                capabilities.setCapability("os", "OS X");
                capabilities.setCapability("os_version", "Big Sur");
                capabilities.setCapability("build","Regression Tests-Jupiter");
                capabilities.setCapability("name","Regression Tests");
                capabilities.setCapability("newCommandTimeout",600000);
                System.out.println("Browser Stack Driver Capabilities-->"+capabilities);
                driver = new RemoteWebDriver(new URL(BrowserStackURL), capabilities);
                System.out.println("Successfully initiated driver");
            }catch (Exception e){
                Assert.fail("Failed to get BrowserStack Driver:\n"+e.getMessage());
            }
        }
        return driver;
    }

    public static WebDriver getMobileDriver()  {
       WebDriver driver=null;
        try{
            String appPath = System.getProperty("user.dir") +
                    "/src/main/resources/Apps/"+System.getProperty("AppName");
            System.out.println("App used for Regression->"+appPath);
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("fullReset",true);
            capabilities.setCapability("newCommandTimeout",600000);
            capabilities.setCapability("appPackage","au.com.lexus.mylexus.app");
            capabilities.setCapability("appActivity", "crc64df9d2c25963cc4a5.LaunchActivity");
            if(System.getProperty("Browser").contains("local")){
                capabilities.setCapability("app",appPath);
                capabilities.setCapability("platformName", "Android");
                //capabilities.setCapability("deviceName", "Pixel 5 API 30");
                capabilities.setCapability("deviceName", "Galaxy S20");
                capabilities.setCapability("platformVersion", "11.0");
                capabilities.setCapability("automationName", "UiAutomator2");
                //capabilities.setCapability("udid","emulator-5554");
                capabilities.setCapability("udid","RF8N20RCMJY");
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            }else if(System.getProperty("Browser").contains("browserstack")){
               String appUrl = uploadApp(appPath);
               capabilities.setCapability("app",appUrl);
               capabilities.setCapability("platformName", "android");
               capabilities.setCapability("platformVersion", "10.0");
               capabilities.setCapability("deviceName", "Samsung Galaxy S20");
               capabilities.setCapability("real_mobile", "true");
               capabilities.setCapability("build","Lexus Mobile Regression Tests");
               capabilities.setCapability("name",System.getProperty("TestCaseName"));
               driver = new AndroidDriver(new URL(BrowserStackURL), capabilities);
           }
            System.out.println("Mobile Driver Capabilities-->"+capabilities);
            assert driver!=null;
            System.out.println("Successfully initiated driver");
        }catch (Exception e){
            Assert.fail("Failed to get mobile Driver:\n"+e.getMessage());
        }
        return driver;
    }


    public static void closeDriver(){
        if(driver!=null){
            if(System.getProperty("Browser").contains("web")){
                driver.close();
            }
            driver.quit();
            driver=null;
        }
    }

    public static String uploadApp(String appPath) {
        String appUrl="";
        try{
            String urlS = "https://"+AUTOMATE_USERNAME+":"+AUTOMATE_ACCESS_KEY+"@api.browserstack.com/app-automate/upload";
            HttpClient client = new DefaultHttpClient();
            URI url = new URI(urlS);
            HttpPost post = new HttpPost(url);

            MultipartEntity nameValuePairs = new MultipartEntity();
            //Select the file you want to upload .ipa or .apk and pass the path accordingly.
            nameValuePairs.addPart("file",new FileBody(new File(appPath)));//Path to the file
            post.setEntity(nameValuePairs);

            System.out.println("Going upload the mobile app to BrowserStack, It takes couple of mins");
            HttpResponse response = client.execute(post);
            HttpEntity entity = response.getEntity();
            String responseString = EntityUtils.toString(entity,"UTF-8");
            System.out.println("Respone->"+responseString);

            JSONObject responseObject = new JSONObject(responseString);
            appUrl =  (String)responseObject.get("app_url");
            System.out.println("App URL after uploading to Browser Stack->"+appUrl);
        }catch (Exception e){
            Assert.fail("Failed to upload the App into BrowserStack: Exception->"+e.getMessage());
        }
        return appUrl;
    }

}
