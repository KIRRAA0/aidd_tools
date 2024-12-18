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

WebUI.click(findTestObject('Object Repository/product_search/Page_Aidd-Tools/input_Aidd Tools_flex h-10 border-slate-200_769d14'))

WebUI.setMaskedText(findTestObject('Object Repository/product_search/Page_Aidd-Tools/input_Aidd Tools_flex h-10 border-slate-200_769d14_1_2_3_4'), 
    'test')

WebUI.click(findTestObject('Object Repository/product_search/Page_Aidd-Tools/div_Test'))

WebUI.doubleClick(findTestObject('Object Repository/product_search/Page_Aidd-Tools/h2_Test'))

WebUI.click(findTestObject('Object Repository/product_search/Page_Aidd-Tools/div_TestdasadsadsadCode sadasdas4324234dsfs_fc15aa'))

WebUI.doubleClick(findTestObject('Object Repository/product_search/Page_Aidd-Tools/button_EGP94.00_inline-flex items-center ju_b34d7d'))

WebUI.click(findTestObject('Object Repository/product_search/Page_Aidd-Tools/button_EGP94.00_inline-flex items-center ju_b34d7d'))

WebUI.click(findTestObject('Object Repository/product_search/Page_Aidd-Tools/button_EGP94.00_inline-flex items-center ju_b34d7d'))

WebUI.doubleClick(findTestObject('Object Repository/product_search/Page_Aidd-Tools/span_EGP 470.00'))

WebUI.click(findTestObject('Object Repository/product_search/Page_Aidd-Tools/div_Grand Total EGP 470.005Add to cart'))

WebUI.closeBrowser()

