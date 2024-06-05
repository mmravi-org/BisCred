Feature: Contact Details Page

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Search for a person using the quick search functionality
    Given I am on BisCred Admin dashboard and want to search about specific record
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should be redirect to person search results page
    And I should see a person search results that correspond with the entered text
    And I should see summary panel with the selected contact result

  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside the list columns
    And I should see the List column removed from the contacts details and make sure all other columns added


  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside Email column
    And I should see Email column removed from the contacts details and make sure all other columns added


  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside Phone column
    And I should see Phone column removed from the contacts details and make sure all other columns added


  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside Job Title column
    And I should see Job Title column removed from the contacts details and make sure all other columns added

  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside Seniority column
    And I should see Seniority column removed from the contacts details and make sure all other columns added

  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside Asset Experienced column
   And I should see Asset Experienced column removed from the contacts details and make sure all other columns added

  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside City column
    And I should see City column removed from the contacts details and make sure all other columns added

  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside State column
    And I should see State column removed from the contacts details and make sure all other columns added

  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside LinkedIn column
    And I should see LinkedIn column removed from the contacts details and make sure all other columns added


  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside Company column
    And I should see Company column removed from the contacts details and make sure all other columns added

  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside Company Asset Experience column
    And I should see Company Asset Experience column removed from the contacts details and make sure all other columns added

  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside Company Industries column
    And I should see Company Industries column removed from the contacts details and make sure all other columns added

  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a the exact person from result
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside Company HQ City column
    And I should see Company HQ City column removed from the contacts details and make sure all other columns added


  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a the exact person from result
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside Company HQ State column
    And I should see Company HQ State column removed from the contacts details and make sure all other columns added

#    below case to add the Company HQ State column for checking the hide functionality
  Scenario: Check the Remove columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a the exact person from result
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on Columns button
    And I click on selection box beside Company HQ State column to set up the columns for hide functionality

##  Here the hide function add a case to rest the setting of checkboxes

  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside list column
    Then  I should see the List column removed from the contacts details and make sure all other columns added

  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside Email column
    Then I should see Email column removed from the contacts details and make sure all other columns added

  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside Phone column
    Then I should see Phone column removed from the contacts details and make sure all other columns added

  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside Job Title column
    Then I should see Job Title column removed from the contacts details and make sure all other columns added


  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside Seniority column
    Then I should see Seniority column removed from the contacts details and make sure all other columns added


  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside Asset Experience column
    Then I should see Asset Experienced column removed from the contacts details and make sure all other columns added

  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside City column
    Then I should see City column removed from the contacts details and make sure all other columns added

  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside State column
    Then I should see State column removed from the contacts details and make sure all other columns added


  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside LinkedIn column
    Then I should see LinkedIn column removed from the contacts details and make sure all other columns added

  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside Company column
    Then I should see Company column removed from the contacts details and make sure all other columns added


  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside Company Asset Experience column
    Then I should see Company Asset Experience column removed from the contacts details and make sure all other columns added

  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside company industries column
    Then I should see Company Industries column removed from the contacts details and make sure all other columns added

  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a the exact person from result
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside Company HQ City column
    Then I should see Company HQ City column removed from the contacts details and make sure all other columns added


  Scenario: Check the Hide columns Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a the exact person from result
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on The hide link beside Company HQ State column
    Then I should see Company HQ State column removed from the contacts details and make sure all other columns added

  Scenario: Check delete Saved List on profile panel Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on save person Button
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field to save person
    Then I click on Submit button on the Save People to List pop up
    And I should see the list added to the profile panel
    When I click on the Delete icon beside list name on profile panel
    Then I should see Remove from List pop up
    And I click on Remove from List button
    Then I should see a success massage "Person has been removed from list."
    And I should see the person list removed from profile panel

  Scenario: Check new search Button Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on New Search button two
    Then I should be redirected to the Quick Search Tab


  Scenario: Check "Save person" to List on profile panel Functionality to new list
   Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on save person Button
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field to save person
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    And I should see the list added to the profile panel

  Scenario: Check Cancel Save person List on profile panel Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on save person Button
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field to save person
    And I click on Cancel button on Save People to List pop up
    Then I should be redirect to the person search results page


  Scenario: Check X button in Save person List on profile panel Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on save person Button
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field to save person
    And  I click on X icon on save to list pop up
    Then I should be redirect to the person search results page



  Scenario: Check Cancel delete Saved List on profile panel Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Test"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should see a person search results that correspond with the person entered text
    And I should be redirect to the person search results page
    When I click on save person Button
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field to save person
    Then I click on Submit button on the Save People to List pop up
    And I should see the list added to the profile panel
    When I click on the Delete icon beside list name on profile panel
    Then I should see Remove from List pop up
    And I click on Cancel button
    Then I should be redirect to the person search results page
    And I should see the delete icon still displayed on the profile






