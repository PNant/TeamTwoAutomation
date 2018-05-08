package mainFB;

import base.CommonAPI;

public class facebookFriends extends CommonAPI {
    //Search friend
    public void searchFriends(){
        typeByXpath("//*[@id='js_1l']","Michelle Sourdough");
        clickOnElement("//*[@id=\"js_1y0\"]/div");
    }
    //Confirm correct friend and Submit, Else Navigate back
    public void confirmFriend(){
        String friendOne =  captureProfileName();
        if(friendOne == "Michelle Sourdough"){
            clickOnElement("//*[@id='u_ps_fetchstream_19_0_3']/button[1]");
        }
        else{navigateBack();
        }

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
