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

WebUI.click(findTestObject('Object Repository/Page_Vite App/a'))

WebUI.click(findTestObject('Object Repository/Page_Vite App/a_1'))

WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_Email address_email'), 'test@testes.pt')

WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_Name_name'), 'teste')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite App/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_Nickname_nickname'), 'testeee')

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Nickname_inline-flex items-center ju_ee67eb'))

WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_Email address_email'), 'test@testes.pt')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite App/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Password_inline-flex items-center ju_559f66'))

WebUI.closeBrowser()

