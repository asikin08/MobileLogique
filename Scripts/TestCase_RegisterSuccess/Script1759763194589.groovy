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

Mobile.startApplication('D:\\titip\\test\\Logique test - A Dhiyaul Asikin\\gvm-staging.apk', true)

Mobile.verifyElementExist(findTestObject('Object Repository/Registration/First Next button'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/First Next button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Registration/Second Next button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.doubleTap(findTestObject('Registration/Masuk button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Registration/Profile section'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Registration/Link Register'), 0)

Mobile.tap(findTestObject('Registration/Email input'), 0)

Mobile.setText(findTestObject('Registration/Email set'), 'asik@email.com', 0)

CucumberKW.delay(1)

Mobile.tap(findTestObject('Registration/nama input'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Registration/Nama set'), 'Asikin', 0)

CucumberKW.delay(1)

Mobile.tap(findTestObject('Registration/Hp input'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Registration/Hp set'), '085707766723', 0)

CucumberKW.delay(1)

Mobile.pressBack()

Mobile.tap(findTestObject('Registration/Password input'), 0, FailureHandling.STOP_ON_FAILURE)

CucumberKW.delay(1)

Mobile.setText(findTestObject('Registration/Buat Password Input'), 'Logic01!', 0)

CucumberKW.delay(1)

Mobile.pressBack()

Mobile.tap(findTestObject('Registration/Confirm Password input'), 0, FailureHandling.STOP_ON_FAILURE)

CucumberKW.delay(1)

Mobile.setText(findTestObject('Registration/Ulangi Password Input'), 'Logic01!', 0)

CucumberKW.delay(1)

Mobile.tap(findTestObject('Registration/Daftar Button'), 0)

CucumberKW.delay(1)

Mobile.closeApplication()

