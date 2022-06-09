Feature: Login Test Functionality

Scenario: Validate login future with valid credentials

Given: user opens chrome browser
When user opens url "https://demo.guru99.com/test/newtours/index.php"
And user enters username "Mercury" and password "mercury"
Then user clicks on Login 
Then Page Title should be "Login: Mercury Tours"
Then closes the browser



Scenario Outline: Validate login future with valid credentials

Given: user opens chrome browser
When user opens url "https://demo.guru99.com/test/newtours/index.php"
And user enters username "<username>" and password "<password>"
Then user clicks on Login 
Then Page Title should be "Login: Mercury Tours"
Then closes the browser

Examples:

	|username | 	password|
	|Mercury  |		mercury|
	|admin    |		ziya123|