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

WebUI.openBrowser('http://hcc-asset-server.program-ace.net/login')

WebUI.setViewPortSize(1920, 1080)

WebUI.verifyElementPresent(findTestObject('LoginPage/Page_Laravel/div_Welcome Back_col-lg-6 d-none d-lg-block bg-login-image'), 
    0)

WebUI.verifyElementPresent(findTestObject('LoginPage/Page_Laravel/h1_Welcome Back'), 0)

WebUI.verifyElementPresent(findTestObject('LoginPage/Page_Laravel/input_Welcome Back_login'), 0)

WebUI.verifyElementPresent(findTestObject('LoginPage/Page_Laravel/input_Welcome Back_password'), 0)

WebUI.verifyElementPresent(findTestObject('LoginPage/Page_Laravel/label_Remember Me'), 0)

WebUI.verifyElementClickable(findTestObject('LoginPage/Page_Laravel/label_Remember Me'), FailureHandling.STOP_ON_FAILURE)

WebUI.setViewPortSize(1024, 750)

WebUI.verifyElementPresent(findTestObject('LoginPage/Page_Laravel/div_Welcome Back_col-lg-6 d-none d-lg-block bg-login-image'), 
    0)

WebUI.verifyElementPresent(findTestObject('LoginPage/Page_Laravel/h1_Welcome Back'), 0)

WebUI.verifyElementPresent(findTestObject('LoginPage/Page_Laravel/input_Welcome Back_login'), 0)

WebUI.verifyElementPresent(findTestObject('LoginPage/Page_Laravel/input_Welcome Back_password'), 0)

WebUI.verifyElementPresent(findTestObject('LoginPage/Page_Laravel/label_Remember Me'), 0)

WebUI.verifyElementChecked(findTestObject('Object Repository/LoginPage/Page_Laravel/label_Remember Me'), 1, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/LoginPage/Page_Laravel/input_Welcome Back_login'), 'admin')

WebUI.setText(findTestObject('Object Repository/LoginPage/Page_Laravel/input_Welcome Back_password'), 'admin')

WebUI.click(findTestObject('Object Repository/LoginPage/Page_Laravel/label_Remember Me'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/LoginPage/Page_Laravel/button_Login'))
WebUI.verifyElementPresent(findTestObject('Object Repository/DashboardPage/Page_Laravel/button_Banned IPs_sidebarToggle'), 0)

