Feature: Location

  Scenario:Location
    Given I am demo home page
    When I login with  username
    When I login with password
    When I locate with pharmacy
    And I click register new patient
    And I enter all required information
      | username     | admin          |
      | password     | Admin123       |
      | location     | pharmacy       |
      | givenName    | Anna           |
      | familyName   | Annand         |
      | gender       | female         |
      | birthdate    | 01             |
      | month        | 01             |
      | year         | 2011           |
      | address      | 2220 W Farwell |
      | phoneNumber  | 1234567        |
      | reletionType | JohnWhite      |
      | click        | confirm        |





