package com.aravinda.app.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumx.util.PageObject;

public class ModelPage extends PageObject {
    private int timeout = 15;

    @FindBy(css = "button.leadin-button.leadin-advance-button.leadin-button-secondary")
    @CacheLookup
    private WebElement abonnierenSieUnserenNewsletter;

    @FindBy(xpath = "//*[@id='mat-tab-content-0-0']/div/div/discovered-model/div/div[4]/button/span/mat-icon")
    @CacheLookup
    private WebElement slow_motion_video;

    @FindBy(xpath = "//div[@class='introjs-overlay']")
    @CacheLookup
    private WebElement waitForExitHelper;


    @FindBy(css = "#mat-tab-content-0-0 div.mat-tab-body-content.ng-trigger.ng-trigger-translateTab div.demo-tab-content.ng-star-inserted discovered-model div.additional-tools div:nth-of-type(2) button:nth-of-type(1)")
    @CacheLookup
    private WebElement add;

    @FindBy(css = "#animation button:nth-of-type(4)")
    @CacheLookup
    private WebElement addcircle;

    @FindBy(css = "#mat-tab-content-0-0 div.mat-tab-body-content.ng-trigger.ng-trigger-translateTab div.demo-tab-content.ng-star-inserted discovered-model div.additional-tools div:nth-of-type(4) div.slider-invisible div.md-whiteframe-4dp button.mat-icon-button.mat-primary")
    @CacheLookup
    private WebElement close;

    @FindBy(css = "#mat-tab-content-0-0 div.mat-tab-body-content.ng-trigger.ng-trigger-translateTab div.demo-tab-content.ng-star-inserted discovered-model div.additional-tools div:nth-of-type(2) button:nth-of-type(3)")
    @CacheLookup
    private WebElement cropfree;

    @FindBy(css = "button.no-hover-effect.mat-button.ng-star-inserted")
    @CacheLookup
    private WebElement discoveredModel;

    @FindBy(id = "downloadMenuButton")
    @CacheLookup
    private WebElement filedownload;

    @FindBy(xpath = "//*[@id='addFilterMenuButton']/span/mat-icon")
    @CacheLookup
    private WebElement filterlist;

    @FindBy(id = "activity-search-input")
    @CacheLookup
    private WebElement findActivity;

    @FindBy(css = "app-root app-shell.ng-star-inserted div mat-sidenav-container.mat-drawer-container.mat-sidenav-container mat-sidenav-content.mat-drawer-content.mat-sidenav-content app-header mat-toolbar.mat-elevation-z6.header-navbar.mat-toolbar.mat-toolbar-single-row div:nth-of-type(2) div:nth-of-type(3) button:nth-of-type(2)")
    @CacheLookup
    private WebElement helpoutline;

    @FindBy(css = "app-root app-shell.ng-star-inserted div mat-sidenav-container.mat-drawer-container.mat-sidenav-container mat-sidenav-content.mat-drawer-content.mat-sidenav-content app-header mat-toolbar.mat-elevation-z6.header-navbar.mat-toolbar.mat-toolbar-single-row div:nth-of-type(2) div:nth-of-type(1) log-management-menu.ng-star-inserted div.log-management button.mat-icon-button")
    @CacheLookup
    private WebElement incidentmanagementCsvExpandmore;

    @FindBy(css = "#filterContainer div:nth-of-type(1) log-filter-percentage mat-card.filter-card.mat-card mat-card-content.mat-card-content button.mat-icon-button")
    @CacheLookup
    private WebElement keyboardarrowright;

    @FindBy(css = "button.menu-button.mat-icon-button")
    @CacheLookup
    private WebElement model;

    private final String pageLoadedText = "Choose a log";

    private final String pageUrl = "https://magellanic.lanalabs.com/model";

    @FindBy(css = "#animation button:nth-of-type(1)")
    @CacheLookup
    private WebElement playarrow;

