import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://trytestingthis.netlify.app/')

WebUI.setText(findTestObject('Object Repository/Page_Try Testing This/input_Username_uname'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Try Testing This/input_Password_pwd'), password)

WebUI.click(findTestObject('Object Repository/Page_Try Testing This/input'))

WebUI.verifyTextPresent('Login Successful', false)

WebUI.delay(1)

WebUI.closeBrowser()

