package com.qa.calculator.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.calculator.page.CalculatorPage;

public class CalculatorTest {

	CalculatorPage calculatorPage = new CalculatorPage();;

	@BeforeTest
	public void beforeTest() {
//		calculatorPage.init_driver("chrome");
		calculatorPage.clickOnOperator("CE");
	}

	/**
	 * This test does addition of two positive numbers
	 * 
	 *
	 */
	@Test(priority = 1)
	public void verifyAdditionOfTwoPositiveNumbers() throws InterruptedException {
		calculatorPage.enterNumber(9);
		calculatorPage.clickOnOperator("+");
		calculatorPage.enterNumber(9);
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifyAdditionOfTwoPositiveNumbers");
		calculatorPage.clickOnOperator("CE");
	}

	/**
	 * This test does addition of two negative numbers
	 */
	@Test(priority = 2)
	public void verifyAdditionOfTwoNegativeNumbers() {
		calculatorPage.enterNumber(2);
		calculatorPage.clickOnOperator("+/-");
		calculatorPage.clickOnOperator("+");
		calculatorPage.enterNumber(6);
		calculatorPage.clickOnOperator("+/-");
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifyAdditionOfTwoNegativeNumbers");
	}

	/**
	 * This test does addition of one negative and one positive number
	 */
	@Test(priority = 3)
	public void verifyAdditionOfOnePositiveOneNegativeNumber() {
		calculatorPage.clickOnOperator("-");
		calculatorPage.enterNumber(7);
		calculatorPage.clickOnOperator("+");
		calculatorPage.enterNumber(4);
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifyAdditionOfOnePositiveOneNegativeNumber");
	}

	/**
	 * This test does subtraction of two integer numbers.
	 */
	@Test(priority = 4)
	public void verifySubtractionOfTwoIntegerNumbers() {
		calculatorPage.enterNumber(1);
		calculatorPage.clickOnOperator("-");
		calculatorPage.enterNumber(5);
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifySubtractionOfTwoIntegerNumbers");
	}

	/**
	 * This test does subtraction of two negative numbers
	 */
	@Test(priority = 5)
	public void verifySubtractionOfTwoNegativeNumbers() {
		calculatorPage.enterNumber(5);
		calculatorPage.clickOnOperator("+/-");
		calculatorPage.clickOnOperator("-");
		calculatorPage.enterNumber(3);
		calculatorPage.clickOnOperator("+/-");
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifySubtractionOfTwoNegativeNumbers");
	}

	/**
	 * This test does subtraction of one negative and one positive number
	 */
	@Test(priority = 6)
	public void verifySubtractionOfOnePositiveOneNegativeNumber() {
		calculatorPage.clickOnOperator("-");
		calculatorPage.enterNumber(9);
		calculatorPage.clickOnOperator("-");
		calculatorPage.enterNumber(3);
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifySubtractionOfOnePositiveOneNegativeNumber");
	}

	/**
	 * This test does multiplication of two integer numbers
	 */
	@Test(priority = 7)
	public void verifyMultiplicationOfTwoIntegerNumbers() {
		calculatorPage.enterNumber(7);
		calculatorPage.clickOnOperator("x");
		calculatorPage.enterNumber(2);
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifyMultiplicationOfTwoIntegerNumbers");
	}

	/**
	 * This test does multiplication of two negative numbers
	 */
	@Test(priority = 8)
	public void verifyMultiplicationOfTwoNegativeNumbers() {
		calculatorPage.clickOnOperator("-");
		calculatorPage.enterNumber(3);
		calculatorPage.clickOnOperator("x");
		calculatorPage.enterNumber(4);
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifyMultiplicationOfTwoNegativeNumbers");
	}

	/**
	 * This test does multiplication of two one negative and one positive number
	 */
	@Test(priority = 9)
	public void verifyMultiplicationOfOnePositiveOneNegativeNumber() {
		calculatorPage.enterNumber(7);
		calculatorPage.clickOnOperator("+/-");
		calculatorPage.clickOnOperator("x");
		calculatorPage.enterNumber(6);
		calculatorPage.clickOnOperator("+/-");
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifyMultiplicationOfOnePositiveOneNegativeNumber");
	}

	/**
	 * This test does division of two integer numbers
	 */
	@Test(priority = 10)
	public void verifyDivisionOfTwoIntegerNumbers() {
		calculatorPage.enterNumber(8);
		calculatorPage.clickOnOperator("/");
		calculatorPage.enterNumber(2);
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifyDivisionOfTwoIntegerNumbers");
	}

	/**
	 * This test does division of two negative numbers
	 */
	@Test(priority = 11)
	public void verifyDivisionOfTwoNegativeNumbers() {
		calculatorPage.enterNumber(10);
		calculatorPage.clickOnOperator("+/-");
		calculatorPage.clickOnOperator("/");
		calculatorPage.enterNumber(3);
		calculatorPage.clickOnOperator("+/-");
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifyDivisionOfTwoNegativeNumbers");
	}

