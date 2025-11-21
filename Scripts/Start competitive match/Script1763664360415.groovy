import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:5173/')

WebUI.mouseOver(findTestObject('Object Repository/Page_Vite App/button_PlayBisca_reka-navigation-menu-v-0-t_2c65dd'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/a_Login_data-activetruefocusbg-accent data-_cc2a33'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Jogo casual, sem ranking_option-tile'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Um nico jogo_option-tile'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Variant_option-tile'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Mo inicial de 9 cartas_primary-btn'))

WebUI.navigateToUrl('http://localhost:5173/singleplayer/competitive/match/3')

WebUI.delay(5)

WebUI.closeBrowser()

