import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import groovy.io.FileType as FileType
import com.kms.katalon.core.annotation.Keyword as Keyword
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('HCC/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('AvatarUpload/Page_Laravel/rightAvatarIcon'))

WebUI.click(findTestObject('AvatarUpload/Page_Laravel/ProfileButton'))

WebUI.click(findTestObject('AvatarUpload/Page_Laravel/EditIconForAvatar'))

WebUI.delay(1)

WebUI.click(findTestObject('AvatarUpload/Page_Laravel/input_Upload Avatar_cr-slider', [('aria-valuenow') : '1.2328']))

WebUI.delay(1)

CustomKeywords.'test.testclass.uploadFile'(findTestObject('AvatarUpload/Page_Laravel/label_Upload photo'), 'D:\\1b.jpg')

new_btn = WebUI.modifyObjectProperty(findTestObject('AvatarUpload/Page_Laravel/input_Upload Avatar_cr-slider'), 'xpath', 
    'equals', '//*[@aria-valuenow="1.5"]', false)

WebUI.click(new_btn)

//WebUI.clickOffset(findTestObject('AvatarUpload/Page_Laravel/input_Upload Avatar_cr-slider'), 10, 0)
WebUI.acceptAlert()

