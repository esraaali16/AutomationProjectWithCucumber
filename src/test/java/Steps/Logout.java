package Steps;

import Pages.LoginPage;
import Pages.LogoutPage;
import Hooks.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Logout extends TestBase {

    LoginPage loginObject;
    LogoutPage logoutObject = new LogoutPage(driver);

    @Given("user login with {string} and {string} the website")
    public void userLoginWithAndTheWebsite(String username,String password)
    {
        loginObject = new LoginPage(driver);
        loginObject.loginSteps(username,password);
    }
    @When("user open menu")
    public void user_open_menu()
    {
        logoutObject.openMenu();
    }
    @When("user click on logout link")
    public void user_click_on_logout_link()
    {
        logoutObject.ClickOnLogout();
    }
    @Then("user should logout and go to login page")
    public void user_should_logout_and_go_to_login_page()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/v1/index.html");
    }

}

