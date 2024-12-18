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

WebUI.click(findTestObject('Object Repository/add_product/Page_Aidd-Tools/button_English_flex items-center gap-2 bg-r_f73801'))

WebUI.click(findTestObject('Object Repository/logout/Page_Aidd-Tools/span_Sign In'))

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/input_Email_email'), 'secretary@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/input_Password_password'), 'gANkKSf2PC08HcJJJKQDDw==')

WebUI.click(findTestObject('Object Repository/add_product/Page_Aidd-Tools/label_Remember me'))

WebUI.click(findTestObject('Object Repository/add_product/Page_Aidd-Tools/button_Sign in'))

WebUI.click(findTestObject('Object Repository/add_product/Page_Aidd-Tools/button_English_flex items-center gap-2 bg-r_f73801'))

WebUI.click(findTestObject('Object Repository/add_product/Page_Aidd-Tools/div_Secretary Dashboard'))

WebUI.click(findTestObject('Object Repository/add_product/Page_Aidd-Tools/button_Add Product'))

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/input_Name_name'), 'mouse')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/input_Code_code'), '514514')

WebUI.click(findTestObject('Object Repository/add_product/Page_Aidd-Tools/html_Aidd-Tools                  where(html_62d065'))

WebUI.selectOptionByValue(findTestObject('Object Repository/add_product/Page_Aidd-Tools/select_DoorsStrawsWater MotorsLightsMixersB_84a703'), 
    'lights', true)

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/input_Brand_brand'), 'shark')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/input_Price_price'), '20')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/input_Stock_stock'), '50')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_n'), 'n')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_no'), 'no')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_not'), 'not')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_noth'), 'noth')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_nothi'), 'nothi')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_nothin'), 'nothin')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_nothing'), 'nothing')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_nothing_1'), 'nothing ')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_nothing h'), 'nothing h')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_nothing he'), 'nothing he')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_nothing her'), 'nothing her')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_nothing here'), 'nothing here')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_nothing here_1'), 'nothing here ')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_nothing here y'), 'nothing here y')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_nothing here ye'), 'nothing here ye')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/textarea_nothing here yet'), 'nothing here yet')

WebUI.setText(findTestObject('Object Repository/add_product/Page_Aidd-Tools/input_Specifications_requirement-0'), 'no')

WebUI.click(findTestObject('productPhotoUpload/Page_Aidd-Tools/button_Add Product'))

