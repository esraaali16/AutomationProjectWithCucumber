package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


    public class LoginPage extends PageBase{

        public LoginPage(WebDriver driver)
        {
            super(driver);


        }

        private final By UserNameText = By.id("user-name");
        private final By PasswordText = By.id("password");
        private final By LoginButton = By.id("login-button");
        public final By errorMessage = By.xpath("//h3[@data-test='error']");



        public void fillLoginInfo(String username, String password)
        {
            setText(UserNameText,username);
            setText(PasswordText,password);
        }

        public void clickLoginButton()
        {
            driver.findElement(LoginButton).click();

        }

        public boolean isErrorMessageDisplayed() {
            return driver.findElement(errorMessage).isDisplayed();
        }

        public void loginSteps(String username,String password)
        {
            fillLoginInfo(username,password);
            clickLoginButton();
        }
    }

