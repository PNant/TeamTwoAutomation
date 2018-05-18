package mainFB;

import base.CommonAPI;
import org.openqa.selenium.By;

public class facebookFriends extends CommonAPI {
    public void correctCredentials(){
        typeByID("email","prisgray861@hotmail.com");
        typeByID("pass","SocialMediaTeam2");
        clickOnElement("//input[@data-testid='royal_login_button']");
    }
    //Click on Profile Name, css Selector
    public void enterProfile(){
        clickOnElement("//span[@class='_1vp5']");
    }
    //Search friend
    public void searchFriends() {
        typeByXpath("//input[@placeholder='Search']", "Michelle Sourdough");
        clickOnElement("//i[@class='_585_']");
    }
    //Confirm correct friend and Submit, Else Navigate back
    public void confirmFriendElseNavigateBack() {
        String friendName = driver.findElement(By.xpath("//div[@class='_52eh _5bcu']")).getText();
        if (friendName == "Michelle Sourdough") {
            clickByXpath("//button[@class='_42ft _4jy0 FriendRequestIncoming _52nf _4jy3 _517h _51sy _5f0v']");
        } else {
            navigateBack();
        }
        System.out.println("Successfully accepted Michelle Sourdough as friend.");
    }
}







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
