Feature: Download Center

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard

  Scenario: Check the Download functionality with results is not selected
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Download option
    Then I should see a Confirm download popup
    And I click on the checkbox for Clear selected results after download
    And I click on Download button
    Then I should see success massages "Your download is being generated and will be sent to your email and available in your download center shortly."
    And I should see the results is not selected
    Then I click on Download center on the top nav menu
    And I should see the file attached with status "In progress"

  Scenario: Check the Cancel button on Download popup
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Download option
    Then I should see a Confirm download popup
    And I click on Cancel button
   Then I should redirect to the search result page and no files downloaded

  Scenario: Check the Download functionality with results is selected
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Download option
    Then I should see a Confirm download popup
    And I click on Download button
    Then I should see success massages "Your download is being generated and will be sent to your email and available in your download center shortly."
    And I should see the results is still selected
    Then I click on Download center on the top nav menu
    And I should see the file attached with status "In progress"

  Scenario: Check that active downloads can be downloaded again
    Given I am on BisCred Download Center page
    When I click on any FILE NAME
    Then I should see the file is clickable

  Scenario: Check that inactive downloads can't be downloaded again
    Given I am on BisCred Download Center page
    When I click on any Expired File Name
    Then I should see the file is not clickable

  Scenario: Check the pagination of the downloads
    Given I am on BisCred Download Center page
    When I click on the pagination arrow on the right bottom corner
    Then I should see the next page of the downloaded file

  Scenario: Check the message After checking checkbox the downloads
    Given I am on BisCred Download Center page
    When I click on the checkbox beside Send downloads directly to my email
   Then I should see success massage "Your settings have been updated successfully."

  Scenario: Check the Close button on Download popup
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Download option
    Then I should see a Confirm download popup
    And I click on Close icon
   Then I should redirect to the search result page and no files downloaded

  Scenario: Check the status for the download file
    Given I am on BisCred dashboard and want to search about a person
    When I enter an exist company name "CBRE Investment Management" on the search field
    And I select the company from the result
    And I select all the people on the search result
    And I click on Actions button
    And I click on Download option
    Then I should see a Confirm download popup
    And I click on Download button
    Then I should see success massages "Your download is being generated and will be sent to your email and available in your download center shortly."
    And I click on Download center on the top nav menu
    And I should see the file attached to the download center page with current date
#    And I should see the file attached with status "In progress"