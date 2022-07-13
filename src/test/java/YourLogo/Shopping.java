package YourLogo;
import org.testng.annotations.Test;
public class Shopping {
    @Test
    public void test3(){
     YourLogoPages yourLogoPages=new YourLogoPages();
     yourLogoPages.navigateToURL();
     yourLogoPages.login();
     yourLogoPages.womenShopping();
     yourLogoPages.quit();
    }
}
