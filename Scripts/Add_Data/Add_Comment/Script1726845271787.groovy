import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login_Positive/Call_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Add Data/Plus_Button'))

WebUI.click(findTestObject('Object Repository/Add Data/h6_Comment'))

WebUI.click(findTestObject('Add Data/Txt_condition'))

WebUI.setText(findTestObject('Add Data/Txt_condition'), 'Test Comment')

WebUI.setText(findTestObject('Object Repository/Add Data/Input_Token Data'), 'abdi')

WebUI.click(findTestObject('Object Repository/Add Data/p_11 Abdi, Temporary Protected Status (TPS)_0f4ff2'))

WebUI.click(findTestObject('Object Repository/Add Data/input_Set as red flag_commit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Add Data/PopUp_Comment'))

WS.delay(2)

WebUI.closeBrowser()

