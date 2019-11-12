package com.aravinda.app.script;

import com.aravinda.app.page.ModelPage;
import org.seleniumx.annotations.Page;
import org.seleniumx.util.Script;
import org.testng.Assert;

public class FilterApplication extends Script {
    @Page(page = {ModelPage.class})
    public void script() {
        //Model page load verification
        execute("ModelPage", "verifyPageLoaded");
        execute("ModelPage", "verifyPageUrl");

        execute("ModelPage", "clickRadioButton", data.get("chooseLogFile"));
        execute("ModelPage", "clickSelectLogFileButton");
        execute("ModelPage", "exitHelpOutLine");

        execute("ModelPage", "clickFilterListButton");
        execute("ModelPage", "ClickFilterAttributeButton");
        execute("ModelPage", "searchFilter", data.get("filter"));
        execute("ModelPage", "selectFilter", data.get("filter"));
        execute("ModelPage", "SaveFilter");
        Assert.assertEquals("Country filter", get("ModelPage", "countryFilterChart"));
        execute("ModelPage", "SaveFilter");
        execute("ModelPage", "selectCountrySegment", data.get("countryOfSegmentValues"));
        log.info(get("ModelPage", "getCaseCount"));
        String[] caseValueString = get("ModelPage", "getCaseCount").trim().split(" ");
        String caseCount = null;
        for (String value : caseValueString) {
            if (value.matches("\\d+")) {
                caseCount = value;
                break;
            }
        }
        //assert case count
        Assert.assertEquals(caseCount.trim(), data.get("caseCount").trim());
    }
}
