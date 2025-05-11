package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage extends PageBase{

    WebDriverWait wait;
    public AddToCartPage(WebDriver driver)
    {
        super(driver);
    }

    private final By ProductItem1 = By.linkText("Sauce Labs Backpack");
    private final By AddToCartButton = By.xpath("//button[@class='btn_primary btn_inventory']");
    private final By BackButton = By.xpath("//button[@class='inventory_details_back_button']");
    private final By ProductItem2 = By.linkText("Sauce Labs Bolt T-Shirt");
    private final By carIcon = By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']");


    public void openItem1()
    {
        driver.findElement(ProductItem1).click();
    }

    public void addItem1ToCart()
    {

        driver.findElement(AddToCartButton).click();
    }

    public void BackToProductsPage()
    {
        driver.findElement(BackButton).click();
    }

    public void openItem2()
    {

        driver.findElement(ProductItem2).click();
    }

    public void addItem2ToCart()
    {
        driver.findElement(AddToCartButton).click();
    }

    public void clickOnCarIcon()
    {
        driver.findElement(carIcon).click();
    }

    public boolean ProductName1IsDisplayed()
    {
        return driver.findElement(ProductItem1).isDisplayed();
    }
    public boolean ProductName2IsDisplayed()
    {
        return driver.findElement(ProductItem2).isDisplayed();
    }

    public void AddToCartSteps()
    {
        openItem1();
        addItem1ToCart();
        BackToProductsPage();
        openItem2();
        addItem2ToCart();
        clickOnCarIcon();
    }
}

