package YourLogo;

import org.testng.annotations.Test;

public class Login {
    @Test
    public void test2(){
       YourLogoPages yourLogoPages=new YourLogoPages();
       yourLogoPages.navigateToURL();
       yourLogoPages.login();
       //yourLogoPages.quit();
    }
}