    @FindBy(css = "#mat-tab-content-0-0 div.mat-tab-body-content.ng-trigger.ng-trigger-translateTab div.demo-tab-content.ng-star-inserted discovered-model div.additional-tools div:nth-of-type(2) button:nth-of-type(2)")
    @CacheLookup
    private WebElement remove;

    @FindBy(css = "#animation button:nth-of-type(3)")
    @CacheLookup
    private WebElement removecircle;

    @FindBy(css = "#canvasSettingsButton button.mat-icon-button.mat-primary")
    @CacheLookup
    private WebElement settings;

    @FindBy(css = "button.mat-icon-button.mat-primary.ng-star-inserted")
    @CacheLookup
    private WebElement slowmotionvideo;

    @FindBy(css = "#animation button:nth-of-type(2)")
    @CacheLookup
    private WebElement stop;

    @FindBy(css = "#animation button:nth-of-type(5)")
    @CacheLookup
    private WebElement videocam;

    @FindBy(xpath = "//span[contains(text(),'Use selected')]")
    @CacheLookup
    private WebElement selectLogFile;

    @FindBy(xpath = "//*[@id='AddAttributeFilterButton']/span")
    @CacheLookup
    private WebElement filterAttributes;

    @FindBy(xpath = "//mat-cell[contains(text(),'Country')]/../mat-cell/mat-checkbox[@class='mat-checkbox mat-accent mat-checkbox-checked']")
    @CacheLookup
    private WebElement verifyFilterSelected;

    @FindBy(xpath = "//button[@type='button']/span[contains(text(),'Save')]")
    @CacheLookup
    private WebElement saveSelectfilterAttributes;

    @FindBy(xpath = "//button[@type='button' and @disabled]/span[contains(text(),'Save')]")
    @CacheLookup
    private WebElement saveButtonDisabled;

    @FindBy(xpath = "//a[@role='button' and contains(text(),'EXIT')]")
    @CacheLookup
    private WebElement exitHelpOutline;

    @FindBy(xpath = "//*[@id='filterContainer']/div[6]/categorical-attribute-filter/mat-card/mat-card-header/div/mat-card-title/b")
    @CacheLookup
    private WebElement countryFilterChart;

    @FindBy(xpath = "//*[@id='mat-input-1']")
    @CacheLookup
    private WebElement serachFilter;

    @FindBy(xpath = "//div[@class='cdk-global-overlay-wrapper']")
    @CacheLookup
    private WebElement waitUntilAddAttributeFilter;

    @FindBy(xpath = "//input[@class='mat-input-element mat-form-field-autofill-control ng-untouched ng-pristine ng-valid' and @placeholder='Search' and @aria-invalid='false']")
    @CacheLookup
    private WebElement clickSearchField;

    @FindBy(xpath = "//input[@class='mat-input-element mat-form-field-autofill-control ng-pristine ng-valid ng-touched' and @placeholder='Search' and @aria-invalid='false']")
    @CacheLookup
    private WebElement verifySearchFieldClicked;

    @FindBy(css = "#filterContainer > div:nth-child(6) > categorical-attribute-filter > mat-card > mat-card-content > div > div > svg > g > path:nth-child(5)")
    @CacheLookup
    private WebElement clickChart;

    @FindBy(xpath = "//*[@id='filterContainer']/div[1]/log-filter-percentage/mat-card/mat-card-content/span")
    @CacheLookup
    private WebElement caseCount;


