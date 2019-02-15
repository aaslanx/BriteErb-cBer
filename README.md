selenium-cucumber-java-maven
=================

selenium-cucumber : Automation Testing Using Java

USED APPROACH: Behavior Driven Development (BDD) approach to write automation test script to test "Brite ERP Database".



Documentation
-------------
* will be added soon

Download the framework
--------------
* https://github.com/aaslanx/BriteErb-cBer

Framework Architecture
--------------
	Project-Name
		|
		|_src/test/java
		|   |_pages
		|   |   |_ContactsLoginPage
		|   |   |_ContactsPage
		|   |   |_HomePage
		|   |   |_ImportUserPage
		|   |   |_LoginPage
		|   |   |_NewContact
		|   |   |_SystemNavigatesToPage
		|   |   |...
		|	|_runners
		|	|	|_CukesRunner
		|	|	|...
		|	|_step_definitions
		|	|	|_AlbertsTests.steps
		|	|	|_Common_steps
		|	|	|...
		|   |_utilities
		|   |   |_ApplicationConstants
		|   |   |_BrowserUtils
		|   |   |_ConfigReader
		|   |   |_Driver
		|
		|
		|_src/test/resources
		|	|_features
		|	|	|_Common.feature
		|	|	|_AlbertsTests.feature

* **src/test/resources/features** - all the cucumber features files (files .feature ext) goes here.
* **src/test/java/step-definition** - you can define step definition under this package for your feature steps.
* **src/test/java/runners - this package contains cucumber runner (RunCukeTest.java) where you can configure your glue code location (step defintions), define test result output format.(html, json, xml). Hooks where you can configure all before and after test settings Hooks.java, DriverUtil.java contains code for intializing driver instances for respective driver.
* **src/main/java/utilities/BrowserUtils** - There are so many methods that you can use while testing. You can call the methods from this class

Writing a test
--------------

The cucumber features goes in the `features` library and should have the ".feature" extension.

You can start out with naming your .feature file with your name or Jira case number.

You can extend this feature or make your own features.

You can extends and user Common.feature steps.


Predefined steps
-----------------
This is an excellent method to automate our tests cases more quickly, we did not learn yet. We can add later if we will be taught.

by albert