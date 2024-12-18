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

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_English_flex items-center gap-2 bg-r_f73801'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/input_Email_email'), 'kirraa699@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/input_Password_password'), 
    'e/mq8m8OzwHkvDQpQXlZFA==')

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_Password_absolute inset-y-0 right-0 _8f750d'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/input_Password_rememberMe'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_Sign in (1)'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_English_flex items-center gap-2 bg-r_f73801'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/div_Categories'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_Doors'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_Close'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_English_flex items-center gap-2 bg-r_f73801'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_Cart'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/input_Building_building'), '9018')

WebUI.setText(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/input_Floor_floor'), '3')

WebUI.setText(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/input_Apartment_apartment'), '6')

WebUI.setText(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/input_State_state'), 'cairo')

WebUI.setText(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/input_Street_street'), '72')

WebUI.setText(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/input_City_city'), 'elmokkatam')

WebUI.setText(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/input_Postal Code_postalCode'), 
    '11571')

WebUI.setText(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/textarea_n'), 'n')

WebUI.setText(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/textarea_no'), 'no')

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_Next Step'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/label_Cash on Delivery'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_Place Order'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_Close'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_English_flex items-center gap-2 bg-r_f73801'))

WebUI.click(findTestObject('Object Repository/AddToCart_Checkout_Cash/Page_Aidd-Tools/button_Orders'))

WebUI.closeBrowser()

