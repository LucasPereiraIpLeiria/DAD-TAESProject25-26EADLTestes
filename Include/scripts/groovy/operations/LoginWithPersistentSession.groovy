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



class LoginWithPersistentSession {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@And('I enter email "(.*)"')
	def enterEmail(String email) {
		WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_Email address_email'), email)
	}

	@And('I enter password "(.*)"')
	def enterPassword(String password) {
		// If you want encrypted input swap to setEncryptedText()
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite App/input_Password_password'), password)
	}

	@And("I click on login button")
	def clickLoginButton() {
		WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Password_inline-flex items-center ju_559f66'))
	}

	@Then("I should see the user profile panel")
	def verifyProfileVisible() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/div_(teste)_flex items-center text-xl space-x-1'), 0)
	}

	@Then("I should see the PlayBisca element")
	def verifyGameVisible() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/span_PlayBisca_text-xs'), 0)
	}

	@When("I wait for {int} seconds")
	def waitForSeconds(int seconds) {
		WebUI.delay(seconds)
	}

	@And("I refresh the page")
	def refreshPage() {
		WebUI.refresh()
	}

	@Then("I should still see the PlayBisca element")
	def verifyGameStillVisible() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/span_PlayBisca_text-xs'), 0)
	}

	@Then("I should still see the user profile panel")
	def verifyProfileStillVisible() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Vite App/div_(teste)_flex items-center text-xl space-x-1'), 0)
	}
}