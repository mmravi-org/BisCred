
Feature: Saved Searches Dashboard

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Search for a list of records using the criteria search functionality by name
    Given I am on BisCred Admin dashboard and want to search about specific record
    When I click on criteria Search
    Then I Select company in criteria search menu
    And I type  any Company name in Company Names field "Grey"
    And I click the plus button
    When  I Click search companies button
    Then I should be redirect to the search results page and see retains selected criteria
    And I should see summary panel with the selected result
    When I click on the save search button
    Then I should see a pop up is displayed
    Then I fill in the Saved Search Name field "new Saved Search"
    Then I click on Submit button
    Then I should see a notification message is displayed "Search Saved Successfully."

  Scenario: Edit a saved persons search name.
    Given I am on BisCred saved searches page and want to Edit a saved persons search name
    When I click on Edit button in the saved search page
    Then I should See popup to edit the saved search name
    When I Add a valid saved search name
    And click submit button
    Then I should see a success message for updating saved search name Your Saved Search has been udpated!
    And I should be redirect to the saved search page
    And the new added name should be reflected on the Name column

  Scenario: Checking the Functionality of the cancel button on the update saved search name popup
    Given I am on BisCred saved searches page and want to Edit a saved persons search name
    When I click on Edit button in the saved search page
    Then I should See popup to edit the saved search name
    When I click cancel button
    Then I should be redirect to the saved search page

  Scenario: Edit a saved persons with empty search name.
    Given I am on BisCred saved searches page and want to Edit a saved persons search name
    When I click on Edit button in the saved search page
    Then I should See popup to edit the saved search name
    And I Add a valid saved search name empty
    And click submit button
    Then I should see error "There was a problem updating your Saved Search!"

  Scenario: Checking the Functionality of the close icon on the update saved search name popup
    Given I am on BisCred saved searches page and want to Edit a saved persons search name
    When I click on Edit button in the saved search page
    Then I should See popup to edit the saved search name
    When I click close icon
    Then I should be redirect to the saved search page

  Scenario: Delete Saved Search for a saved persons search.
    Given I am on BisCred saved searches page and want to Edit a saved persons search name
    When I click on Delete button for a saved search
    Then I should See popup to confirm deleting the saved search
    When I click delete button
    Then I should see a success message for deleting the saved search
    Then I should be redirect to the saved search page

  Scenario: Checking the Functionality of the close icon on the delete saved search popup
    Given I am on BisCred saved searches page and want to Edit a saved persons search name
    When I click on Delete button for a saved search
    Then I should See popup to confirm deleting the saved search
    When I click close icon
    Then I should be redirect to the saved search page
    And the saved searches name should be displayed on the column name not deleted

  Scenario: Checking the Functionality of the cancel button on the delete saved search popup
    Given I am on BisCred saved searches page and want to Edit a saved persons search name
    When I click on Delete button for a saved search
    Then I should See popup to confirm deleting the saved search
    When I click cancel button
    Then I should be redirect to the saved search page
    And the saved searches name should be displayed on the column name not deleted

  Scenario: Clicking on any saved search person
    Given I am on BisCred saved searches page and want to Edit a saved persons search name
    When I click on person saved search tab
    And I click on any Person Saved search
    Then I should be redirect to the person search result page

  Scenario: validate existing Saved searches
    Given I am on BisCred Admin dashboard
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    And I click on Save search Button
    And I type the name of the Saved search
    Then I click on Submit button
    And I click on saved search menu on the top nav
    And I should see saved result for the first search matching the applied search
    And I should see the saved search date match the current dates

  Scenario: validate Date for person Saved searches
    Given I am on BisCred Admin dashboard
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    And I click on Save search Button
    And I type the name of the Saved search
    Then I click on Submit button
    And I click on saved search menu on the top nav
    And I click on person saved search tab
    Then I should see the saved search dates match the current date

  Scenario: Verify the results column in the saved the searches
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Andrew"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to person search result page
    Then I should see the Save search button at the right side of the page
    When I click on the save search button
    Then I should see a pop up is displayed
    Then I fill in the Saved Search Name field "new Saved Search"
    Then I click on Submit button
    Then I should see a notification message is displayed "Search Saved Successfully."
    And I should see the total value on the result column is matched the results on the contact search page

  Scenario: Search for a company using the quick search functionality and saved the searches
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results
    And I should be redirect to the company searchs result page
    And I should see summary panel with the selected contact result
    Then I should see the Save search button at the right side of the page
    When I click on the save search button
    Then I should see a pop up is displayed
    Then I fill in the Saved Search Name field "new Saved Search"
    Then I click on Submit button
    Then I should see a notification message is displayed "Search Saved Successfully."

  Scenario: Run search for a saved Company search.
   Given I am on BisCred saved searches page and want to Edit a saved company search name
    When I click on Run search.
    Then I should see a company search results that correspond to the saved search
    And I should see summary panel with the selected contact result

  Scenario: Edit a saved company search name.
    Given I am on BisCred saved searches page and want to Edit a saved company search name
    When I click on Edit button in the saved search page
    Then I should See popup to edit the saved search name
    When I Add a valid saved search name
    And click submit button
    Then I should see a success message for updating saved search name Your Saved Search has been udpated!
    And I should be redirect to the saved search page

  Scenario: Checking the Functionality of the cancel button on the update saved search name popup
    Given I am on BisCred saved searches page and want to Edit a saved company search name
    When I click on Edit button in the saved search page
    Then I should See popup to edit the saved search name
    When I click cancel button
    Then I should be redirect to the saved search page

  Scenario: Checking the Functionality of the close icon on the update saved search name popup
    Given I am on BisCred saved searches page and want to Edit a saved company search name
    When I click on Edit button in the saved search page
    Then I should See popup to edit the saved search name
    When I click close icon
    Then I should be redirect to the saved search page

  Scenario: Checking the Functionality of the close icon on the delete saved search popup
    Given I am on BisCred saved searches page and want to Delete Saved Search for a saved company search
    When I click on Delete button for a saved search
    Then I should See popup to confirm deleting the saved search
    When I click close icon
    Then I should be redirect to the saved search page

  Scenario: Checking the Functionality of the cancel button on the delete saved search popup
    Given I am on BisCred saved searches page and want to Delete Saved Search for a saved company search
    When I click on Delete button for a saved search
    Then I should See popup to confirm deleting the saved search
    When I click cancel button
    Then I should be redirect to the saved search page


  Scenario: Delete Saved Search for a saved company search.
    Given I am on BisCred saved searches page and want to Delete Saved Search for a saved company search
    When I click on Delete button for a saved search
    Then I should See popup to confirm deleting the saved search
    When I click delete button
    Then I should see a success message for deleting the saved search
    Then I should be redirect to the saved search page


  Scenario: Clicking on any saved search company
    Given I am on BisCred saved searches page and want to Edit a saved persons search name
    When I click on company saved search tab
    And I click on any Company Saved search
    Then I should be redirect to the company search result page

  Scenario: Clicking on all Tab on saved Search page
    Given I am on BisCred saved searches page and want to Edit a saved persons search name
    When I click on all saved search tab
    Then I should see both companies and contacts saved search

  Scenario: validate Date for Company Saved searches
    Given I am on BisCred Admin dashboard and want to search about company
    When  I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    Then I should be redirect to the company searchs result page
    And I click on Save search Button
    And I type the name of the Saved search
    Then I click on Submit button
    And I click on saved search menu on the top nav
    And I click on company saved search tab
    Then I should see the saved search date match the current dates

  Scenario: Search for a company using the quick search functionality and saved the searches
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "10 F"
    Then I should See options for matching names
    When I click on view all companies results link
    Then I should be redirect to the company searchs result page
    And I should see summary panel with the selected contact result
    Then I should see the Save search button at the right side of the page
    When I click on the save search button
    Then I should see a pop up is displayed
    Then I fill in the Saved Search Name field "new Saved Search"
    Then I click on Submit button
    Then I should see a notification message is displayed "Search Saved Successfully."

  Scenario: Edit a saved company search name.
    Given I am on BisCred saved searches page and want to Edit a saved company search name
    When I click on Edit button in the saved search page
    Then I should See popup to edit the saved search name
    When I Add a valid saved search name
    And click submit button
    Then I should see a success message for updating saved search name Your Saved Search has been udpated!
    And I should be redirect to the saved search page
    When I refresh the page
    Then I should see the date is not updated

  Scenario: Check X button Save Search Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Tandi"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to the search All results page and see many possible results returned
    When I click on the save search button
    Then I should see a pop up is displayed
    When I fill in the Saved Search Name field "new Saved Search"
    And I click close icon
    Then I should be redirect to person search result page

  Scenario: Check Cancel Save Search Functionality
    Given I am on BisCred Admin dashboard and want to search about contact
    When I type any person name into quick search bar "Tandi"
    Then I should See options for matching result
    When I click on view all contacts results
    Then I should be redirect to the search All results page and see many possible results returned
    When I click on the save search button
    Then I should see a pop up is displayed
    When I fill in the Saved Search Name field "new Saved Search"
    And I click on Cancels button
    Then I should be redirect to person search result page