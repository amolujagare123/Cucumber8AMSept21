Feature: all login scenarios

  Background: opening a browser
    Given browser is opened
    And it is maximized

  @login
  Scenario: to test the functionality of login button for valid input
    Given I am on Login page
  #  When I Enter valid username and password
    When I enter username as "admin" and password as "admin"
    And I click on Login button
    Then I should be on home page

  @login  @invalid
  Scenario: to test the functionality of login button for invalid input
    Given I am on Login page
 #   When I Enter invalid username and password
    When  I enter username as "dsdsd" and password as "dsdsd"
    And I click on Login button
    Then we should be on same page

  @login
  Scenario: to test the functionality of login button for blank input
    Given I am on Login page
 #   When I Enter blank username and password
    When  I enter username as "" and password as ""
    And I click on Login button
    Then we should be on same page

