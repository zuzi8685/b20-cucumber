Feature:Sauce swag
  Background:
    Given I am on swag home page



  Scenario: login with valid username
  When I login with valid username and password
  Then I should see items on page


Scenario:Login with locked user
  When I login with locked username and password
  Then I should get error message


Scenario: I am login with visual user
  When I am login with visual user
  Then I should see "onesie" item
  And price should be 7.99


