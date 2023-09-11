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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/index.htm')

WebUI.click(findTestObject('Object Repository/Web/web4/Page_ParaBank  Welcome  Online Banking/a_Register'))

WebUI.setText(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_First Name_customer.firstName'), 
    'john')

WebUI.setText(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Last Name_customer.lastName'), 
    'doe')

WebUI.setText(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Address_customer.address.street'), 
    'jakarta')

WebUI.setText(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_City_customer.address.city'), 
    'sleman')

WebUI.setText(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_State_customer.address.state'), 
    'yogyakarta')

WebUI.setText(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Zip Code_customer.address.zipCode'), 
    '5822')

WebUI.setText(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Phone_customer.phoneNumber'), 
    '081122334455')

WebUI.setText(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_SSN_customer.ssn'), 
    '126378273')

WebUI.setText(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Username_customer.username'), 
    '')

WebUI.click(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Username_customer.username'))

WebUI.setText(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Username_customer.username'), 
    'yahya' + RandomStringUtils.randomNumeric(5))

WebUI.setEncryptedText(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Password_customer.password'), 
    'P9ET2sDE0SE=')

WebUI.setEncryptedText(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Confirm_repeatedPassword'), 
    'P9ET2sDE0SE=')

WebUI.click(findTestObject('Object Repository/Web/web4/Page_ParaBank  Register for Free Online Acc_dbf84b/input_Confirm_button'))

WebUI.closeBrowser()

