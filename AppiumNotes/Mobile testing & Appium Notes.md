**adb commands**
	adb shell dumpsys window | find "mCurrentFocus"

&nbsp;	adb install <path of the .apk>
	adb shell svc wifi diable - to turn off the wifi

 	adb shell svc wifi enable - to turn on the wifi

 	adb shell am start -a android.intent.action.CALL -d tel:+CCXXXXXXXXXXX

 	adb shell am start -a android.intent.action.SENDTO -d sms:xxxxxxxxxxx --es sms\_body "message\\ body\\ here" --ez exit\_on\_sent true

 	adb shell dumpsys battery set level 5

 	adb shell dumpsys battery set level 100

 	adb shell dumpsys battery set usb 0

 	adb shell dumpsys battery set usb 1

 	adb shell dumpsys battery reset

 	adb shell input keyevet KEYCODE\_HOME

 	adb shell input keyevet KEYCODE\_BACK

 	adb shell content insert --uri content://settings/system --bind name:s:accelerometer\_rotation --bind value:i:0 -> potrate mode

 	adb shell content insert --uri content://settings/system --bind name:s:accelerometer\_rotation --bind value:i:1 -> landscape

adb shell content insert --uri content://settings/system --bind name:s:accelerometer\\\_rotation --bind value:i:2 -> potrate mode
	adb shell content insert --uri content://settings/system --bind name:s:accelerometer\\\_rotation --bind value:i:3 -> landscape

&nbsp;	adb logcat <package name>  -> to fetch the logs 










**Mobile testing**



**Types of mobile application**

 - Native app

 - Hybrid application

 - Mobile web application



Native application

 	- Platform dependent

 	- UI is not attractive

 	- faster since it is developed in own language

 	- where you install it

 

Hybrid application

 	- web application put under a native container

 	- works for both android and iOS

 	- platform independent



   disadvantages

 	- 1% compatability issues

 	- comparatively slower than the native application

 

Mobile web application

 	**Simple Web Application**

 		 - same in both web browser and in mobile web



 	**Progressive web application**

 		 - separate ui for browser web and mobile web



**Android SDK**

SDK build tool -> build binaries (.apk)

   Android SDK tools (Absolete)

   Android Emulator

   Platform tools - helps the test engineer to debug the application. like adb(android debugging bridge)

Platforms - android versions

 

 	go to Android Studio -> SDK Manager -> install SDK platform and SDK tools mentioned above.



**adb**

 	Client -> installed exe

 	server -> 5037 (default)

 	Daemon -> mobile phone in which action is performed





Types of Mobile testinh

 	- Mobile device testing

 	- Mobile application testing



   **Installation testing** - testing the application properly installed in the mobile device

   **Interruption testing** - test the application when there is an intruption.

 	- network dependent -> by testing with adb commands **adb shell svc wifi diable/enable**

 	- functionality dependent -> application interrupted by other application is called functionality dependent. adb shell am start -a android.intent.action.CALL -d tel:+CCXXXXXXXXXXX

    	- device dependent -> adb shell dumpsys battery set level 5, adb shell dumpsys battery set level 100, adb shell dumpsys battery set usb 0, adb shell dumpsys battery set usb 1, adb shell dumpsys battery reset

   **Orientation testing** - patriate, Landscape. -> adb shell content insert --uri content://settings/system --bind name:s:accelerometer\_rotation --bind value:i:0

   **Battery testing** - battery consumption testing \& testing application in different battery level

   **Network testing** - testing in different network. Mobile data, wifi, lan.. by using charls proxy throttle the network

   **GPS testing** - testing based on different geographical. for Dollar and rupee. -> fake GPS.. settings -> make mock location

   **Guesture testing** - adb shell input tap 1000 5000, adb shell input swipe 400 500 400 500

   **Standby testing** - testing the application in standby mode is called Standby testing.

   **Field testing** - testing the application in the real environment like high temperature \& low temparature (not in home/ travelling)

   **Ui testing** -

   **Unistallalation testing** - testing the application by uninstalling. for uninstalling using adb command -> adb uninstall "<app package>"





