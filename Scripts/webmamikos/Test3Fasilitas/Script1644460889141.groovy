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

WebUI.navigateToUrl('https://mamikos.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Record/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/button_Mau'))

WebUI.click(findTestObject('Object Repository/Record/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/div_Masukan nama lokasiareaalamat'))

WebUI.setText(findTestObject('Object Repository/Record/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/input_2022 Mamikos.com, All rights reserved_fc217b'), 
    'bogor')

WebUI.click(findTestObject('Object Repository/Record/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/label_Bogor City, West Java, Indonesia'))

WebUI.click(findTestObject('Object Repository/Record/Page_Cari Kost di Sekitarmu, Booking Langsu_0d722e/span_Fasilitas'))

WebUI.click(findTestObject('Object Repository/Record/Page_Cari Kost di Sekitarmu, Booking Langsu_0d722e/span_K. Mandi Dalam_filter-input__custom-checkbox'))

WebUI.click(findTestObject('Object Repository/Record/Page_Cari Kost di Sekitarmu, Booking Langsu_0d722e/span_Parkir Motor_filter-input__custom-checkbox'))

WebUI.click(findTestObject('Object Repository/Record/Page_Cari Kost di Sekitarmu, Booking Langsu_0d722e/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Record/Page_Cari Kost di Sekitarmu, Booking Langsu_0d722e/span_Kost NResidence Tipe C Bogor Timur'))

WebUI.switchToWindowIndex(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/input_bulan_booking-input-checkin__input'))

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/button_Lanjut'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/button_Lanjut'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/button_Lanjut'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/button_Lanjut'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/button_Lanjut'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/button_Saya Mengerti'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/span_28'))

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/div_Per bulan_mami-radio-icon'))

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/h2_Ajukan Sewa'))

WebUI.setText(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/input_Nomor Handphone_Nomor Handphone'), 
    '085718924460')

WebUI.setEncryptedText(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/input_Password_Password'), 
    '+q0Fw6JOWO2ju05+hDn0ww==')

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/span_Login'))

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/h2_Ajukan Sewa'))

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/div_Per bulan_mami-radio-icon'))

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/h2_Ajukan Sewa'))

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/svg_add-plus'))

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/svg_add-plus'))

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/svg_add-plus'))

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/svg_add-plus'))

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Record/Page_Kost NResidence Tipe C Bogor Timur/span_checkmark'))

WebUI.closeBrowser()

