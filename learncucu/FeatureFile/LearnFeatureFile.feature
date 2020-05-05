Feature: opening google and searching
Scenario: Google search Scenario
Given user is entering google.co.in
When User is typing the search  "Vinoth"
And eneter the return key
Then user shoud see the results