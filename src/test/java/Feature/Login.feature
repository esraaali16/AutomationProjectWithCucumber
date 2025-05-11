Feature: Test The Login Functionality

  Scenario Outline: User login with valid name and valid password
    Given user open the website on the login page
    When user fill "<username>" and "<password>" and click on login button
    Then user should get to home page


    Examples:
      |     username          |      password        |
      |standard_user|secret_sauce|