	/**
	 * This test does division of one negative and one positive number
	 */
	@Test(priority = 12)
	public void verifyDivisionOfOnePositiveOneNegativeNumber() {
		calculatorPage.enterNumber(9);
		calculatorPage.clickOnOperator("+/-");
		calculatorPage.clickOnOperator("/");
		calculatorPage.enterNumber(3);
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifyDivisionOfOnePositiveOneNegativeNumber");
	}

	/**
	 * This test verifies division by zero
	 */
	@Test(priority = 13)
	public void verifyDivisionOfNumebrByZero() {
		calculatorPage.enterNumber(3);
		calculatorPage.clickOnOperator("/");
		calculatorPage.enterNumber(0);
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifyDivisionOfNumebrByZero");
	}

	/**
	 * This test verifies division by negative number
	 */
	@Test(priority = 14)
	public void verifyDivisionOfNumebrByNegativeNumber() {
		calculatorPage.enterNumber(9);
		calculatorPage.clickOnOperator("/");
		calculatorPage.enterNumber(3);
		calculatorPage.clickOnOperator("+/-");
		calculatorPage.clickOnOperator("=");
		calculatorPage.takeScreenshot("verifyDivisionOfNumebrByNegativeNumber");
	}

	/**
	 * This test clicks on number 1
	 */
	@Test(priority = 15)
	public void verifyClickon1() {
		calculatorPage.enterNumber(1);
		calculatorPage.takeScreenshot("verifyClickon1");
		calculatorPage.clickOnOperator("CE");
	}

	/**
	 * This test clicks on number 2
	 * 
	 * @throws InterruptedException
	 */
	@Test(priority = 16)
	public void verifyClickon2() throws InterruptedException {
		calculatorPage.enterNumber(2);
		calculatorPage.takeScreenshot("verifyClickon2");
		calculatorPage.clickOnOperator("CE");
	}

	/**
	 * This test clicks on number 3
	 */
	@Test(priority = 17)
	public void verifyClickon3() throws InterruptedException {
		calculatorPage.enterNumber(3);
		calculatorPage.takeScreenshot("verifyClickon3");
		calculatorPage.clickOnOperator("CE");
	}

	/**
	 * This test clicks on number 4
	 */
	@Test(priority = 18)
	public void verifyClickon4() {
		calculatorPage.enterNumber(4);
		calculatorPage.takeScreenshot("verifyClickon4");
		calculatorPage.clickOnOperator("CE");
	}

	/**
	 * This test clicks on number 5
	 */
	@Test(priority = 19)
	public void verifyClickon5() {
		calculatorPage.enterNumber(5);
		calculatorPage.takeScreenshot("verifyClickon5");
		calculatorPage.clickOnOperator("CE");
	}

	/**
	 * This test clicks on number 6
	 */
	@Test(priority = 20)
	public void verifyClickon6() {
		calculatorPage.enterNumber(6);
		calculatorPage.takeScreenshot("verifyClickon6");
		calculatorPage.clickOnOperator("CE");
	}

	/**
	 * This test clicks on number 7
	 */
	@Test(priority = 21)
	public void verifyClickon7() {
		calculatorPage.enterNumber(7);
		calculatorPage.takeScreenshot("verifyClickon7");
		calculatorPage.clickOnOperator("CE");
	}

	/**
	 * This test clicks on number 8
	 */
	@Test(priority = 22)
	public void verifyClickon8() {
		calculatorPage.enterNumber(8);
		calculatorPage.takeScreenshot("verifyClickon8");
		calculatorPage.clickOnOperator("CE");
	}

	/**
	 * This test clicks on number 9
	 */
	@Test(priority = 23)
	public void verifyClickon9() {
		calculatorPage.enterNumber(9);
		calculatorPage.takeScreenshot("verifyClickon9");
		calculatorPage.clickOnOperator("CE");
	}

	/**
	 * This test clicks on number 0
	 */
	@Test(priority = 24)
	public void verifyClickon0() {
		calculatorPage.enterNumber(0);
		calculatorPage.takeScreenshot("verifyClickon0");
		calculatorPage.clickOnOperator("CE");
	}

	/**
	 * This test clicks on CE button to reset value
	 */
	@Test(priority = 25)
	public void verifyCEButtonResetsValue() {
		calculatorPage.enterNumber(1);
		calculatorPage.clickOnOperator("CE");
	}

	/**
	 * This test verifies atleast 9 digits can be entered
	 */
	@Test(priority = 26)
	public void verifyAtleastNineDigitAdded() {
		calculatorPage.enterNumber(987654321);
	}

	/**
	 * This test verifies no more than 9 digits can be entered
	 */
	@Test(priority = 27)
	public void verifyNoMoreThanNineDigitsAdded() {
		calculatorPage.enterNumber(1876543212);

	}

	@AfterTest
	public void tearDown() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		calculatorPage.quit();
	}

}
