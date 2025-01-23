package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id="firstName")
    public WebElement firstNameLocator;

    @FindBy(id="middleName")
    public WebElement middleNameLocator;

    @FindBy(id="lastName")
    public WebElement lastNameLocator;

    @FindBy(id="employeeId")
    public WebElement employeeIdLocator;

    @FindBy(xpath="//span[@for='firstName']")
    public WebElement firstnameErrorMessage;

    @FindBy(xpath="//span[@for='lastName']")
    public WebElement lastnameErrorMessage;

    @FindBy(id="btnSave")
    public WebElement saveButton;

    public AddEmployeePage() {
        PageFactory.initElements(driver, this);
    }
}
