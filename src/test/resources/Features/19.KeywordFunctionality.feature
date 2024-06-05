Feature: Keyword Functionality

  Scenario: Login to biscred with valid credentials
    Given I am on BisCred Login Screen and want to log in as Admin
    When I enter valid email and password
    And I click on Sign In Button
    Then I should see Admin Dashboard


#The edit flag is removed from the site

#  Scenario: Checking the Activate the keyword functionality
#    Given I am on BisCred Admin dashboard
#    When I Select Feature Management from drop down list
#    And I click on Activate link for company-keyword-search-controls
#    Then I should see a success message "Feature successfully activated."
#
#  Scenario: Checking Close Edit the keyword functionality
#    Given I am on BisCred Admin dashboard
#    When I click on Admin Menu
#    Then I Select Feature Management from drop down list
#    And I click on Edit link
#    Then I should see Edit Feature Flags pop up
#    And I type any user name in Edit Feature Flags field "Hanin Alsheyab"
#    And I should see the user is displaying in All Users section "Hanin Alsheyab"
#    And I click on Close icon
#    Then I should be redirected to the Feature Management page
#    When I click on Search menu
#    When I click on criteria Search
#    Then I should see the kewyword field is removed from criteria search page
#
#  Scenario: Checking Edit the keyword functionality
#    Given I am on BisCred Admin dashboard
#    When I Select Feature Management from drop down list
#    And I click on Edit link
#    Then I should see Edit Feature Flags pop up
#    And I type any user name in Edit Feature Flags field "Hanin Alsheyab"
#    And I should see the user is displaying in All Users section "Hanin Alsheyab"
#    When I click on the check box beside the user
#    Then I should see the user added to the Selected Users section "Hanin Alsheyab"
#    And I click Save button
#    Then I should see a success message "Feature settings saved!"
#    When I click on Search menu
#    When I click on criteria Search
#    Then I should see the A new free text field should be accessible on the criteria search page
#
#  Scenario: Checking Cancel Edit the keyword functionality
#    Given I am on BisCred Admin dashboard
#    When I click on Admin Menu
#    Then I Select Feature Management from drop down list
#    And I click on Edit link
#    Then I should see Edit Feature Flags pop up
#    And I type any user name in Edit Feature Flags field "Testing user manager"
#    And I should see the user is displaying in All Users section "Testing user manager"
#    When I click on the check box beside the user
#    Then I should see the user added to the Selected Users section "Testing user manager"
#    And I click on Cancel button on Edit Feature popup
#    Then I should be redirected to the Feature Management page
#    When I click on Edit link again
#    Then I should see Edit Feature Flags pop up
#    And I should see the user not added to the Selected Users section "Testing user manager"

  Scenario: keyword column should be disable if we removed keywords were searched in the inputs
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select company in criteria search menu
    And I leave the company keyword empty
    And I Select Construction from Company Industries
    When  I Click search companies button
    Then I should be redirect to the search results page
    When I click on Columns button on company details page
    Then I should see the Company Keywords & Company Keywords Context is disabled

  Scenario: keyword column should only appear if keywords were searched in the inputs
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select company in criteria search menu
    And I type in any word into Company Keyword field "few"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "few"
    When I Click search companies button
    Then I should be redirect to the search results page
    And I should see A new column Company Keywords should be added to the search results page contains the search keyword
    And I should see A new column Company Keywords Context should be added to the search results page


  Scenario: Check The Keywords column with word into Company Keyword field
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "Design"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "Design"
    When I Click search companies button
    Then I should be redirect to the search results page
    And I should see A new column Company Keywords should be added to the search results page contains the search keyword "Design"


  Scenario: Check The Keywords column with phrase into Company Keyword field
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "Interior Design"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "Interior Design"
    When I Click search companies button
    Then I should be redirect to the search results page
    And I should see A new column Company Keywords should be added to the search results page contains the search keyword "Interior Design"

  Scenario: Check The Keywords column with number value  into Company Keyword field
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "123"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "123"
    When I Click search companies button
    Then I should be redirect to the search results page
    And I should see A new column Company Keywords should be added to the search results page contains the search keyword "123"

  Scenario: Check The Keywords column, is a simple comma separated value column of all the keywords
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "Architecture"
    And I click on plus sign for Company Keyword field
    And I type in any word into Company Keyword field "Healthcare"
    And I click on plus sign for Company Keyword field
    When I Click search companies button
    Then I should be redirect to the search results page
    And I should see A new column Company Keywords should be added to the search results page contains the search keyword "Architecture","Healthcare","Architecture,Healthcare"

  Scenario: Validate Additional Criteria after Keyword search
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "Private"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "Private"
    And I Select Private Equity from Company Industries
    When I click the three dots beside the Company Industries
    And I select exact checkbox
    When I Click search companies button
    Then I should be redirect to the search results page
    And I should see A new column Company Keywords should be added to the search results page contains the search keyword "Private"

  Scenario: validate keyword modal window and load in all the keyword highlights
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "Company"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "Company"
    When I Click search companies button
    Then I should be redirect to the search results page
    And I click on any value in Company Keywords Context column
    Then I should see Company Keywords Search Details pop up display
    And I should see the keywords and their context for the selected company displayed

  Scenario: validate close modal window using close modal
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "results"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "results"
    When I Click search companies button
    Then I should be redirect to the search results page
    And I click on any value in Company Keywords Context column
    Then I should see Company Keywords Search Details pop up display
    And I should see the keywords and their context for the selected company displayed
    When I click on close button Pop Up
    Then I should be redirect to the search results page

  Scenario: check snippet should be a hyperlink In the Context Dialog box, each
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "box"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "box"
    When I Click search companies button
    Then I should be redirect to the search results page
    And I click on any value in Company Keywords Context column
    Then I should see Company Keywords Search Details pop up display
    And I should see the keywords and their context for the selected company displayed
    When I click on any Snippet Link
    Then I should be redirect to the correct page

  Scenario: Validate searched multiple keywords is sorted by keyword
    Given I am on BisCred Admin dashboard
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "Architecture"
    And I click on plus sign for Company Keyword field
    And I type in any word into Company Keyword field "Healthcare"
    And I click on plus sign for Company Keyword field
    When I Click search companies button
    Then I should be redirect to the search results page
    And I should see the Keywords column are sorted by keyword

  Scenario: Validate Adding special characters as #, & will not show an empty keyword column
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "LEED & Certified"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "LEED & Certified"
    When I Click search companies button
    Then I should be redirect to the search results page
    And I should see A new column Company Keywords should be added to the search results page contains the search keyword "LEED & Certified"
    And I should see the Keyword columns contains the keywords that were found without any empty value

  Scenario: Check The Remove functionality for Company Keywords column
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "LEED"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "LEED"
    When I Click search companies button
    Then I should be redirect to the search results page
    When I click on Columns button on company details page
    And I click on selection box beside Company Keywords column
    And I should see the Company Keywords column removed from the company details page

  Scenario: Check The Remove functionality for Company Keywords Context column
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "Cold"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "Cold"
    When I Click search companies button
    Then I should be redirect to the search results page
    When I click on Columns button on company details page
    And I click on selection box beside Company Keywords Context column
    And I should see the Company Keywords Context column removed from the company details page

  Scenario: Check added  Company Keywords column again
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "LEED"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "LEED"
    When I Click search companies button
    Then I should be redirect to the search results page
    When I click on Columns button on company details page
    And I click on selection box beside Company Keywords column

  Scenario: Check added Company Keywords Context column again
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "Cold"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "Cold"
    When I Click search companies button
    Then I should be redirect to the search results page
    When I click on Columns button on company details page
    And I click on selection box beside Company Keywords Context column

  Scenario: Check the Hide Company Keywords column Functionality
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "values"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "values"
    When I Click search companies button
    Then I should be redirect to the search results page
    When I click on The hide link beside Company Keywords column on company details page
    And I should see the Company Keywords removed from the company details page


  Scenario: Check The hide functionality for Company Keywords Context column
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I type in any word into Company Keyword field "time"
    And I click on plus sign for Company Keyword field
    Then I should see the recent keywords searched should appear below the search bar "time"
    When I Click search companies button
    Then I should be redirect to the search results page
    When I click on The hide link beside Company Keywords context column on company details page
    And I should see the Company Keywords Context column removed from the company details page