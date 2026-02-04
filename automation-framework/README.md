Automation Framework - Starter

How to use:
1. Unzip this project and import as Maven project in IntelliJ.
2. Run `mvn test` or run src/test/resources/testng.xml from IntelliJ.
3. Edit src/test/resources/config.properties to change browser or app.url.
4. Reports will be generated under the reports/ folder. Logs under logs/.

Included:
- Selenium 4, TestNG, WebDriverManager
- ExtentReports HTML reporting
- Basic utilities: ConfigReader, ExcelUtils, WaitUtils, ScreenshotUtils
- DriverFactory supporting Chrome and Firefox
- Sample test (SampleTest) that opens app.url

Notes:
- This is a starter template. Extend Page Objects and utils as required.
