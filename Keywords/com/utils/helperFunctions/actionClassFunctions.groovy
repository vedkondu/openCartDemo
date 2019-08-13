package com.utils.helperFunctions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class actionClassFunctions {

	public static WebDriver driver = DriverFactory.getWebDriver()
	public static Actions action = new Actions(driver)


	public static void click(WebElement element) {

		action.moveToElement(element)
		action.click().build().perform()
	}

	public static void moveToElement(WebElement element) {

		action.moveToElement(element).build().perform()
	}

	public static void sendKeys(WebElement element, String text) {

		action.sendKeys(element, text).build().perform()
	}

	public static void dragAndDrop(WebElement source, WebElement destination) {

		action.dragAndDrop(source, destination).build().perform()
	}

	public static void doubleClick(WebElement element) {

		action.doubleClick(element).build().perform()
	}
}