    /**
     * Click on Abonnieren Sie Unseren Newsletter Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickAbonnierenSieUnserenNewsletterButton() {
        abonnierenSieUnserenNewsletter.click();
        return this;
    }

    /**
     * Click on Add Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickAddButton() {
        add.click();
        return this;
    }

    /**
     * Click on Addcircle Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickAddcircleButton() {
        addcircle.click();
        return this;
    }

    /**
     * Click on Close Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickCloseButton() {
        close.click();
        return this;
    }

    /**
     * Click on Cropfree Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickCropfreeButton() {
        cropfree.click();
        return this;
    }

    /**
     * Click on Discovered Model Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickDiscoveredModelButton() {
        discoveredModel.click();
        return this;
    }

    /**
     * Click on Filedownload Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickFiledownloadButton() {
        filedownload.click();
        return this;
    }

    /**
     * Click on Filterlist Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickFilterListButton() {
        (new WebDriverWait(driver, timeout)).until(ExpectedConditions.elementToBeClickable(filterlist));
        try {
            filterlist.click();
        } catch (Exception NoSuchElementException) {
            (new WebDriverWait(driver, timeout)).until(ExpectedConditions.elementToBeClickable(filterlist));
            filterlist.click();
        }
        return this;
    }

    /**
     * Click on Helpoutline Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickHelpoutlineButton() {
        helpoutline.click();
        return this;
    }

    /**
     * Click on Incidentmanagement.csv radio Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickRadioButton(String radioButtonValue) {
        WebElement incidentManagementRadioButton = driver.findElement(By.xpath("(//span[contains(text(),'" + radioButtonValue + "')]/../../div)[1]"));
        incidentManagementRadioButton.click();
        return this;
    }

    /**
     * Click on Keyboardarrowright Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickKeyboardarrowrightButton() {
        keyboardarrowright.click();
        return this;
    }

    /**
     * Click on Model Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickModelButton() {
        model.click();
        return this;
    }

    /**
     * Click on Playarrow Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickPlayarrowButton() {
        playarrow.click();
        return this;
    }

    /**
     * Click on Remove Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickRemoveButton() {
        remove.click();
        return this;
    }

    /**
     * Click on Removecircle Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickRemovecircleButton() {
        removecircle.click();
        return this;
    }

    /**
     * Click on Settings Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickSettingsButton() {
        settings.click();
        return this;
    }

    /**
     * Click on Slowmotionvideo Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickSlowmotionvideoButton() {
        slowmotionvideo.click();
        return this;
    }

    /**
     * Click on Stop Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickStopButton() {
        stop.click();
        return this;
    }

    /**
     * Click on Videocam Button.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage clickVideocamButton() {
        videocam.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage fill() {
        setFindActivityTextField();
        return this;
    }


    /**
     * Set default value to Find Activity Text field.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage setFindActivityTextField() {
        return setFindActivityTextField(data.get("FIND_ACTIVITY"));
    }

    /**
     * Set value to Find Activity Text field.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage setFindActivityTextField(String findActivityValue) {
        findActivity.sendKeys(findActivityValue);
        return this;
    }

    /**
     * Get Page title.
     *
     * @return page title.
     */
    public String getTitle() {
        return driver.getTitle();
    }


    /**
     * Verify that the page loaded completely.
     *
     * @return the ModelPage class instance.
     */
    public ModelPage verifyPageLoaded() {
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
     * @return the ModelPage class instance.
     */
    public ModelPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }


    /**
     * Click on select log file button.
     *
     * @return page title.
     */
    public ModelPage clickSelectLogFileButton() {
        (new WebDriverWait(driver, timeout)).until(ExpectedConditions.elementToBeClickable(selectLogFile));
        selectLogFile.click();
        return this;
    }

    /**
     * Click filter attribute button.
     *
     * @return page title.
     */
    public ModelPage ClickFilterAttributeButton() {
        (new WebDriverWait(driver, timeout)).until(ExpectedConditions.elementToBeClickable(filterAttributes));
        filterAttributes.click();
        return this;
    }

    /**
     * Select filter.
     *
     * @return page title.
     */
    public ModelPage selectFilter(String filter) {
        WebElement selectCountryFilterAttributes = driver.findElement(By.xpath("//mat-cell[contains(text(),'" + filter + "')]/.."));
        (new WebDriverWait(driver, timeout)).until(ExpectedConditions.visibilityOf(selectCountryFilterAttributes));
        selectCountryFilterAttributes.click();
        try {
            (new WebDriverWait(driver, timeout)).until(ExpectedConditions.visibilityOf(verifyFilterSelected));
        } catch (Exception NoSuchElementException) {
            selectCountryFilterAttributes.click();
        }
        return this;
    }

