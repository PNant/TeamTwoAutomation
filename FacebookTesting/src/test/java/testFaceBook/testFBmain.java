package testFaceBook;

import mainFB.FBmain;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class testFBmain extends FBmain{

    @Test(priority = 1, description = "TestLogInFunctionality")
    public void testWebsite(){
        TestLogger.log("Test running");
    }

    public void launchFB() {

    }

    public void validateTitlePage() {

    }

    public void validateURL() {

    }

    public void validatePageSource() {

    }

    public String captureProfileName() {
        return null;
    }
}
