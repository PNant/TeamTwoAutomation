package testFaceBook;

import mainFB.facebookFriends;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testFBfriends extends facebookFriends {
    @Test(description = "Test to Search specific friend")
    public void testSearchFriends() {
        correctCredentials();
        enterProfile();
        searchFriends();
        confirmFriendElseNavigateBack();
    }
}