    /**
     * Save filter.
     *
     * @return page title.
     */
    public ModelPage SaveFilter() {
        try {
            saveSelectfilterAttributes.click();
        } catch (Exception NoSuchElementException) {
            (new WebDriverWait(driver, timeout)).until(ExpectedConditions.elementToBeClickable(saveSelectfilterAttributes));
            saveSelectfilterAttributes.click();
        }
        return this;
    }

    /**
     * Click exit help outline.
     *
     * @return page title.
     */
    public ModelPage exitHelpOutLine() {
        (new WebDriverWait(driver, timeout)).until(ExpectedConditions.visibilityOf(exitHelpOutline));
        if (exitHelpOutline.isEnabled()) {
            exitHelpOutline.click();
        }
        try {
            (new WebDriverWait(driver, timeout)).until(ExpectedConditions.invisibilityOf(waitForExitHelper));
        } catch (Exception ignored) {
        }
        return this;
    }

    /**
     * Verify country filter applied by front page chart name.
     *
     * @return page title.
     */
    public String countryFilterChart() {
        return countryFilterChart.getText();
    }

    /**
     * Search for a filter.
     *
     * @return page title.
     */
    public ModelPage searchFilter(String filer) {
        (new WebDriverWait(driver, timeout)).until(ExpectedConditions.visibilityOf(waitUntilAddAttributeFilter));
        (new WebDriverWait(driver, timeout)).until(ExpectedConditions.visibilityOf(clickSearchField));
        try {
            clickSearchField.click();
        } catch (Exception NoSuchElementException) {
            (new WebDriverWait(driver, timeout)).until(ExpectedConditions.visibilityOf(clickSearchField));
            clickSearchField.click();
        }
        serachFilter.sendKeys(filer);
        return this;
    }

    /**
     * Click on pie chart one segment
     *
     * @return page title.
     */
    public ModelPage clickChart() {
        clickChart.click();
        return this;
    }

    /**
     * Click on pie chart one segment- Dynamic
     *
     * @return page title.
     */
    public ModelPage selectCountrySegment(String country) {
        int segments = driver.findElements(By.cssSelector(".pie-div path")).size();
        for (int x = 2; x < segments + 2; x++) {
            String css = "#filterContainer > div:nth-child(6) > categorical-attribute-filter > mat-card > mat-card-content > div > div > svg > g > path:nth-child(" + x + ")";
            WebElement pieSegment = driver.findElement(By.cssSelector(css));
            (new WebDriverWait(driver, timeout)).until(ExpectedConditions.visibilityOf(pieSegment));
            pieSegment.click();
            try {
                WebElement noValueFiltered = driver.findElement(By.xpath("//b[contains(text(),'Country filter')]/ancestor::mat-card//child::p[contains(text(),'no value filtered')]"));
                (new WebDriverWait(driver, timeout)).until(ExpectedConditions.invisibilityOf(noValueFiltered));
            } catch (Exception NoSuchElementException) {

            }
            WebElement segmentCountryValue = driver.findElement(By.xpath("//*[@id='attributeFilterTooltipCountry']/div[@style='font-weight: bold;']"));
            (new WebDriverWait(driver, timeout)).until(ExpectedConditions.visibilityOf(segmentCountryValue));
            WebElement undo = driver.findElement(By.xpath("//*[@id='filterContainer']/div[6]/categorical-attribute-filter/mat-card/mat-card-actions/button[1]/span/mat-icon"));
            if (segmentCountryValue.getText().equals(country)) {
                break;
            } else {
                (new WebDriverWait(driver, timeout)).until(ExpectedConditions.visibilityOf(undo));
                undo.click();
            }
        }
        return this;
    }

    /**
     * Get case count
     *
     * @return page title.
     */
    public String getCaseCount() {
        return caseCount.getText();
    }
}