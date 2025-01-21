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

def testdata = findTestData("Data Files/Data Request Hadir")
def NPP = testdata.getValue(1, 1)
def password = testdata.getValue(2, 1)
def Title = testdata.getValue(3, 1)
def Tanggal = testdata.getValue(4, 1)
def JamHadir = testdata.getValue(5, 1)
def JamPulang = testdata.getValue(6, 1)
def Karena = testdata.getValue(7, 1)
def Alasan = testdata.getValue(8, 1)
def ApprovalUnit = testdata.getValue(9, 1)
def Saksi = testdata.getValue(10, 1)
def Reviewer1 = testdata.getValue(11, 1)
def Reviewer2 = testdata.getValue(12, 1)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://e-office.bni.co.id/')

WebUI.verifyElementPresent(findTestObject('Page_Login/halaman_login'), 0)

WebUI.setText(findTestObject('Page_Login/login_npp'), NPP)

WebUI.setText(findTestObject('Page_Login/login_password'), password)

WebUI.click(findTestObject('Page_Login/login_button'))

WebUI.verifyElementPresent(findTestObject('Page_Portal/portal_verify'), 0)

WebUI.click(findTestObject('Page_Portal/portal_absensi'))

WebUI.click(findTestObject('Page_Absensi/absensi_hadir'))

WebUI.setText(findTestObject('Page_Hadir/hadir_title'), Title)

WebUI.getAttribute(findTestObject('Page_Hadir/hadir_tanggal'), Tanggal)

//WebUI.verifyElementPresent(findTestObject('Page_Hadir/hadir_tanggal_verify_bulan'), 0)
//WebUI.click(findTestObject('Page_Hadir/hadir_tanggal_tanggal'))
WebUI.click(findTestObject('Page_Hadir/hadir_tanggal_tanggal'))

WebUI.setText(findTestObject('Page_Hadir/hadir_jamhadir'), JamHadir)

WebUI.setText(findTestObject('Page_Hadir/hadir_jampulang'), JamPulang)

WebUI.setText(findTestObject('Page_Hadir/hadir_karena'))

WebUI.setText(findTestObject('Page_Hadir/hadir_alasan'), Alasan)

WebUI.setText(findTestObject('Page_Hadir/hadir_approvalunit'), ApprovalUnit)

WebUI.setText(findTestObject('Page_Hadir/hadir_saksi'), Saksi)

WebUI.setText(findTestObject('Page_Hadir/hadir_reviewer1'), Reviewer1)

WebUI.setText(findTestObject('Page_Hadir/hadir_reviewer2'), Reviewer2)

