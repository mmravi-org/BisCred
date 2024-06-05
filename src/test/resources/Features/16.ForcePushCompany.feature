Feature: Force Push Company Feature

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Adding New company successfully with all required fields
    Given I am on Bisreach admin dashboard and want to add a new company
    When I Add a valid admin credentials
    And I click on Add company Button
    Then I should see a new screen for adding a company
    When I add the new company info with Common Name, Full Legal Name and  Company URL
    And I click on Add company button inside popup
    Then I should be redirected to Edit company page
    And I should see the notification message for creating new company "Company created."

  Scenario: Updating Company Status with In the Bisnow Universe status
    When I click on Update Company status Button
    Then I should see a pop up for Update Company Status
    When I click on contact status dropdown list
    And I select the status In Bisnow Universe status
    And I click on the Update Company Status button
    Then I should see the company status shown as In the Bisnow Universe
    And I should see a notification message for updating Company Status "Company Status has been saved."
    And I should see a message displayed on the bottom of the page You cannot approve without Addresses, Asset Class, and Industry.

  Scenario: Adding new US valid Address with required fields and address type Headquarters
    When I click on Add Address Button
    Then I should see a pop up for Create-Update Company Address
    When I fill in the Postal Code textbos with valid postal code as "01470"
    Then I should see verified mark for a valid postal code
    And I select Address Type Headquarters
    And I click on save address button
    Then I should see the new address added with Headquarters type
    And I should see a notification message for company address updated "Company Address updated."

  Scenario: Add Asset Class
    When I click on the Add Asset Class button
    Then I should see a pop up Add Asset Class
    When I select Asset Class
    Then I click on Update Asset Class button
    And I should see a success message for adding Asset Class

    Scenario: Add Industry
    When I click on the Add Industry button
    Then I should see a pop up Add Industry
    When I select one of Company Industry
    Then I click on Update Industry button
    And I should see a success message for adding Industry "Industries have been added."

  Scenario: Add Researcher Notes
    When I click on Update Note button for any contact
    Then I should see a new Pop-Up for Update Current Research Note for contacts
    When I fill in valid researcher notes in Research Note textbox as "adding researcher note"
    And I select Research Outcome from dropDown List
    And I click on Update Note button in the Update Current Research Note for contacts
    Then I should see Research Note added notification "Research Note added."

   Scenario: Approved Ready for Review Company and Force Push
    When I click on Approved Button
    Then I should see Notification massage Company has been approved.
    When I click on Force Push Button
     Then I should see success message "Company force push job successfully queued."

  Scenario:Search for a specific record using the quick search functionality
    Given I am on BisCred Admin dashboard and want to search about company
    When I type any company name into quick search bar "1ee9e65f-3443-692c-b37f-167134c806a1"
    Then I should See options for matching names
    When I select a Company result from the dropdown
    Then I should see a company search results that correspond with the entered text
    And I should see summary panel with the selected company result