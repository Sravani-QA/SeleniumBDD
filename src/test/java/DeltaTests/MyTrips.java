package DeltaTests;

import org.testng.annotations.Test;
import pages.DeltaPages;

public class MyTrips {
    @Test
    public void myTripsWithIncorrectInformation(){
        DeltaPages deltaPages=new DeltaPages();
        deltaPages.navigateToURL();
        deltaPages.myTrips("1");
    }
}
