package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends PageBase{
    public CheckoutPage(WebDriver driver)
    {
        super(driver);
    }

    private final By CheckoutButton = By.xpath("//a[@class='btn_action checkout_button']");
    private final By FirstNameTextBox = By.id("first-name");
    private final By LastNameTextBox = By.id("last-name");
    private final By PostalCodeTextBox = By.id("postal-code");
    private final By ContinueButton = By.xpath("//input[@class='btn_primary cart_button']");
    private final By FinishButton = By.xpath("//a[@class='btn_action cart_button']");
    private final By completeMessage = By.xpath("//div[@class='complete-text']");



    public void openCheckoutPage()
    {
        driver.findElement(CheckoutButton).click();
    }

    public void fillCheckoutInfo(String FirstName, String LastName, String PostalCode)
    {
        setText(FirstNameTextBox,FirstName);
        setText(LastNameTextBox,LastName);
        setText(PostalCodeTextBox,PostalCode);
    }

    public void ClickOnContinueButton()
    {
        driver.findElement(ContinueButton).click();
    }

    public void ClickOnFinishButton()
    {
        driver.findElement(FinishButton).click();
    }

    public String getCompleteMessage()
    {
        return driver.findElement(completeMessage).getText();
    }

    public void CheckoutSteps(String FirstName, String LastName, String PostalCode)
    {
        openCheckoutPage();
        fillCheckoutInfo(FirstName,LastName,PostalCode);
        ClickOnContinueButton();
        ClickOnFinishButton();
    }



}


