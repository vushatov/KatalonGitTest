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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://www.executeautomation.com/demosite/Login.html', FailureHandling.CONTINUE_ON_FAILURE)
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Execute Automation/input_Login_UserName'), 'admin', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Execute Automation/input_Login_Password'), 'admin', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Execute Automation/input_Login_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PopUpTest/Page_Execute Automation/input_Initial_Initial'), '1234', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PopUpTest/Page_Execute Automation/input__FirstName'), '1234', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PopUpTest/Page_Execute Automation/input_Middle Name_MiddleName'), '1234', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/PopUpTest/Page_Execute Automation/DropdownList'), '2', true, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Object Repository/PopUpTest/Page_Execute Automation/RadioButton'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Execute Automation/input_EnglishHindi_Hindi'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('PopUpTest/Page_Execute Automation/a_HtmlPopup'))

WebUI.switchToWindowIndex(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/PopUpTest/Page_Popup Window/select_SelectMrMs'), '1', true,FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PopUpTest/Page_Popup Window/input_Initial_Initial'), '1234', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PopUpTest/Page_Popup Window/input__FirstName'), '1234', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PopUpTest/Page_Popup Window/input__LastName'), '1234',FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PopUpTest/Page_Popup Window/input_Middle Name_MiddleName'), '1234',FailureHandling.CONTINUE_ON_FAILURE)

WebUI.check(findTestObject('Object Repository/PopUpTest/Page_Popup Window/input_GenderMaleFemale_Female'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/PopUpTest/Page_Popup Window/select_SelectIndiaUSASingaporeUK'), '2', true,FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PopUpTest/Page_Popup Window/input_Country_Save'))

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/PopUpTest/Page_Execute Automation/Save button'), FailureHandling.CONTINUE_ON_FAILURE)



