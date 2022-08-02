package DeltaTests.checkIn;

import org.testng.annotations.Test;
import pages.DeltaPages;
import reusablemethods.DeltaReusableMethods;

public class CheckInWithConfirmationNumberTest {
    @Test
    public void checkInProcess(){
        DeltaReusableMethods deltaReusableMethods=new DeltaReusableMethods();
        deltaReusableMethods.navigateToURL();
        deltaReusableMethods.checkInProcess("Confirmation Number", "SFTORB","", "MEL");
 //       deltaPages.checkInProcess("Ticket Number", "343434");
//        deltaPages.checkInProcess("SkyMiles Number", "343434");
    }
}
