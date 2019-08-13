import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'openCart.Page_Login.loginToThePage'(AppURL)

CustomKeywords.'openCart.Page_Your_Store.clickOnRegisterButton'()

CustomKeywords.'openCart.Page_Register_Account.setfirstName'(firstName)

CustomKeywords.'openCart.Page_Register_Account.setLastName'(lastName)

CustomKeywords.'openCart.Page_Register_Account.setEmail'(email)

CustomKeywords.'openCart.Page_Register_Account.setPhoneNumber'(phoneNumber)

CustomKeywords.'openCart.Page_Register_Account.setPassword'(password)

CustomKeywords.'openCart.Page_Register_Account.clickOnCheckBoxPrivacypolicy'()

CustomKeywords.'openCart.Page_Register_Account.clickOnPrivacyPolicyAggreeButton'()

CustomKeywords.'openCart.Page_Your_Account_Has_Been_Created.clickOnContinueButton'()


















