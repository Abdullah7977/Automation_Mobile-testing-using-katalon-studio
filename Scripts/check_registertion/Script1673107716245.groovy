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

//setup and open application
//String app_path='F:\\java\\Appium_project\\testapp.apk'
//go to register page
String register_page = 'Object Repository/Register_elements/register_page'

Mobile.tap(findTestObject(register_page), GlobalVariable.Timeout)

// enter username
String userName = 'Object Repository/Register_elements/userName'

Mobile.setText(findTestObject(userName), user_name, GlobalVariable.Timeout)

//enter email address
Mobile.setText(findTestObject('Object Repository/Register_elements/Email'), email, GlobalVariable.Timeout)

// enter password
Mobile.setText(findTestObject('Object Repository/Register_elements/password'), password, GlobalVariable.Timeout)

//set your name
Mobile.setText(findTestObject('Register_elements/name'), name, GlobalVariable.Timeout)

//hide the keyboard
Mobile.hideKeyboard()

//select the programming language 
Mobile.tap(findTestObject('Object Repository/Register_elements/programmingLanguage'), GlobalVariable.Timeout)

//choose java language
Mobile.tap(findTestObject('Object Repository/Register_elements/android.widget.CheckedTextView - Java'), GlobalVariable.Timeout)

//click the checkbox
Mobile.tap(findTestObject('Object Repository/Register_elements/android.widget.CheckBox - I accept adds'), GlobalVariable.Timeout)

//click register button
Mobile.tap(findTestObject('Object Repository/Register_elements/register_btn'), GlobalVariable.Timeout)

//check the result
Mobile.tap(findTestObject('Object Repository/Register_elements/finish_register'), GlobalVariable.Timeout)

