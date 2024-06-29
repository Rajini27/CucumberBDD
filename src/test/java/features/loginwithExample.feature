Feature: Login Action
  Scenario Outline: Successful Login with Valid Credentials
    Given User is on Home page
    When User Navigate to Login Page
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfully
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | visual_user             | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
