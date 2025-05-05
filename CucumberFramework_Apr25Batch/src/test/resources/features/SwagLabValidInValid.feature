Feature: Login Functionality

  Scenario Outline: ValidInValid Login Test
    Given The user is on the login page
    When The user enters a username "<username>"
    And The user enters a password "<password>"
    And The user clicks the login button
    Then The user should be redirected to the dashboard

    Examples:
      | username        | password      |
      | standard_user | Invalid |
      | Invalid   | secret_sauce |
      | Invalid | Invalid |