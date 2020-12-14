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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://skooleeo-app.com/')

WebUI.click(findTestObject('Object Repository/Page_Skooleeo - School Management System an_9ec0ce/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Skooleeo/input_Sign In_form-control'), 'S0000001')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Skooleeo/input_Sign In_form-control_1'), '/dTC0zkZWCU=')

WebUI.click(findTestObject('Object Repository/Page_Skooleeo/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Skooleeo Learning Center/input_Back_q'), 'mathematics')

WebUI.sendKeys(findTestObject('Object Repository/Page_Skooleeo Learning Center/input_Back_q'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Skooleeo Learning Center/input_Back_q'), 'podcasts')

WebUI.click(findTestObject('Object Repository/Page_Skooleeo Learning Center/i_Back_fas fa-search'))

WebUI.click(findTestObject('Object Repository/Page_Skooleeo Learning Center/input_Back_q'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Skooleeo Learning Center/input_Back_q'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Skooleeo Learning Center/input_Back_q'), 'podcasts')

WebUI.click(findTestObject('Object Repository/Page_Skooleeo Learning Center/img_Courses_img-fluid'))

WebUI.click(findTestObject('Object Repository/Page_Skooleeo Learning Center/div_Senior                                 _3b28a5'))

WebUI.click(findTestObject('Object Repository/Page_Skooleeo Learning Center/div_Senior Secondary School 3'))

