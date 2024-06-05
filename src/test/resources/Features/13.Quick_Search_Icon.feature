Feature: Quick Search Icon

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

#  Scenario: Search for a company using the quick search icon functionality
#    Given I am on BisCred List Page and want to search using quick search icon
#    When I click on search Icon on top nav menu
#    Then I should see a search icon pop up display
#    When I type any company name into quick search bar
#    Then I should See options for matching names
#    When I click on view all companies results
#    Then I should be redirect to the company searchs result page

  Scenario: Search for a contact using the quick search icon functionality
    Given I am on BisCred List Page and want to search using quick search icon
    When I click on search Icon on top nav menu
    Then I should see a search icon pop up display
    When I type any contact name into quick search bar
    Then I should See options for matching names
    When I click on view all contacts results
#    Then I should be redirect to person search result page

  Scenario: Check Open the ""Quick search"" using ""ctrl + k"" Keys Functionality
    Given I am on BisCred List Page and want to search using quick search icon
    When I click on ctrl + k Keys at the same time
    Then I should see a search icon pop up display
    When I type any contact name into quick search bar
    Then I should See options for matching names
    When I click on view all contacts results
    Then I should be redirect to person search result page

  Scenario: Check Open the ""Quick search"" using ""ctrl + k"" Keys Functionality
    Given I am on BisCred List Page and want to search using quick search icon
    When I click on ctrl + k Keys at the same time
    Then I should see a search icon pop up display
    When I type any company name into quick search bar
    Then I should See options for matching names
    When I click on view all companies results
    Then I should see search results that correspond with the entered text
    And I should be redirect to the company searchs result page

  Scenario: Check Close the ""Quick search"" using ""ctrl + k"" Keys Functionality
    Given I am on BisCred List Page and want to search using quick search icon
    When I click on search Icon on top nav menu
    Then I should see a search icon pop up display
    When I click on ctrl + k Keys at the same time
    Then I should see the search pop up closed
    And I should be redirected to the person list page details

  Scenario: Check close the ""Quick search"" using Esc key functionality
    Given I am on BisCred List Page and want to search using quick search icon
    When I click on search Icon on top nav menu
    Then I should see a search icon pop up display
    When I click Esc key from keyboard
    Then I should see the search pop up closed
    And I should be redirected to the person list page details

  Scenario: Check close the ""Quick search"" When clicking anywhere outside the module functionality
    Given I am on BisCred List Page and want to search using quick search icon
    When I click on search Icon on top nav menu
    Then I should see a search icon pop up display
    When I click anywhere outside the module
    Then I should see the search pop up closed
    And I should be redirected to the person list page details

  Scenario: validate recent searches with the search criteria (filter)
    Given I am on BisCred List Page and want to search using quick search icon
    When I click on search Icon on top nav menu
    Then I should see a search icon pop up display
    When I click on Recent Search tab
    Then I should be redirect to the search results page

  Scenario: Search for a person with selecting all results from dropdown
    Given I am on BisCred List Page and want to search using quick search icon
    When I click on search Icon on top nav menu
    Then I should see a search icon pop up display
    When I type any contact name into quick search bar
    Then I should See options for matching names
    When I click on view all contacts results
    Then I should be redirect to person search result page

  Scenario: Search for a company with selecting all results from dropdown
    Given I am on BisCred List Page and want to search using quick search icon
    When I click on search Icon on top nav menu
    Then I should see a search icon pop up display
    When I type any company name into quick search bar
    Then I should See options for matching names
    When I click on view all companies results
#    Then I should see search results that correspond with the entered text
    And I should be redirect to the company searchs result page

