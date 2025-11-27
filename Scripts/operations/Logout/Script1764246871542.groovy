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

// Open browser and navigate
WebUI.openBrowser('')
WebUI.navigateToUrl('http://localhost:5173/')

// Login
WebUI.click(findTestObject('Object Repository/Page_Vite App/a'))
WebUI.setText(findTestObject('Object Repository/Page_Vite App/input_Email address_email'), 'test@example.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Vite App/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')
WebUI.click(findTestObject('Object Repository/Page_Vite App/button_Password_inline-flex items-center ju_559f66'))

// Wait for dashboard element
WebUI.waitForElementVisible(
    findTestObject('Object Repository/Page_Vite App/div_(teste)_flex items-center text-xl space-x-1'), 
    10
)
WebUI.verifyElementPresent(
    findTestObject('Object Repository/Page_Vite App/div_(teste)_flex items-center text-xl space-x-1'), 
    0
)

// Click Logout reliably (Vue @click.prevent)
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Vite App/a_Logout'), 10)
// Use JS click to trigger Vue handler
WebUI.executeJavaScript("document.evaluate(\"//nav//a[text()='Logout']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click()", null)


// Close browser
WebUI.closeBrowser()
