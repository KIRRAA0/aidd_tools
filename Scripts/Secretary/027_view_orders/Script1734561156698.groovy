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

WebUI.click(findTestObject('Object Repository/sec_view_orders/Page_Aidd-Tools/button_English_flex items-center gap-2 bg-r_f73801'))

WebUI.click(findTestObject('Object Repository/sec_view_orders/Page_Aidd-Tools/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/sec_view_orders/Page_Aidd-Tools/input_Email_email'), 'secretary@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/sec_view_orders/Page_Aidd-Tools/input_Password_password'), 'gANkKSf2PC08HcJJJKQDDw==')

WebUI.click(findTestObject('Object Repository/sec_view_orders/Page_Aidd-Tools/button_Sign in (1)'))

WebUI.click(findTestObject('Object Repository/sec_view_orders/Page_Aidd-Tools/button_English_flex items-center gap-2 bg-r_f73801'))

WebUI.click(findTestObject('Object Repository/sec_view_orders/Page_Aidd-Tools/div_Secretary Dashboard'))

WebUI.click(findTestObject('Object Repository/sec_view_orders/Page_Aidd-Tools/button_All Orders'))

WebUI.doubleClick(findTestObject('Object Repository/sec_view_orders/Page_Aidd-Tools/p_Order Number ORD-1734533476015'))

WebUI.click(findTestObject('Object Repository/sec_view_orders/Page_Aidd-Tools/p_Order Number ORD-1734533476015'))

WebUI.click(findTestObject('Object Repository/sec_view_orders/Page_Aidd-Tools/p_Order Number ORD-1734533476015'))

WebUI.closeBrowser()

