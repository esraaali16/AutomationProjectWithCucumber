Feature: Test The AddToCart Functionality

  Scenario Outline: user can add products to cart
    Given user login with "<username>" and "<password>" and go to products page
    When user add Item1 to cart
    And user back to products page
    And user add Item2
    And user click on car Icon
    Then user should go to add to cart page

    Examples:
      |     username          |      password        |
      |    standard_user      |     secret_sauce     |