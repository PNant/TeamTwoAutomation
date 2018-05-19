/*package googleSheetsPackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class automationTest {
    public WebDriver driver;
    public WebDriverWait wait;
    String appURL = "appURL";

    private String spreadsheetId = "1Di5IJ07G7dExJlbbkG1IJKWs-YmsErkKbWBN9Xn-E_o";
    private String range = "Sheet1!A2:D";
    String userName = "pris.nant27@gmail.com";
    String password = "EvaTamar1016";

    @BeforeClass
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver","C://Users//prisc//IdeaProjects//TeamTwoAutomation//Generic//browser-driver//chromedriver.exe");
        driver=new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
    }

    //Verify user profile information after login
    @Test
    public void verifyProfileInfo() throws IOException {
        login(userName,password);
        String[] userProfileInfo = getProfileInfo();
        List<String> userData = Arrays.asList(userProfileInfo);
        //Get data from sheet  and verify first profile info of john
        GoogleSheetAPI sheetAPI = new GoogleSheetAPI();
        List<List<Object>> values = sheetAPI.getSpreadSheetRecords(spreadsheetId, range);
        for (List<Object> row : values) {
            if(row.get(0).equals(userName)) {
                Assert.assertEquals(userData, row);
                break;
            }
        }
    }

    public String[] getProfileInfo() {
        //Navigate to Profile page
        driver.findElement(By.id("user-profile")).click();
        String firstName = driver.findElement(By.id("firstname")).getText();
        String lastName = driver.findElement(By.id("lastname")).getText();
        String age = driver.findElement(By.id("user-age")).getText();
        String sex = driver.findElement(By.id("user-sex")).getText();
        String[] arrayUserInfo = {firstName, lastName, age, sex};
        return arrayUserInfo;
    }

    public void login(String userName, String password) {
        driver.findElement(By.id("session_key-login")).sendKeys(userName);
        driver.findElement(By.id("session_password-login")).sendKeys(password);
        driver.findElement(By.id("signin")).click();
    }

    @AfterClass
    public void tearDown() {
        if(driver!=null) {
            driver.quit();
        }
    }
}*/

