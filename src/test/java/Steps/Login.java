package Steps;

import Pages.LoginPage;
import Hooks.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Login extends TestBase {

    LoginPage loginObject;

    @Given("user open the website on the login page")
    public void user_open_the_website_on_the_login_page()
    {
        loginObject = new LoginPage(driver);
    }

    @When("user fill {string} and {string} and click on login button")
    public void userFillAndAndClickOnLoginButton(String username, String password) {
        loginObject.loginSteps(username,password);
    }

    @Then("user should get to home page")
    public void user_should_get_to_home_page()
    {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/v1/inventory.html");
    }



}
