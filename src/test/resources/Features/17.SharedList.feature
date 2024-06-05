Feature: Shared List

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Check "Save to List" Functionality to new list
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type any list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    When I click on any person name
    And I should see the list added to the profile panel

  Scenario: Share my list with my coworkers for person list.
    Given I am on BisCred lists page and want to share my list
    When I click on edit button
    Then I should See popup to edit the list name
    When I click on the make public toggle
    Then I should see Add Users list
    And I select any user from the list
    And I click on submit button on edit popup
    Then I should see a shared mark beside the list name
    And  I should be redirect to the person lists page
    When I click on the profile Icon
    And I select Logout option from drop down list
    Then I should be redirected to the login page
    When I enter email and password for the person who shared list with him
    And I click on Sign In Button
    Then I should see Admin Dashboard
    When I click on List menu on the top nav
    And I click on person Tap
    And I should see the shared list appear on the list page
    And I should see Created by user appear beside the list name
    And I should see Duplicate a publicly shared list into the current users account
    When I click on the profile icon
    And I select Logout option from drop down list

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Check "Save to List" Functionality to new list
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type any list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    And I should see the list added to the profile panel

  Scenario: Checking the Functionality of the cancel button on share person list
    Given I am on BisCred lists page and want to share my list
    When I click on edit button
    Then I should See popup to edit the list name
    When I click on the make public toggle
    Then I should see Add Users list
    And I select any user from the list
    And I click on Cancel Button
    Then I should see the list is not sharable
    And  I should be redirect to the person lists page

  Scenario: Checking the Functionality of the close icon on the create new list popup
    Given I am on BisCred lists page and want to share my list
    When I click on edit button
    Then I should See popup to edit the list name
    When I click on the make public toggle
    Then I should see Add Users list
    And I select any user from the list
    And I click on close button
    Then I should see the list is not sharable
    And  I should be redirect to the person lists page

  Scenario: Share my list with all coworkers for person list.
    Given I am on BisCred lists page and want to share my list
    When I click on edit button
    Then I should See popup to edit the list name
    When I click on the make public toggle
    Then I should see Add Users list
    And I click on submit button on edit popup
    And I should see a shared mark beside the list name
    And  I should be redirect to the person lists page
    When I click on the profile Icon
    And I select Logout option from drop down list
    Then I should be redirected to the login page
    When I enter email and password for the person who shared list with him
    And I click on Sign In Button
    Then I should see Admin Dashboard
    When I click on List menu on the top nav
    And I click on person Tap
    And I should see the shared list appear on the list page
    And I should see Created by user appear beside the list name
    And I should see Duplicate a publicly shared list into the current users account
    When I click on the profile icon
    And I select Logout option from drop down list

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Create new shared list with my coworkers for person list.
    Given I am on BisCred lists page and want to share my list
    When I click on New person list
    Then I should See popup to create new list
    When I click on the make public toggle
    Then I should see Add Users list
    And I select any user from the list
    And I click on submit button on edit popup
    Then I should see a shared mark beside the list name
    And  I should be redirect to the person lists page

  Scenario: Checking the Functionality of the cancel button on Create new share person list
    Given I am on BisCred lists page and want to share my list
    When I click on New person list
    Then I should See popup to create new list
    When I click on the make public toggle
    Then I should see Add Users list
    And I select any user from the list
    And I click on Cancel Button
    Then I should not see a shared mark beside the list name
    And  I should be redirect to the person lists page

  Scenario: Checking the Functionality of the close button on Create new share person list
    Given I am on BisCred lists page and want to Add new persons list
    When I click on New person list
    Then I should See popup to create new list
    When I click on the make public toggle
    Then I should see Add Users list
    And I select any user from the list
    And I click on Close icon
    Then I should not see a shared mark beside the list name
    And  I should be redirect to the person lists page

  Scenario: Checking the Functionality of Duplicate shared person list
    Given I am on BisCred lists page and want to Add new persons list
    When I click on the profile icon
    And I select Logout option from drop down list
    Then I should be redirected to the login page
    When I enter email and password for the person who shared list with him
    And I click on Sign In Button
    Then I should see Admin Dashboard
    When I click on List menu on the top nav
    And I should see the shared list appear on the list page
    When I click on Duplicate link
    Then I should See popup to Duplicate List
    When I click on Duplicate List button
    Then I should see Duplicate massage display
    And  I should be redirect to the person lists page
    And I should see a copy of the shared list added to the person list
    When I click on the profile Icon
    And I select Logout option from drop down list

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Check "Save to List" Functionality to new list
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type any list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    And I should see the list added to the profile panel

   Scenario: Share my list with my coworkers for person list.
    Given I am on BisCred lists page and want to share my list
    When I click on edit button
    Then I should See popup to edit the list name
    When I click on the make public toggle
    Then I should see Add Users list
    And I select any user from the list
    And I click on submit button on edit popup
    Then I should see a shared mark beside the list name
    And  I should be redirect to the person lists page
    When I click on the profile Icon
    And I select Logout option from drop down list
    Then I should be redirected to the login page
    When I enter email and password for the person who shared list with him
    And I click on Sign In Button
    Then I should see Admin Dashboard
    When I click on List menu on the top nav
    And I click on person Tap
    And I should see the shared list appear on the list page
    And I should see Created by user appear beside the list name
    And I should see Duplicate a publicly shared list into the current users account
    When I click on Duplicate link
    Then I should See popup to Duplicate List
    When I click on Cancel button
    Then I should be redirect to the person lists page
    And I should see No copy of the shared list added to the person list

   Scenario: Checking the Functionality of Closed Button on Duplicate shared person list
     Given I am on BisCred lists page and want to share my list
     When I click on Duplicate link
     Then I should See popup to Duplicate List
     When I click on Close icon
     Then I should be redirect to the person lists page
     And I should see No copy of the shared list added to the person list

   Scenario: Checking the Functionality of Edit Duplicate shared person list
     Given I am on BisCred lists page and want to share my list
     When I click on edit link
     Then I should See popup to edit the list name
     When I Edit a valid list name
     And I click on submit button on edit popup
     Then I should see a success message for updating list
     And  I should be redirect to the person lists page
     And I should see the name of the list has been updated

   Scenario: Checking the Functionality of make Duplicate shared person list public
     Given I am on BisCred lists page and want to share my list
     When I click on edit link
     Then I should See popup to edit the list name
     When I click on the make public toggle
     Then I should see Add Users list
     When I select any user from the list
     And I click on submit button on edit popup
     Then I should see a success message for updating list
     And  I should be redirect to the person lists page
     And I should see the shared list appear on the list page

   Scenario: Checking the Functionality of Cancel Button on Edit Duplicate shared person list public
     Given I am on BisCred lists page and want to share my list
     When I click on edit link
     Then I should See popup to edit the list name
     And I click on Cancel Button
     Then I should be redirect to the person lists page
     And I should see the list not changed

   Scenario: Checking the Functionality of Close Button on Edit Duplicate shared person list public
     Given I am on BisCred lists page and want to share my list
     When I click on edit link
     Then I should See popup to edit the list name
     And I click on Close icon
     Then I should be redirect to the person lists page
     And I should see the list not changed

   Scenario: Checking the Functionality of View Duplicate shared person list
     Given I am on BisCred lists page and want to share my list
     When I click on view link
     Then I should be redirect to the person list page
     When I click on the profile Icon
     And I select Logout option from drop down list

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Check "Save to List" Functionality to new list
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type any list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    And I should see the list added to the profile panel

    Scenario: Share my list with my coworkers for person list.
    Given I am on BisCred lists page and want to share my list
    When I click on edit button
    Then I should See popup to edit the list name
    When I click on the make public toggle
    Then I should see Add Users list
    And I select any user from the list
    And I click on submit button on edit popup
    Then I should see a shared mark beside the list name
    And  I should be redirect to the person lists page

   Scenario: Checking the Functionality of make shared person list private
     Given I am on BisCred lists page and want to share my list
     When I click on edit button
     Then I should See popup to edit the list name
     When I Unchecked the make public toggle
     Then I should see Add Users list disappeare
     And I click on submit button on edit popup
    Then I should see a success message for updating list
     And I should see a shared mark beside the list name is removed
     And  I should be redirect to the person lists page
     When I click on the profile Icon
     And I select Logout option from drop down list
     Then I should be redirected to the login page
     When I enter email and password for the person who shared list with him
     And I click on Sign In Button
     Then I should see Admin Dashboard
     When I click on List menu on the top nav
     And I click on person Tap
    And I should see the shared list removed from the page

  Scenario: Checking the Functionality of deactivate the shared list owner
     Given I am on BisCred Users management page
     When I enter in the search bar "hsheyab@aspire-"
     When I click on the Edit link
     Then I should be redirected to Edit User page
     And I click on the User Active to unchecked it
     And I click on Update User button
     And I should see success massage "User has been updated."
     When I click on the profile icon
     And I select Logout option from drop down list
     Then I should be redirected to the login page
     When I enter email and password for the person who shared list with him
     When I click on List menu on the top nav
     And I click on person Tap
     Then I should see the shared list is removed
