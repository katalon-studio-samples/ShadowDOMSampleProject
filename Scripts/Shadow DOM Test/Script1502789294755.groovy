import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open browser and navigate to the AUT website'
WebUI.openBrowser('http://www.kaidez.com/samples/template-shadowdom-practice/')

'Click on the destination book store link'
WebUI.click(findTestObject('aStoreLink'))

'Delay 5s to view the result'
WebUI.delay(5)

'Verify that a new window is opened'
WebUI.switchToWindowTitle('Object-Oriented JavaScript, 2nd Edition: Stoyan Stefanov, Kumar Chetan Sharma: 9781849693127: Amazon.com: Books')

'Close the browser to clean up'
WebUI.closeBrowser()

