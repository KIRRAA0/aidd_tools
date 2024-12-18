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

WebUI.navigateToUrl('https://aiddtools.vercel.app/')

WebUI.click(findTestObject('Object Repository/forget_password/Page_Aidd-Tools/button_English_flex items-center gap-2 bg-r_f73801'))

WebUI.click(findTestObject('Object Repository/forget_password/Page_Aidd-Tools/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/forget_password/Page_Aidd-Tools/input_Email_email'), 'kirraa699@gmail.com')

WebUI.click(findTestObject('Object Repository/forget_password/Page_Aidd-Tools/a_Forgot password'))

WebUI.setText(findTestObject('Object Repository/forget_password/Page_Aidd-Tools/input_Email_email'), 'kirraa699@gmail.com')

WebUI.click(findTestObject('Object Repository/forget_password/Page_Aidd-Tools/button_Reset Password'))

WebUI.setText(findTestObject('Object Repository/forget_password/Page_Aidd-Tools/input_Code_code'), '123456')

WebUI.click(findTestObject('Object Repository/forget_password/Page_Aidd-Tools/button_Verify Code'))

WebUI.setEncryptedText(findTestObject('Object Repository/forget_password/Page_Aidd-Tools/input_New Password_password'), 
    '/5S6MFFLcE5ZzW6QKlDupg==')

WebUI.setEncryptedText(findTestObject('Object Repository/forget_password/Page_Aidd-Tools/input_Confirm New Password_confirmPassword'), 
    '/5S6MFFLcE5ZzW6QKlDupg==')

WebUI.click(findTestObject('Object Repository/forget_password/Page_Aidd-Tools/button_Change password'))

WebUI.click(findTestObject('Object Repository/forget_password/Page_Aidd-Tools/button_Close'))

WebUI.closeBrowser()

