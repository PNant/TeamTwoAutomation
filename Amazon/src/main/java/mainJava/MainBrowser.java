package mainJava;


import base.CommonAPI;
import org.openqa.selenium.By;

public class MainBrowser extends CommonAPI{

    //String url = "https://www.amazon.com";

    public void browseWebsite(){
        //driver.get(url);
    }

    public void mainAmazonLogin(){
        browseWebsite();
        driver.findElement(By.xpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("test@email.com");
        driver.findElement(By.xpath("//div[@class='a-section']//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abcd1234");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    }

}
