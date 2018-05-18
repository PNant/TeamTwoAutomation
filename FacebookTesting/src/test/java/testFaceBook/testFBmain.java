package testFaceBook;

import com.gargoylesoftware.htmlunit.Page;
import mainFB.FBmain;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class testFBmain extends FBmain {
    //WebDriver driver= null;
   /* @BeforeMethod
    public void testLaunchFB(){
        launchFB();
    }*/

    @Test(priority = 1, description = "Test FB main functions")
    public void testValidateTitlePage() {
        System.out.println("Test Title Page");
        validateTitlePage();
        validatePageSource();
        IncorrectEmailCorrectPass();
        CorrectEmailIncorrectPass();
        correctCredentials();
        enterProfile();
        captureProfileName();
        AddBio();
        //submitPost();
    }
}
