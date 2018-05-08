package testFaceBook;

import com.gargoylesoftware.htmlunit.Page;
import mainFB.FBmain;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public abstract class testFBmain extends FBmain{
    //WebDriver driver= null;
    @BeforeMethod
    public abstract void launchFB();

    @Test(priority = 1, description = "Validate Title Page")
    public String validateTitlePage(){
        String titlePg = driver.getTitle();
        Assert.assertTrue(titlePg.contains("Facebook"));
        return titlePg;
    }
    @Test(dependsOnMethods = "validateTitlePage", description = "Validate URL")
    public String getCurrentPageUrl(){
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("facebook"));
        return url;
    }
    @Test(dependsOnMethods = "validateURL", description = "Validate Page Source")
    public String validatePageSource() {
        return null;
    }
   @Test(dependsOnMethods = "validatePageSource", description = "Incorrect Email, Correct Password")
    public void IncorrectEmailCorrectPass(){
       Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"login_link\"]/div[1]/a")).isDisplayed());
    }
    @Test(dependsOnMethods = "IncorrectEmailCorrectPass", description = "Correct Email, Incorrect Password")
    public void CorrectEmailIncorrectPass(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"login_link\"]/div[1]/a")).isDisplayed());
    }
    @Test(dependsOnMethods = "CorrectEmailIncorrectPass", description = "Test Correct Credentials")
    public void correctCredentials(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='navItem_4748854339\']/a/div")).isDisplayed());
    }
    @Test(dependsOnMethods = "correctCredentials", description = "Test to Enter into Profile")
    public void enterProfile(){
        clickOnElement("span._1vp5.f_click ");
    }
    @Test(dependsOnMethods = "enterProfile", description = "Test to capture Profile Name")
    public String captureProfileName() {
       String profileName;
       Assert.assertTrue(Boolean.parseBoolean(profileName = "TeamTwo SocialMedia"));
       return profileName;
    }
    @Test(dependsOnMethods = "captureProfileName", description = "Test Temporary Bio Functionality")
    public void AddBio(){
        clickOnElement("//*[@id=\'profile_intro_card_bio\']/div/div/a");
        typeByXpath("//*[@id=\"profile_intro_card_bio\"]/div/div/form/textarea", "My name is TeamTwo Social Media.");
        clickOnElement("//*[@id=\"profile_intro_card_bio\"]/div/div/form/div/div[2]/div[2]/div/button[2]");
    }
    @Test(dependsOnMethods = "AddBio", description = "Test to submit a Post")
    public void submitPost(){
        typeByCSS("div._1mf._1mj", "It is Spring. It is 85 degrees today.");
        clickOnElement("//*[@id='js_u7']/div[2]/div[3]/div[2]/span/button/span");
    }
}
