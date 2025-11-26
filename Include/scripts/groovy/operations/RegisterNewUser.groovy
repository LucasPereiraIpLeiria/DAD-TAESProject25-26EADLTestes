package operations
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RegisterNewUser {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("I open the browser")
	def openBrowser() {
		WebUI.openBrowser('')
	}

	@When('I navigate to "(.*)"')
	def navigateToUrl(String url) {
		WebUI.navigateToUrl(url)
	}

	@When('I enter "(.*)" into the email field')
	def enterEmail(String email) {
		WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_Email address_email'), email)
	}

	@When('I enter "(.*)" into the name field')
	def enterName(String name) {
		WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_Name_name'), name)
	}

	@When('I enter "(.*)" into the password field')
	def enterPassword(String encryptedPassword) {
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite App/input_Password_password'), encryptedPassword)
	}

	@When('I enter "(.*)" into the nickname field')
	def enterNickname(String nickname) {
		WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_Nickname_nickname'), nickname)
	}

	@Then("I close the browser")
	def closeBrowser() {
		WebUI.closeBrowser()
	}
}