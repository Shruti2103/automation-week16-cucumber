$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contectcustomerservice.feature");
formatter.feature({
  "line": 1,
  "name": "Contact Customer service",
  "description": "",
  "id": "contact-customer-service",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10971542700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "TC-004 Contact customer service for the previous successful order",
  "description": "",
  "id": "contact-customer-service;tc-004-contact-customer-service-for-the-previous-successful-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I am on the contact page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I send refund request to customer care for previous order",
  "keyword": "Then "
});
formatter.match({
  "location": "SignIn.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 3213276100,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 23671925600,
  "status": "passed"
});
formatter.match({
  "location": "Contact.iAmOnTheContactPage()"
});
formatter.result({
  "duration": 20060524800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(text(),\u0027Sign in\u0027)]\"}\n  (Session info: chrome\u003d102.0.5005.61)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027DESKTOP-TMPB3MR\u0027, ip: \u0027192.168.1.143\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_302\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [d550bbd104bef4c87f31e97ff968d832, findElement {using\u003dxpath, value\u003d//a[contains(text(),\u0027Sign in\u0027)]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.61, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\nihar\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51866}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:51866/devtoo..., se:cdpVersion: 102.0.5005.61, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d550bbd104bef4c87f31e97ff968d832\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy24.click(Unknown Source)\r\n\tat com.automationpractice.utility.Utility.clickOnElement(Utility.java:55)\r\n\tat com.automationpractice.pages.HomePage.clickonSigninButton(HomePage.java:24)\r\n\tat com.automationpractice.steps.Contact.iAmOnTheContactPage(Contact.java:14)\r\n\tat ✽.And I am on the contact page(contectcustomerservice.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Contact.iSendRefundRequestToCustomerCareForPreviousOrder()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 827448700,
  "status": "passed"
});
formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp, Sign In and Purchase Product",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4191192400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "TC-002 Sign In with newly created user credentials",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-002-sign-in-with-newly-created-user-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I shall verify the address information in my address section",
  "keyword": "Then "
});
formatter.match({
  "location": "SignIn.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 3708376200,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 22264582000,
  "status": "passed"
});
formatter.match({
  "location": "SignIn.iShallVerifyTheAddressInformationInMyAddressSection()"
});
formatter.result({
  "duration": 821581000,
  "status": "passed"
});
formatter.after({
  "duration": 755640800,
  "status": "passed"
});
});