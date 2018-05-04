package mainFB;

import base.CommonAPI;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.java2d.cmm.Profile;

public class FBmain extends CommonAPI {
    //Open Browser
    public void launchFB();

    //Validate Title Page
    public void validateTitlePage();

    //Validate URL
    public void validateURL();

    //Print out the page source
    public void validatePageSource();

    //Login with Incorrect Email and Correct Password
    public void typeByID(String "email", String "abc123@hotmail.com");
    public void typeByXpath(String "//*[@id='pass']", String "SocialMediaTeam2");
    public void clickOnElement(String "//*[@id='u_0_2']");

    //Login with Correct Email but Incorrect Password
    public void typeByID(String "email", String "prisgray861@hotmail.com");
    public void typeByXpath(String "//*[@id='pass']", String "abc123");
    public void clickOnElement(String "//*[@id='u_0_2']");

    //Login with correct credentials
    public void typeByID(String "email", String "prisgray861@hotmail.com");
    public void typeByXpath(String "pass", String "SocialMediaTeam2");
    public void clickOnElement(String "//*[@id='u_0_2']");

    //Confirm Correct Profile Page
    public void captureProfileName();

    //Add Bio
    public void clickOnElement(String "//*[@id=\'profile_intro_card_bio\']/div/div/a");
    public void typeByXpath(String "//*[@id=\"profile_intro_card_bio\"]/div/div/form/textarea", String "My name is TeamTwo Social Media.");
    public void clickOnElement(String "//*[@id=\"profile_intro_card_bio\"]/div/div/form/div/div[2]/div[2]/div/button[2]");
}
