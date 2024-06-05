Feature: Company Details Page

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Search for a company using the quick search functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 Federal"
    Then I should See options for matching names
    When I select a the exact company from result
    And I should see summary panel with the selected company result
    When I click on Validate Profile Indexing link
    Then I should see a message "Company: (98984f8a-caee-4454-aaef-3496ac370fd1) 10 Federal, has been reindexed."
    When I click on Company webSite
#    Then I should be redirected to the company profile


  Scenario: Check the Remove lists column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Columns button on company details page
    And I click on selection box beside the lists column for company
    And I should see the Lists column removed from the company details page

  Scenario: Check the Remove Industry column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Columns button on company details page
    And I click on selection box beside Industry column for company
    And I should see Industry column removed from the company details page


  Scenario: Check the Remove Asset Experience column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Columns button on company details page
    And I click on selection box beside Asset Experience column
    And I should see Asset Experience column removed from the company details page


  Scenario: Check the Remove Property Count column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Columns button on company details page
    And I click on selection box beside Property Count column
    And I should see Property Count column removed from the company details page

  Scenario: Check the Remove Contact Count column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Columns button on company details page
    And I click on selection box beside Contact Count column
    And I should see Contact Count column removed from the company details page

  Scenario: Check the Remove HQ City column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Columns button on company details page
    And I click on selection box beside HQ City column
    And I should see HQ City column removed from the company details page

  Scenario: Check the Remove HQ State column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Columns button on company details page
    And I click on selection box beside HQ State column
    And I should see HQ State column removed from the company details page

  Scenario: Check the Remove LinkedIn column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Columns button on company details page
    And I click on selection box beside Company LinkedIn column
    And I should see LinkedIn column removed from the company details page

  Scenario: Check the Remove WebSites columns Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Columns button on company details page
    And I click on selection box beside WebSites column
    And I should see WebSites column removed from the company details page

  Scenario: Check the Remove Phone column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Columns button on company details page
    And I click on selection box beside phone column
    And I should see phone column removed from the company details page




#    Hide function

  Scenario: Check the Hide lists column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on The hide link beside list column on company details page
    And I should see the Lists column removed from the company details page

  Scenario: Check the Hide Industry column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Hide link beside the Industry column on company details page
    And I should see Industry column removed from the company details page

  Scenario: Check the Hide Asset Experience column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Hide link beside the Asset Experience column
    And I should see Asset Experience column removed from the company details page

  Scenario: Check the Hide Property Count column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Hide link beside the Property Count column
    And I should see Property Count column removed from the company details page

  Scenario: Check the Hide Contact Count column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Hide link beside the Contact Count column
    And I should see Contact Count column removed from the company details page


  Scenario: Check the Hide HQ City column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Hide link beside the HQ City column
    And I should see HQ City column removed from the company details page

  Scenario: Check the Hide HQ State column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Hide link beside the HQ State column
    And I should see HQ State column removed from the company details page

  Scenario: Check the Hide LinkedIn column Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Hide link beside the LinkedIn column
    And I should see LinkedIn column removed from the company details page

  Scenario: Check the Hide WebSites columns Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Hide link beside the WebSites column
    And I should see WebSites column removed from the company details page

  Scenario: Check the Hide Phone columns Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Hide link beside the Phone column
    And I should see phone column removed from the company details page

  Scenario: Check new search Button Functionality
    Given I am on BisCred Admin dashboard and want to search about company using quick search
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
     When I click on view all companies results link
    When I click on New Search
    Then I should be redirected to the Quick Search Tab


  Scenario: Check "Save Company" to List on profile panel and results still selected Functionality to new list
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I select a Company result from the dropdown
    And I click on save Company Button inside profile panel
    Then I should see a pop up display for Save companies to List
    When I click on New List Tab
    And I type a list name on List Name Field
    And I leave the checkbox of Clear selected results after submit. not selected
    When I click on New List Tab
    And I click on Submit button
    Then I should see a notification massage "Saved successfully to your list."
    And I should see the list added to the profile panel
    When I click on saved list
    Then I should be redirected to the save list page

  Scenario: Check "Cancel" on the delete Saved List on profile panel Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I select a Company result from the dropdown
    When I click on the Delete icon beside list name on profile panel
    Then I should see Remove from List pop up
    And I click on Cancel button
    Then I should see the list not deleted
#
  Scenario: Check "Close Icon" on the delete Saved List on profile panel Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I select a Company result from the dropdown
    When I click on the Delete icon beside list name on profile panel
    Then I should see Remove from List pop up
    And I click on close icon on Remove from List pop up
    And I should see the list not deleted

  Scenario: Check delete Saved List on profile panel Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I select a Company result from the dropdown
    When I click on Delete icon beside list name on profile panel
    Then I should see Remove from List pop up
    And I click on Remove from List button
#    Then I should see a notification massage "Company has been removed from list." for removing list
#    And I should see the company not saved to new list



  Scenario: Check the "Clear selected results after submit" checkbox Functionality - checked
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
   When I click on view all companies results link
    Then I select all the companies on the search result
    Then I close the summary panel
    Then I click on the first company in the shown list
    And I click on save Company Button inside profile panel
    Then I should see a pop up display for Save companies to List
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on the checkbox of Clear selected results after submit. not selected
    When I click on New List Tab
    And I click on Submit button
    Then I should see a notification massage "Saved successfully to your list."
    And I should see the list added to the profile panel
    And I should see All selected options cleared and not selected


  Scenario: Check Cancel Save company List on profile panel Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    Then I select all the companies on the search result
    Then I close the summary panel
    Then I click on the first company in the shown list
  When I click on save Company Button inside profile panel
    Then I should see a pop up display for Save companies to List
    When I click on existing list Tab
    And I select any list from drop down list options
    And I click on Cancel button on save companies to list
    Then I should be redirect to the company search result page
    And I should see the company list not changed

  Scenario: Check Close icon on Save person List on profile panel Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    Then I select all the companies on the search result
    Then I close the summary panel
    Then I click on the first company in the shown list
    When I click on save Company Button inside profile panel
    Then I should see a pop up display for Save companies to List
    When I click on existing list Tab
    And I select any list from drop down list options
    And I click on close icon on save companies to list
    Then I should be redirect to the company search result page
    And I should see the company list not changed

  Scenario: Check fill the list name with space on Save company List Functionality to new list
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    Then I select all the companies on the search result
    Then I close the summary panel
    Then I click on the first company in the shown list
    And I click on save Company Button inside profile panel
    Then I should see a pop up display for Save companies to List
    When I click on New List Tab
    And I fill the list name field with space
    When I click on New List Tab
    And I click on Submit button
    Then I should see a notification massage There was a problem saving to your list.

  Scenario: Check filling the field in the saved search with spaces Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    When I click on Save search Button
    Then I should see a pop up is displayed
    Then I fill in the Saved Search Name field "  "
    Then I click on Submit button
#   Then I should see a notification massage There was a problem saving to your search.

  Scenario: Check Copy UUID icon on the profile panel Functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    Then I select all the companies on the search result
    Then I close the summary panel
    Then I click on the first company in the shown list
    Then I should see company profile panel
    And I click on Copy UUID icon at the bottom corner inside profile panel
    Then I should see success message Company UUID copied to clipboard.

  Scenario: Check Clear selected function for all companies
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    Then I select all the companies on the search result
    Then I click on Actions button on company details page
    Then I Click on clear selected button
    Then I should see All selected options cleared and not selected
