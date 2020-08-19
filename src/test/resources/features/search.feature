@search
Feature: Search functionality

  Scenario Outline: Search with <keywords> and verify title contains <keywords>
    Given user is on the home page
    And user click search button
    When user enter "<keywords>"
    Then user should verify that title contains "<keywords>"

    Examples:
      | keywords |
      | ?        |
      | wexinc   |


