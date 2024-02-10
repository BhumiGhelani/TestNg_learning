package pkg_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class login {

    WebDriver driver = null;

    @Parameters("url")
    @BeforeClass
    public void launchApplication(String url) throws Exception{
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(2000);
    }

    @Test
    public void login_validation() throws Exception {
        driver.findElement(By.xpath("//button[@id='header_Button']")).click();
        if(driver.findElement(By.xpath("//span[text()='Email ID']")).isDisplayed());
        System.out.println("Email ID text is present");

        if (driver.findElement(By.xpath("//div/input[@name='email']")).isDisplayed());
        System.out.println("Email ID input box is present");

        if(driver.findElement(By.xpath("//span[text()='Password']")).isDisplayed());
        System.out.println("Password text is present");

        if (driver.findElement(By.xpath("//div/input[@name='password']")).isDisplayed());
        System.out.println("Password input box is present");

        driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys("ghelanibhumi@gmail.com");
        driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys("Z0aiH8VxDP");

    }
    @AfterClass
    public void close_application(){
        driver.quit();
    }
}
