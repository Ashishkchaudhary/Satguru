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
WebUI.sendKeys(findTestObject('Object Repository/Sample_satguru/Page_Satguru Agent Portal Login Page/input_Login_displayUserType'), "AGN231")
WebUI.sendKeys(findTestObject('Object Repository/Sample_satguru/Page_Satguru Agent Portal Login Page/input_Login_userAlias'), "xyza@yopmail.com")
WebUI.sendKeys(findTestObject('Object Repository/Sample_satguru/Page_Satguru Agent Portal Login Page/input_Login_password_password'), "Xyza@123")
WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_Satguru Agent Portal Login Page/input_Remember Me_btn orange-btn'))

WebUI.sleep(5000)
WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/a'))
WebUI.sendKeys(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/input_Multi City_startingFrom_1'), "del")
WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/div_DEL - New Delhi - India - Indira Gandhi Internatio...'))

WebUI.sendKeys(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/input_Multi City_goingTo_1'), "BLR")
WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/div_BLR - Bangalore - India - Bangalore International ...'))

WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/input_Airport is not available_flightwidgetElement0.dateOfJourney'))
WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/a_13'))
WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/input_Exclude LCC_searchFlights btn orange-btn'))

WebUI.sleep(5000)
WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/a_Book Now'))

WebUI.sleep(5000)
WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/a_NO THANKS'))

WebUI.sleep(5000)
WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/a_Continue'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/select_TitleMrMsMrs'), 1)

WebUI.sendKeys(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/input_Personal Details_passengerList0.firstName'), "Ashish")
WebUI.sendKeys(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/input_Personal Details_passengerList0.lastName'), "Kumar")
WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/div_Personal Details_fw date'))
WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/Date_a_13'))

WebUI.sendKeys(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/input_Personal Details_passengerList0.email'), "ascdef@gmail.com")
WebUI.sleep(3000)
WebUI.sendKeys(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/input_Personal Details_passengerList0.phoneCode'), "+91")
WebUI.sleep(3000)

WebUI.sendKeys(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/Page_1552389938154/div_Personal Details_phone_No'), "1234567890")

WebUI.selectOptionByIndex(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/select_GenderMaleFemale'), 1)

//WebUI.sendKeys(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/div_Personal Details_passport_No'), "1234567890")
WebUI.selectOptionByIndex(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/select_Select Frequent Flyer                       1dria AirwaysAegean AirlinesAereonautica militareAero 2000 SAAero ContractorsAer'), 3)
WebUI.sendKeys(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/Page_1552389938154/Page_satguruportal/input_Personal Details_passengerNationality_0'),"ind")
WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_1552394020384/div_India'))


WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/input_ Total Price in roundup value._bookButtonShowHide'))

WebUI.click(findTestObject('Object Repository/Sample_satguru/Page_satguruportal/input_AED_btn orange-btn'))














