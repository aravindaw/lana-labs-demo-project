package com.aravinda.app.script;

import com.aravinda.app.page.LoginPage;
import com.aravinda.app.page.ModelPage;
import org.seleniumx.annotations.Page;
import org.seleniumx.util.Script;
import org.testng.Assert;

public class LoginScript extends Script {
    @Page(page = {LoginPage.class, ModelPage.class})
    public void script() {
        //page verification
        execute("LoginPage","verifyPageLoaded");
        execute("LoginPage","verifyPageUrl");

        execute("LoginPage","setEmailTextField",data.get("userName"));
        execute("LoginPage","setPasswordPasswordField",data.get("password"));
        execute("LoginPage","clickSignInButton");

        //Model page load verification
        execute("ModelPage","verifyPageLoaded");
        execute("ModelPage","verifyPageUrl");
        log.info(get("ModelPage","getTitle"));
        Assert.assertEquals(data.get("firstPageTitle"),get("ModelPage","getTitle"));

    }
}
