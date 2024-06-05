Feature: List Company Feature
  @failed
  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Add new company list.
    Given I am on BisCred lists page and want to Add new company list
    When I click on New company list
    Then I should See popup to create new list
    When I Add a valid Company list name
    And I click on submit button
    And I should be redirect to the company lists page
    And I should see the added list name

  Scenario: Add new company list with empty name.
    Given I am on BisCred lists page and want to Add new company list
    When I click on New company list
    Then I should See popup to create new list
    When I click on submit button
    Then I should see an error message "There was a problem creating your list!"

  Scenario: Click on any company list.
    Given I am on BisCred lists page and want to view company list
    When I click on any company list
    Then I should be redirected to the company list page details after viewing a company

  Scenario: Checking the Functionality of the cancel button on the create new list popup
    Given I am on BisCred lists page and want to Add new company list
    When I click on New company list
    Then I should See popup to create new list
    When I should click on cancel button on the create new list pop up
    Then I should be redirect to the company lists page

  Scenario: Checking the Functionality of the close icon on the create new list popup
    Given I am on BisCred lists page and want to Add new company list
    When I click on New company list
    Then I should See popup to create new list
    When I click close icon
    Then I should be redirect to the company lists page

  Scenario: Edit company list
    Given I am on BisCred lists page and want to edit company list
    When I click on edit button again
    Then I should See popup to edit the list name
    When I Edit a valid list  for company
    And I click on submit button
    Then I should see a success message for updating list
    And I should be redirect to the company lists page
    And I should see the company list name edited

  Scenario: Add empty name in Edit company list
    Given I am on BisCred lists page and want to edit company list
    When I click on edit button again
    Then I should See popup to edit the list name
    When I clear the name in company list field
    And I click on submit button
    Then I should see an error message "There was a problem creating your list!"

  Scenario: Checking the Functionality of the cancel button on the update list popup
    Given I am on BisCred lists page and want to edit company list
    When I click on edit button again
    Then I should See popup to edit the list name
    When I click cancel button on edit pop up
    Then I should be redirect to the company lists page

  Scenario: Checking the Functionality of the close icon on the update list popup
    Given I am on BisCred lists page and want to edit company list
    When I click on edit button again
    Then I should See popup to edit the list name
    When I click close icon
    Then I should be redirect to the company lists page

  Scenario: Delete company list
    Given I am on BisCred lists page and want to Delete company list
    When I click on Delete Link
    Then I should See popup to confirm deleting the list
    When I click on delete list button
    Then I should see a success message for deleting the list
    And I should be redirect to the company lists page

  Scenario: Checking the Functionality of the cancel button on the delete list popup
    Given I am on BisCred lists page and want to Delete company list
    When I click on Delete Link again
    Then I should See popup to confirm deleting the list
    When I click cancel button on delete pop up
    Then  I should be redirect to the company lists page

  Scenario: Checking the Functionality of the close icon on the delete list popup
    Given I am on BisCred lists page and want to Delete company list
    When I click on Delete Link again
    Then I should See popup to confirm deleting the list
    When I click close icon on delete pop up
    Then I should be redirect to the company lists page

  Scenario: View company list
    Given I am on BisCred lists page and want to view company list
    When I click on view Link
    Then I should be redirect to the company lists page after viewing


  Scenario: Check Remove from List Functionality
    Given I am on BisCred dashboard and want to search about a company
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I click on view all companies results link
    And I select all the companies on the search result
    And I click on Actions button for company
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on List main menu
    And I click on company tab
    Then I click on the first company list
    When I select all the records from company list page
    And I click on Actions button
    And I select Remove from list option from company list page
    Then I should see Remove from List pop up
    And I click on Remove from List button
    And I should see a notification massage Selected profiles have been removed from your list. for removing list
    And I should see a massage displayed on the page Your list is currently empty.


  Scenario: Check Cancel on Remove from List pop up Functionality
    Given I am on BisCred dashboard and want to search about a company
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I click on view all companies results link
    And I select all the companies on the search result
    And I click on Actions button for company
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on List main menu
    And I click on company tab
    Then I click on the first company list
    When I select all the records from company list page
    And I click on Actions button
    And I select Remove from list option from company list page
    Then I should see Remove from List pop up
    And I click on Cancel button
    Then I should be redirected to the company list page details
    And I should see the list Result is not deleted

  Scenario: Check close on Remove from List pop up Functionality
    Given I am on BisCred dashboard and want to search about a company
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I click on view all companies results link
    And I select all the companies on the search result
    And I click on Actions button for company
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on List main menu
    And I click on company tab
    Then I click on the first company list
    When I select all the records from company list page
    And I click on Actions button
    And I select Remove from list option from company list page
    Then I should see Remove from List pop up
    And I click on X icon button
    Then I should be redirected to the company list page details
    And I should see the list Result is not deleted


  Scenario: Check Clear Selected Functionallity
    Given I am on BisCred dashboard and want to search about a company
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I click on view all companies results link
    And I select all the companies on the search result
    And I click on Actions button for company
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on List main menu
    And I click on company tab
    Then I click on the first company list
    When I select all the records from company list page
    And I click on Actions button
    And I select Clear Selected from drop down list
    Then I should see All selected options cleared and not selected

  Scenario: Check Download functionality for the list details page
    Given I am on BisCred dashboard and want to search about a company
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I click on view all companies results link
    And I select all the companies on the search result
    And I click on Actions button for company
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on List main menu
    And I click on company tab
    Then I click on the first company list
    When I select all the records from company list page
    And I click on Actions button
    And I select Download from Action list in the company list page
    Then I should see a pop up Confirm Download
    And I leave the check box beside Clear selected results after download. without checking it
    When I click Download button
