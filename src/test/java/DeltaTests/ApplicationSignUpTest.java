package DeltaTests;

import org.testng.annotations.Test;
import pages.DeltaPages;

public class ApplicationSignUpTest {

    @Test
    public void signUpProcess(){
        try {
            DeltaPages deltaPages = new DeltaPages();
            deltaPages.navigateToURL();
            deltaPages.signUp("John", "Joe", "Oct","25","1994","2","Bermuda","Hamilton","2","1");
        }catch (Exception ex) {
            System.out.println("Exception found" +ex);
        }
    }

}
