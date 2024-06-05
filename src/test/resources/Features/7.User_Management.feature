Feature: User Management Feature

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Create new user
    Given I am on BisCred Users management page and want to Create new user
    When I click on Create user button
    Then I should be redirected to create user page
    When I fill the form with valid user data
    And click on Create user button
    Then I should see a success massage for adding new user
    And I should be redirected to the manage users page

  Scenario: Create new internal user
    Given I am on BisCred Users management page and want to Create new user
    When I click on Create user button
    Then I should be redirected to create user page
    When I fill the form with valid user data for internal
    And click on Create user button
    Then I should see a success massage for adding new user
    And I should be redirected to the manage users page

  Scenario: Create new trial user
    Given I am on BisCred Users management page and want to Create new user
    When I click on Create user button
    Then I should be redirected to create user page
    When I fill the form with valid user data trial
    Then the user downloads settings section should be hidden
    When click on Create user button
    Then I should see a success massage for adding new user
    And I should be redirected to the manage users page

  Scenario: Create new user with role Basic
    Given I am on BisCred Users management page and want to Create new user
    When I click on Create user button
    Then I should be redirected to create user page
    When I fill the form with valid user data for Basic
    And click on Create user button
    Then I should see a success massage for adding new user
    And I should be redirected to the manage users page

  Scenario: Create new super admin user
    Given I am on BisCred Users management page and want to Create new user
    When I click on Create user button
    Then I should be redirected to create user page
    When I fill the form with valid user data Super Admin
    And click on Create user button
    Then I should see a success massage for adding new user
    And I should be redirected to the manage users page

  Scenario: Check empty username field validation
    Given I am on BisCred Users management page and want to Create new user
    When I click on Create user button
    Then I should be redirected to create user page
    When I fill the form with valid user data and leave the user name empty
    And click on Create user button
    Then I should see an error message says: "The name field is required."

  Scenario: Check empty email field validation
    Given I am on BisCred Users management page and want to Create new user
    When I click on Create user button
    Then I should be redirected to create user page
    When I fill the form with valid user data and leave the email empty
    And click on Create user button
    Then I should see an error message says: "The email field is required."

  Scenario: Check empty account field validation
    Given I am on BisCred Users management page and want to Create new user
    When I click on Create user button
    Then I should be redirected to create user page
    When I fill the form with valid user data and leave accounts dropdown empty
    And click on Create user button
    Then I should see an error message says: "The account ids field is required."

  Scenario: Check empty role field validation
    Given I am on BisCred Users management page and want to Create new user
    When I click on Create user button
    Then I should be redirected to create user page
    When I fill the form with valid user data and leave the role field empty
    And click on Create user button
    Then I should see an error message says: "2"

  Scenario: Create new user can't download
    Given I am on BisCred Users management page and want to Create new user
    When I click on Create user button
    Then I should be redirected to create user page
    When I fill the form with valid user data and mark can download false
    And click on Create user button
    Then I should see a success massage for adding new user
    And I should be redirected to the manage users page

  Scenario: Create new user can download
    Given I am on BisCred Users management page and want to Create new user
    When I click on Create user button
    Then I should be redirected to create user page
    When I fill the form with valid user data and mark can download true
    And I select monthly from Download Limit Cadence
    And I fill the Download Limit field with any download limit
    And click on Create user button
    Then I should see a success massage for adding new user
    And I should be redirected to the manage users page

  Scenario: Search for users by name
    Given I am on BisCred Users management page
    When I enter in the search bar "RegressionAutomationTest"
    Then I should see all users that matched the typed name "RegressionAutomationTest"

  Scenario: Search for users by email
    Given I am on BisCred Users management page
    When I enter in the search bar "haneenTestRegression@bisnow.com"
    Then I should see all users that matched the typed Email "haneenTestRegression@bisnow.com"

  Scenario: Search for users by account
    Given I am on BisCred Users management page
    When I enter in the search bar "Test Account"
    Then I should see all users under account "Test Account"

  Scenario: Filter by active users
    Given I am on BisCred Users management page
    When I click on Active filter
    Then I should see all users with status "Active"

  Scenario: Filter by inactive users
    Given I am on BisCred Users management page
    When I click on InActive filter
    Then I should see all users with status "Inactive"

  Scenario: Checking the users list pagination
    Given I am on BisCred Users management page
    When I click on next arrow pagination on the right bottom corner
    Then I should see the next page

  Scenario: Check files downloaded by the user in View Page
    Given I am on BisCred Users management page
    When I enter in the search bar "RegressionAutomationTest"
    And I click on view link
    Then I should be redirected to View user page
    Then I should see User Download Stats
    And I should see user Activity
    When I click on downloads tab
  Then I should see the files downloaded by the user

  Scenario: Check Activity downloaded by the user in View Page
    Given I am on BisCred Users management page
    When I enter in the search bar "RegressionAutomationTest"
    And I click on view link
    Then I should be redirected to View user page
    Then I should see User Download Stats
    And I should see user Activity
    Then I should be redirected to View user page
    When I click on Activity tab
    Then I should see the user Activity

  Scenario: validate user status of Active status on View User page  Functionality
    Given I am on BisCred Users management page
    When I click on Active filter
    And I click on view link
    Then I should be redirected to View user page
    Then I should see the Active status in the right top corner

  Scenario:  validate user status of InActive status on View User page  Functionality
    Given I am on BisCred Users management page
    When I click on InActive filter
    And I click on view link
    Then I should be redirected to View user page
    Then I should see the InActive status in the right top corner

  Scenario: Check Edit User Functionality by leaving the email empty
    Given I am on BisCred Users management page
    When I enter in the search bar "RegressionAutomationTest"
    When I click on the Edit link
    Then I should be redirected to Edit User page
    When I update the form with valid user data and leave the email empty
    And I click on Update User button
    Then I should see an error message says: "The email field is required."

  Scenario: Check Edit User Functionality by leaving the name empty
    Given I am on BisCred Users management page
    When I enter in the search bar "RegressionAutomationTest"
    When I click on the Edit link
    Then I should be redirected to Edit User page
    When I update the form with valid user data and leave the name empty
    And I click on Update User button
    Then I should see an error message says: "The name field is required."


  Scenario: Check Update all fields Functionality
    Given I am on BisCred Users management page
    When I enter in the search bar "RegressionAutomationTest"
    And I click on the Edit link
    Then I should be redirected to Edit User page
    When I Update all the fields
    And I click on Update User button
    And I should see success massage "User has been updated."

  Scenario: Check Edit User's Password Functionality by leaving fields empty
    Given I am on BisCred Users management page
    When I enter in the search bar "RegressionAutomationTest"
    And I click on the Edit link
    Then I should be redirected to Edit User page
    When I Enter an empty space to the password field
    And I click on Update password Button
    And I should see error message under the password field "The new password field is required."
    And I should see error message "Please fix the error below, and try again."

  Scenario: Check Edit User's Password Functionality
    Given I am on BisCred Users management page
    When I enter in the search bar "AutomationTestUser"
    And I click on the Edit link
    Then I should be redirected to Edit User page
    When I Enter new password and confirm new password
    And I click on Update password Button
    And I should see success massage "Password has been updated."

  Scenario: Check the Login using the updated Password Functionality
    Given I am on BisCred Users management page
    When I enter in the search bar "AutomationTestUser"
    And I click on the Edit link
    Then I should be redirected to Edit User page
    When I Enter new password and confirm new password
    And I click on Update password Button
    And I should see success massage "Password has been updated."
    When I click on the profile icon
    And I select Logout option from drop down list
    Then I should be redirected to the login page
    When I enter the new password to the password field
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Check the Login using Super Admin User
    Given I am on BisCred Users management page
    When I click on the profile icon
    And I select Logout option from drop down list
    Then I should be redirected to the login page
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard
    And I should see download center , User Management and Accounts page displaying on the top nav
    When I click on User Management on the top nav
    And I should be redirected to the manage users page
    And I should see Export Activity Report button

  Scenario: Check the Login using user with role Basic
    Given I am on BisCred Users management page
    When I enter in the search bar "BasicUserForAutomation2"
    And I click on the Edit link
    Then I should be redirected to Edit User page
    When I Enter new password and confirm new password For Basic
    And I click on Update password Button
    When I click on the profile icon
    And I select Logout option from drop down list
    Then I should be redirected to the login page
    When I enter valid email and password for The Basic User
    And I click on Sign In Button
    Then I should see Admin Dashboard
    And I should see Base Permissions displaying on the top nav
    When I click on the profile icon
    And I select Logout option from drop down list

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Check the Login using user with role user
    Given I am on BisCred Users management page
    When I enter in the search bar "UserRoleForAutomation"
    And I click on the Edit link
    Then I should be redirected to Edit User page
    When I Enter new password and confirm new password For Basic
    And I click on Update password Button
    When I click on the profile icon
    And I select Logout option from drop down list
    Then I should be redirected to the login page
    When I enter valid email and password for The User
    And I click on Sign In Button
    Then I should see Admin Dashboard
    And I should see Base Permissions displaying on the top nav
    When I click on the profile icon
    And I select Logout option from drop down list

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Check the Login using user with role Trail
    Given I am on BisCred Users management page
    When I enter in the search bar "TrailUserForAutomation"
    And I click on the Edit link
    Then I should be redirected to Edit User page
    When I Enter new password and confirm new password For Basic
    And I click on Update password Button
    When I click on the profile icon
    And I select Logout option from drop down list
    Then I should be redirected to the login page
    When I enter valid email and password for Trail User
    And I click on Sign In Button
    Then I should see Admin Dashboard
    And I should see Base Permissions displaying on the top nav with No downloads display
    When I click on the profile icon
    And I select Logout option from drop down list

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Check the Login using user with role Internal
    Given I am on BisCred Users management page
    When I enter in the search bar "InternalRoleForAutomation"
    And I click on the Edit link
    Then I should be redirected to Edit User page
    When I Enter new password and confirm new password For Basic
    And I click on Update password Button
    When I click on the profile icon
    And I select Logout option from drop down list
    Then I should be redirected to the login page
    When I enter valid email and password for The Internal User
    And I click on Sign In Button
    Then I should see Admin Dashboard
    And I should see download center , User Management and Accounts page displaying on the top nav
