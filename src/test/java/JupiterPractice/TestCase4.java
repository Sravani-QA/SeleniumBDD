package JupiterPractice;

import org.testng.annotations.Test;
import pages.JupiterPagesPractice;

public class TestCase4 {
    @Test
    public void test4(){
        JupiterPagesPractice jupiterPagesPractice=new JupiterPagesPractice();
        jupiterPagesPractice.navigateToURL();
        jupiterPagesPractice.navigateToShopPage();

        jupiterPagesPractice.buyStuffedFrog();
        jupiterPagesPractice.buyStuffedFrog();

        jupiterPagesPractice.buyFluffyBunny();
        jupiterPagesPractice.buyFluffyBunny();
        jupiterPagesPractice.buyFluffyBunny();
        jupiterPagesPractice.buyFluffyBunny();
        jupiterPagesPractice.buyFluffyBunny();

        jupiterPagesPractice.buyValentineBear();
        jupiterPagesPractice.buyValentineBear();
        jupiterPagesPractice.buyValentineBear();

        jupiterPagesPractice.clickOnCartButton();

        jupiterPagesPractice.actualPriceAndQtyOfStuffedFrog();
        jupiterPagesPractice.actualPriceAndQtyOfFluffyBunny();
        jupiterPagesPractice.actualPriceAndQtyOfValentineBear();

        jupiterPagesPractice.verifyingTotalWithSumOfSubtotal();

//        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver");
//        WebDriver driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//
//        driver.navigate().to("https://jupiter.cloud.planittesting.com/");
//        driver.findElement(By.linkText("Shop")).click();
//        //Add Stuffed frog to cart
//        driver.findElement(By.xpath("//li[2]/div[1]/p[1]/a")).click();
//        driver.findElement(By.xpath("//li[2]/div[1]/p[1]/a")).click();
//        //Add Fluffy bunny to cart
//        driver.findElement(By.xpath("//li[4]/div[1]/p[1]/a")).click();
//        driver.findElement(By.xpath("//li[4]/div[1]/p[1]/a")).click();
//        driver.findElement(By.xpath("//li[4]/div[1]/p[1]/a")).click();
//        driver.findElement(By.xpath("//li[4]/div[1]/p[1]/a")).click();
//        driver.findElement(By.xpath("//li[4]/div[1]/p[1]/a")).click();
//        //Add Valentine bear to cart
//        driver.findElement(By.xpath("//li[7]/div[1]/p[1]/a")).click();
//        driver.findElement(By.xpath("//li[7]/div[1]/p[1]/a")).click();
//        driver.findElement(By.xpath("//li[7]/div[1]/p[1]/a")).click();
//        //go to cart
//        driver.findElement(By.partialLinkText("Cart")).click();
//        //verifying price of each product
//        String Price1= driver.findElement(By.cssSelector("tbody:nth-child(2) tr:nth-child(1) > td:nth-child(2)")).getText();
//        String NewPrice1=Price1.substring(1,6);
//             double ActualPrice1=Double.parseDouble(NewPrice1);
//             System.out.println("Stuffed Frog ActualPrice-"+ActualPrice1);
//
//        String Price2=driver.findElement(By.cssSelector("tbody:nth-child(2) tr:nth-child(2) > td:nth-child(2)")).getText();
//        String NewPrice2=Price2.substring(1,5);
//             double ActualPrice2 = Double.parseDouble(NewPrice2);
//             System.out.println("Fluffy Bunny ActualPrice-"+ActualPrice2);
//
//        String Price3=driver.findElement(By.cssSelector("tbody:nth-child(2) tr:nth-child(3) > td:nth-child(2)")).getText();
//        String NewPrice3=Price3.substring(1,6);
//             double ActualPrice3=Double.parseDouble(NewPrice3);
//             System.out.println("Valentine Bear ActualPrice-"+ActualPrice3);
//
//        //Product Subtotal=ProductPrice * quantity
//        String QtyOfStuffedFrog=driver.findElement(By.cssSelector("tr:nth-child(1) td:nth-child(3) > input.input-mini")).getAttribute("value");
//        int Qty1=Integer.parseInt(QtyOfStuffedFrog);
//        System.out.println("QtyOfStuffedFrog-"+Qty1);
//        double ExpectedValue1 =ActualPrice1*Qty1;
//        System.out.println("Expected value-"+ ExpectedValue1);
//        String Subtotal1=driver.findElement(By.cssSelector("tbody:nth-child(2) tr:nth-child(1) > td:nth-child(4)")).getText();
//        String NewSubtotal1=Subtotal1.substring(1,6);
//        double subTotal1 =Double.parseDouble(NewSubtotal1);
//        System.out.println("Actual Subtotal of Stuffed frog-"+subTotal1);
//        if(subTotal1 == ExpectedValue1){
//            System.out.println("Both are equal");
//        } else{
//            System.out.println("Both are not equal");
//        }
//
//        String QtyOfFluffyBunny=driver.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(3) > input.input-mini")).getAttribute("value");
//        int Qty2=Integer.parseInt(QtyOfFluffyBunny);
//        System.out.println("QtyOfFluffyBunny-"+Qty2);
//        double ExpectedValue2 =ActualPrice2*Qty2;
//        System.out.println("Expected value-"+ ExpectedValue2);
//        String Subtotal2=driver.findElement(By.cssSelector("tbody:nth-child(2) tr:nth-child(2) > td:nth-child(4)")).getText();
//        String NewSubTotal2=Subtotal2.substring(1,6);
//        double subTotal2=Double.parseDouble(NewSubTotal2);
//        System.out.println("Actual Subtotal of Fluffy Bunny-"+subTotal2);
//        if (ExpectedValue2==subTotal2){
//            System.out.println("Both are Equal");
//        }else{
//            System.out.println("Both are not equal");
//        }
//
//        String QtyOfValentineBear=driver.findElement(By.cssSelector("tbody:nth-child(2) tr:nth-child(3) td:nth-child(3) > input.input-mini")).getAttribute("value");
//        int Qty3=Integer.parseInt(QtyOfValentineBear);
//        System.out.println("QtyOfValentineBear-"+Qty3);
//        double ExpectedValue3=ActualPrice3*Qty3;
//        System.out.println("Expected value-"+ExpectedValue3);
//        String Subtotal3=driver.findElement(By.cssSelector("tbody:nth-child(2) tr:nth-child(3) > td:nth-child(4)")).getText();
//        String NewSubTotal3=Subtotal3.substring(1,6);
//        double subTotal3=Double.parseDouble(NewSubTotal3);
//        System.out.println("Actual Subtotal of Valentine Bear-"+subTotal3);
//        if (ExpectedValue3==subTotal3){
//            System.out.println("Both are equal");
//        }else{
//            System.out.println("Both are not equal");
//        }
//       //Verifying the total with subtotal
//        String Total=driver.findElement(By.cssSelector("tfoot:nth-child(3) tr:nth-child(1) td:nth-child(1) > strong.total.ng-binding")).getText();
//        String TotalValue =Total.substring(7,12);
//        double ActualTotal=Double.parseDouble(TotalValue);
//        System.out.println("Total="+ ActualTotal);
//
//        double sumOfSubtotal=(ExpectedValue1+ExpectedValue2+ExpectedValue3);
//        System.out.println("Sum of Subtotal="+sumOfSubtotal);
//        if (ActualTotal ==sumOfSubtotal){
//            System.out.println("Both are equal");
//        } else{
//            System.out.println("Both are not equal");
//        }
//        driver.close();
    }
}
