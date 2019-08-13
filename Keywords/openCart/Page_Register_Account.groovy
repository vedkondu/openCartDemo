package openCart

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.utils.helperFunctions.actionClassFunctions
import com.utils.helperFunctions.waitStatements
import internal.GlobalVariable

public class Page_Register_Account {


	@Keyword
	public void setfirstName(String firstName) {

		WebUI.setText(findTestObject('Object Repository/Page_Register Account/input_First Name_firstname'), firstName)
	}

	@Keyword
	public void setLastName(String lastName) {

		WebUI.setText(findTestObject('Object Repository/Page_Register Account/input_Last Name_lastname'), lastName)
	}

	@Keyword
	public void setEmail(String email) {

		WebUI.setText(findTestObject('Object Repository/Page_Register Account/input_E-Mail_email'), email)
	}

	@Keyword
	public void setPhoneNumber(String phoneNumber) {

		WebUI.setText(findTestObject('Object Repository/Page_Register Account/input_Telephone_telephone'), phoneNumber)
	}

	@Keyword
	public void setPassword(String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Register Account/input_Password_password'), password)

		WebUI.setText(findTestObject('Object Repository/Page_Register Account/input_Password Confirm_confirm'), password)
	}

	@Keyword
	public void clickOnCheckBoxPrivacypolicy() {

		WebElement checkBoxPrivacyPolicy =  WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Page_Register Account/input_Privacy Policy_agree'), 60)
		actionClassFunctions.click(checkBoxPrivacyPolicy)
	}

	@Keyword
	public void clickOnPrivacyPolicyAggreeButton() {

		waitStatements.waitForElementTobeClickable(findTestObject('Object Repository/Page_Register Account/input_Privacy Policy_btn btn-primary'), 60)
		WebUI.click(findTestObject('Object Repository/Page_Register Account/input_Privacy Policy_btn btn-primary'))
	}
}
