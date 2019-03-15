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
import java.io.IOException as IOException
import java.util.concurrent.TimeUnit as TimeUnit
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.By as By

IOException ioe = new IOException()

//Initializing server
System.setProperty('webdriver.chrome.driver', '/home/ttuser3/Desktop/chromedriver')

ChromeDriver driver = new ChromeDriver()

driver.manage().window().maximize()

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)

driver.get('https://www.google.com/')

driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("sele")

 driver.findElement(By.xpath("//b[text()='nium tutorial']/..")).click()
 

CustomKeywords.'newPackage.Autosuggession.AutoSugg'()
 
 
 
 
 
 