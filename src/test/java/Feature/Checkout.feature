Feature: Test The Checkout Functionality

  Scenario Outline: user can checkout to products
    Given user loggedin with "<username>" and "<password>" and go to products page
    When user add products to cart
    When user click on checkout button
    And user fill "<firstname>" and "<lastname>" and "<postalcode>"
    And user click on continue button
    And user click on finish button
    Then success message should appear to user

    Examples:
      |     username          |      password        |   firstname   |  lastname  |   postalcode   |
      |    standard_user      |     secret_sauce     |     test      |     user   |     12345      |
