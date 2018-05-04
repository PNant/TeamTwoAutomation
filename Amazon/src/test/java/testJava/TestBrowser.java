package testJava;

import mainJava.MainBrowser;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestBrowser extends MainBrowser {

    @Test
    public void testWebsite(){
        TestLogger.log("Test running");
        browseWebsite();
    }

    @Test
    public void testLogin(){
        TestLogger.log("Test running");
        mainAmazonLogin();
    }
}
