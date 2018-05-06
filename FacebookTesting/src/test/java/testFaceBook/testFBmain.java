package testFaceBook;

import mainFB.FBmain;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import reporting.TestLogger;

public abstract class testFBmain extends FBmain{
    //WebDriver driver= null;
    @BeforeMethod
    public abstract void launchFB();

    @Test(priority = 1, description = "Validate Title Page")
    public abstract void validateTitlePage();

    @Test(priority = 2, description = "Validate URL")
    public abstract void validateURL();

    @Test(priority = 3, description = "Validate Page Source")
    public abstract void validatePageSource();

    @Test(priority = 4, description = "Incorrect Email, Correct Password")
    public void IncorrectEmailCorrectPass(){
        typeByID("email", "abc123@hotmail.com");
        typeByXpath("//*[@id='pass']", "SocialMediaTeam2");
        clickOnElement("//*[@id='u_0_2']");
    }
    @Test(priority = 5, description = "Correct Email, Incorrect Password")
    public void CorrectEmailIncorrectPass(){
        typeByID("email","prisgray861@hotmail.com");
        typeByXpath("//*[@id='pass']","abc123");
        clickOnElement("//*[@id='u_0_2']");
    }
    @Test(priority = 6, description = "Test Correct Credentials")
    public void correctCredentials(){
        typeByID("email","prisgray861@hotmail.com");
        typeByXpath("pass","SocialMediaTeam2");
        clickOnElement("//*[@id='u_0_2']");
    }
    @Test(priority = 7, description = "Test to Enter into Profile")
    public void enterProfile(){
        clickOnElement("span._1vp5.f_click ");
    }
    @Test(priority = 8, description = "Test to capture Profile Name")
    public String captureProfileName() {
        return null;
    }
    @Test(priority = 9, description = "Test Temporary Bio Functionality")
    public void AddBio(){
        clickOnElement("//*[@id=\'profile_intro_card_bio\']/div/div/a");
        typeByXpath("//*[@id=\"profile_intro_card_bio\"]/div/div/form/textarea", "My name is TeamTwo Social Media.");
        clickOnElement("//*[@id=\"profile_intro_card_bio\"]/div/div/form/div/div[2]/div[2]/div/button[2]");
    }
    @Test(priority = 10, description = "Test to submit a Post")
    public void submitPost(){
        typeByCSS("div._1mf._1mj", "It is Spring. It is 85 degrees today.");
        clickOnElement("//*[@id='js_u7']/div[2]/div[3]/div[2]/span/button/span");
    }
    @Test(priority = 11, description = "Test for Friend Search Functionality")
    public void searchFriends(){
        typeByXpath("//*[@id='js_1l']","Michelle Sourdough");
        clickOnElement("//*[@id=\"js_1y0\"]/div");
    }
    @Test(priority = 12, description = "Test to confirm friend search")
    public void confirmFriend(){
        String friendOne =  captureProfileName();
        if(friendOne == "Michelle Sourdough"){
            clickOnElement("//*[@id='u_ps_fetchstream_19_0_3']/button[1]");
        }
        else{navigateBack();
        }
    }
}
