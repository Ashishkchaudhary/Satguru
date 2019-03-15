import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('www.irctc.com')
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/Page_IRCTC Corporate Portal/div_TOURISM'))
WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Page_IRCTC Tourism Official Website  Incredible India Travel  Tour Package/div_International_Flights'))

WebUI.switchToWindowIndex(2)

WebUI.sendKeys(findTestObject('Object Repository/Page_Air Ticket Booking  Book Flight Tickets  Cheap Air Fare  LTC Fare IRCTC AIR/input_LTC_from'), "del")
WebUI.click(findTestObject('Object Repository/Page_Air Ticket Booking  Book Flight Tickets  Cheap Air Fare  LTC Fare IRCTC AIR/div_New Delhi (DEL)IN'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Air Ticket Booking  Book Flight Tickets  Cheap Air Fare  LTC Fare IRCTC AIR/input_LTC_to'), "Blr")
WebUI.click(findTestObject('Object Repository/Page_Air Ticket Booking  Book Flight Tickets  Cheap Air Fare  LTC Fare IRCTC AIR/div_Bengaluru (BLR)IN'))

String str = WebUI.getWindowTitle()
 print(str)