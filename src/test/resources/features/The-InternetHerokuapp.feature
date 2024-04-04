Feature: The Internet herokuapp
  Scenario: Validate links on home page
    When I navigate to home page
    Then should see 44 links

Scenario: Validate checkboxes header
  When I navigate to Checkboxes page
  Then I navigate page header

  Scenario:Uber eats
    When user search for Uber eats
    Then user can order delivery near you

