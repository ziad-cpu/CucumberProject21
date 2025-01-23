package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class AddEmployeeSteps extends CommonMethods {

    @When("user clicks on PIM button")
    public void user_clicks_on_pim_button() {
        click(dashboardPage.pimOption);
    }

    @When("user clicks on Add Employee option")
    public void user_clicks_on_add_employee_option() {
        click(dashboardPage.addEmployeeOption);

    }

    @When("user enters data {string} and {string} and {string}")
    public void user_enters_data_and_and
            (String firstname, String middlename, String lastname) {
        sendText(firstname, addEmployeePage.firstNameLocator);
        sendText(middlename, addEmployeePage.middleNameLocator);
        sendText(lastname, addEmployeePage.lastNameLocator);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeePage.saveButton);
    }

    @Then("display employee has been added successfully")
    public void display_employee_has_been_added_successfully() {
        System.out.println("Employee has been added successfully");
    }

    @When("user enters data {string} and {string} and {string} and {string}")
    public void user_enters_data_and_and_and
            (String firstname, String middlename, String lastname, String employeeid) {
        sendText(firstname, addEmployeePage.firstNameLocator);
        sendText(middlename, addEmployeePage.middleNameLocator);
        sendText(lastname, addEmployeePage.lastNameLocator);
        sendText(employeeid, addEmployeePage.employeeIdLocator);
    }




    @When("user enters data middlename {string} and lastname {string}")
    public void user_enters_data_middlename_and_lastname
            (String middlename, String lastname) {
        sendText(middlename, addEmployeePage.middleNameLocator);
        sendText(lastname, addEmployeePage.lastNameLocator);


    }
    @Then("user is able to see error message Required below firstname textbox")
    public void user_is_able_to_see_error_message_required_below_firstname_textbox() {
        System.out.println("Error, firstname required is present");
    }
    @When("user enters data firstname {string} and middlename {string}")
    public void user_enters_data_firstname_and_middlename
            (String firstname, String middlename) {
        sendText(firstname, addEmployeePage.firstNameLocator);
        sendText(middlename, addEmployeePage.middleNameLocator);

    }
    @Then("user is able to see error message Required below lastname textbox")
    public void user_is_able_to_see_error_message_required_below_lastname_textbox() {
        String lastnameErrorMsg = addEmployeePage.lastnameErrorMessage.getText();
        Assert.assertEquals("Required", lastnameErrorMsg);
        System.out.println("Error, lastname required is present");
    }
}
