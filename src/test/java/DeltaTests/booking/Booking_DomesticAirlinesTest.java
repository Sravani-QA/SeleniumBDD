package DeltaTests.booking;

import org.testng.annotations.Test;
import pages.DeltaPages;
import reusablemethods.DeltaReusableMethods;

public class Booking_DomesticAirlinesTest {
    @Test
    public void domesticAirlines(){
        try {
            DeltaReusableMethods deltaReusableMethods=new DeltaReusableMethods();
            deltaReusableMethods.navigateToURL();
            deltaReusableMethods.bookDomesticAirlines();
        }catch (Exception ex){
            System.out.println("Exception found-"+ex);
        }

    }
}