**Debugging**

	W -> WARN

&nbsp;	I -> INFO

&nbsp;	D -> DEBUG

&nbsp;	V -> VERBOSE

&nbsp;	E -> ERROR



**Appium**



1\. Appium is an open source tool which is used to automate Mobile Native, Hybrid, and M Web.



2\. Appium used W3C protocol.



3\. Appium can be used to automate the android , ios (Cross platform compatibility).



Features of Appium

 	- Cross platform compatibility

 	- open source

 	- supports multiple programming language

 	- No app modification is required (a small patch will not impact the framework)

 	- supports Native, Hybrid, and M Web.

 	- Supports real \& emulator and simulator testing

 	- Built in inspector (Appuim inspector)

 	- Parallel Execution



Advantages

 	- open source

 	- supports multiple language

 	- supports multiple OS

 	- supports multiple platform

 	- good community support

 	- Supports testing frameworks



disadvantages

 	- complex setup

 	- dont support lower version (not compatable android version < 4.2)

 	- slow in execution

 	- cannot automate desktop application

 	- supports only chrome and safari



Difference between version 1 \& 2



Appium 1

 	- Appium 1 had default android and iOS support

 	- The url for Appium was http://localhost:4723/wd/hub

 	- It supported both JSON WIRE and W3C protocol

 	- We were using touch action class to perform actions

 	- In Appium1 you could give any capabilibities without vendor prefix "platformName","android"

 	- In Appium1 We had Appium desktop



Appium 2

 	- Appium 2 doesn't have default support needs driver to installed externally.

 	- The url for Appium2 is http://localhost:4723

 	- It supports W3C protocol

 	- Now we are using gestures to platform actions

 	- Here we mention only automationName and browserName with vendor prefix "appium:platformName","android"

 	- In Appium2 We had Appium inspector.



Appium Architecture



 	- Appium Java client \[IDE] / Appium inspector

 	- Appium Server (http server runs in 4723 port)

 	- Drivers - UI Automator 2(Android driver) / Xcuitest(ios driver)

 	- Devices - android/AVD - Android Virtual Device\[emulator] .apk) / ios .psa





Capabilities

 	- Capabilities are nothing but JSON object which can be represented in key value pair.

 	- Capabilities says which it should device use, what driver it need to connect, actions and much more to the server

 

bootstap.jar file (Android), WDA (ios) - Application which helps the ios device to perform operation.



Appium Pre-reqiests

 	for Android

 	- JDK

 	- Eclipse / IntelliJ

 	- Node.js

 	- Appium Server (npm install -g appium@2.5.4)

 	- Drivers

 	- Device

 	- Inspector

 	- Android Studio

 



Desired Capabilities

 	-

 	"platformName","android"

 	"platformVersion","14"

 	"automationName","uiautomator2"

 	"deviceName","GalaxyA32"

 	"UDID","RFW1234" - ADB command

 	"ignoreHiddenApiPolicyError","true"

 	"autoGrantPermissions","true"

 	"noReset","true" -

 	"fullReset","true" - uninstall the application

 	"app","path of apk" - mandatory when we mention "fullReset"

 	"appPackage",""

 	"appActivity",""

 	"unlockType","pin"

 	"ulnlockKey","1234"

 	"browserName","chrome"



ADB commands

 	adb devices -

 	adb shell dumpsys window | find "mCurrentFocus" - for getting appPackage \& appActivity (copy from com.)

 	Appium  to start the Appium server

 

Locators

    selenium Locators

 	- id

 	- name

 	- className

 	- tagName

 	- linkText

 	- partialLinkText

 	- cssSelector

 	- xpath    syntax : //tagName\[@AN = 'AN']



    Appium

 	- AcccessibilityId

 	- Id

 	- className

 	- AndroiduiAutomator

 	- xpath    syntax : //className\[@AN = 'AN'] (text,contentText,resource-id)



 

Gestures

 	- click

 	- Double click

 	- long click/long press

 	- Pinch open -> Zoom in

 	- Pinch close -> Zoom out

 	- Drag and Drop

 	- Swipe

 	- scroll



 	https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md

