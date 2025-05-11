package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver)
    {
        this.driver = driver;
    }

    protected  void setText(By element, String value)
    {
        driver.findElement(element).sendKeys(value);
    }
}
