Feature: Go Live Readiness

  Background: 
    Given user launches the browser
    When user launches the Canvas gig portal
    And user enter the credentials and logged in
    And user select the Canvas gig testing dropdown
    And user navigates to Operational Readiness module
    And user navigates to Go Live Readiness sub module
    And verify user is on Go Live Readiness page



  @GLR_TC_03
  Scenario Outline: Verify the search functionality
    And verify user is able to search by <Application Name>
    Then user closes the browser
    
    Examples: 
      | Application Name |
      | demo             |
      
      
  	@ContractFinancial_TC_04
Scenario Outline: Verify user able to search values in Contract Financial table
	Given user clicks on Planning from left menu
	When user clicks on <planningOption> from planning
	And user clicks on expand <planningSection> button from Transition Milestone Planning
	And user verifies search <searchPlanName> for <planningSection>
	Then user closes the browser

Examples:
	|planningOption             |planningSection| searchPlanName |
	|Setup Transition Milestone|Contract Financial|Contract Signed|
	|12 Transition Milestone|Contract Financial|Contract Signed|