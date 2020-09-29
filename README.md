# Test - Assigment 2

## Reflections

### Computer Mouse
Identify the types of testing you would perform on a computer mouse, tomake sure that it is of the highest quality.
* I would test how fast the mouse is (DPI)
* I would test how precise the mouse is.
* I would test how durable the mouse is.
* I would test how comfortable the mouse is.

For a cable mouse I would test:
* How durable the cable is
For a wireless mouse i would test:
* The input lag of the mouse.
* How reliable the connetion is.
* How far the connection can reach. 

### Catastrophic failure
Find a story where a software system defect had a bad outcome. Describewhat happened. Can you identify a test that would have prevented it?
Story used: Rocket launch errors - https://www.pingdom.com/blog/10-historical-software-bugs-with-extreme-consequences/

In this case it would have been smart to test the reused code from Ariane 4, on a simulated version of the Ariane 5 flight controls instead of just expecting it to work. 

## Investigation of JUnit 5 tools
Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.
###@Tag
* this tag annotation is used to filter tests to be executed for a specific test plan with the given tag name. Its useful if you have multiple test plans that test different things so you can test specific parts of the program.
###@Disabled
* This tag is used to disable a test so it will not be executed. This is useful if you have disabled a part of your program and therefore the test is not needed.
###@RepeatedTest
* When this tag is used it will execute the number of times you have specified in the tag, and run if the test was written that many times. This is useful to make sure that the test does not fail due to  environmental issues.
###@BeforeEach, @AfterEach
* This tag is used to run a method before or after each test and is executed everytime a test is run. These annotations are useful to setup tests or assert tests,  so you dont have to write duplicate code. 
###@BeforeAll, @AfterAll
* This tag is used to run a specific method before or after the rest of you tests and is only executed once. This is useful if you have something you only want to be executed once and before all tests.
###@DisplayName
* this tag is used to give a test a custom name which is able to contain special characters, emojis and spaces . This is useful for test reporting in IDEs and build tools. 
###@Nested
* This is used to mark a nested class to be included in the test cases. This is useful to orgranize your tests.
###AsumeFalse, AssumeTrue
These are methods used to compare objects or values and if the condition is not met the rest of the test will not be run. This is usefull if you want to test if a specific object has the expeceted value and if the condition is not met it doesnt make sense to run the rest of the test because you know the test will fail.

##Mocking frameworks
Investigate mocking frameworks for your preferred language. Choose at leasttwo frameworks, and answer the questions. (One could be Mockito, which we saw in class.)
Mockito vs EasyMock
* What are their similarities?
    * Both of them uses annotations, 
* What are their differences?
    * In EasyMock you have to call EasyMock.replay on a test method or you will recieve an exception
* Which one would you prefer, if any, and why?
    * I would prefer to use Mockito because it is easier to use and requires less setup to work. 



