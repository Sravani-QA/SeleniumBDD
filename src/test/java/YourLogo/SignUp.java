package YourLogo;

import org.testng.annotations.Test;

public class SignUp {
    @Test
    public void test1() {
        YourLogoPages yourLogoPages = new YourLogoPages();
        yourLogoPages.navigateToURL();
        yourLogoPages.signUp();
        yourLogoPages.enterPersonalDetails();
        yourLogoPages.enterAddressDetails();
        yourLogoPages.quit();
    }
}
