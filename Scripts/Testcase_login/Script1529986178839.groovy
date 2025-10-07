import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('D:\\titip\\test\\gvm-staging.apk', true)

Mobile.verifyElementExist(findTestObject('Object Repository/Registration/First Next button'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/First Next button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Second Next button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.doubleTap(findTestObject('Registration/Masuk button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Registration/Profile section'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

