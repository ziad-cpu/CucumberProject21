package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;
import utils.ConfigReader;

import java.time.Duration;

import static utils.PageInitializer.dashboardPage;
import static utils.PageInitializer.loginPage;

public class LoginValidationSteps extends CommonMethods {

    @When("user enters correct admin username and password")
    public void user_enters_correct_admin_username_and_password() {
        sendText(ConfigReader.read("userName"), loginPage.usernameField);
        sendText(ConfigReader.read("password"), loginPage.passwordField);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginButton);
    }
    @Then("user is able to see dashboard page")
    public void user_is_able_to_see_dashboard_page() {
        Assert.assertTrue(dashboardPage.messageText.isDisplayed());
    }

    @When("user leaves username field empty")
    public void user_leaves_username_field_empty() {
        sendText(ConfigReader.read("password"), loginPage.passwordField);
    }

    @Then("user is able to see error message Username cannot be empty")
    public void user_is_able_to_see_error_message_Username_cannot_be_empty() {
        String userNameErrorMsg = loginPage.errorMessage.getText();
        Assert.assertEquals("Username cannot be empty", userNameErrorMsg);
        System.out.println("\"Username cannot be empty\" error message shown");
    }

    @When("user leaves password field empty")
    public void user_leaves_password_field_empty() {
        sendText(ConfigReader.read("userName"), loginPage.usernameField);

    }

    @Then("user is able to see error message Password is empty")
    public void user_is_able_to_see_error_message_Password_is_empty() {
        String passwordErrorMsg = loginPage.errorMessage.getText();
        Assert.assertEquals("Password is Empty", passwordErrorMsg);
        System.out.println("\"Password is Empty\" error message shown");
    }

    @When("user enters either the wrong username or password")
    public void user_enters_either_the_wrong_username_or_password() {
        sendText("userName", loginPage.usernameField);
        sendText("password1", loginPage.passwordField);
    }
    @Then("user is able to see error message Invalid credentials")
    public void user_is_able_to_see_error_message_Invalid_credentials() {
        String invalidErrorMsg = loginPage.errorMessage.getText();
        Assert.assertEquals("Invalid credentials", invalidErrorMsg);
        System.out.println("\"Invalid credentials\" error message shown");
    }
}
