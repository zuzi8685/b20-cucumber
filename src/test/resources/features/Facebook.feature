Feature: Login functionality

  Scenario Outline:
    Given I am on facebook home page
    When I enter invalid Facebook eamail "<email>"
    And I enter invalid Facebook password "<password>"
    Then I should get error message: "<error>"

    Examples:
      | email            | password      | error                                                |
      | test1234512@te.com | myFavPassword | The email you entered isn’t connected to an account. |