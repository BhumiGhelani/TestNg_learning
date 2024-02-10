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

public class Tc_01 {
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
    public void header_menu_validation() throws Exception{
    System.out.println("I am learning TestNG");
    WebElement ele = null;
    Actions action = new Actions(driver);
    ele = driver.findElement(By.xpath("//span[text()='Courses']"));


    // Mouse Hover into Courses Menu bar ...
    if (ele.isDisplayed()) {
        System.out.println("The DevLab Courses Menu Bar is present ......");
        action.moveToElement(ele).perform();
        Thread.sleep(3000);
    }
    // Mouse Hover into Consulting Menu bar ...
    ele = driver.findElement(By.xpath("//button[text()='Consulting']"));
    if (ele.isDisplayed()) {
        System.out.println("The DevLab Consulting Menu Bar is present ......");
        action.moveToElement(ele).perform();
        Thread.sleep(3000);
    }


    // Mouse Hover into Enterprises Menu bar ...
    ele = driver.findElement(By.xpath("//button[text()='Enterprises']"));
    if (ele.isDisplayed()) {
        System.out.println("The DevLab Enterprises Menu Bar is present ......");
        action.moveToElement(ele).perform();
        Thread.sleep(3000);
    }


    // Mouse Hover into Enterprises Menu bar ...
    ele = driver.findElement(By.xpath("//button[text()='Enterprises']"));
    if (ele.isDisplayed()) {
        System.out.println("The DevLab Enterprises Menu Bar is present ......");
        action.moveToElement(ele).perform();
        Thread.sleep(3000);
    }

    // Mouse Hover into Certification Menu bar ...
    ele = driver.findElement(By.xpath("//button[text()='Certification']"));
    if (ele.isDisplayed()) {
        System.out.println("The DevLab Certification Menu Bar is present ......");
        action.moveToElement(ele).perform();
        Thread.sleep(3000);
    }

    // Mouse Hover into Resources Menu bar ...
    ele = driver.findElement(By.xpath("//button[text()='Resources']"));
    if (ele.isDisplayed()) {
        System.out.println("The DevLab Resources Menu Bar is present ......");
        action.moveToElement(ele).perform();
        Thread.sleep(3000);
    }
    // Mouse Hover into Resources Menu bar ...
    ele = driver.findElement(By.xpath("//button[text()='Resources']"));
    if(ele.isDisplayed()) {
        System.out.println("The DevLab Resources Menu Bar is present ......");
        action.moveToElement(ele).perform();
        Thread.sleep(3000);
    }
}

@Test
    public void footer_validation(){
        System.out.println("I am learning TestNG with Selenium");
    WebElement terms = driver.findElement(By.xpath("//p[text()='Terms of Use']"));
if(terms.isDisplayed())
{
    System.out.println("Terms of use is getting displayed");
}
    }

 @AfterClass
 public void close_application(){
driver.quit();
 }
}
