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

WebUI.click(findTestObject('Object Repository/Personal Profile/btn_burger_dashboard'))

WebUI.click(findTestObject('Object Repository/Personal Profile/btn_TeamMembers'))

WebUI.click(findTestObject('Object Repository/Personal Profile/btn_view'))

WebUI.click(findTestObject('Object Repository/Personal Profile/btn_sponsored'))

WebUI.click(findTestObject('Object Repository/Personal Profile/btn_SetAutoAssign'))

WebUI.click(findTestObject('Object Rrepository/Personal Profile/div_AllClients'))

WebUI.click(findTestObject('Object Repository/Personal Profile/div_SelectClient'))

WebUI.click(findTestObject('Object Repository/Personal Profile/btn_ToggleReference'))

WebUI.click(findTestObject('Object Repository/Personal Profile/btn_SearchTeamMembers'))

WebUI.click(findTestObject('Object Repository/Personal Profile/btn_Add'))

WebUI.click(findTestObject('Object Repository/Personal Profile/btn_update'))

WebUI.click(findTestObject('Object Repository/Personal Profile/btn_DisableAutoAssign'))

WebUI.closeBrowser()

