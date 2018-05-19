package forEyes;

import base.CommonAPI;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class shoppingExperience extends CommonAPI {
    //Validate Title Page
    public String validateTitlePage(){
        System.out.println("Test to Validate Title pg.");
        String titlePg = driver.getTitle();
        System.out.println("Test to Validate Title pg. Second Line");
        return titlePg;
    }
    //Validate URL
    public void getUrl(){
        getCurrentPageUrl();
    }
    //Print out the page source
    public String validatePageSource(){
        String pgSource = driver.getPageSource();
        return pgSource;
    }
    //Select Shopping Experience
    public void clickShoppingExperience(){
        clickByXpath("//a[@href='/shoppingexperience']");
        clickByXpath("//a[@href='/scheduleexam']");
        typeByXpath("//*[@id='searchStr']", "19149");
        clickByXpath();
    }


}
