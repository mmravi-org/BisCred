Feature: Quick Search

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario:Search for a company using the quick search functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I select a Company result from the dropdown
    Then I should see a company search results that correspond with the entered text
    And I should see summary panel with the selected company result

  Scenario:Search for a specific record using the quick search functionality
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    And I should see summary panel with the selected result

  Scenario: Search for a person using the quick search functionality
    Given I am on BisCred Admin dashboard and want to search about specific record
    When I type any person name into quick search bar "Tandi"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should be redirect to person search results page
    And I should see a person search results that correspond with the entered text
    And I should see summary panel with the selected contact result

  Scenario: Search for a person with selecting all results from dropdown
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Tandi"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to the search All results page and see many possible results returned
    When I click on any contact name
    And I should see summary panel with the selected result

  Scenario: Search for a company with selecting all results from dropdown
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching result
    When I click on view all companies results
    Then I should be redirect to the companies search result page
    Then I should see summary panel with the selected result

  Scenario: Start a new search
    Given I am on BisCred Admin dashboard and want to start new search
    When I type any person name into quick search bar "Tandi"
    Then I should See options for matching names
    When I Select a result from the dropdown
    Then I should be redirect to person search results page
    When I click on Start New Search button
    And I should be back to the landing page search page

  Scenario: Checkboxes on the Person result page
    Given I am on BisCred Admin dashboard
    When I type any person name into quick search bar "Tandi"
    Then I should See options for matching names
    When  I click on view all contacts results
    Then I should be redirect to the search All results page and see many possible results returned
    When I click on select and unselect checkboxes
    And I should be able to selected and unselected contacts with a shown number of the selected numbers in the page footer

  Scenario: Checkboxes on the Company result page
    Given I am on BisCred Admin dashboard
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When  I click on view all companies results
    Then I should be redirect to the companies search result page
    When I click on select and unselect checkboxes
    And I should be able to selected and unselected companies with a shown number of the selected numbers in the page footer

  Scenario: Sort arrows on the Person result page
    Given I am on BisCred Admin dashboard
    When I type any person name into quick search bar "Tandi"
    Then I should See options for matching names
    When  I click on view all contacts results
    Then I should be redirect to person search result page
    When I click on sort arrow beside person name
    And I should see the results sorted alphabitaclly

  Scenario: Sort arrows on the Company result page
    Given I am on BisCred Admin dashboard
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When  I click on view all companies results
    Then I should be redirect to the companies search result page
    When I click on sort arrow beside companys name
    And I should see the results sorted alphabitaclly

  Scenario: DDL (Items per page) on the Person result page
    Given I am on BisCred Admin dashboard
    When I type any person name into quick search bar "Tandi"
    Then I should See options for matching names
    When  I click on view all contacts results
    Then I should be redirect to person search result page
    And I should see Items per page on the page bottom should be reflected on the shown data on the page

  Scenario: DDL (Items per page) on the Company result page
    Given I am on BisCred Admin dashboard
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When  I click on view all companies results
    Then I should be redirect to the companies search result page
    And I should see Items per page on the page bottom should be reflected on the shown data on the page
