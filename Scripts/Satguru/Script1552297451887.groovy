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

WebUI.openBrowser('http://192.168.1.246/satguruportal/')
WebUI.maximizeWindow()
WebUI.sendKeys(findTestObject('Object Repository/Page_Satguru Agent Portal Login Page/input_Login_displayUserType'), UserName)
WebUI.sendKeys(findTestObject('Object Repository/Page_Satguru Agent Portal Login Page/input_Login_userAlias'), Email)
WebUI.sendKeys(findTestObject('Object Repository/Page_Satguru Agent Portal Login Page/input_Login_password_password'), Password)
WebUI.click(findTestObject('Object Repository/Page_Satguru Agent Portal Login Page/input_Remember Me_btn orange-btn'))

WebUI.sleep(5000)

WebUI.click(findTestObject('Object Repository/Page_satguruportal/a'))

WebUI.sendKeys(findTestObject('Object Repository/Example/Page_satguruportal/input_Multi City_startingFrom_1'), "del")
//WebUI.click(findTestObject('Object Repository/Example/Page_satguruportal/div_DEL - New Delhi - India - Indira Gandhi Internatio...'))
WebUI.click(findTestObject('Object Repository/Example/Page_1552381783678/div_DEL - New Delhi - India - Indira Gandhi Internatio...'))
WebUI.sendKeys(findTestObject('Object Repository/Example/Page_satguruportal/input_Multi City_goingTo_1'), "BLR")
//WebUI.click(findTestObject('Object Repository/Example/Page_satguruportal/div_BLR - Bangalore - India - Bangalore International ...'))
WebUI.click(findTestObject('Object Repository/Example/Page_1552382069744/div_BLR - Bangalore - India - Bangalore International ...'))

WebUI.click(findTestObject('Object Repository/Example/Page_satguruportal/input_Multi City_flightwidgetElement0.dateOfJourney'))
WebUI.click(findTestObject('Object Repository/Example/Page_satguruportal/a_20'))