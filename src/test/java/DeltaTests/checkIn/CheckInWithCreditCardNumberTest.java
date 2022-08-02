package DeltaTests.checkIn;

import org.testng.annotations.Test;
import pages.DeltaPages;
import reusablemethods.DeltaReusableMethods;

public class CheckInWithCreditCardNumberTest {
    @Test
    public void checkInProcess(){
        DeltaReusableMethods deltaReusableMethods=new DeltaReusableMethods();
        deltaReusableMethods.navigateToURL();
        deltaReusableMethods.checkInProcess("CreditCard Number", "1234123412341234", "Joe","MEL");
//        deltaPages.checkInProcess("Ticket Number", "343434");
//        deltaPages.checkInProcess("SkyMiles Number", "343434");
    }
}
