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

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://demoaut.katalon.com/')

WebUI.click(findTestObject('Object Repository/Home_Page/Page_CURA Healthcare Service/a_Make Appointment'))
WebUI.sleep(3000)
WebUI.setText(findTestObject('Object Repository/Home_Page/Page_CURA Healthcare Service/input_Username_username'), Username)
WebUI.sleep(3000)
//WebUI.click(findTestObject('Object Repository/Home_Page/Page_CURA Healthcare Service/input_Username_username'))
WebUI.sendKeys(findTestObject('Object Repository/Home_Page/Page_CURA Healthcare Service/input_Password_password'), password)
WebUI.sleep(3000)
WebUI.click(findTestObject('Object Repository/Home_Page/Page_CURA Healthcare Service/button_Login'))
WebUI.sleep(3000)
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), '2', false)
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospital_readmission'))
WebUI.sleep(3000)
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'))
WebUI.sleep(3000)
WebUI.sendKeys(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), StrText)
WebUI.sleep(3000)
WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), 
    variable)
WebUI.sleep(3000)

//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))
//WebUI.sendKeys(findTestObject('Object Repository/Page_CURA Healthcare Service/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'),Date)
WebUI.sleep(3000)
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Page_CURA Healthcare Service/button_Book Appointment'))
WebUI.sleep(3000)
