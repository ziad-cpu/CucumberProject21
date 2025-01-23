Feature:Add Employee to HRMS

  Background:
    When user enters correct admin username and password
    And user clicks on login button
    Then user is able to see dashboard page
    When user clicks on PIM button
    And user clicks on Add Employee option

    @added
  Scenario:Adding employee using firstname, middlename, and lastname
    And user enters data "Hamdi" and "Mohammed" and "Ziad"
    And user clicks on save button
    Then display employee has been added successfully

    @added
  Scenario:Adding employee using firstname, middlename, lastname, and unique employeeID
    And user enters data "Hamdi" and "Mohammed" and "Ziad" and "12345678"
    And user clicks on save button
    Then display employee has been added successfully

    @error
  Scenario:Adding employee information without firstname
    And user enters data middlename "Mohammed" and lastname "Ziad"
    And user clicks on save button
    Then user is able to see error message Required below firstname textbox

    @error
  Scenario:Adding employee information without lastname
    And user enters data firstname "Hamdi" and middlename "Mohammed"
    And user clicks on save button
    Then user is able to see error message Required below lastname textbox

