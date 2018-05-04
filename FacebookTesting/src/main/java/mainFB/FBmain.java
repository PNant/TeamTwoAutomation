package mainFB;

import base.CommonAPI;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.java2d.cmm.Profile;

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
    //Confirm Correct Profile Page
    public abstract void captureProfileName();

    //Add Bio
    public void AddBio(){
        clickOnElement("//*[@id=\'profile_intro_card_bio\']/div/div/a");
        typeByXpath("//*[@id=\"profile_intro_card_bio\"]/div/div/form/textarea", "My name is TeamTwo Social Media.");
        clickOnElement("//*[@id=\"profile_intro_card_bio\"]/div/div/form/div/div[2]/div[2]/div/button[2]");
    }


    //Type a post and submit

    //Search friends

    //Submit friend requests

    //Respond to a friend request

    //Delete a friend

    //Comment on a friend's post

    //Like a post

    //Check Friend Requests and Validate

    //Check Notifications and Validate

    //Check Messages and Validate

    //Delete a Picture

    //Add Profile Picture

    //Add Cover Photo

    //Click on About and Validate

}
