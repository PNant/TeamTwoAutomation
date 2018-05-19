package forEyes;

import base.CommonAPI;
import org.openqa.selenium.By;

public class purchaseSelection extends CommonAPI {
   //Type in Search Box
    public void findBoysClothing(){
        typeByXpath("//*[@id='search']", "boy's dress shirts");
        takeEnterKeys("input#search");
    }
    //Select Stag Print Shirt
    public void selectShirt(){
        waitUntilClickAble(By.xpath("//button[@aria-label='choose Boys Button-Down Shirt - Cat &amp; Jack™ White options']"));
        clickByXpath("//button[@aria-label='choose Boys Button-Down Shirt - Cat &amp; Jack™ White options']");

       /* clickByXpath("//button[@aria-label='choose Boys Button-Down Shirt - Cat &amp; Jack™ White options']");
        clickByXpath("//*[@id='5xtd3']/a/div");
        clickByXpath("//*[@id='5xty4']/a/div");
        clickOnElement("//*[@href='/c/boys-clothing/-/N-5xty4']");*/
    }
    //Select Dresswear
    /*public void dresswear(){
        clickOnElement("//*[@class='ItemTitle-s1bls9ac-0 cswDKl']");
    }
    //Filter Results
    public void filterDresswearResults(){
        clickByXpath("//*[@class='CheckboxLabel-s1vpfz8c-0 fouHyW']");
        clickByXpath("//*[@img alt='City of London Boys' Long Sleeve Button-Down Shirt - Pink']");
    }
    //Choose Size and Quantity
    public void selectSizeAndQty(){
        clickByXpath("//*[@data-test='showAllBtn']");
        clickByXpath("//button[data-test='m']");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }*/
}
