package JupiterPractice;

import org.testng.annotations.Test;
import pages.JupiterPagesPractice;

public class TestCase1 {
      @Test
    public void test1() {

       JupiterPagesPractice jupiterPagesPractice=new JupiterPagesPractice();
       jupiterPagesPractice.navigateToURL();
       jupiterPagesPractice.navigateToContactPage();
       jupiterPagesPractice.submitButton();
       jupiterPagesPractice.validateContactPageMandatoryErrors();
       jupiterPagesPractice.enterMandatoryFieldsInContactPage("Anu","anu@gmail.com","Hello");
       jupiterPagesPractice.submitButton();
       jupiterPagesPractice.validateSuccessMessage();
       jupiterPagesPractice.quit();
    }
}
