package DeltaTests;

import org.testng.annotations.Test;
import pages.DeltaPages;
import reusablemethods.DeltaReusableMethods;

public class MyTripsTest {
    @Test
    public void myTripsWithIncorrectInformation(){
        DeltaReusableMethods deltaReusableMethods=new DeltaReusableMethods();
        deltaReusableMethods.navigateToURL();
        deltaReusableMethods.myTrips("0");
    }
}
