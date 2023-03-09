Feature: Login Functionality

  Background: Login page
    Given User is on the login page

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

  Scenario Outline: User should see validation message when using empty credentials
    When  User enter "<username>" in username box
    And User enter "<password>" in password box
    And User clicks login button
    Then User should  see "Please fill out this  field." message

    Examples:Email and Password
      | username                | password   |
      |                         |            |
      | salesmanager39@info.com |            |
      |                         | posmanager |
