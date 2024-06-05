Feature: Accounts Feature

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Create new Account with valid data and active status
    Given I am on BisCred Accounts page and want to Create new account
    When I click on Create account button
    Then I should be redirected to create account page
    When I fill the form with valid data
    And click on Create account button
    Then I should see a success message "Account has been created."
    And I should be redirected to the Account details page

  Scenario: Create new Account with Account name already exist
    Given I am on BisCred Accounts page and want to Create new account
    When I click on Create account button
    Then I should be redirected to create account page
    When I fill the account name with name already exist
    And I fill the other fields with valid data
    And click on Create account button
    And I should see error message under the Name field "AutomationAcountForTesting"
    And I should see error message "Please fix the error below, and try again."

  Scenario: Create new Account with empty account name field
    Given I am on BisCred Accounts page and want to Create new account
    When I click on Create account button
    Then I should be redirected to create account page
    When I fill the account name field with empty data
    And click on Create account button
    Then I should see error message under the Name field "The name field is required."
    And I should see error message "Please fix the error below, and try again."

  Scenario: Create new Account with empty Company Name field
    Given I am on BisCred Accounts page and want to Create new account
    When I click on Create account button
    Then I should be redirected to create account page
    When I fill the company Name field with empty data
    And click on Create account button
    Then I should see an error message under company Name "The company field is required."
    And I should see error message "Please fix the error below, and try again."

  Scenario: Create new Account with empty Number of Seats field
    Given I am on BisCred Accounts page and want to Create new account
    When I click on Create account button
    Then I should be redirected to create account page
    When I fill the Number of Seats field with empty data
    And click on Create account button
    Then I should see an error message under number of Seats "The seats field is required."
    And I should see error message "Please fix the error below, and try again."

  Scenario: Create new Account with inactive status
    Given I am on BisCred Accounts page and want to Create new account
    When I click on Create account button
    Then I should be redirected to create account page
    When I fill the form with inactive Account
    And I click on Account Active check box
    And click on Create account button
    Then I should see a success message "Account has been created."
    And I click on the account main menu
    When I search about the created account
    Then it should retains the created account with status inactive

  Scenario: Create new Account with all Fields are empty
    Given I am on BisCred Accounts page and want to Create new account
    When I click on Create account button
    Then I should be redirected to create account page
    When I left all the fields empty
    And click on Create account button
    Then I should see error message under the Name field "The name field is required."
    And I should see an error message under company Name "The company field is required."
    And I should see an error message under number of Seats "The seats field is required."
    And I should see error message "Please fix the errors below, and try again."

  Scenario: Search about created account Functionality
    Given I am on BisCred Accounts page and want to search about an account
    When I fill on search field with any account name
    Then I should see the correct account retains successfully


  Scenario: Check View Account Functionality
    Given I am on BisCred Accounts page and want to Check All filter Status
    When I fill on search field with any account names
    When I click on view link
    Then I should see all the users related to this account
    And I should see the correct status for this account

  Scenario: Check View Account Functionality with No Users
    Given I am on BisCred Accounts page and want to Check All filter Status
    When I fill on search field with account name
    When I click on view link
    Then I should see No users related to this account

  Scenario: Check Edit Account Functionality
    Given I am on BisCred Accounts page and want to edit an account
    When I fill on search field with any account name
    When I click on edit link
    Then I should be redirected to Edit Account page
    When I update the form fields
    And I click on Update Account Button
    And I should see success massage "Account has been updated."

  Scenario: Checking when searching a contact by its ""All"" Status and its pagination
    Given I am on BisCred Accounts page and want to Check All filter Status
    When I click on All filter
    And I click on next arrow pagination on the right bottom corner
    Then I should see the correct account results

  Scenario: Checking when searching a contact by its ""Active"" Status and its pagination
    Given I am on BisCred Accounts page and want to Check All filter Status
    When I click on Active filter
    And I click on next arrow pagination on the right bottom corner
    Then I should see the correct account results "Active"

  Scenario: Checking when searching a contact by its ""InActive"" Status and its pagination
    Given I am on BisCred Accounts page and want to Check All filter Status
    When I click on InActive filter
    And I click on next arrow pagination on the right bottom corner
    Then I should see the correct account results "Inactive"

  Scenario: Edit new Account with Account name already exist
    Given I am on BisCred Accounts page and want to edit an account
    When I fill on search field with any account name
    Then I click on edit link
    Then I should be redirected to Edit Account page
    When I update the account name with name already exist
    And I update the other fields with valid data
    And I click on Update Account Button
    And I should see error message "Please fix the error below, and try again."
    And I should see an error message below the account name

  Scenario: Edit Account with empty account name field
    Given I am on BisCred Accounts page and want to edit an account
    When I fill on search field with any account name
    Then I click on edit link
    Then I should be redirected to Edit Account page
    When I update the account name field with empty data
    And I click on Update Account Button
    And I should see error message "Please fix the error below, and try again."
    And I should see error message under the Name field "The name field is required."

  Scenario: Edit new Account with empty Company Name field
    Given I am on BisCred Accounts page and want to edit an account
    When I fill on search field with any account name
    Then I click on edit link
    Then I should be redirected to Edit Account page
    When I update the company Name field with empty data
    And I click on Update Account Button
    And I should see error message "Please fix the error below, and try again."
    And I should see an error message under company Name "The company field is required."

  Scenario: Edit new Account with empty Number of Seats field
    Given I am on BisCred Accounts page and want to edit an account
    When I fill on search field with any account name
    Then I click on edit link
    Then I should be redirected to Edit Account page
    When I update the seats Name field with empty data
    And I click on Update Account Button
    Then I should see error message "Please fix the errors below, and try again."

  Scenario: Sort Name field alphabetically
    Given I am on BisCred Accounts page and want to sort the Fields alphabetically
    When I click on the arrows beside the name field
    Then I should see the names are sorting alphabetically

  Scenario: Sort Company field alphabetically
    Given I am on BisCred Accounts page and want to sort the Fields alphabetically
    When I click on the arrows beside the company field
    Then I should see the companies are sorting alphabetically

  Scenario: Sort Status field alphabetically
    Given I am on BisCred Accounts page and want to sort the Fields alphabetically
    When I click on the arrows beside the Status field
    Then I should see the Statuses are sorting alphabetically

  Scenario: Sort Seats field alphabetically
    Given I am on BisCred Accounts page and want to sort the Fields alphabetically
    When I click on the arrows beside the Seats field
    Then I should see the Seats are sorting descending