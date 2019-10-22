Feature: demo1

  Scenario: test1
    Given launch https://www.google.com
    When save URL as test1
    Then print URL

  Scenario: test2
    Given launch https://www.facebook.com
    When save URL as test2
    Then print URL
