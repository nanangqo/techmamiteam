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

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://mamikos.com/', FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OBJECTawal/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/button_Mau'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/OBJECTawal/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/button_Masuk'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OBJECTawal/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/div_Pencari Kos'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OBJECTawal/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/input_Nomor Handphone_Nomor Handphone'), 
    '085718924460', FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/OBJECTawal/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/input_Password_Password'), 
    '+q0Fw6JOWO2ju05+hDn0ww==', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OBJECTawal/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/button_Login'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJECTawal/Page_Mamikos - Cari, Bayar,  Sewa Kost Onli_d79c00/div_Masukan nama lokasiareaalamat Cari'))

WebUI.click(findTestObject('OBJECTawal/Jakarta/button_Jakarta chevron-down'))

WebUI.click(findTestObject('OBJECTawal/Jakarta/a_STAN Jakarta'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJECTawal/STAN_JAKARTA/promobtnmengerti'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OBJECTawal/STAN_JAKARTA/span_flash  Promo Ngebut'))

WebUI.click(findTestObject('OBJECTawal/STAN_JAKARTA/promobtnmengerti'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OBJECTawal/STAN_JAKARTA/input_Dapat diskon pembayaran pertama harga sewa. Diskon hanya berlaku selama program berlangsung_bg-c-switch__input'))

WebUI.click(findTestObject('OBJECTawal/PromoNgebut/span_Kost Apik Rumah Nenek Tipe C Jurangmangu Tangerang Selatan'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.click(findTestObject('OBJECTawal/PAY_Promo_Kost Apik Rumah Nenek Tipe B Jurangmangu Tangerang Selatan/a_Saya Mengerti'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OBJECTawal/PAY_Promo_Kost Apik Rumah Nenek Tipe B Jurangmangu Tangerang Selatan/input_bulan_booking-input-checkin__input'))

WebUI.click(findTestObject('OBJECTawal/PAY_Promo_Kost Apik Rumah Nenek Tipe B Jurangmangu Tangerang Selatan/a_Saya Mengerti'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OBJECTawal/PAY_Promo_Kost Apik Rumah Nenek Tipe B Jurangmangu Tangerang Selatan/span_21'))

WebUI.click(findTestObject('OBJECTawal/PAY_Promo_Kost Apik Rumah Nenek Tipe B Jurangmangu Tangerang Selatan/div_Per bulan'))

WebUI.click(findTestObject('OBJECTawal/PAY_Promo_Kost Apik Rumah Nenek Tipe B Jurangmangu Tangerang Selatan/button_Ajukan Sewa'))

WebUI.click(findTestObject('OBJECTawal/PAY_Promo_Kost Apik Rumah Nenek Tipe B Jurangmangu Tangerang Selatan/span_bayar penuh'))

WebUI.click(findTestObject('OBJECTawal/PAY_Promo_Kost Apik Rumah Nenek Tipe B Jurangmangu Tangerang Selatan/button_Selanjutnya'))

WebUI.click(findTestObject('OBJECTawal/PAY_Promo_Kost Apik Rumah Nenek Tipe B Jurangmangu Tangerang Selatan/span_checkketentuan'))

WebUI.closeBrowser()

