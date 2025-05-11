package Hooks;

import Utilities.Util;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

public class TestBase extends AbstractTestNGCucumberTests {

    protected static WebDriver driver;

    @BeforeMethod
    public void Setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

    @AfterMethod
    public void tearDown(Method method) throws IOException {
        Util.TakeScreenshot(driver,method.getName());
        driver.quit();
    }
}