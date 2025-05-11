package Steps;

import Pages.AddToCartPage;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Hooks.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Checkout extends TestBase {
    LoginPage loginObject;
    AddToCartPage cartObject;
    CheckoutPage checkoutObject = new CheckoutPage(driver);


    @Given("user loggedin with {string} and {string} and go to products page")
    public void userLoggedinWithAndAndGoToProductsPage(String username, String password)
    {
        loginObject = new LoginPage(driver);
        loginObject.loginSteps(username,password);
    }

    @When("user add products to cart")
    public void user_add_products_to_cart()
    {
        cartObject = new AddToCartPage(driver);
        cartObject.AddToCartSteps();
    }
    @When("user click on checkout button")
    public void user_click_on_checkout_button()
    {
        checkoutObject.openCheckoutPage();
    }
    @And("user fill {string} and {string} and {string}")
    public void userFillAndAnd(String FirstName,String LastName,String PostalCode) {

        checkoutObject.fillCheckoutInfo(FirstName,LastName, PostalCode);
    }
    @When("user click on continue button")
    public void user_click_on_continue_button()
    {
        checkoutObject.ClickOnContinueButton();
    }
    @When("user click on finish button")
    public void user_click_on_finish_button()
    {
        checkoutObject.ClickOnFinishButton();
    }
    @Then("success message should appear to user")
    public void success_message_should_appear_to_user()
    {
        Assert.assertEquals(checkoutObject.getCompleteMessage(),"Your order has been dispatched, and will arrive just as fast as the pony can get there!");
    }

}
