
Feature: My Searches Dashboard

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Search for a company with selecting all results from dropdown
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching result
    When I click on view all companies results
    #Then I should be redirect to the companies search result page
    Then I should see summary panel with the selected result

  Scenario: validate recent searches
    Given I am on BisCred Admin dashboard
    When I click on first recent search
    Then I should be redirect to the companies search result page
    And I should see results matches with the search criteria displayed in the recent search box

  Scenario: validate recent searches with current date
    Given I am on BisCred Admin dashboard
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to the search results page
    And I back to dashboard page
    And I should see the recent search date match the current date

  Scenario:  Validate if the user can back to home page
    Given I am on BisCred Admin dashboard
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to the search results page
    And I back to dashboard page
    When I click on first recent search
    Then I should be redirect to the search results page
    When I Click on the back arrow on the left side of the page
    Then I should be navigated to the home page again-recent searches boxes

#    #Saved searches
#
  Scenario: validate existing Saved searches
    Given I am on BisCred Admin dashboard
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to the search results page
    And I click on Save search Button
    And I type the name of the Saved search
    Then I click on Submit button
    And I back to dashboard page
    And I click on saved search tab again
    And I should see a saved searches shown on the dashboard


  Scenario: validate existing Saved searches
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching result
    When I click on view all companies results
    Then I should be redirect to the companies search result page
    Then I should see summary panel with the selected result
    And I click on Save search Button
    And I type the name of the Saved search
    Then I click on Submit button
    And I back to dashboard page
    And I click on saved search tab again
    And I should see a saved searches shown on the dashboard