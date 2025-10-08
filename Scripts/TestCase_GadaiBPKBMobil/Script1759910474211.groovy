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

Mobile.swipe(500, 300, 500, 100)

Mobile.longPress(findTestObject('Gadai BPKB/Gadai BPKB Mobil Fidusia'), 0)

Mobile.verifyElementVisible(findTestObject('Gadai BPKB/Merk input'), 0)

Mobile.tap(findTestObject('Gadai BPKB/Merk input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Merk Set'), 'Honda', 0)

Mobile.setText(findTestObject('Gadai BPKB/Jenis Set'), 'Brio', 0)

Mobile.setText(findTestObject('Gadai BPKB/Tahun Kendaraan Set'), '2024', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Gadai BPKB/Nomor Polisi Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Nomor Polisi Set'), 'S 2345 ED', 0)

Mobile.pressBack()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Gadai BPKB/nama STNK Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Nama STNK Set'), 'Asikin', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Gadai BPKB/Last Date STNK Input'), 0)

Mobile.tap(findTestObject('Gadai BPKB/31 Ock 2025'), 0)

Mobile.tap(findTestObject('Gadai BPKB/Oke Button'), 0)

Mobile.tap(findTestObject('Gadai BPKB/Odometer Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Odometer Set'), '209', 0)

Mobile.pressBack()

Mobile.swipe(500, 300, 500, 100)

Mobile.tap(findTestObject('Gadai BPKB/Warna Unit Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Warna Set'), 'Merah', 0)

Mobile.pressBack()

Mobile.swipe(500, 300, 500, 100)

Mobile.tap(findTestObject('Gadai BPKB/Pengajuan Pinjaman Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Pengajuan Pinjaman Set'), '3000000', 0)

Mobile.pressBack()

Mobile.swipe(500, 300, 500, 0)

Mobile.tap(findTestObject('Gadai BPKB/Sesuai KTP Checklist'), 0)

Mobile.tap(findTestObject('Gadai BPKB/Kepemilikan dropdown'), 0)

Mobile.tap(findTestObject('Gadai BPKB/Milik Sendiri'), 0)

Mobile.tap(findTestObject('Gadai BPKB/Bukti Kepemilikan Dropdown'), 0)

Mobile.tap(findTestObject('Gadai BPKB/SHM Option'), 0)

Mobile.swipe(500, 300, 500, -300)

Mobile.tap(findTestObject('Gadai BPKB/Kondisi rumah input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Kondisi Rumah Set'), 'Bagus', 0)

Mobile.pressBack()

Mobile.swipe(500, 300, 500, 100)

Mobile.tap(findTestObject('Gadai BPKB/Kondisi Lingkungan Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Kondisi Lingkungan Set'), 'Bagus', 0)

Mobile.pressBack()

Mobile.swipe(500, 300, 500, 0)

Mobile.tap(findTestObject('Gadai BPKB/Akses Jalan Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Akses Jalan Set'), 'Bagus', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Gadai BPKB/Lama Tinggal Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Lama Tinggal Set'), '2', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Gadai BPKB/Garasi Dropdown'), 0)

Mobile.tap(findTestObject('Gadai BPKB/Ada Options'), 0)

Mobile.swipe(500, 300, 500, -100)

Mobile.tap(findTestObject('Gadai BPKB/Nama Usaha Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Nama Usaha Set'), 'DS Store', 0)

Mobile.pressBack()

Mobile.swipe(500, 300, 500, 100)

Mobile.tap(findTestObject('Gadai BPKB/Alamat Usaha Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Alamat Usaha Set'), 'Tbn', 0)

Mobile.pressBack()

Mobile.swipe(500, 300, 500, -100)

Mobile.tap(findTestObject('Gadai BPKB/Jabatan Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Jabatan Input'), 'Owner', 0)

Mobile.pressBack()

Mobile.swipe(500, 300, 500, -100)

Mobile.tap(findTestObject('Gadai BPKB/Nomor Usaha Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Nomor Usaha Set'), '3232323', 0)

Mobile.pressBack()

Mobile.swipe(500, 300, 500, 100)

Mobile.tap(findTestObject('Gadai BPKB/Status Usaha Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Status Usaha Set'), 'Baik', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Gadai BPKB/Lama Usaha Set'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Lama Usaha Set'), '2', 0)

Mobile.pressBack()

Mobile.swipe(500, 300, 500, 100)

Mobile.tap(findTestObject('Gadai BPKB/Omset minimal Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Omset Minimal Set'), '2000', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Gadai BPKB/Omset Max Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Omset Max Set'), '2000000', 0)

Mobile.pressBack()

Mobile.swipe(500, 300, 500, 100)

Mobile.tap(findTestObject('Gadai BPKB/Izin Usaha Dropdown'), 0)

Mobile.tap(findTestObject('Gadai BPKB/SKU Options'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 300, 500, 0)

Mobile.tap(findTestObject('Gadai BPKB/Nomor NIB Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Nomor NIB Set'), '2324242424', 0)

Mobile.pressBack()

Mobile.swipe(500, 300, 500, 100)

Mobile.tap(findTestObject('Gadai BPKB/Bidang Usaha Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Bidang Usaha set'), 'Makanan', 0)

Mobile.pressBack()

Mobile.swipe(500, 300, 500, 100)

Mobile.tap(findTestObject('Gadai BPKB/Minimal Jumlah karyawan Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Minimal Jumlah Karyawan Set'), '1', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Gadai BPKB/Max Jumlah Karyawan Input'), 0)

Mobile.setText(findTestObject('Gadai BPKB/Maximal Jumlah Karyawan Set'), '10', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Gadai BPKB/Checked Terms'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Gadai BPKB/Checked Condition'), 0)

Mobile.tap(findTestObject('Gadai BPKB/Proses button'), 0)

