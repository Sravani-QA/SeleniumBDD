package YourLogo;

import org.testng.annotations.Test;

public class DressesShopping {
    @Test
    public void dressesShopping() {
        YourLogoPages yourLogoPages = new YourLogoPages();
        yourLogoPages.navigateToURL();
        yourLogoPages.login();
        yourLogoPages.DressesShopping();
        yourLogoPages.VerifyPrice();
        yourLogoPages.quit();
    }
}
