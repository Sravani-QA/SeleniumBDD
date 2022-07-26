package DeltaTests;

import org.testng.annotations.Test;
import pages.DeltaPages;

public class Booking_DomesticAirlinesTest {
    @Test
    public void domesticAirlines(){
        try {
            DeltaPages deltaPages=new DeltaPages();
            deltaPages.navigateToURL();
            deltaPages.bookDomesticAirlines();
        }catch (Exception ex){
            System.out.println("Exception found-"+ex);
        }

    }
}
