Feature: all login scenarios

  Scenario: to test the functionality of login button for valid input
    Given I am on Login page
    When I Enter valid username and password
    And I click on Login button
    Then I should be on home page


  Scenario: to test the functionality of login button for invalid input
    Given I am on Login page
    When I Enter invalid username and password
    And I click on Login button
    Then we should be on same page


  Scenario: to test the functionality of login button for blank input
    Given I am on Login page
    When I Enter blank username and password
    And I click on Login button
    Then we should be on same page
