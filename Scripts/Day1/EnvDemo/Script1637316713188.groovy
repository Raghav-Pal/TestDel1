import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Page_Try Testing This/input_Username_uname'), GlobalVariable.USERNAME)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Try Testing This/input_Password_pwd'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Object Repository/Page_Try Testing This/input'))

WebUI.verifyTextPresent('Login Successful', false)

WebUI.delay(1)

WebUI.closeBrowser()

