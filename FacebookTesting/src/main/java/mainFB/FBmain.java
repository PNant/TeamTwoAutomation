package mainFB;

import base.CommonAPI;

public abstract class FBmain extends CommonAPI {
    //Open Browser
    public abstract void launchFB();

    //Validate Title Page
    public abstract String validateTitlePage();

    //Validate URL
    public String  getCurrentPageUrl(){
        String url = driver.getCurrentUrl();
        return url;
    }
    //Print out the page source
    public abstract String validatePageSource();

    public void IncorrectEmailCorrectPass(){
       typeByID("email", "abc123@hotmail.com");
       typeByXpath("//*[@id='pass']", "SocialMediaTeam2");
       clickOnElement("//*[@id='u_0_2']");
    }
    public void CorrectEmailIncorrectPass(){
       typeByID("email","prisgray861@hotmail.com");
       typeByXpath("//*[@id='pass']","abc123");
       clickOnElement("//*[@id='u_0_2']");
    }
    public void correctCredentials(){
       typeByID("email","prisgray861@hotmail.com");
       typeByXpath("pass","SocialMediaTeam2");
       clickOnElement("//*[@id='u_0_2']");
    }
    //Click on Profile Name, css Selector
    public void enterProfile(){
        clickOnElement("span._1vp5.f_click ");
    }
   //Confirm Correct Profile Page
    public abstract String captureProfileName();

    //Add Bio
    public void AddBio(){
        clickOnElement("//*[@id=\'profile_intro_card_bio\']/div/div/a");
        typeByXpath("//*[@id=\"profile_intro_card_bio\"]/div/div/form/textarea", "My name is TeamTwo Social Media.");
        clickOnElement("//*[@id=\"profile_intro_card_bio\"]/div/div/form/div/div[2]/div[2]/div/button[2]");
    }
    //Type a post and submit
    public void submitPost(){
        typeByCSS("div._1mf._1mj", "It is Spring. It is 85 degrees today.");
        clickOnElement("//*[@id='js_u7']/div[2]/div[3]/div[2]/span/button/span");
    }
}
