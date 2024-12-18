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

WebUI.click(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/button_English_flex items-center gap-2 bg-r_f73801'))

WebUI.click(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/span_Sign In'))

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/input_Email_email'), 'kirraa699@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/input_Password_password'), 'e/mq8m8OzwHkvDQpQXlZFA==')

WebUI.click(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/button_Sign in'))

WebUI.click(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/button_English_flex items-center gap-2 bg-r_f73801'))

WebUI.click(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/button_About'))

WebUI.click(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/a_Contact Us'))

WebUI.selectOptionByValue(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/select_Select Type of MessageSupportFeedbac_c78995'), 
    'Support', true)

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i'), 'i')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i_1'), 'i ')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i w'), 'i w')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i wa'), 'i wa')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i wan'), 'i wan')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want'), 'i want')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want_1'), 'i want ')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want h'), 'i want h')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want he'), 'i want he')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want hel'), 'i want hel')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want help'), 'i want help')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want help_1'), 'i want help ')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want help t'), 'i want help t')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want help to'), 'i want help to')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want help to_1'), 'i want help to ')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want help to a'), 'i want help to a')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want help to at'), 'i want help to at')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want help to at5'), 'i want help to at5')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want help to at5a'), 'i want help to at5a')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want help to at5ar'), 'i want help to at5ar')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want help to at5ara'), 'i want help to at5ara')

WebUI.setText(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/textarea_i want help to at5arag'), 'i want help to at5arag')

WebUI.click(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/button_Send to Aidd Tools'))

WebUI.doubleClick(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/div_Message sent successfully. Our team wil_1dc0c6'))

WebUI.click(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/div_Message sent successfully. Our team wil_1dc0c6'))

WebUI.click(findTestObject('Object Repository/contact_us/Page_Aidd-Tools/button_Close'))

WebUI.closeBrowser()

