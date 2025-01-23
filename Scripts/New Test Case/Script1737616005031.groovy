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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://e-office.bni.co.id/')

WebUI.setText(findTestObject('Object Repository/test/Page_e-Office/input_Sign in with your organizational acco_9a18b3 (1)'), 
    '900666')

WebUI.setEncryptedText(findTestObject('Object Repository/test/Page_e-Office/input_Sign in with your organizational acco_04b8f7 (1)'), 
    'jGZcLSFmrF0=')

WebUI.click(findTestObject('Object Repository/test/Page_e-Office/input_Sign in with your organizational acco_ff227e (1)'))

WebUI.click(findTestObject('Object Repository/test/Page_e-Office Portal/img (1)'))

WebUI.click(findTestObject('Object Repository/test/Page_Absensi - Absensi - Inbox/a_Hadir (1)'))

WebUI.click(findTestObject('Object Repository/test/Page_Absensi - Absensi - Hadir/hadir_select_approvalunit'))

WebUI.click(findTestObject('Object Repository/test/Page_Absensi - Absensi - Hadir/hadir_approvalunit'))

WebUI.click(findTestObject('Object Repository/test/Page_Absensi - Absensi - Hadir/hadir_select_saksi'))

WebUI.click(findTestObject('Object Repository/test/Page_Absensi - Absensi - Hadir/hadir_saksi'))

WebUI.click(findTestObject('Object Repository/test/Page_Absensi - Absensi - Hadir/hadir_select_reviewer1'))

WebUI.click(findTestObject('Object Repository/test/Page_Absensi - Absensi - Hadir/hadir_reviewer1'))

WebUI.click(findTestObject('Object Repository/test/Page_Absensi - Absensi - Hadir/hadir_select_reviewer2'))

WebUI.click(findTestObject('Object Repository/test/Page_Absensi - Absensi - Hadir/hadir_reviewer2'))

WebUI.click(findTestObject('Object Repository/test/Page_Absensi - Absensi - Hadir/hadir_calendar'))

WebUI.click(findTestObject('Object Repository/test/Page_Absensi - Absensi - Hadir/a_16'))

