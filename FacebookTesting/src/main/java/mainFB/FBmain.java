package mainFB;

import base.CommonAPI;

public abstract class FBmain extends CommonAPI {
    //Open Browser
    public abstract void launchFB();

    //Validate Title Page
    public abstract void validateTitlePage();

    //Validate URL
    public abstract void validateURL();

    //Print out the page source
    public abstract void validatePageSource();

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
    //Search friends
    public void searchFriends(){
        typeByXpath("//*[@id='js_1l']","Michelle Sourdough");
        clickOnElement("//*[@id=\"js_1y0\"]/div");
    }
    //Confirm correct friend and Submit, Else Navigate back
    public void confirmFriend(){
        String friendOne =  captureProfileName();
        if(friendOne = "Michelle Sourdough"){
            clickOnElement("//*[@id='u_ps_fetchstream_19_0_3']/button[1]");
        }
        else{navigateBack();
        }

        }
    }
}

    //Click on About and Validate

