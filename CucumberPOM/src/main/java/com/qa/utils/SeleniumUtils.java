package com.qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.factory.DriverFactory;

public abstract class SeleniumUtils {

	private WebDriver driver;

	public SeleniumUtils() {
		this.driver = DriverFactory.getDriver();
	}

	public WebElement findElementByID(String inputId) {
		WebElement idElement = driver.findElement(By.id(inputId));
		return idElement;
	}

	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

}
