package com.aravinda.app.preconditions;

import com.aravinda.app.page.LoginPage;
import com.aravinda.app.page.ModelPage;
import org.seleniumx.annotations.Page;
import org.seleniumx.util.Script;

public class LoginPrecondition extends Script {
    @Page(page = {LoginPage.class, ModelPage.class})
    public void script() {
        execute("LoginPage", "verifyPageLoaded");
        execute("LoginPage", "verifyPageUrl");
        execute("LoginPage", "setEmailTextField", preConData.get("data1"));
        execute("LoginPage", "setPasswordPasswordField", preConData.get("data2"));
        execute("LoginPage", "clickSignInButton");
        execute("ModelPage", "verifyPageLoaded");
    }
}
