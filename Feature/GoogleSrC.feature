
@googlesearch
Feature: google search
@googlesearch-simple
  Scenario Outline: simple search
    Given i am on the google homepage
    When i enter search as "<term>"
    And i click on google search button
    Then i receive related search results

    Examples: 
      | term              |
      | Quality Assurance |
      |Software Testing   |