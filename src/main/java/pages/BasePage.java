package pages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ReportConfiguration;

public class BasePage {

    ReportConfiguration report=new ReportConfiguration();

    //To click on any element
    public void click(WebElement element){
        try{
            if(checkElementExists(element)){
                element.click();
                //report("Clicked on - "+element);
            }else{
                //reportResult("Element not exist. Failed to click on element->"+element, LogStatus.FAIL);
            }
        }catch (Exception e){
            //reportResult("Element not exist. Failed to click on element->"+element, LogStatus.FAIL);
        }
    }

    //To enter text using sendKeys() method
    public void enterText(WebElement element, String text){
        try{
            if(checkElementExists(element)){
                element.clear();
                element.sendKeys(text);
                //report("Entered value : "+text);
            }else{
                //reportResult("Element not exist. Failed to enter text into element->"+element, LogStatus.FAIL);
            }
        }catch (Exception e){
            //reportResult("Element not exist. Failed to enter text into element->"+element, LogStatus.FAIL);
        }
    }

    //To select By Value from dropdown
    public  void selectByValue(WebElement element, String value){
        try{
            if(checkElementExists(element)){
                Select select = new Select(element);
                select.selectByValue(value);
            }else{
                //reportResult("Element not exist. Failed to select value from->"+element, LogStatus.FAIL);
            }
        }catch (Exception e){
            //reportResult("Failed to select value from "+element, LogStatus.FAIL);
        }
    }

    //To select By Index from dropdown
    public  void selectByIndex(WebElement element, int index){
        try{
            if(checkElementExists(element)){
                Select select = new Select(element);
                select.selectByIndex(index);
            }else{
                //reportResult("Element not exist. Failed to select value from->"+element, LogStatus.FAIL);
            }
        }catch (Exception e){
            //reportResult("Failed to select value from "+element, LogStatus.FAIL);
        }
    }

    //To check element visibility
    public boolean checkElementExists(WebElement element){
        try{
            element.isDisplayed();
        }catch (Exception e){
            return  false;
        }
        return true;
    }

    //To wait for seconds
    public void waitForSeconds(int t)  {
        try{
            Thread.sleep(t* 1000L);
        }catch (InterruptedException e){
            //reportResult("Failed in wait for mentioned seconds-"+e.getMessage(), LogStatus.FAIL);
        }
    }

    public String getText(MobileElement element) {
        String text=null;
        try{
            if(checkElementExists(element)){
                text = element.getText();
            }else{
                //reportResult("Failed to get text from -"+element, LogStatus.FAIL);
            }
        }catch (Exception e){
            //reportResult("Failed in wait for mentioned seconds-"+e.getMessage(), LogStatus.FAIL);
        }
        return text;
    }

    public void validateElementExists(WebElement element) {
        try{
            if(checkElementExists(element)){
                //report(element+"Element exists");
            }else{
                //reportResult("Element not exist-"+element, LogStatus.FAIL);
            }
        }catch (Exception e){
            //reportResult("Element not exist-"+element, LogStatus.FAIL);
        }
    }
}
