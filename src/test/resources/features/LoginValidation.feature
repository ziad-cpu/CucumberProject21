Feature:Login Validation for HRMs Portal

  Scenario:Valid admin login
    When user enters correct admin username and password
    And user clicks on login button
    Then user is able to see dashboard page


  Scenario:Empty username field login
    When user leaves username field empty
    And user clicks on login button
    Then user is able to see error message Username cannot be empty


  Scenario:Empty password field login
    When user leaves password field empty
    And user clicks on login button
    Then user is able to see error message Password is empty


  Scenario:Incorrect login credentials
    When user enters either the wrong username or password
    And user clicks on login button
    Then user is able to see error message Invalid credentials