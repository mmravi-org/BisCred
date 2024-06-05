Feature: Criteria Search Dashboard

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

  Scenario: Search for a list of records using the criteria search functionality by name exact
    Given I am on BisCred Admin dashboard and want to search about specific record
    When I click on criteria Search
    Then I Select company in criteria search menu
    And I type  any Company name in Company Names field "Grey"
    And I click the plus button
    When I click the three dots beside the name
    And I select exact checkbox
    When  I Click search companies button
    Then I should be redirect to the search results page and see retains selected criteria
    And I should see Results exactly matched to the input contains "Grey"

  Scenario: Search for a list of records using the criteria search functionality by name Exclude
    Given I am on BisCred Admin dashboard and want to search about specific record
    When I click on criteria Search
    Then I Select company in criteria search menu
    And I type  any Company name in Company Names field "Grey"
    And I click the plus button
    When I click the three dots beside the name
    And I select exact checkbox
    When  I Click search companies button
    Then I should be redirect to the search results page and see retains selected criteria
    And I should see summary panel with the selected result

  Scenario: Check the Remove link for company name in  criteria search functionality
    Given I am on BisCred Admin dashboard and want to search about specific record
    When I click on criteria Search
    Then I Select company in criteria search menu
    And I type  any Company name in Company Names field "Grey"
    And I click the plus button
    When I click the three dots beside the name
    And I click on Remove link
    Then I should see the company name removed from criteria search

  Scenario: Check the Reset Button for criteria search functionality
    Given I am on BisCred Admin dashboard and want to search about specific record
    When I click on criteria Search
    Then I Select company in criteria search menu
    And I type  any Company name in Company Names field "Grey"
    And I click the plus button
    When I click on Reset button
    Then I should see the company name remove from criteria search
    And I should see the search icon displayed

  Scenario: Search for a list of records using the criteria search functionality by company industry "Private Equity"
    Given I am on BisCred Admin dashboard and want to search about specific record
    When I click on criteria Search
    Then I Select company in criteria search menu
    And I Select Private Equity from Company Industries
    When  I Click search companies button
    Then I should be redirect to the search results page and see retains selected criteria "Private Equity"
    And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry "Real Estate Investment Firm"
    Given I am on BisCred Admin dashboard and want to search about specific record
    When I click on criteria Search
    Then I Select company in criteria search menu
    And I Select Real Estate Investment Firm from Company Industries
    When  I Click search companies button
    Then I should be redirect to the search results page and see retains selected criteria "Real Estate Investment Firm"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Real Estate Investment Trust from Company Industries
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Real Estate Investment Trust (REIT)"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry "Developer"
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Developer from Company Industries
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Developer"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry "Operator"
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Operator from Company Industries
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Operator"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry ""Architect""
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Architect from Company Industries
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Architect"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry ""Engineering""
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Engineering from Company Industries
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Engineering"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry ""Interior Design""
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Interior Design from Company Industries
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Interior Design"
     And I should see summary panel with the selected result


   Scenario: Search for a list of records using the criteria search functionality by company industry ""General Contractor""
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select General Contractor from Company Industries
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "General Contractor"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry ""Property Management""
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Property Management from Company Industries
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Property Management"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry ""Construction""
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Construction from Company Industries
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Construction"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry ""CRE Broker""
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select CRE Broker from Company Industries
     When I click the three dots beside the Company Industries
     And I select exact checkbox
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Broker - Agency"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry ""Consulting - Beta""
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Consulting-Beta from Company Industries
     When I click the three dots beside the Company Industries
     And I select exact checkbox
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Consulting"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry ""Environmental Consulting - Beta""
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Environmental Consulting-Beta from Company Industries
     When I click the three dots beside the Company Industries
     And I select exact checkbox
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Environmental Consulting"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry ""Landscaping - Beta""
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Landscaping-Beta from Company Industries
     When I click the three dots beside the Company Industries
     And I select exact checkbox
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Landscaping"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry ""Law Firm and Legal Services - Beta""
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Law Firm and Legal Services-Beta from Company Industries
     When I click the three dots beside the Company Industries
     And I select exact checkbox
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Law Firm / Legal Services"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry "Lender"
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Lender from Company Industries
     When I click the three dots beside the Company Industries
     And I select exact checkbox
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Lender - Agency"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry ""Materials - Beta""
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Materials-Beta from Company Industries
     When I click the three dots beside the Company Industries
     And I select exact checkbox
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "Materials"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry ""PropTech - Beta""
     Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select PropTech-Beta from Company Industries
     When I click the three dots beside the Company Industries
     And I select exact checkbox
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria "PropTech"
     And I should see summary panel with the selected result

   Scenario: Search for a list of records using the criteria search functionality by company industry exact
    Given I am on BisCred Admin dashboard and want to search about specific record
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Private Equity from Company Industries
     When I click the three dots beside the Company Industries
     And I select exact checkbox
     And  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria
     And I should see Company only the input industry "Private Equity"

   Scenario: Search for a list of records using the criteria search functionality by company industry Exclude
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Private Equity from Company Industries
     When I click the three dots beside the Company Industries
     And I select Exclude checkbox
     And  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria
     And I should see Company not contain the input industry

   Scenario: Check Remove link from Company Industry in the criteria search functionality
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Private Equity from Company Industries
     When I click the three dots beside the Company Industries
     And I click on Remove link
     Then I should see the Company search button and people button is inactive
     And I should see the search icon displayed

   Scenario: Search for a list of records using the criteria search functionality by Company Asset Experiences
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Affordable Housing from Company Asset Experiences
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected Company "Affordable Housing"

   Scenario: Search for a list of records using the criteria search functionality by Company Asset Experiences exact
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Affordable Housing from Company Asset Experiences
     When I click the three dots beside the Company Asset Experiences
     And I select exact checkbox
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected Company "Affordable Housing"
     And I should see summary panel with the selected criteria result

   Scenario: Search for a list of records using the criteria search functionality by Company Asset Experiences Exclude
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Affordable Housing from Company Asset Experiences
     When I click the three dots beside the Company Asset Experiences
     And I select Exclude checkbox
     When  I Click search companies button
     Then I should be redirect to the search results page and Company should not contain the input asset
     And I should see summary panel with the selected criteria result

   Scenario: Remove link for Company Asset Experiences in criteria search functionality
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Affordable Housing from Company Asset Experiences
     When I click the three dots beside the Company Asset Experiences
     And I click on Remove link
     Then I should see the Company search button and people button is inactive
     And I should see the search icon displayed

   Scenario: Search for a list of records using the criteria search functionality by Company State HQ Only
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Select Illinois from Midwest from Company State
     And I click on HQ Only toggle
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria city "Illinois"
     And I should see summary panel with the selected criteria result

   Scenario: Search for a list of records using the criteria search functionality by Company State combination between exclude and HQ only
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     And I Select company in criteria search menu
     And I Select Illinois from Midwest from Company State
     And I click on the three dots beside Company State selected
     And I click on HQ Only and Exclude at the same time
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains Companies should not be headquarted in the selected state "Illinois"
     And I should see summary panel with the selected criteria result

   Scenario: Check Remove link fro Company State  the criteria search functionality
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     And I Select company in criteria search menu
     And I Select Illinois from Midwest from Company State
     And I click on the three dots beside Company State selected
     And I click on Remove link
     Then I should see the Company search button and people button is inactive
     And I should see the search icon displayed

   Scenario: Search for a list of records using the criteria search functionality by Company City
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I type any city in the Company City field
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains Company should be in the selected City "New York"
     And I should see summary panel with the selected criteria result

   Scenario: Search for a list of records using the criteria search functionality by Company City HQ Only
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I type any city in the Company City field
     And I click on HQ Only toggle for City
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains Company should be headquartered in the selected City
     And I should see summary panel with the selected criteria result

   Scenario: Search for a list of records using the criteria search functionality by Company City Exclude
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I type any city in the Company City field
     And I click on the three dots beside the Company City
     When  I select exclude city
     And  I Click search companies button
     Then I should be redirect to the search results page and see retains Company should not have any offices in the selected City HQ or Regional
     And I should see summary panel with the selected criteria result

   Scenario: Search for a list of records using the criteria search functionality by Company City Exact
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I type any city in the Company City field
     And I click on the three dots beside the Company City
     When I select exact for city
     And  I Click search companies button
     Then I should be redirect to the search results page and see retains City should match the input exactly
     And I should see summary panel with the selected criteria result

   Scenario: Search for a list of records using the criteria search functionality by Company City compination between HQ Only, Exact
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I type any city in the Company City field
     And I click on the three dots beside the Company City
     When  I select HQ Only, Exact at the same time
     And  I Click search companies button
     Then I should be redirect to the search results page and see retains Company should be headquartered in exactly the inputted city
     And I should see summary panel with the selected criteria result

   Scenario: Search for a list of records using the criteria search functionality by Company City Compination between HQ Only, Exclude
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I type any city in the Company City field
     And I click on the three dots beside the Company City
     When  I select exclude city
     And  I Click search companies button
     Then I should be redirect to the search results page and see retains Company should not be headquarterd in inputted city
     And I should see summary panel with the selected criteria result

   Scenario: Search for a list of records using the criteria search functionality by Company City Compination between HQ Only, Exact, Exclude
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I type any city in the Company City field
     And I click on the three dots beside the Company City
     When I select HQ only, exclude, Exact at the same time
     And  I Click search companies button
     Then I should be redirect to the search results page and see retains Company should not have be headquartered in exactly the selected city
     And I should see summary panel with the selected criteria result

   Scenario: Check Remove link from Company City in Criteria Search Functionality
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I type any city in the Company City field
     And I click on the three dots beside the Company City
     When  I select Remove link
     Then I should see the Company search button and people button is inactive
     And I should see the search icon displayed

   Scenario: Search for a list of records using the criteria search functionality by Company Lists
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I click on Exclude Saved Company Records toggle
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria
     And I should see summary panel with the selected criteria result

   Scenario: Check the x button besdide the selected Company Lists
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I click on Exclude Saved Company Records toggle
     And I click on x button
     Then I should see the Company search button and people button is inactive
     And I should see the search icon displayed

   Scenario: Search for a list of records using the criteria search functionality by Company Contact Count
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I select Minimum and maximum value Contacts
     And I should see Contact Count appear on the right search bar with correct min & max value as selected
     When  I Click search companies button
     Then I should be redirect to the search results page and see retains selected criteria
     And I should see summary panel with the selected criteria result

   Scenario: Search for a list of records using the criteria search functionality by Company Contact Count Minimum value by scrolling bar
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I select Minimum value Contacts
     And I should see Contact Count appear on the right search bar with correct min & max value as selected
     When  I Click search companies button
     And I click on sort arrow
     Then I should be redirect to the search results page and see retains company Contact count has the minimum value selected

   Scenario: Search for a list of records using the criteria search functionality by Company Contact Count Minimum value by Enter value
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Enter a minimum value inside the minimum field
     And I should see Contact Count appear on the right search bar with correct min & max value as selected
     When  I Click search companies button
     And I click on sort arrow
     Then I should be redirect to the search results page and see retains company Contact count has the minimum value selected

   Scenario: Search for a list of records using the criteria search functionality by Company Contact Count Maximum value by scrolling bar
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I select Maximum value Contacts
     And I should see Contact Count appear on the right search bar with correct min & max value as selected
     When  I Click search companies button
     And I click on sort arrow twice
     Then I should be redirect to the search results page and see retains company Contact count has the minimum value selected

   Scenario: Search for a list of records using the criteria search functionality by Company Contact Count Maximum value by Enter value
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Enter a maximum value
     And I should see Contact Count appear on the right search bar with correct min & max value as selected
     When  I Click search companies button
     And I click on sort arrow twice
     Then I should be redirect to the search results page and see retains company Contact count has the minimum value selected

   Scenario: Search for a list of records using the criteria search functionality by Company Contact Count Maximum value by Enter value
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Enter a maximum value
     And I should see Contact Count appear on the right search bar with correct min & max value as selected
     When  I Click search companies button
     And I click on sort arrow twice
     Then I should be redirect to the search results page and see retains company Property count has the maximum value selected

   Scenario: Search for a list of records using the criteria search functionality by Company Property Count Maximum value by scrolling bar
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I select Maximum value for property Contacts
     And I should see Contact Count appear on the right search bar with correct min & max value as selected
     When  I Click search companies button
     And I click on sort arrow twice
     Then I should be redirect to the search results page and see retains company Property count has the maximum value selected

   Scenario: Search for a list of records using the criteria search functionality by Company Property Count Maximum value by Enter value
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Enter a maximum value to maximum field
     And I should see Contact Count appear on the right search bar with correct min & max value as selected
     When  I Click search companies button
     And I click on sort arrow twice
     Then I should be redirect to the search results page and see retains company Property count has the maximum value selected

   Scenario: Search for a list of records using the criteria search functionality by Company Property Count Minimum value using scroll bar
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I select Minimum value Contacts
     And I should see Contact Count appear on the right search bar with correct min & max value as selected
     When  I Click search companies button
     And I click on sort arrow
     Then I should be redirect to the search results page and see retains company Property count has the maximum value selected

   Scenario: Search for a list of records using the criteria search functionality by Company Property Count Minimum value by Enter value
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I Enter a Minimum value to the mininmum Contacts
     And I should see Property Count appear on the right search bar with correct min & max value as selected
     When  I Click search companies button
     And I click on sort arrow
     Then I should be redirect to the search results page and see retains company Property count has the maximum value selected

   Scenario: checking clear functionality for Company property Count
     Given I am on BisCred Admin dashboard
     When I click on criteria Search again
     Then I Select company in criteria search menu
     And I select Minimum value Properties
     And I should see Property Count appear on the right search bar with correct min & max value as selected
     When I Click on clear button
     Then I should see the Property Count appear on the right search bar is disappeared
     And I should see the Company search button and people button is inactive

  Scenario: Check new search Button on Company Details Page Functionallity
     Given I am on BisCred Admin dashboard
     When I click on criteria Search
     Then I Select company in criteria search menu
     And I type any city in the Company City field
     And I click on the three dots beside the Company City
     When  I select exclude city
     And  I Click search companies button
     Then I should be redirect to the search results page and see retains Company should not be headquarterd in inputted city
     And I should see summary panel with the selected criteria result
     When I click on New Search button
     Then I should be redirected to the Criteria Search Tab

  Scenario: Checking when searching company city with empty value
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select company in criteria search menu
    And I click the plus button in city Field
    And I should see notification "Search must be at least 3 characters."

  Scenario: Search for a list of records using the criteria search functionality by People names Exact
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I type  any People name in People Names field
    And I click the plus button in Person
    And I click on the three dots
    And I select exact for Person
    When I Click search people button
    Then I should be redirect to the search results page and Results should be exactly matched to the input People name
    And I should see summary panel with the selected criteria result

  Scenario: Search for a list of records using the criteria search functionality by People names Exclude
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I type  any People name in People Names field
    And I click the plus button in Person
    And I click on the three dots
    And I select exclude for Person
    When I Click search people button
    Then I should be redirect to the search results page and Results should not have the input phrase in them
    And I should see summary panel with the selected criteria result

  Scenario: check the remove link from People Names
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I type  any People name in People Names field
    And I click the plus button in Person
    And I click on the three dots
    And I select Remove link for Person
    Then I should see the name value is disappeared
    And I should see the Company search button and people button is inactive

  Scenario: Search for a list of records using the criteria search functionality by People Job Titles Exact
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I type  any Job Titles in people Job Titles field
    And I click the plus button in job title
    And I click on the three dots
    And I select exact in job title
    When  I Click search people button
    Then I should be redirect to the search results page and Results should be exactly matched to the input Job Titles
    And I should see summary panel with the selected criteria result

  Scenario: Search for a list of records using the criteria search functionality by People Job Titles Exclude
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I type  any Job Titles in people Job Titles field
    And I click the plus button in job title
    And I click on the three dots
    And I select exclude in job title
    When  I Click search people button
    Then I should be redirect to the search results page and Results should not have the input phrase in them
    And I should see summary panel with the selected criteria result

  Scenario: Check the Remove link in People Job Title
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I type  any Job Titles in people Job Titles field
    And I click the plus button in job title
    And I click on the three dots
    And I select Remove link in job title
    Then I should see the People Job Title value is disappeared
    And I should see the Company search button and people button is inactive

  Scenario: Search for a list of records using the criteria search functionality by People Senioritis exact
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I click the plus sign beside Executive
    And I select Chairman from Executive from People Senioritis
    And I should see the selected seniority in the right side panel
    And I click on the three dots
    And I select exact for Seniority
    When  I Click search people button
    Then I should be redirect to the search results page and Results should be exactly matched to the input Seniority
    And I should see summary panel with the selected criteria result

  Scenario: Search for a list of records using the criteria search functionality by People Senioritis Exclude
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I click the plus sign beside Executive
    And I select Chairman from Executive from People Senioritis
    And I should see the selected seniority in the right side panel
    And I click on the three dots
    And I select exclude
    When  I Click search people button
    Then I should be redirect to the search results page and Results should be exactly matched to the input not contain senirity
    And I should see summary panel with the selected criteria result

  Scenario: Check Remove Link for People Seniorities
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I Select Person in criteria search menu
    And I click the plus sign beside Executive
    And I select Chairman from Executive from People Senioritis
    And I should see the selected seniority in the right side panel
    When I click on the three dots
    And I select Remove Link in Seniority
    Then I should see the People Seniorities value is disappeared
    And I should see the Company search button and people button is inactive

  Scenario: Search for a list of records using the criteria search functionality by People Asset Experiences exact
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I select Affordable Housing from People Asset Experiences
    And I should see the selected seniority in the right side panel
    And I click on the three dots
    And I select exact for Seniority
    When  I Click search people button
    Then I should be redirect to the search results page and People should be only the input asset
    And I should see summary panel with the selected criteria result

  Scenario: Search for a list of records using the criteria search functionality by People Asset Experiences Exclude
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I select Affordable Housing from People Asset Experiences
    And I should see the selected seniority in the right side panel
    And I click on the three dots
    And I select exclude
    When  I Click search people button
    Then I should be redirect to the search results page and Results should not contain people with the selected seniority
    And I should see summary panel with the selected criteria result

  Scenario: Check Remove link from People Asset Experiences Exclude
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I Select Person in criteria search menu
    And I select Affordable Housing from People Asset Experiences
    And I should see the selected seniority in the right side panel
    And I click on the three dots
    When I select Remove Link in Asset Experiences
    Then I should see the Asset Experiences value is disappeared
    And I should see the Company search button and people button is inactive

  Scenario: Search for a list of records using the criteria search functionality by People States Exact
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I click on plus sign beside Midwest
    And I select Illinois from  Midwest in people state
    And I should see the selected state in the right side panel
    And I click on the three dots
    And I select exclude in people state
    When  I Click search people button
    Then I should be redirect to the search results page and Results should contain people with the selected state exact
    And I should see summary panel with the selected criteria result

  Scenario: Search for a list of records using the criteria search functionality by People States Exclude
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I click on plus sign beside Midwest
    And I select Illinois from  Midwest in people state
    And I should see the selected state in the right side panel
    And I click on the three dots
    And I select exclude in people state
    When  I Click search people button
    Then I should be redirect to the search results page and Results should not contain people with the selected state
    And I should see summary panel with the selected criteria result

  Scenario: Check Remove link from People State
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I Select Person in criteria search menu
    And I click on plus sign beside Midwest
    And I select Illinois from  Midwest in people state
    Then I should see the selected state in the right side panel
    And I click on the three dots
    When I select Remove Link in people state
    Then I should see the People State value is disappeared
    And I should see the Company search button and people button is inactive

  Scenario: Search for a list of records using the criteria search functionality by People Cities Exact
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I type any city in People Cities
    And I click on plus sign
    And I should see the selected city in the right side panel
    And I click on the three dots
    And I select Exact in People Cities
    When  I Click search people button
    Then I should be redirect to the search results page and City should match the input exactly
    And I should see summary panel with the selected criteria result

  Scenario: Search for a list of records using the criteria search functionality by People Cities exclude
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I type any city in People Cities
    And I click on plus sign
    And I should see the selected city in the right side panel
    And I click on the three dots
    And I select exclude
    When  I Click search people button
    Then I should be redirect to the search results page and People should not be based in the selected City
    And I should see summary panel with the selected criteria result

  Scenario: Check Remove link from People Cities
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I Select Person in criteria search menu
    And I type any city in People Cities
    And I click on plus sign
    Then I should see the selected city in the right side panel
    And I click on the three dots
    When I select Remove Link in People Cities
    Then I should see the People Cities value is disappeared
    And I should see the Company search button and people button is inactive

  Scenario: Checking when searching People city with empty value
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I click on plus sign
    And I should see notification "Search must be at least 3 characters."

  Scenario: Search for a list of records using the criteria search functionality by People Lists
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I click on Exclude Saved People Records toggle
    When  I Click search people button
    Then I should be redirect to the search results page and see retains selected criteria
    And I should see summary panel with the selected criteria result

  Scenario: Checking the X Icon on People List
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    And I Select Person in criteria search menu
    And I click on Exclude Saved People Records toggle
    When  I Click on X Icon
    Then I should see the People List value is disappeared
    And I should see the Company search button and people button is inactive

  Scenario: Check new search Button on Contact Detailes page Functionallity
    Given I am on BisCred Admin dashboard
    When I click on criteria Search
    Then I Select Person in criteria search menu
    And I type  any People name in People Names field
    And I click the plus button in Person
    And I click on the three dots
    And I select exact for Person
    When I Click search people button
    Then I should be redirect to the search results page and Results should be exactly matched to the input People name
    And I should see summary panel with the selected criteria result
    When I click on New Search button
    Then I should be redirected to the Criteria Search Tab