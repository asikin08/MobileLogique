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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Registration/Profile section'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/Email Input'), 0)

Mobile.setText(findTestObject('Login/Email Set'), 'asik@email.com', 0)

Mobile.setText(findTestObject('Login/Password Set'), 'Asikin01!', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Login/Button Masuk'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Registration/Profile section'), 0)

Mobile.verifyElementVisible(findTestObject('Login/Tittle Profil'), 0)

Mobile.swipe(500, 300, 500, -100)

Mobile.tap(findTestObject('Login/Logout button'), 0)

Mobile.verifyElementVisible(findTestObject('Registration/Profile section'), 0)

Mobile.closeApplication()

