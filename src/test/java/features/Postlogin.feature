Feature: Post Feature of FaceBook
  This will test the post functionality at user wall

  Scenario: Post a message on user wall
    Given User should be logged in and should be present on his wall
    When I type the message in the box
    And Click on the Post button
    Then the message should be posted
@SmokeTest
  Scenario: Post a video on user wall
    Given User should be logged in and should be present at its own wall
    When User supply the youtube link in the text box
    And Click on the Post button
    Then Then video should get posted on the user wall
    And the video should have proper thumbnail