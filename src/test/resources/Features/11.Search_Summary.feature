Feature: Search Summary Feature

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Check the closed icon for search summary on Contact details page
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    And I should see summary panel with the selected result
    When I click on x icon on Search summary panel
    Then I should be redirect to person search result page

  Scenario: Check the closed icon for search summary on Company details page
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "Grey"
    Then I should See options for matching names
    When I select a Company result from the dropdown
    Then I should see a company search results that correspond with the entered text
    And I should see summary panel with the selected company result

  Scenario: Check Open search summary on Contact details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    And I should see summary panel with the selected result
    When I click on x icon on Search summary panel
    Then I should be redirect to person search result page
    When I click on the search summary icon on the left side panel
    Then I should see the search summary displaying again

  Scenario: Check Collapse Icon for Seniority tab on search summary on Contact details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    And I should see summary panel with the selected result
    When I click on minus icon on Search summary panel for Seniority tab
    Then I should see Seniority tab Collapsed

  Scenario: Check Collapse Icon for Location tab on search summary on Contact details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    And I should see summary panel with the selected result
    When I click on minus icon on Search summary panel for Location tab
    Then I should see Location tab Collapsed

  Scenario: Check Collapse Icon for Person Asset Experience tab on search summary on Contact details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    And I should see summary panel with the selected result
    When I click on minus icon on Search summary panel for Person Asset Experience tab
    Then I should see Person Asset Experience tab Collapsed

  Scenario: Check expand Icon for Seniority tab on search summary on Contact details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    And I should see summary panel with the selected result
    When I click on + icon on Search summary panel for Seniority tab
    Then I should see Seniority tab Expanded and details display for Seniority results

  Scenario: Check expand Icon for Location tab on search summary on Contact details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    And I should see summary panel with the selected result
    When I click on + icon on Search summary panel for Location tab
    Then I should see Location tab Expanded and details display for location results

  Scenario: Check expand Icon for Person Asset Experience tab on search summary on Contact details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    And I should see summary panel with the selected result
    When I click on + icon on Search summary panel for Person Asset Experience tab
    Then I should see Person Asset Experience tab Expanded and details display for Asset Experience results

  Scenario: Check Collapse Icon for Company Industries tab on search summary on Company details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    And I should see summary panel with the selected result
    When I click on - icon on Search summary panel for Company Industries tab
    Then I should see Company Industries tab Collapsed

  Scenario: Check Collapse Icon for Company Asset Experience tab on search summary on Company details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    And I should see summary panel with the selected result
    When I click on - icon on Search summary panel for Company Asset Experience tab
    Then I should see Company Asset Experience tab Collapsed

  Scenario: Check Collapse Icon for Company Headquarters tab on search summary on Company details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    And I should see summary panel with the selected result
    When I click on - icon on Search summary panel for Company Headquarters tab
    Then I should see Company Headquarters tab Collapsed

  Scenario: Check Collapse Icon for Company Regional Offices tab on search summary on Company details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    And I should see summary panel with the selected result
    When I click on - icon on Search summary panel for Company Regional Offices tab
    Then I should see Company Regional Offices tab Collapsed

  Scenario: Check Expand Icon for Company Industries tab on search summary on Company details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    And I should see summary panel with the selected result
    When I click on + icon on Search summary panel for Company Industries tab
    Then I should see Company Industries tab Expanded and the details display

  Scenario: Check Expand Icon for Company Asset Experience tab on search summary on Company details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    And I should see summary panel with the selected result
    When I click on + icon on Search summary panel for Company Asset Experience tab
    Then I should see Company Asset Experience tab Expanded and the details display

  Scenario: Check Expand Icon for Company Headquarters tab on search summary on Company details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    And I should see summary panel with the selected result
    And I should see summary panel with the selected result
    When I click on + icon on Search summary panel for Company Headquarters tab
    Then I should see Company Headquarters tab Expanded and the details display

  Scenario: Check Expand Icon for Company Regional Offices tab on search summary on Company details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    And I should see summary panel with the selected result
    When I click on + icon on Search summary panel for Company Regional Offices tab
    Then I should see Company Regional Offices tab Expanded and the details display

  Scenario: Check Copy chart for Company Industries in search summary on Company details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    And I should see summary panel with the selected result
    When I click on Settings icon for Company Industries in Search summary panel
    And I should see a drop down list for charts
    And I click on copy chart
    Then I should see success massage "Chart copied to clipboard"

  Scenario: Check Copy chart for Company Asset Experience in search summary on Company details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    And I should see summary panel with the selected result
    When I click on Settings icon for Company Asset Experience in Search summary panel
    And I should see a drop down list for charts
    And I click on copy chart
    Then I should see success massage "Chart copied to clipboard"

  Scenario: Check Copy chart for Company Regional Offices in search summary on Company details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    And I should see summary panel with the selected result
    And I should see summary panel with the selected result
    When I click on Settings icon for Company Regional Offices in Search summary panel
    And I should see a drop down list for charts
    And I click on copy chart
    Then I should see success massage "Chart copied to clipboard"

  Scenario: Check Copy chart for Company Company Headquarters in search summary on Company details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about companies
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    And I should see summary panel with the selected result
    When I click on Settings icon for Company Headquarters In Search summary panel
    And I should see a drop down list for charts
    And I click on copy chart
    Then I should see success massage "Chart copied to clipboard"

  Scenario: Check Copy chart for Seniority in search summary in Contact details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    And I should see summary panel with the selected result
    When I click on Settings icon for Seniority in Search summary panel
    And I should see a drop down list for charts
    And I click on copy chart
    Then I should see success massage "Chart copied to clipboard"

  Scenario: Check Copy chart for Person Asset Experience in search summary in Contact details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    And I should see summary panel with the selected result
    When I click on Settings icon for Person Asset Experience in Search summary panel
    And I should see a drop down list for charts
    And I click on copy chart
    Then I should see success massage "Chart copied to clipboard"

  Scenario: Check Copy chart for Location in search summary in Contact details page from the side panel
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    And I should see summary panel with the selected result
    When I click on Settings icon for Location in Search summary panel
    And I should see a drop down list for charts
    And I click on copy chart
    Then I should see success massage "Chart copied to clipboard"