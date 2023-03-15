@logout

Feature: Log out functionality

  Background: User is  on the login  page
    Given user  is on the login page
    And user logged in with  valid credential

  Scenario: User  can log out and ends up in  login page
    When user clicks username at the right top  of  the  corner
    And user clicks log out button
    Then user  goes back to login page

  Scenario: User  can not go to the  home  page  again by clicking the step back button after successfully logged out
    When  user clicks username at the right top  of  the  corner
    And user clicks log out button
    Then  user  goes back to login page
    And user press back key on the keyboard
    And user is still on the page