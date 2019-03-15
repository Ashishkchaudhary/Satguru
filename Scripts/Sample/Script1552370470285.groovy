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

WebUI.openBrowser("https://www.goibibo.com/")

WebUI.sendKeys(findTestObject('Object Repository/Page_Online flight booking Hotels Bus amp Holiday Packages at Goibibo/input_Multicity_gosuggest_inputSrc'), "Delhi")
WebUI.click(findTestObject('Object Repository/Page_Online flight booking Hotels Bus amp Holiday Packages at Goibibo/li_Delhi(DEL)Delhi AirportIN'))


WebUI.sendKeys(findTestObject('Object Repository/Page_Online flight booking Hotels Bus amp Holiday Packages at Goibibo/input_Multicity_gosuggest_inputDest'), "Banglore")
WebUI.click(findTestObject('Object Repository/Page_Online flight booking Hotels Bus amp Holiday Packages at Goibibo/li_Bangalore(BLR)Kempegowda International AirportIN'))

WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Page_Online flight booking Hotels Bus amp Holiday Packages at Goibibo/span_1 Traveller'))
WebUI.click(findTestObject('Object Repository/Page_Online flight booking Hotels Bus amp Holiday Packages at Goibibo/button_1'))
WebUI.click(findTestObject('Object Repository/Page_Online flight booking Hotels Bus amp Holiday Packages at Goibibo/button_2'))

//WebUI.click(findTestObject('Object Repository/Page_Online flight booking Hotels Bus amp Holiday Packages at Goibibo/select_EconomyBusinessFirst classPremium Economy'))
WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Online flight booking Hotels Bus amp Holiday Packages at Goibibo/select_EconomyBusinessFirst classPremium Economy'), 3)

NoOfOPtion = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Page_Online flight booking Hotels Bus amp Holiday Packages at Goibibo/select_EconomyBusinessFirst classPremium Economy'))
print("Total No Of OPtion are "+ NoOfOPtion)

WebUI.verifyEqual(NoOfOPtion, 4)
//WebUI.click(findTestObject('Object Repository/Page_Online flight booking Hotels Bus amp Holiday Packages at Goibibo/button_SEARCH'))




