# lana-labs-demo-project

#### Project Requirements
   - Java 8
   - maven 
 
#### Run test cases as a Test Suite
Navigate to the lana-labs-demo-project/src/main/java/com/aravinda/app/testSuite and run TestSuite.xml

or

Run ```mvn test``` from the project root folder

##### Properties and configurations

You do not need to worry about any property configurations because it will be handled by the SeleniumX framework. 
Drivers will be downloaded according to what you set as the driver settings for your test case. For example .... If there is a failure in test cases,
SeleniumX will generate a folder called *FailedSnapshots* at the project root and it will upload the screenshot of the failed scenario accordingly.  

#### Run the project in CI pip-line
If you need to run the test cases in CI pip-line with a docker image which is having selenium/standalone-chrome just replace the @DriverSettings as @ServerSettings.

For example
 
     @DriverSettings(
             OS = Set.OS.MAC,
             WINDOW_SIZE = Set.WINDOW_SIZE.DEFAULT,
             BROWSER = Set.BROWSER.CHROME,
             BASE_URL = "http://magellanic.lanalabs.com",
             IMPLICIT_WAIT = 10000
             )
     
     to
     
         @ServerSettings(
                 PLATFORM = Platform.LINUX,
                 BROWSER = Set.BROWSER.CHROME,
                 BASE_URL = "http://magellanic.lanalabs.com",
                 IMPLICIT_WAIT = 100
                 )
                 
*Assumption - All the test cases are running on Desktop/Laptop based environments.*


    