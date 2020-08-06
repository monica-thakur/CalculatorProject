This is online calculator application. The framework is built using Selenium WebDriver using testNG design pattern.

Framework structure,
1. Base Page Layer- This contains basePage class which has init_driver method that is used to initialise Selenium Web-driver on the basis of given browserName.
2. Page Layer- This contains calculatorPage class which contains all the page actions.
3. Test Layer- This layer contains calculatorTest class which is verifying all the test scenarios mentioned below. calculatorTest class is using testNG framework and annotations.
4. Test Runner Layer- This layer contains testNG_functionalityTest.xml file which executes test cases from xml file.
5. Extent Report is generated in build folder.
6. Screenshots are generated under screenshots folder.

Below are the test case scenarios covered:
1. Verify addition of two integer numbers.
2. Verify addition of two negative numbers.
3. Verify addition of one positive and one negative number.
4. Verify subtraction of two integer numbers.
5. Verify subtraction of two negative numbers.
6. Verify subtraction of one negative and one positive number
7. Verify multiplication of two integer numbers.
8. Verify multiplication of two negative numbers.
9. Verify multiplication of one negative and one positive number.
8. Verify division of two integer numbers.
9. Verify division of two negative numbers.
10. Verify division of one positive number and one integer number.
11. Verify division of a number by zero.
12. Verify division of a number by negative number.
13. Verify if all the numbers are working ( 0 to 9)
14. Verify clicking on CE resets the value to 0
15. Verify at least 9 digits can be entered 
16. Verify no more than 9 digits can be entered

Notes:
1. Test report is in build/TestExecutionReport.html
2. Screenshots are in screenshots/ folder
3. [Enhancement] I have used hard-coded values for calculator button offsets - this works on my machine on chrome - however to make it more generic, the hard-coded values could be converted to ratios.
4. [Limitation] Due to limited support around HTML5 canvas - this suite covers only the execution of test cases. The validation however will need to be done manually from the captured screenshots.
5. [Enhancement] Due to a lot of trial-and-error - I have missed setting up proper GIT commit history for the project and it doesn't feel right to manually add code step by step to artificially generate the commit history now. I am aware of the fact and if its mandatory - would request more time to submit it.
6. [Enhancement] CalculatorTest.java can be further split into multiple classes taking care of - arithmetic, general button clicks and advanced test cases.
7. [Enhancement] Config.properties file can also be created to store values in key value pair format where keys like- url, login, password, browser, headless, incognito etc can be stored. These value can be accessed by creating a properties class object in basePage Class.
7. [Enhancement] After point 4, the test data could be moved to a separate XLS so that minimum code changes will be required if we wish to alter the test data at any point. 


