import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.SetupTestCase
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownTestCase

/**
 * Some methods below are samples for using SetUp/TearDown in a test suite.
 */

/**
 * Setup test suite environment.
 */

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://demoaut.katalon.com/')

WebUI.click(findTestObject('Object Repository/Home_Page/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Home_Page/Page_CURA Healthcare Service/input_Username_username'), Username)

//WebUI.click(findTestObject('Object Repository/Home_Page/Page_CURA Healthcare Service/input_Username_username'))
WebUI.sendKeys(findTestObject('Object Repository/Home_Page/Page_CURA Healthcare Service/input_Password_password'), password)

WebUI.click(findTestObject('Object Repository/Home_Page/Page_CURA Healthcare Service/button_Login'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), '2', false)
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'))

WebUI.sendKeys(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), StrText)

WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'),
	variable)
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), '22/03/2019')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Page_CURA Healthcare Service/button_Book Appointment'))