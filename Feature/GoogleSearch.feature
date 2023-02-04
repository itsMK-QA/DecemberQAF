@google
Feature: Google Search

Scenario Outline: Simple Search

Given I am on the google homepage
When I enter search "<term>"
And I click on google search button
Then I recieve related search result

Examples:
|term							 |
|Quality Assurance |
|Software Testing	 |