package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends PageBase{

    public LogoutPage(WebDriver driver)
    {
        super(driver);
    }

    private final By Menu = By.xpath("//div[@class='bm-burger-button']");
    private final By LogoutLink = By.linkText("Logout");



    public void openMenu()
    {
        driver.findElement(Menu).click();
    }

    public void ClickOnLogout()
    {
        driver.findElement(LogoutLink).click();
    }

}

