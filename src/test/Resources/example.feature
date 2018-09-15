

Feature: Open Website


  Scenario: Open Firefox
    Given type codersguru
    Then Goto add new user
    When type in to formular
    And  type username
    And  type Last Name
    And  Password
    And  Repeat password
    And  Type City Name
    And  Type Zip-Code
    And  Type Street Name
    And  Type Home Number
    And  Click "agree"
    And  Click register
