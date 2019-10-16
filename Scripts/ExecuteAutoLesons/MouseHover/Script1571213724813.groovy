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

WebUI.openBrowser('http://www.executeautomation.com/demosite/Login.html')

WebUI.setText(findTestObject('Mouse/Page_Execute Automation/input_Login_UserName'), 'admin')

WebUI.setText(findTestObject('Mouse/Page_Execute Automation/input_Login_Password'), 'admin')

WebUI.click(findTestObject('Mouse/Page_Execute Automation/input_Login_Login'))

WebUI.mouseOver(findTestObject('Mouse/Page_Execute Automation/a_Automation Tools'))

WebUI.mouseOver(findTestObject('Mouse/Page_Execute Automation/a_Selenium'))

WebUI.click(findTestObject('Mouse/Page_Execute Automation/a_Selenium IDE'))

WebUI.verifyElementPresent(findTestObject('Mouse/Page_Execute Automation/h1_Execute Automation Selenium Test Site'), 2)

WebUI.click(findTestObject('Mouse/Page_Execute Automation/Page_Execute Automation/input_Selenium IDE_Accept'))

