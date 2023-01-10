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

Mobile.tap(findTestObject('Object Repository/chrome_page/chrome_icon'), GlobalVariable.Timeout)

Mobile.setText(findTestObject('Object Repository/chrome_page/android.widget.EditText - Enter your name here'), text, GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/chrome_page/android.view.View - Volvo'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/chrome_page/android.widget.CheckedTextView - Mercedes'), GlobalVariable.Timeout)

Mobile.tap(findTestObject('Object Repository/chrome_page/android.widget.Button - Send me your name'), GlobalVariable.Timeout)

String actualtext = Mobile.getText(findTestObject('chrome_page/android.widget.TextView - wlcome abdo'), GlobalVariable.Timeout)

Mobile.verifyEqual(actualtext.contains(text), true)

