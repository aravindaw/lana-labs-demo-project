package com.aravinda.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumx.util.PageObject;

public class LoginPage extends PageObject {
    private int timeout = 15;
    WebDriverWait wait;

    @FindBy(xpath = "(//*[@id='signInFormUsername'])[2]")
    @CacheLookup
    private WebElement email;

    @FindBy(css = "div:nth-of-type(1) div.modal-dialog div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(3) div div form.cognito-asf a.redirect-customizable")
    @CacheLookup
    private WebElement forgotYourPassword1;

    @FindBy(css = "div:nth-of-type(1) div.modal-dialog div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) div:nth-of-type(2) div div form.cognito-asf a.redirect-customizable")
    @CacheLookup
    private WebElement forgotYourPassword2;

    private final String pageLoadedText = "Sign in with your email and password";

    private final String pageUrl = "https://magellanic.lanalabs.com/aws";

    @FindBy(xpath = "(//*[@id='signInFormPassword'])[2]")
    @CacheLookup
    private WebElement password;

    @FindBy(xpath = "(//input[@name='signInSubmitButton'])[2]")
    @CacheLookup
    private WebElement signIn;

    /**
     * Click on Forgot Your Password Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage clickForgotYourPassword1Link() {
        forgotYourPassword1.click();
        return this;
    }

    /**
     * Click on Forgot Your Password Link.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage clickForgotYourPassword2Link() {
        forgotYourPassword2.click();
        return this;
    }

    /**
     * Click on Sign In Button.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage clickSignInButton() {
        signIn.click();
        return this;
    }

    /**
     * Set value to Email Text field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setEmailTextField(String emailValue) {
        email.sendKeys(emailValue);
        return this;
    }

    /**
     * Set value to Password Password field.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage setPasswordPasswordField(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the LoginPage class instance.
     */
    public LoginPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
