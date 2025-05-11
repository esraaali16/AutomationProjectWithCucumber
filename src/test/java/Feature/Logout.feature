Feature: Test The logout Functionality

  Scenario Outline: user can logout
    Given user login with "<username>" and "<password>" the website
    When user open menu
    When user click on logout link
    Then user should logout and go to login page

    Examples:
      |     username          |      password        |
      |    standard_user      |     secret_sauce     |