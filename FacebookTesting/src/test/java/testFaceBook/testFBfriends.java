package testFaceBook;

import mainFB.facebookFriends;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public abstract class testFBfriends extends facebookFriends {

    @Test(dependsOnMethods = "submitPost", description = "Test for Friend Search Functionality")
    public void searchFriends(){
        typeByXpath("//*[@id='js_1l']","Michelle Sourdough");
        clickOnElement("//*[@id=\"js_1y0\"]/div");
    }
    @Test(dependsOnMethods = "searchFriends", description = "Test to confirm friend search")
    public void confirmFriend(){
        String friendOne =  captureProfileName();
        if(friendOne == "Michelle Sourdough"){
            clickOnElement("//*[@id='u_ps_fetchstream_19_0_3']/button[1]");
            Assert.assertTrue(Boolean.parseBoolean(friendOne));
        }
        else{navigateBack();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\'fb-timeline-cover-name\']/a")).isDisplayed());
        }
    }
    @AfterMethod
    public abstract void afterMethod();
}
