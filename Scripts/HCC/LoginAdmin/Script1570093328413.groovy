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

WebUI.openBrowser(URL)

WebUI.setViewPortSize(1920, 1080)

WebUI.click(findTestObject('StartPage/Page_Laravel/a_Login'))

WebUI.setText(findTestObject('Object Repository/LoginPage/Page_Laravel/input_Welcome Back_login'), Username)

WebUI.setText(findTestObject('Object Repository/LoginPage/Page_Laravel/input_Welcome Back_password'), Password)

WebUI.check(findTestObject('LoginPage/Page_Laravel/label_Remember Me'))

WebUI.uncheck(findTestObject('LoginPage/Page_Laravel/label_Remember Me'))

WebUI.verifyElementNotChecked(findTestObject('LoginPage/Page_Laravel/label_Remember Me'), 1)

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Laravel/button_Login'))

WebUI.switchToWindowIndex(1)

