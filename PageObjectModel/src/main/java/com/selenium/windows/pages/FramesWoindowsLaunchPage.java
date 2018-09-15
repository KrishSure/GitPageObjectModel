package com.selenium.windows.pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesWoindowsLaunchPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='Accordion.html']")
    @CacheLookup
    private WebElement accordion;

    @FindBy(css = "a[href='Alerts.html']")
    @CacheLookup
    private WebElement alerts;

    @FindBy(css = "a[href='AutoComplete.html']")
    @CacheLookup
    private WebElement autocomplete;

    @FindBy(css = "a[title='Sakinalium Demo Site']")
    @CacheLookup
    private WebElement automationTesting;

    @FindBy(css = "a[href='Charts.html']")
    @CacheLookup
    private WebElement charts;

    @FindBy(css = "a[href='CKEditor.html']")
    @CacheLookup
    private WebElement ckeditor;

    @FindBy(css = "a[href='http://www.sakinalium.in']")
    @CacheLookup
    private WebElement click1;

    @FindBy(css = "#Tabbed a button.btn.btn-info")
    @CacheLookup
    private WebElement click2;

    @FindBy(css = "button.btn.btn-primary")
    @CacheLookup
    private WebElement click3;

    @FindBy(css = "#Multiple button.btn.btn-info")
    @CacheLookup
    private WebElement click4;

    @FindBy(css = "a[href='CodeMirror.html']")
    @CacheLookup
    private WebElement codemirror;

    @FindBy(css = "a[href='Datepicker.html']")
    @CacheLookup
    private WebElement datepicker;

    @FindBy(css = "#header nav.navbar.navbar-inverse div.container div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(6) ul.dropdown-menu li:nth-of-type(1) a.dropdown-toggle")
    @CacheLookup
    private WebElement dragAndDrop;

    @FindBy(css = "a[href='Dynamic.html']")
    @CacheLookup
    private WebElement dynamic;

    @FindBy(css = "a[href='DynamicData.html']")
    @CacheLookup
    private WebElement dynamicData;

    @FindBy(css = "a[href='FileDownload.html']")
    @CacheLookup
    private WebElement fileDownload;

    @FindBy(css = "a[href='FileUpload.html']")
    @CacheLookup
    private WebElement fileUpload;

    @FindBy(css = "a[href='Frames.html']")
    @CacheLookup
    private WebElement frames;

    @FindBy(css = "a[href='Index.html']")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "a[href='Interactions.html']")
    @CacheLookup
    private WebElement interactions;

    @FindBy(css = "a[href='JqueryProgressBar.html']")
    @CacheLookup
    private WebElement jqueryProgressbar;

    @FindBy(css = "a[href='Loader.html']")
    @CacheLookup
    private WebElement loader;

    @FindBy(css = "a[href='Modals.html']")
    @CacheLookup
    private WebElement modals;

    @FindBy(css = "#header nav.navbar.navbar-inverse div.container div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(9) a.dropdown-toggle")
    @CacheLookup
    private WebElement more;

    @FindBy(css = "a[href='/frame']")
    @CacheLookup
    private WebElement openFramesetWindow;

    @FindBy(css = "a[href='#Seperate']")
    @CacheLookup
    private WebElement openNewSeperateWindows;

    @FindBy(css = "a[href='#Tabbed']")
    @CacheLookup
    private WebElement openNewTabbedWindows;

    @FindBy(css = "a[href='#Multiple']")
    @CacheLookup
    private WebElement openSeperateMultipleWindows;

    private final String pageLoadedText = "";

    private final String pageUrl = "/Windows.html";

    @FindBy(css = "a[href='http://practice.automationtesting.in/']")
    @CacheLookup
    private WebElement practiceSite;

    @FindBy(css = "a[href='ProgressBar.html']")
    @CacheLookup
    private WebElement progressbar;

    @FindBy(css = "a[href='Register.html']")
    @CacheLookup
    private WebElement register;

    @FindBy(css = "a[href='Resizable.html']")
    @CacheLookup
    private WebElement resizable;

    @FindBy(css = "a[href='Selectable.html']")
    @CacheLookup
    private WebElement selectable;

    @FindBy(css = "a[href='Slider.html']")
    @CacheLookup
    private WebElement slider;

    @FindBy(css = "a[href='staticVariable.html']")
    @CacheLookup
    private WebElement staticVariable;

    @FindBy(css = "a[href='SummerNote.html']")
    @CacheLookup
    private WebElement summernote;

    @FindBy(css = "#header nav.navbar.navbar-inverse div.container div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(4) a.dropdown-toggle")
    @CacheLookup
    private WebElement switchto;

    @FindBy(css = "a[href='TinyMCE.html']")
    @CacheLookup
    private WebElement tinymce;

    @FindBy(css = "button.btn.btn-success.navbar-toggle")
    @CacheLookup
    private WebElement toggleNavigation;

    @FindBy(css = "#header nav.navbar.navbar-inverse div.container div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(7) a.dropdown-toggle")
    @CacheLookup
    private WebElement video;

    @FindBy(css = "a[href='Vimeo.html']")
    @CacheLookup
    private WebElement vimeo;

    @FindBy(css = "a[href='WebTable.html']")
    @CacheLookup
    private WebElement webtable;

    @FindBy(css = "a[href='Widgets.html']")
    @CacheLookup
    private WebElement widgets;

    @FindBy(css = "a[href='Windows.html']")
    @CacheLookup
    private WebElement windows;

    @FindBy(css = "a[href='WYSIWYG.html']")
    @CacheLookup
    private WebElement wysiwyg;

    @FindBy(css = "a[href='Youtube.html']")
    @CacheLookup
    private WebElement youtube;

    public FramesWoindowsLaunchPage() {
    }

    public FramesWoindowsLaunchPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public FramesWoindowsLaunchPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public FramesWoindowsLaunchPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Accordion Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickAccordionLink() {
        accordion.click();
        return this;
    }

    /**
     * Click on Alerts Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickAlertsLink() {
        alerts.click();
        return this;
    }

    /**
     * Click on Autocomplete Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickAutocompleteLink() {
        autocomplete.click();
        return this;
    }

    /**
     * Click on Automation Testing Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickAutomationTestingLink() {
        automationTesting.click();
        return this;
    }

    /**
     * Click on Charts Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickChartsLink() {
        charts.click();
        return this;
    }

    /**
     * Click on Ckeditor Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickCkeditorLink() {
        ckeditor.click();
        return this;
    }

    /**
     * Click on Click Button.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickClick1Button() {
        click1.click();
        return this;
    }

    /**
     * Click on Click Button.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickClick2Button() {
        click2.click();
        return this;
    }

    /**
     * Click on Click Button.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickClick3Button() {
        click3.click();
        return this;
    }

    /**
     * Click on Click Button.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickClick4Button() {
        click4.click();
        return this;
    }

    /**
     * Click on Codemirror Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickCodemirrorLink() {
        codemirror.click();
        return this;
    }

    /**
     * Click on Datepicker Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickDatepickerLink() {
        datepicker.click();
        return this;
    }

    /**
     * Click on Drag And Drop Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickDragAndDropLink() {
        dragAndDrop.click();
        return this;
    }

    /**
     * Click on Dynamic Data Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickDynamicDataLink() {
        dynamicData.click();
        return this;
    }

    /**
     * Click on Dynamic Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickDynamicLink() {
        dynamic.click();
        return this;
    }

    /**
     * Click on File Download Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickFileDownloadLink() {
        fileDownload.click();
        return this;
    }

    /**
     * Click on File Upload Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickFileUploadLink() {
        fileUpload.click();
        return this;
    }

    /**
     * Click on Frames Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickFramesLink() {
        frames.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Interactions Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickInteractionsLink() {
        interactions.click();
        return this;
    }

    /**
     * Click on Jquery Progressbar Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickJqueryProgressbarLink() {
        jqueryProgressbar.click();
        return this;
    }

    /**
     * Click on Loader Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickLoaderLink() {
        loader.click();
        return this;
    }

    /**
     * Click on Modals Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickModalsLink() {
        modals.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickMoreLink() {
        more.click();
        return this;
    }

    /**
     * Click on Open Frameset Window Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickOpenFramesetWindowLink() {
        openFramesetWindow.click();
        return this;
    }

    /**
     * Click on Open New Seperate Windows Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickOpenNewSeperateWindowsLink() {
        openNewSeperateWindows.click();
        return this;
    }

    /**
     * Click on Open New Tabbed Windows Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickOpenNewTabbedWindowsLink() {
        openNewTabbedWindows.click();
        return this;
    }

    /**
     * Click on Open Seperate Multiple Windows Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickOpenSeperateMultipleWindowsLink() {
        openSeperateMultipleWindows.click();
        return this;
    }

    /**
     * Click on Practice Site Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickPracticeSiteLink() {
        practiceSite.click();
        return this;
    }

    /**
     * Click on Progressbar Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickProgressbarLink() {
        progressbar.click();
        return this;
    }

    /**
     * Click on Register Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickRegisterLink() {
        register.click();
        return this;
    }

    /**
     * Click on Resizable Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickResizableLink() {
        resizable.click();
        return this;
    }

    /**
     * Click on Selectable Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickSelectableLink() {
        selectable.click();
        return this;
    }

    /**
     * Click on Slider Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickSliderLink() {
        slider.click();
        return this;
    }

    /**
     * Click on staticVariable Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickstaticVariableLink() {
        staticVariable.click();
        return this;
    }

    /**
     * Click on Summernote Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickSummernoteLink() {
        summernote.click();
        return this;
    }

    /**
     * Click on Switchto Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickSwitchtoLink() {
        switchto.click();
        return this;
    }

    /**
     * Click on Tinymce Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickTinymceLink() {
        tinymce.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Video Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickVideoLink() {
        video.click();
        return this;
    }

    /**
     * Click on Vimeo Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickVimeoLink() {
        vimeo.click();
        return this;
    }

    /**
     * Click on Webtable Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickWebtableLink() {
        webtable.click();
        return this;
    }

    /**
     * Click on Widgets Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickWidgetsLink() {
        widgets.click();
        return this;
    }

    /**
     * Click on Windows Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickWindowsLink() {
        windows.click();
        return this;
    }

    /**
     * Click on Wysiwyg Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickWysiwygLink() {
        wysiwyg.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage submit() {
        clickToggleNavigationButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage verifyPageLoaded() {
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
     * @return the FramesWoindowsLaunchPage class instance.
     */
    public FramesWoindowsLaunchPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
