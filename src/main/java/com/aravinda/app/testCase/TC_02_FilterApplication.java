package com.aravinda.app.testCase;

import com.aravinda.app.preconditions.LoginPrecondition;
import com.aravinda.app.script.FilterApplication;
import org.openqa.selenium.Platform;
import org.seleniumx.annotations.DriverSettings;
import org.seleniumx.annotations.Precondition;
import org.seleniumx.annotations.Script;
import org.seleniumx.annotations.ServerSettings;
import org.seleniumx.util.Set;
import org.seleniumx.util.TestCase;

public class TC_02_FilterApplication extends TestCase {

    @ServerSettings(
            PLATFORM = Platform.LINUX,
            BROWSER = Set.BROWSER.CHROME,
            VERSION = "1",
            SERVER_PORT = "4444",
            SERVER_URL = "http://localhost",
            BASE_URL = "http://magellanic.lanalabs.com",
            IMPLICIT_WAIT = 1000)
//    @DriverSettings(
//            OS = Set.OS.MAC,
//            WINDOW_SIZE = Set.WINDOW_SIZE.DEFAULT,
//            BROWSER = Set.BROWSER.CHROME,
//            BASE_URL = "http://magellanic.lanalabs.com",
//            IMPLICIT_WAIT = 1000
//    )
    @Precondition(precondition = LoginPrecondition.class, data = {"aravindaweerasekara@gmail.com", "test@123"})
    @Script(script = FilterApplication.class)
    public void testCase() {
        data.put("chooseLogFile", "Incident_Management.csv");
        data.put("filter", "Country");
        data.put("countryOfSegmentValues", "Germany");
        data.put("caseCount", "693");

        //assert Model page title
        data.put("firstPageTitle", "LANA - Model");
        run(data);

    }
}
