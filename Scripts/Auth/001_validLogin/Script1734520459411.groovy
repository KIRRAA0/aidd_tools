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

WebUI.click(findTestObject('Object Repository/validLogin/Page_Aidd-Tools/svg_Select language_lucide lucide-x h-4 w-4'))

WebUI.click(findTestObject('Object Repository/validLogin/Page_Aidd-Tools/svg_English_lucide lucide-menu w-5 h-5 mdw-6 mdh-6'))

WebUI.click(findTestObject('Object Repository/validLogin/Page_Aidd-Tools/span_Sign In'))

WebUI.setText(findTestObject('Object Repository/validLogin/Page_Aidd-Tools/input_Email_email'), 'kirraa699@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/validLogin/Page_Aidd-Tools/input_Password_password'), 'e/mq8m8OzwHkvDQpQXlZFA==')

WebUI.click(findTestObject('Object Repository/validLogin/Page_Aidd-Tools/svg'))

WebUI.click(findTestObject('Object Repository/validLogin/Page_Aidd-Tools/button_Sign in'))

WebUI.click(findTestObject('Object Repository/validLogin/Page_Aidd-Tools/svg_Select language_lucide lucide-x h-4 w-4'))

WebUI.click(findTestObject('Object Repository/validLogin/Page_Aidd-Tools/svg_English_lucide lucide-menu w-5 h-5 mdw-6 mdh-6'))

WebUI.click(findTestObject('Object Repository/validLogin/Page_Aidd-Tools/a_Ali Ahmed'))

WebUI.closeBrowser()

