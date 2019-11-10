package com.aravinda.app.testCase;

import com.aravinda.app.script.LoginScript;
import org.openqa.selenium.Platform;
import org.seleniumx.annotations.Script;
import org.seleniumx.annotations.ServerSettings;
import org.seleniumx.util.Set;
import org.seleniumx.util.TestCase;

public class TC_01_LoginTest extends TestCase {

    @ServerSettings(
            PLATFORM = Platform.LINUX,
            BROWSER = Set.BROWSER.CHROME,
            VERSION = "1",
            SERVER_PORT = "5555",
            SERVER_URL = "http://localhost",
            BASE_URL = "http://magellanic.lanalabs.com",
            IMPLICIT_WAIT = 100)
//    @DriverSettings(
//            OS = Set.OS.MAC,
//            WINDOW_SIZE = Set.WINDOW_SIZE.DEFAULT,
//            BROWSER = Set.BROWSER.CHROME,
//            BASE_URL = "http://magellanic.lanalabs.com",
//            IMPLICIT_WAIT = 10000
//    )
    @Script(script = LoginScript.class)
    public void testCase() {
        data.put("userName", "aravindaweerasekara@gmail.com");
        data.put("password", "test@123");
        //assert Model page title
        data.put("firstPageTitle", "LANA - Model");
        run(data);

    }
}
