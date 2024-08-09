package Learntestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Learning {

    WebDriver driver;

    @BeforeMethod
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Parameters({"username", "password"})
    @Test
    public void loginToFCM(String username, String password) {
        driver.get("https://fcm.omuni.com/");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }

    @Parameters({"username", "password"})
    @Test
    public void loginToPCM(String username, String password) {
        driver.get("https://pcm.omuni.com/");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }

    @Test
    public void goToIMS() {
        driver.get("https://ims.omuni.com/");
    }
}
