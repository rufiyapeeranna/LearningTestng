package Learntestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Learning2 {

    WebDriver driver;

    @BeforeMethod
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

  

    @Parameters({"username", "password"})
    @Test
    public void loginToOMS(String username, String password) {
        driver.get("https://oms.omuni.com/");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        // Add assertions or further actions as needed
    }

    @Test
    public void loginToUSI() {
        driver.get("https://usi.omuni.com/");
        driver.findElement(By.id("")).sendKeys();
        driver.findElement(By.id("")).sendKeys();
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        // Add assertions or further actions as needed
    }

    @Parameters({"username", "password"})
    @Test
    public void loginToCloud(String username, String password) {
        driver.get("https://cloud.omuni.com/");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        // Add assertions or further actions as needed
    }
}
