import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://hcc-asset-server.program-ace.net/')

WebUI.setViewPortSize(1920, 1080)

WebUI.verifyElementPresent(findTestObject('StartPage/Page_Laravel/h1_RealDigitalSolutions'), 0)

WebUI.verifyElementPresent(findTestObject('StartPage/Page_Laravel/img'), 0)

WebUI.verifyElementPresent(findTestObject('StartPage/Page_Laravel/svg_Login_logo-word'), 0)

WebUI.verifyElementPresent(findTestObject('StartPage/Page_Laravel/ul_Auszeichnung Landespreis'), 0)

WebUI.verifyElementPresent(findTestObject('StartPage/Page_Laravel/a_Login'), 0)

WebUI.setViewPortSize(1024, 750)

WebUI.verifyElementPresent(findTestObject('StartPage/Page_Laravel/h1_RealDigitalSolutions'), 0)

WebUI.verifyElementPresent(findTestObject('StartPage/Page_Laravel/img'), 0)

WebUI.verifyElementPresent(findTestObject('StartPage/Page_Laravel/svg_Login_logo-word'), 0)

WebUI.verifyElementPresent(findTestObject('StartPage/Page_Laravel/ul_Auszeichnung Landespreis'), 0)

WebUI.verifyElementPresent(findTestObject('StartPage/Page_Laravel/a_Login'), 0)

WebUI.setViewPortSize(1920, 1080)

WebUI.click(findTestObject('StartPage/Page_Laravel/a_Login'), FailureHandling.STOP_ON_FAILURE)

