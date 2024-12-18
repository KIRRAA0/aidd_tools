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

WebUI.click(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/button_English_flex items-center gap-2 bg-r_f73801'))

WebUI.click(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/button_Sign In'))

WebUI.click(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/button_Sign up'))

WebUI.setText(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/input_First Name_firstname'), 'Ali')

WebUI.setText(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/input_Last Name_lastname'), 'Ahmed')

WebUI.setText(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/input_Email address_email'), 'kira2172003@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/input_Password_password'), '/5S6MFFLcE5ZzW6QKlDupg==')

WebUI.setEncryptedText(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/input_Confirm Password_confirm-password'), 
    '/5S6MFFLcE5ZzW6QKlDupg==')

WebUI.click(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/input_Confirm Password_agree'))

WebUI.click(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/button_Sign up_1'))

WebUI.click(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/input_Activate Your Account_w-full px-4 py-_d325c2'))

WebUI.setText(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/input_Activate Your Account_w-full px-4 py-_d325c2_1'), 
    '6')

WebUI.setText(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/input_Activate Your Account_w-full px-4 py-_d325c2_1_2'), 
    '67')

WebUI.setText(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/input_Activate Your Account_w-full px-4 py-_d325c2_1_2_3'), 
    '676')

WebUI.setText(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/input_Activate Your Account_w-full px-4 py-_d325c2_1_2_3_4'), 
    '6760')

WebUI.setText(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/input_Activate Your Account_w-full px-4 py-_d325c2_1_2_3_4_5'), 
    '67607')

WebUI.setText(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/input_Activate Your Account_w-full px-4 py-_d325c2_1_2_3_4_5_6'), 
    '676076')

WebUI.click(findTestObject('Object Repository/InValidSignUp_empty_field/Page_Aidd-Tools/button_Activate'))

WebUI.closeBrowser()

