package com.qa.calculator.page;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.calculator.base.BasePage;

public class CalculatorPage extends BasePage {
	WebElement canvas = null;
	Map<Integer, Integer[]> mp;

	int[] xButtonsOffset = { -162, -76, 0, 76, 162,180 };
	int[] yButtonsOffset = { 206, 126, 40, -40, -126, -206, -234 };

	public CalculatorPage() {
		init_driver("chrome");

	}

	public WebElement getCanvasElement() {
		if (canvas == null) {
			new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
			canvas = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
		}
		return canvas;

	}

	public void enterNumber(int num) {
		System.out.println("entering number: " + num);

		if (num >= 10) {
			String number = String.valueOf(num);
			String[] digits2 = number.split("(?<=.)");
			for (int i = 0; i < digits2.length; i++) {
				clickOnNumber(Integer.valueOf(digits2[i]));
			}
		} else {
			clickOnNumber(num);
		}
	}

	private void clickOnNumber(int num) {
		WebElement canvas = getCanvasElement();
		int xButtonOff = 0;
		int yButtonOff = 0;

		switch (num) {
		case 0:
			xButtonOff = 0;
			yButtonOff = 0;
			break;
		case 1:
			xButtonOff = 0;
			yButtonOff = 1;
			break;
		case 2:
			xButtonOff = 1;
			yButtonOff = 1;
			break;
		case 3:
			xButtonOff = 2;
			yButtonOff = 1;
			break;
		case 4:
			xButtonOff = 0;
			yButtonOff = 2;
			break;
		case 5:
			xButtonOff = 1;
			yButtonOff = 2;
			break;
		case 6:
			xButtonOff = 2;
			yButtonOff = 2;
			break;
		case 7:
			xButtonOff = 0;
			yButtonOff = 3;
			break;
		case 8:
			xButtonOff = 1;
			yButtonOff = 3;
			break;
		case 9:
			xButtonOff = 2;
			yButtonOff = 3;
			break;
		default:
			throw new RuntimeException("Number not supported: " + num);
		}

		System.out.println("clicking offset x:" + xButtonOff + " y:" + yButtonOff);
		new Actions(driver).moveToElement(canvas, 0, 0)
				.moveByOffset(xButtonsOffset[xButtonOff], yButtonsOffset[yButtonOff]).click().build().perform();
		waitFor(100);
	}

	public void clickOnOperator(String op) {
		WebElement canvas = getCanvasElement();
		int xButtonOff = 0;
		int yButtonOff = 0;

		switch (op) {
		case "+":
			xButtonOff = 3;
			yButtonOff = 0;
			break;
		case "-":
			xButtonOff = 3;
			yButtonOff = 1;
			break;
		case "/":
			xButtonOff = 3;
			yButtonOff = 3;
			break;
		case "x":
			xButtonOff = 3;
			yButtonOff = 2;
			break;
		case "=":
			xButtonOff = 4;
			yButtonOff = 0;
			break;
		case "+/-":
			xButtonOff = 2;
			yButtonOff = 0;
			break;
		case "CE":
			xButtonOff = 4;
			yButtonOff = 4;
			break;
		default:
			throw new RuntimeException("Operation not supported: " + op);
		}

		System.out.println("clicking offset x:" + xButtonOff + " y:" + yButtonOff);
		new Actions(driver).moveToElement(canvas, 0, 0)
				.moveByOffset(xButtonsOffset[xButtonOff], yButtonsOffset[yButtonOff]).click().build().perform();
		waitFor(100);
	}

	public void waitFor(int x) {
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void quit() {
		driver.quit();

	}

	// take screenshot
	public String takeScreenshot(String fileName) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshots/" + fileName + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}

}
