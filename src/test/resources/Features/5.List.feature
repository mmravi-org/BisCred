Feature: List Feature
  @failed
  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Add new persons list
    Given I am on BisCred lists page and want to Add new persons list
    When I click on New person list
    Then I should See popup to create new list
    When I Add a valid list name
    And I click on submit button
    Then I should be redirect to the person lists page
    And I should see the added list name

  Scenario: Add new persons list with empty name.
    Given I am on BisCred lists page and want to Add new persons list
    When I click on New person list
    Then I should See popup to create new list
    When I click on submit button
    Then I should see an error message "There was a problem creating your list!"
    Then I should click on cancel button on the create new list pop up


  Scenario: Click on any person list
    Given I am on BisCred lists page and want to view person list
    When I click on any person list
    Then I should be redirected to the person list page details

  Scenario: Checking the Functionality of the cancel button on the create new list popup
    Given I am on BisCred lists page and want to Add new persons list
    When I click on New person list
    Then I should See popup to create new list
    When I should click on cancel button on the create new list pop up
    Then I should be redirect to the person lists page

  Scenario: Checking the Functionality of the close icon on the create new list popup
    Given I am on BisCred lists page and want to Add new persons list
    When I click on New person list
    Then I should See popup to create new list
    When I click close icon
    Then I should be redirect to the person lists page

  Scenario: Edit person list
    Given I am on BisCred lists page and want to edit persons list
    When I click on edit button
    Then I should See popup to edit the list name
    When I Edit a valid list name
    And I click on submit button on edit popup
    Then I should see a success message for updating list
    And  I should be redirect to the person lists page
    And I should see the name of the list has been updated


  Scenario: Edit name with empty name in person list
    Given I am on BisCred lists page and want to edit persons list
    When I click on edit button
    Then I should See popup to edit the list name
    When I clear the name in person list field
    And I click on submit button on edit popup
    Then I should see an error message "There was a problem creating your list!"

  Scenario: Checking the Functionality of the cancel button on the edit list popup
    Given I am on BisCred lists page and want to edit persons list
    When I click on edit button
    Then I should See popup to edit the list name
    When I click cancel button on edit pop up
    Then I should be redirect to the person lists page

  Scenario: Checking the Functionality of the close icon on the edit list popup
    Given I am on BisCred lists page and want to edit persons list
    When I click on edit button again
    Then I should See popup to edit the list name
    When I click close icon on edit pop up
    Then I should be redirect to the person lists page

  Scenario: Delete person list
    Given I am on BisCred lists page and want to Delete persons list
    When I click on Delete Link
    Then I should See popup to confirm deleting the list
    When I click on delete list button
    Then I should see a success message for deleting the list
    And I should be redirect to the person lists page
    And I should see the list has been deleted

  Scenario: Checking the Functionality of the cancel button on the delete list popup
    Given I am on BisCred lists page and want to Delete persons list
    When I click on Delete Link again
    Then I should See popup to confirm deleting the list
    When I click cancel button on delete pop up
    Then I should be redirect to the person lists page


  Scenario: Checking the Functionality of the close icon on the delete list popup
    Given I am on BisCred lists page and want to Delete persons list
    When I click on Delete Link again
    Then I should See popup to confirm deleting the list
    When I click close icon on delete pop up
    Then I should be redirect to the person lists page

  Scenario: View person list
    Given I am on BisCred lists page and want to view persons list
    When I click on view Link
    Then I should be redirect to the person lists page after viewing

  Scenario: Check Remove from List Functionality
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on List main menu
    Then I click on the first person list
    When I select all the records from person list page
    And I click on Actions button
    And I select Remove from list option Contact
    Then I should see Remove from List pop up
    And I click on Remove from List button
    And I should see a notification massage Selected profiles have been removed from your list. for removing list
    And I should see a massage displayed on the page Your list is currently empty.

  Scenario: Check Cancel on Remove from List pop up Functionality
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on List main menu
    Then I click on the first person list
    When I select all the records from person list page
    And I click on Actions button
    And I select Remove from list option Contact
   Then I should see Remove from List pop up
    And I click on Cancel button
    Then I should be redirect to the person lists page after viewing
    And I should see the list Result is not deleted

  Scenario: Check close on Remove from List pop up Functionality
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on List main menu
    Then I click on the first person list
    When I select all the records from person list page
    And I click on Actions button
    And I select Remove from list option Contact
    Then I should see Remove from List pop up
    And I click on X icon button
    Then I should be redirect to the person lists page after viewing
    And I should see the list Result is not deleted

#
#  Scenario: Check Remove from List Functionality
#    Given I am on BisCred dashboard and want to search about a person
#    When I enter an exist company name "CBRE Investment Management" on the search field
#    And I select the company from the result
#    And I select all the people on the search result
#    And I click on Actions button
#    And I click on Save to list from from the shown list
#    Then I should see the Save People to List pop up
#    When I click on New List Tab
#    And I type a list name on List Name Field
#    And I click on Submit button on the Save People to List pop up
#    Then I should see a notification massage "Saved successfully to your list."
#    When I click on List main menu
#    Then I click on the first person list
#    And I click on Actions button double click
#    And I select Remove from list option
#    Then I should be redirected to the person list page details
#    And I should see a message No records have been selected!


  Scenario: Check Clear Selected Functionallity
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on List main menu
    Then I click on the first person list
    And I select all the people on the search result
    And I click on Actions button double click
    And I select Clear Selected from drop down list
    Then I should see All selected options cleared and not selected in person list page
@failed
  Scenario: Check Download functionality for the list details page
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I select Download from Action list
    Then I should see a pop up Confirm Download
    When I leave the check box beside Clear selected results after download. without checking it
    And I click Download button
   Then I should see a notification massage for download "Your download is being generated and will be sent to your email and available in your download center shortly."
    And the selected list should be stay selected

  Scenario: Check Cancel Button on Download functionality for the list details page
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I select Download from Action list
    Then I should see a pop up Confirm Download
    When I click Cancel button
    Then I should be redirected to the person list page details
    And the selected list should be stay selected

  Scenario: Check Close Icon Button on Download functionality for list details page
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I select Download from Action list
    Then I should see a pop up Confirm Download
    When I click Close Icon button
    Then I should be redirected to the person list page details
    And the selected list should be stay selected

  Scenario: Check Clear selected results after download on Download functionality for all contacts
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I select Download from Action list
    Then I should see a pop up Confirm Download
    When I click on check box beside Clear selected results after download
    And I click Download button
    Then I should be redirected to the person list page details
    And the selected list should be stay selected

  Scenario: Check Download functionality for the list details page wihtout selecting a list
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I click on Actions button double click on download link once it disabled
    And I click Download link when link is disabled
    Then I should see an error message "No records have been selected!" again for download function

  Scenario: Check "Save to List" Functionality to new list
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on any person name
    And I should see the list added to the profile panel

   Scenario: Check "Save to List" Functionality to Existing list
      Given I am on BisCred dashboard and want to search about a person
      When I enter an exist company name "CBRE Investment Management" on the search field
      And I select the company from the result
      When I select all the people on the search result
      And I click on Actions button
      And I click on Save to list from from the shown list
      Then I should see the Save People to List pop up
      When I select any list from existing list drop Down List
      And I click on Submit button
      Then I should see a notification massage "Saved successfully to your list."
      When I click on any person name
      And I should see the list added to the profile panel
