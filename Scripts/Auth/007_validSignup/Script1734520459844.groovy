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

WebUI.click(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/button_English_flex items-center gap-2 bg-r_f73801'))

WebUI.click(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/button_Sign up'))

WebUI.click(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_First Name_firstname'))

WebUI.doubleClick(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_First Name_firstname'))

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_First Name_firstname'), 'John')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Last Name_lastname'), 'Doe')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Email address_email'), 'name@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Password_password'), '/5S6MFFLcE5ZzW6QKlDupg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Confirm Password_confirm-password'), 
    '/5S6MFFLcE5ZzW6QKlDupg==')

WebUI.click(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Confirm Password_agree'))

WebUI.click(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/button_Sign up_1'))

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Phone_form-control'), '+20 1')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Phone_form-control_1'), '+20 11')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Phone_form-control_1_2'), '+20 111')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Phone_form-control_1_2_3'), '+20 111 1')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Phone_form-control_1_2_3_4'), '+20 111 11')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Phone_form-control_1_2_3_4_5'), '+20 111 111')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Phone_form-control_1_2_3_4_5_6'), '+20 111 111 1')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Phone_form-control_1_2_3_4_5_6_7'), '+20 111 111 11')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Phone_form-control_1_2_3_4_5_6_7_8'), 
    '+20 111 111 111')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Phone_form-control_1_2_3_4_5_6_7_8_9'), 
    '+20 111 111 111 1')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Phone_form-control_1_2_3_4_5_6_7_8_9_10'), 
    '+20 111 111 111 11')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Phone_form-control_1_2_3_4_5_6_7_8_9_10_11'), 
    '+20 111 111 111 111')

WebUI.setText(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/input_Phone_form-control_1_2_3_4_5_6_7_8_9_10_11_12'), 
    '+20 111 111 111 111 1')

WebUI.click(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/button_Sign up_1'))

WebUI.click(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/button_Close'))

WebUI.click(findTestObject('Object Repository/Valid_signUp/Page_Aidd-Tools/button_'))

WebUI.closeBrowser()

