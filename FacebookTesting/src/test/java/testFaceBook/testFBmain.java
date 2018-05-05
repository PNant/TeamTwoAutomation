package testFaceBook;

import mainFB.FBmain;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class testFBmain extends FBmain{
    @Test
    public void testWebsite(){
        TestLogger.log("Test running");
        browseWebsite();
    }
}
