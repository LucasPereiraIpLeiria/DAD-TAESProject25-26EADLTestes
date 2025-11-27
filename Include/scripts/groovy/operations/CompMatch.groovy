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



class CompMatch {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@And("I open the main menu dropdown from the top right")
	def I_open_the_main_menu_dropdown_from_the_top_right() {
		WebUI.mouseOver(findTestObject('Object Repository/Page_Vite App/button_PlayBisca_reka-navigation-menu-v-0-t_2c65dd'))
	}

	@When("I select (.*)")
	def I_select_item(String item) {
		WebUI.click(findTestObject('Object Repository/Page_Vite App/a_Login_data-activetruefocusbg-accent data-_cc2a33'))
	}

	@And("I choose game mode (.*)")
	def I_choose_game_mode(String gameMode) {
		WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Jogo casual, sem ranking_option-tile'))
	}

	@And("I choose game type (.*)")
	def I_choose_game_type(String gameType) {
		WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Um nico jogo_option-tile'))
	}

	@And("I choose variant (.*)")
	def I_choose_game_variant(String gameVariant) {
		WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Variant_option-tile'))
	}

	@Then("the game should start successfully")
	def the_game_should_start_successfully() {
		WebUI.navigateToUrl('http://localhost:5173/singleplayer/competitive/match/3')
		WebUI.delay(5)
		WebUI.closeBrowser()
	}
}