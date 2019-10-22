Feature: demo2

  Scenario: test3
    Given launch https://www.yahoo.com
    When save URL as test3
    Then print URL

  Scenario: test4
    Given launch https://www.twitter.com
    When save URL as test4
    Then print URL

