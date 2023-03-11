Feature: Login Functionality

  Background: Login page
    Given User is on the login page

  @FIDEX10-352
  Scenario Outline: Login with valid  credentials
    When User  enters valid email"<email>"
    And User enters valid password"<password>"
    And User clicks login button
    Then User should be on the  homepage
    Examples: Email and Password
      | email                    | password     |
      | salesmanager6@info.com   | salesmanager |
      | salesmanager100@info.com | salesmanager |
      | posmanager53@info.com    | posmanager   |
      | posmanager100@info.com   | posmanager   |

  @FIDEX10-355
  Scenario Outline: Login with invalid  credentials
    When User  enters invalid email"<email>"
    And User enters invalid password"<password>"
    And User clicks login button
    Then User should see the error message

    Examples: Email and Password
      | email                    | password     |
      | salesmanage6@info.com    | salesmanager |
      | salesmanager100@info.com | salesmanage  |
      | posmanager1@info.com     | posmanager   |
      | posmanager100@info.com   | pomanager    |

  @FIDEX10-356
  Scenario: "Please fill out this field" message should be displayed if the password or username is empty
    When user do not enter email or password
    And  user clicks login button
    Then user see "Please fill in this field." warning message
@FIDEX10-357
  Scenario:User land on the ‘reset password’ page after clicking on the "Reset password" link
    When user click on the Reset password link
    Then user land on the reset password page

  @FIDEX10-358
  Scenario : User should see the password in bullet signs by default
    When user enters valid password "salesmanager"
    Then user see the password in bullet signs

  @FIDEX10-359
  Scenario Outline: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
    When  user enters valid email "<email>"
    And user enters valid password "<password>"
    And user enters Enter key on the keyboard.
    Then user is on home page
    Examples:Email and Passwords
      | email                   | password     |
      | salesmanager90@info.com | salesmanager |
      | posmanager60@info.com   | posmanager   |
      | salesmanager95@info.com | salesmanager |
      | posmanager63@info.com   | posmanager   |
      | salesmanager10@info.com | salesmanager |
      | posmanager100@info.com  | posmanager   |
      | salesmanager97@info.com | salesmanager |
      | posmanager69@info.com   | posmanager   |