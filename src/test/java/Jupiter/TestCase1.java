package Jupiter;

import org.testng.annotations.Test;

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
