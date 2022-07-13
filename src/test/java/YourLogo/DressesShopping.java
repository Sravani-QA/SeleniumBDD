package YourLogo;

import org.testng.annotations.Test;
import pages.YourLogoPages;

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