#    Then I should see a notification massage for download "Your download is being generated and will be sent to your email and available in your download center shortly."
    And the selected list should be stay selected

@failed
  Scenario: Check Clear selected results after download on Download functionality for all compaines
    Given I am on BisCred dashboard and want to search about a company
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I click on view all companies results link
    And I select all the companies on the search result
    And I click on Actions button for company
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on List main menu
    And I click on company tab
    Then I click on the first company list
    When I select all the records from company list page
    And I click on Actions button
    And I select Download from Action list in the company list page
    Then I should see a pop up Confirm Download
    And  I click on check box beside Clear selected results after download
    When I click Download button
    Then the selected list should be stay selected


  Scenario: Check cancel Button on Download functionality for the list details page
    Given I am on BisCred dashboard and want to search about a company
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I click on view all companies results link
    And I select all the companies on the search result
    And I click on Actions button for company
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on List main menu
    And I click on company tab
    Then I click on the first company list
    When I select all the records from company list page
    And I click on Actions button
    And I select Download from Action list in the company list page
    Then I should see a pop up Confirm Download
    When I click Cancel button
    Then I should be redirected to the company list page details
    And the selected list should be stay selected



  Scenario: Check Close Icon Button on Download functionality for list details page
    Given I am on BisCred dashboard and want to search about a company
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I click on view all companies results link
    And I select all the companies on the search result
    And I click on Actions button for company
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on List main menu
    And I click on company tab
    Then I click on the first company list
    When I select all the records from company list page
    And I click on Actions button
    And I select Download from Action list in the company list page
    Then I should see a pop up Confirm Download
    When I click Close Icon button
    Then I should be redirected to the company list page details
    And the selected list should be stay selected

  Scenario: Check Download functionality without selecting any list
    Given I am on BisCred dashboard and want to search about a company
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I click on view all companies results link
    And I select all the companies on the search result
    And I click on Actions button for company
    And I click on Save to list from from the shown list
    Then I should see the Save People to List pop up
    When I click on New List Tab
    And I type a list name on List Name Field
    And I click on Submit button on the Save People to List pop up
    Then I should see a notification massage "Saved successfully to your list."
    When I click on List main menu
    And I click on company tab
    Then I click on the first company list
    And I click on Actions button
    Then  I select Download from Action list in the company list page
    Then I should see an error message "No records have been selected!" again for download function