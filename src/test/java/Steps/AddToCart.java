package Steps;

import Pages.AddToCartPage;
import Pages.LoginPage;
import Hooks.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddToCart extends TestBase {

        AddToCartPage cartObject;
        LoginPage loginObject;


        @Given("user login with {string} and {string} and go to products page")
        public void userLoginWithAndAndGoToProductsPage(String username, String password)
        {
            loginObject = new LoginPage(driver);
            loginObject.loginSteps(username,password);
        }
        @When("user add Item1 to cart")
        public void user_add_item1_to_cart()
        {
            cartObject = new AddToCartPage(driver);
            cartObject.openItem1();
            cartObject.addItem1ToCart();
        }
        @When("user back to products page")
        public void user_back_to_products_page()
        {
            cartObject.BackToProductsPage();
        }
        @When("user add Item2")
        public void user_add_item2()
        {
            cartObject.openItem2();
            cartObject.addItem2ToCart();
        }
        @When("user click on car Icon")
        public void user_click_on_car_icon()
        {
            cartObject.clickOnCarIcon();
        }
        @Then("user should go to add to cart page")
        public void user_should_go_to_add_to_cart_page()
        {
            Assert.assertTrue(cartObject.ProductName1IsDisplayed());
            Assert.assertTrue(cartObject.ProductName2IsDisplayed());
        }


}

