Feature: Force Push Contact Feature

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Adding contact successfully with required fields for Force Push
    Given I am on Bisreach admin dashboard and want to add a new contact
    When I Add a valid admin credentials
    Then I click on Add contact button
    And I should see a new screen for adding a contact
    When I add a new contact required info
    And I click on create contact button
    Then I should be redirected to Edit contact page
    And I should see the notification message for creating new contact

  Scenario: Edit Contact status with "In the Bisnow Universe" status
    When I click on Update Status button
    Then I should see a new Pop-Up for update contact status
    When I click on contact status dropdown list
    And I click on In the Bisnow Universe
    And I click on Update Contact Status button
    And I should see a notification message for updating contact status as "Contact Status has been saved."
    Then I should see the Contact Status updated with In Bisnow

  Scenario: Edit Contact with adding new valid Address with required fields for United States
    When I click on Add Address button in Contact Profile
    Then I should see a new Pop-Up for Create-Update Contact Address
    When I fill in the Postal Code with US valid Code "01470"
    And I should see verified mark for a valid postal code
    And I click on the Save Address button in Create-Update Contact Address Popup
    Then I should see the new address added with city as Groton and state as Massachusetts
    And I should see a notification message for contact address update as "Contact Address updated."

  Scenario: Checking delete non primary employment in contact profile
    When I click on Delete button for non primary employment
    Then I should see a new Pop-Up for Delete Employment
    When I click on Delete Employment button
    Then I should see notification that employment deleted

  Scenario: Checking add new Active Primary employment in contact profile with required data
    When I click on Add Employment button for any contact
    Then I should see a new Pop-Up for Create Update Contact Employment
    When I fill in company name then select a company from Company dropdown list that matches the criteria "Studio Grey"
    And I fill in job title in Job Title textbox as "Job Title"
    And I set Active toggle on
    And I set Primary toggle on
    And I select a job classification from Job Classification dropdownlist
    And I select a contact email from Associated Contact Emails dropdownlist
    And I select a asset classes from Asset Classes dropdownlist
    And I click on Save Employment button
    Then I should see the new Active Primary employment added with required data
#    And I should see the Active and primary labels added beside the employment on the company profile
    And I should see contact employment updated notification "Contact Employment updated."

  Scenario: Checking adding city classification for contact profile
    When I click on Update Classification button for any contact
    Then I should see a new Pop-Up for Add City-Topic Classification
    When I select a city classification from Classification dropdown list for example Atlanta
    And I click on Update Contact Classification in Update Classification Popup
    Then I should see city classification is added as Atlanta City
    And I should see notification that contact classification updated as "Contact City/Topic Classification successfully updated."

  Scenario: Checking adding valid researcher notes in contact profile
    When I click on Update Note button for any contact
    Then I should see a new Pop-Up for Update Current Research Note for contacts
    When I fill in valid researcher notes in Research Note textbox as "adding researcher note"
    And I select Research Outcome from dropDown List
    And I click on Update Note button in the Update Current Research Note for contacts
    Then I should see Research Note added notification "Research Note added."

  Scenario: Approved Ready for Review Contact and Force Push
    When I click on Submit for Ready for Review Button
    Then I should see notifications "Contact has been updated and given a status, Ready For Review. While this contact is in Ready For Review the contact will not be editable."
    And I should see the contact status is changed to "Contact has been updated and given a status, Ready For Review. While this contact is in Ready For Review the contact will not be editable."
    And I click on Review Contact Button
#    Then I should see the contact status is changed to "In Review"
    When I added notes on Review Notes Filed "In Review"
    And I click on Approved Contact Button
    Then I should see notification message "Thanks for reviewing the contact."
    And I should see the contacts status is changed to "Approved"
    When I click on Force Push Button
    Then I should see success message "Contact force push job successfully queued."

  Scenario: Check the Created Contact Reflected to Biscred
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and passwords
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario:Search for a specific record using the quick search functionality
    Given I am on BisCred Admin dashboard and want to search about specific record
    When I type any person name into quick search bar "1ee9e689-44c5-61e0-ae44-167134c806a1"
    Then I should See options for matching names
    When I select a result from the dropdown
    Then I should be redirect to person search results page
    #And I should see a person search results that correspond with the entered text
    And I should see summary panel with the selected contact result