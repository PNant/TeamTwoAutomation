package mainFB;

import base.CommonAPI;
import org.openqa.selenium.By;

public class FBmain extends CommonAPI {
        //LaunchFB
    /*public void launchFB(){
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }*/

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

    public void IncorrectEmailCorrectPass(){
       typeByID("email", "abc123@hotmail.com");
       typeByXpath("//*[@id='pass']", "SocialMediaTeam2");
       clickOnElement("//input[@data-testid='royal_login_button']");
    }
    public void CorrectEmailIncorrectPass(){
       typeByID("email","prisgray861@hotmail.com");
       typeByXpath("//*[@id='pass']","abc123");
       clickOnElement("//button[@id='loginbutton']");
    }
    public void correctCredentials(){
        //typeByID("email","prisgray861@hotmail.com");
        typeByID("pass","SocialMediaTeam2");
        clickOnElement("//button[@id='loginbutton']");
    }
    //Click on Profile Name, css Selector
    public void enterProfile(){
        clickOnElement("//span[@class='_1vp5']");
    }
   //Confirm Correct Profile Page
    public String captureProfileName (){
        String profileName = driver.findElement(By.xpath("//*[@id=\'fb-timeline-cover-name\']/a")).getAttribute("href");
        return profileName;
    }
    //Add Bio
    public void AddBio(){
        clickOnElement("//*[@class='_2p2h']");
        typeByXpath("//textarea[@data-testid='profile_intro_card_edit_bio_text_area']", "I am creating a new bio. My name is Team Two Social Media");
        clickOnElement("//button[@data-testid='profile_intro_card_save_bio_button']");
    }
    /*//Type a post and submit
    public void submitPost(){
        System.out.println("Test to Submit Post");
        typeByXpath("//*[@data-offset-key='eniri-0-0']", "This is a test to submit a Post. Submission successful");
        clickOnElement("//span[@class='']");
        System.out.println("Submission Successful");
    }*/
}
