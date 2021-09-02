Feature: All User register

  @userReg
  Scenario: to test the functionality of submit button for user registration
    Given I am on user registration page
    When I enter below details
      | amol | 898998 | amol@gmail.com    | pune | Tester |
    And I click on submit button
    Then user should be added


    @subscribe
  Scenario Outline: to test the functionality of submit button
    Given I am on subscription page
    When I enter below details <name> , <email> , <phone>
    And I click submit
    Then subscription should be added

    Examples:
      | name    | email             | phone      |
      | amol    | amol@email.com    | 4343434    |
      | asha    | asha@email.com    | 4355443434 |
      | vinay   | vinay@email.com   | 5453434    |
      | anuroop | anuroop@email.com | 323434     |
      | gautham | gautham@email.com | 9993434    |
