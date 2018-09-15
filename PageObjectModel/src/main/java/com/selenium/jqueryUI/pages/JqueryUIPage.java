package com.selenium.jqueryUI.pages;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JqueryUIPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='https://jqueryui.com/about/']")
    @CacheLookup
    private WebElement about;

    @FindBy(css = "a[href='http://jqueryui.com/accordion/']")
    @CacheLookup
    private WebElement accordion;

    @FindBy(css = "a[href='http://jqueryui.com/addClass/']")
    @CacheLookup
    private WebElement addClass;

    @FindBy(css = "a[href='http://learn.jquery.com/jquery-ui/environments/amd/']")
    @CacheLookup
    private WebElement amd;

    @FindBy(css = "a.icon-wrench")
    @CacheLookup
    private WebElement api;

    @FindBy(css = "#menu-top li:nth-of-type(3) a")
    @CacheLookup
    private WebElement apiDocumentation;

    @FindBy(css = "a[href='http://api.jqueryui.com/']")
    @CacheLookup
    private WebElement apiDocumentation1;

    @FindBy(css = "a[href='http://jqueryui.com/autocomplete/']")
    @CacheLookup
    private WebElement autocomplete;

    @FindBy(css = "a[href='https://blog.jqueryui.com/']")
    @CacheLookup
    private WebElement blog1;

    @FindBy(css = "a[href='http://blog.jqueryui.com/']")
    @CacheLookup
    private WebElement blog;

    @FindBy(css = "a[href='http://learn.jquery.com/jquery-ui/environments/bower/']")
    @CacheLookup
    private WebElement bower;

    @FindBy(css = "a[href='/browser-support/']")
    @CacheLookup
    private WebElement browserSupport;

    @FindBy(css = "a[href='http://bugs.jqueryui.com/']")
    @CacheLookup
    private WebElement bugTracker;

    @FindBy(css = "a[href='https://contribute.jquery.org/triage/']")
    @CacheLookup
    private WebElement bugTriage;

    @FindBy(css = "a[href='https://cdn.rawgit.com/arschmitz/jqueryui-bootstrap-adapter/v0.3.0/index.html']")
    @CacheLookup
    private WebElement buildingABootstrapThemeForJquery;

    @FindBy(css = "a[href='http://jqueryui.com/button/']")
    @CacheLookup
    private WebElement button;

    @FindBy(css = "a.sp-link")
    @CacheLookup
    private WebElement cdnByStackpath;

    @FindBy(css = "a[href='/changelog/1.12.0/']")
    @CacheLookup
    private WebElement changelog1120;

    @FindBy(css = "a[href='/changelog/1.12.1/']")
    @CacheLookup
    private WebElement changelog1121;

    @FindBy(css = "a[href='/changelog/']")
    @CacheLookup
    private WebElement changelogs;

    @FindBy(css = "a[href='http://jqueryui.com/checkboxradio/']")
    @CacheLookup
    private WebElement checkboxradio1;

    @FindBy(css = "a[href='/checkboxradio/']")
    @CacheLookup
    private WebElement checkboxradio;

    @FindBy(css = "a[href='https://js.foundation/CLA']")
    @CacheLookup
    private WebElement cla;

    @FindBy(css = "a[href='https://contribute.jquery.org/code/']")
    @CacheLookup
    private WebElement code;

    @FindBy(css = "a[href='http://jqueryui.com/animate/']")
    @CacheLookup
    private WebElement colorAnimation;

    @FindBy(css = "#global-nav nav div.constrain ul:nth-of-type(2) li:nth-of-type(4) ul li:nth-of-type(5) a")
    @CacheLookup
    private WebElement commercialSupport;

    @FindBy(css = "a[href='https://js.foundation/community/code-of-conduct']")
    @CacheLookup
    private WebElement conduct;

    @FindBy(css = "a[href='https://contribute.jquery.org/']")
    @CacheLookup
    private WebElement contribute;

    @FindBy(css = "a[href='/controlgroup/']")
    @CacheLookup
    private WebElement controlgroup1;

    @FindBy(css = "a[href='http://jqueryui.com/controlgroup/']")
    @CacheLookup
    private WebElement controlgroup2;

    @FindBy(css = "a[href='/download/']")
    @CacheLookup
    private WebElement customDownload;

    @FindBy(css = "a[href='http://jqueryui.com/datepicker/']")
    @CacheLookup
    private WebElement datepicker;

    @FindBy(css = "a[href='https://jqueryui.com/demos/']")
    @CacheLookup
    private WebElement demos;

    @FindBy(css = "a[href='/demos/']")
    @CacheLookup
    private WebElement demos1;

    @FindBy(css = "a[href='http://forum.jquery.com/developing-jquery-ui/']")
    @CacheLookup
    private WebElement developingJqueryUi;

    @FindBy(css = "a[href='https://jqueryui.com/development/']")
    @CacheLookup
    private WebElement development;

    @FindBy(css = "a[href='http://wiki.jqueryui.com/']")
    @CacheLookup
    private WebElement developmentPlanningWiki;

    @FindBy(css = "a[href='http://jqueryui.com/dialog/']")
    @CacheLookup
    private WebElement dialog;

    @FindBy(css = "a[href='http://forum.jquery.com/']")
    @CacheLookup
    private WebElement discussionForum;

    @FindBy(css = "a[href='https://contribute.jquery.org/documentation/']")
    @CacheLookup
    private WebElement documentation;

    @FindBy(css = "#global-nav nav div.constrain ul:nth-of-type(2) li:nth-of-type(5) ul li:nth-of-type(5) a")
    @CacheLookup
    private WebElement donate;

    @FindBy(css = "a[href='https://jqueryui.com/download/']")
    @CacheLookup
    private WebElement download;

    @FindBy(css = "a[href='http://jqueryui.com/draggable/']")
    @CacheLookup
    private WebElement draggable;

    @FindBy(css = "a[href='http://jqueryui.com/droppable/']")
    @CacheLookup
    private WebElement droppable;

    @FindBy(css = "a[href='http://jqueryui.com/easing/']")
    @CacheLookup
    private WebElement easing;

    @FindBy(css = "a[href='http://jqueryui.com/effect/']")
    @CacheLookup
    private WebElement effect;

    @FindBy(css = "a[href='https://js.foundation/events']")
    @CacheLookup
    private WebElement events;

    @FindBy(css = "a.icon-group")
    @CacheLookup
    private WebElement forum;

    @FindBy(css = "a[href='https://forum.jquery.com/']")
    @CacheLookup
    private WebElement forums;

    @FindBy(css = "a[href='http://learn.jquery.com/jquery-ui/getting-started/']")
    @CacheLookup
    private WebElement gettingStartedGuide;

    @FindBy(css = "a.icon-github")
    @CacheLookup
    private WebElement github;

    @FindBy(css = "a[href='http://jqueryui.com/hide/']")
    @CacheLookup
    private WebElement hide;

    @FindBy(css = "a.icon-comments")
    @CacheLookup
    private WebElement irc;

    @FindBy(css = "#global-nav nav div.constrain ul:nth-of-type(2) li:nth-of-type(4) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement ircchat;

    @FindBy(css = "a[href='https://js.foundation/about/join']")
    @CacheLookup
    private WebElement join;

    @FindBy(css = "a[title='jQuery']")
    @CacheLookup
    private WebElement jquery;

    @FindBy(css = "a[href='https://jquery.org/license/']")
    @CacheLookup
    private WebElement jqueryLicense;

    @FindBy(css = "a[title='jQuery Mobile']")
    @CacheLookup
    private WebElement jqueryMobile;

    @FindBy(css = "a[href='https://jqueryui.com/']")
    @CacheLookup
    private WebElement jqueryUi1;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement jqueryUi2;

    @FindBy(css = "a[href='https://www.packtpub.com/web-development/jquery-ui-cookbook']")
    @CacheLookup
    private WebElement jqueryUiCookbookAdamBoduch;

    @FindBy(css = "a[href='http://code.jquery.com/ui/jquery-ui-git.js']")
    @CacheLookup
    private WebElement jqueryUiGitWipBuild;

    @FindBy(css = "a[href='https://www.manning.com/books/jquery-ui-in-action']")
    @CacheLookup
    private WebElement jqueryUiInActionTj;

    @FindBy(css = "a[href='https://www.packtpub.com/web-development/jquery-ui-themes-beginners-guide']")
    @CacheLookup
    private WebElement jqueryUiThemesAdamBoduch;

    @FindBy(css = "a[href='https://js.foundation/']")
    @CacheLookup
    private WebElement jsFoundation;

    @FindBy(css = "a[href='https://js.foundation/about/leadership']")
    @CacheLookup
    private WebElement leadership;

    @FindBy(css = "#global-nav nav div.constrain ul:nth-of-type(2) li:nth-of-type(4) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement learningCenter1;

    @FindBy(css = "a.icon-pencil")
    @CacheLookup
    private WebElement learningCenter2;

    @FindBy(css = "a[href='/resources/download/jquery-ui-1.11.4.zip']")
    @CacheLookup
    private WebElement legacy;

    @FindBy(css = "a[href='https://js.foundation/about/members']")
    @CacheLookup
    private WebElement members;

    @FindBy(css = "a[href='http://jqueryui.com/menu/']")
    @CacheLookup
    private WebElement menu;

    @FindBy(css = "a[href='http://learn.jquery.com/jquery-ui/']")
    @CacheLookup
    private WebElement otherTutorials;

    private final String pageLoadedText = "effects, widgets, and themes built on top of the jQuery JavaScript Library";

    private final String pageUrl = "/";

    @FindBy(css = "a[href='https://plugins.jquery.com/']")
    @CacheLookup
    private WebElement plugins;

    @FindBy(css = "a[href='http://jqueryui.com/position/']")
    @CacheLookup
    private WebElement position;

    @FindBy(css = "a[href='/download/all/']")
    @CacheLookup
    private WebElement previousReleases;

    @FindBy(css = "a[href='http://jqueryui.com/progressbar/']")
    @CacheLookup
    private WebElement progressbar;

    @FindBy(css = "a[title='QUnit']")
    @CacheLookup
    private WebElement qunit;

    @FindBy(css = "a[href='http://jqueryui.com/removeClass/']")
    @CacheLookup
    private WebElement removeClass;

    @FindBy(css = "a[href='http://jqueryui.com/resizable/']")
    @CacheLookup
    private WebElement resizable;

    @FindBy(css = "a[href='http://wiki.jqueryui.com/Roadmap/']")
    @CacheLookup
    private WebElement roadmap;

    @FindBy(css = "button.icon-search")
    @CacheLookup
    private WebElement search;

    @FindBy(id = "tinynav2")
    @CacheLookup
    private WebElement searchJqueryUi1;

    @FindBy(name = "s")
    @CacheLookup
    private WebElement searchJqueryUi2;

    @FindBy(css = "a[href='http://jqueryui.com/selectable/']")
    @CacheLookup
    private WebElement selectable;

    @FindBy(css = "a[href='http://jqueryui.com/selectmenu/']")
    @CacheLookup
    private WebElement selectmenu;

    @FindBy(css = "a[href='http://jqueryui.com/show/']")
    @CacheLookup
    private WebElement show;

    @FindBy(css = "a[title='Sizzle']")
    @CacheLookup
    private WebElement sizzle;

    @FindBy(css = "a[href='http://jqueryui.com/slider/']")
    @CacheLookup
    private WebElement slider;

    @FindBy(css = "a[href='http://jqueryui.com/sortable/']")
    @CacheLookup
    private WebElement sortable;

    @FindBy(css = "a[href='https://github.com/jquery/jquery-ui']")
    @CacheLookup
    private WebElement sourceCodeGithub;

    @FindBy(css = "a[href='http://jqueryui.com/spinner/']")
    @CacheLookup
    private WebElement spinner;

    @FindBy(css = "a[href='/resources/download/jquery-ui-1.12.1.zip']")
    @CacheLookup
    private WebElement stable;

    @FindBy(css = "a[href='https://stackoverflow.com/tags/jquery/info']")
    @CacheLookup
    private WebElement stackOverflow;

    @FindBy(css = "a[href='https://contribute.jquery.org/style-guide/']")
    @CacheLookup
    private WebElement styleGuides;

    @FindBy(css = "a[href='http://bugs.jqueryui.com/newticket']")
    @CacheLookup
    private WebElement submitANewBugReport;

    @FindBy(css = "#global-nav nav div.constrain ul:nth-of-type(2) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement support1;

    @FindBy(css = "a[href='https://jqueryui.com/support/']")
    @CacheLookup
    private WebElement support2;

    @FindBy(css = "a[title='Support the JS Foundation']")
    @CacheLookup
    private WebElement supportTheJsFoundation;

    @FindBy(css = "a[href='http://jqueryui.com/switchClass/']")
    @CacheLookup
    private WebElement switchClass;

    @FindBy(css = "a[href='http://jqueryui.com/tabs/']")
    @CacheLookup
    private WebElement tabs;

    @FindBy(css = "a[href='https://jquery.org/team/']")
    @CacheLookup
    private WebElement theJqueryFoundation;

    @FindBy(css = "a[href='http://code.jquery.com/ui/jquery-ui-git.css']")
    @CacheLookup
    private WebElement themeWipBuild;

    @FindBy(css = "a[href='https://jqueryui.com/themeroller/']")
    @CacheLookup
    private WebElement themes;

    @FindBy(css = "a[href='http://jqueryui.com/toggle/']")
    @CacheLookup
    private WebElement toggle;

    @FindBy(css = "a[href='http://jqueryui.com/toggleClass/']")
    @CacheLookup
    private WebElement toggleClass;

    @FindBy(css = "a[href='http://jqueryui.com/tooltip/']")
    @CacheLookup
    private WebElement tooltip;

    @FindBy(css = "#content p:nth-of-type(6) a:nth-of-type(2)")
    @CacheLookup
    private WebElement twitter1;

    @FindBy(css = "a.icon-twitter")
    @CacheLookup
    private WebElement twitter2;

    @FindBy(css = "a[href='/upgrade-guide/1.12/']")
    @CacheLookup
    private WebElement upgradeGuide112;

    @FindBy(css = "a[href='/upgrade-guide/']")
    @CacheLookup
    private WebElement upgradeGuides;

    @FindBy(css = "a[href='http://forum.jquery.com/using-jquery-ui/']")
    @CacheLookup
    private WebElement usingJqueryUi;

    @FindBy(css = "a.do-link")
    @CacheLookup
    private WebElement webHostingByDigitalOcean;

    @FindBy(css = "a[href='https://contribute.jquery.org/web-sites/']")
    @CacheLookup
    private WebElement webSites;

    @FindBy(css = "a[href='http://jqueryui.com/widget/']")
    @CacheLookup
    private WebElement widgetFactory;
    
    @FindBy(xpath = " //input[@placeholder='Search']")
    @CacheLookup
    private WebElement searchJqueryUi;

    public JqueryUIPage() {
    }

    public JqueryUIPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public JqueryUIPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public JqueryUIPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on Accordion Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickAccordionLink() {
        accordion.click();
        return this;
    }

    /**
     * Click on Add Class Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickAddClassLink() {
        addClass.click();
        return this;
    }

    /**
     * Click on Amd Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickAmdLink() {
        amd.click();
        return this;
    }

    /**
     * Click on Api Documentation Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickApiDocumentation1Link() {
        apiDocumentation1.click();
        return this;
    }

    /**
     * Click on Api Documentation Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickApiDocumentationLink() {
        apiDocumentation.click();
        return this;
    }

    /**
     * Click on Api Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickApiLink() {
        api.click();
        return this;
    }

    /**
     * Click on Autocomplete Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickAutocompleteLink() {
        autocomplete.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickBlog1Link() {
        blog1.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickBlogLink() {
        blog.click();
        return this;
    }

    /**
     * Click on Bower Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickBowerLink() {
        bower.click();
        return this;
    }

    /**
     * Click on Browser Support Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickBrowserSupportLink() {
        browserSupport.click();
        return this;
    }

    /**
     * Click on Bug Tracker Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickBugTrackerLink() {
        bugTracker.click();
        return this;
    }

    /**
     * Click on Bug Triage Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickBugTriageLink() {
        bugTriage.click();
        return this;
    }

    /**
     * Click on Building A Bootstrap Theme For Jquery Ui Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickBuildingABootstrapThemeForJqueryLink() {
        buildingABootstrapThemeForJquery.click();
        return this;
    }

    /**
     * Click on Button Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickButtonLink() {
        button.click();
        return this;
    }

    /**
     * Click on Cdn By Stackpath Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickCdnByStackpathLink() {
        cdnByStackpath.click();
        return this;
    }

    /**
     * Click on 1.12.0 Changelog Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickChangelogLink1120() {
        changelog1120.click();
        return this;
    }

    /**
     * Click on 1.12.1 Changelog Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickChangelogLink1121() {
        changelog1121.click();
        return this;
    }

    /**
     * Click on Changelogs Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickChangelogsLink() {
        changelogs.click();
        return this;
    }

    /**
     * Click on Checkboxradio Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickCheckboxradio1Link() {
        checkboxradio1.click();
        return this;
    }

    /**
     * Click on Checkboxradio Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickCheckboxradioLink() {
        checkboxradio.click();
        return this;
    }

    /**
     * Click on Cla Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickClaLink() {
        cla.click();
        return this;
    }

    /**
     * Click on Code Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickCodeLink() {
        code.click();
        return this;
    }

    /**
     * Click on Color Animation Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickColorAnimationLink() {
        colorAnimation.click();
        return this;
    }

    /**
     * Click on Commercial Support Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickCommercialSupportLink() {
        commercialSupport.click();
        return this;
    }

    /**
     * Click on Conduct Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickConductLink() {
        conduct.click();
        return this;
    }

    /**
     * Click on Contribute Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickContributeLink() {
        contribute.click();
        return this;
    }

    /**
     * Click on Controlgroup Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickControlgroup1Link() {
        controlgroup1.click();
        return this;
    }

    /**
     * Click on Controlgroup Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickControlgroup2Link() {
        controlgroup2.click();
        return this;
    }

    /**
     * Click on Custom Download Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickCustomDownloadLink() {
        customDownload.click();
        return this;
    }

    /**
     * Click on Datepicker Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickDatepickerLink() {
        datepicker.click();
        return this;
    }

    /**
     * Click on Demos Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickDemos1Link() {
        demos1.click();
        return this;
    }

    /**
     * Click on Demos Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickDemosLink() {
        demos.click();
        return this;
    }

    /**
     * Click on Developing Jquery Ui Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickDevelopingJqueryUiLink() {
        developingJqueryUi.click();
        return this;
    }

    /**
     * Click on Development Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickDevelopmentLink() {
        development.click();
        return this;
    }

    /**
     * Click on Development Planning Wiki Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickDevelopmentPlanningWikiLink() {
        developmentPlanningWiki.click();
        return this;
    }

    /**
     * Click on Dialog Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickDialogLink() {
        dialog.click();
        return this;
    }

    /**
     * Click on Discussion Forum Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickDiscussionForumLink() {
        discussionForum.click();
        return this;
    }

    /**
     * Click on Documentation Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickDocumentationLink() {
        documentation.click();
        return this;
    }

    /**
     * Click on Donate Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickDonateLink() {
        donate.click();
        return this;
    }

    /**
     * Click on Download Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickDownloadLink() {
        download.click();
        return this;
    }

    /**
     * Click on Draggable Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickDraggableLink() {
        draggable.click();
        return this;
    }

    /**
     * Click on Droppable Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickDroppableLink() {
        droppable.click();
        return this;
    }

    /**
     * Click on Easing Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickEasingLink() {
        easing.click();
        return this;
    }

    /**
     * Click on Effect Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickEffectLink() {
        effect.click();
        return this;
    }

    /**
     * Click on Events Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickEventsLink() {
        events.click();
        return this;
    }

    /**
     * Click on Forum Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickForumLink() {
        forum.click();
        return this;
    }

    /**
     * Click on Forums Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickForumsLink() {
        forums.click();
        return this;
    }

    /**
     * Click on Getting Started Guide Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickGettingStartedGuideLink() {
        gettingStartedGuide.click();
        return this;
    }

    /**
     * Click on Github Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickGithubLink() {
        github.click();
        return this;
    }

    /**
     * Click on Hide Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickHideLink() {
        hide.click();
        return this;
    }

    /**
     * Click on Irc Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickIrcLink() {
        irc.click();
        return this;
    }

    /**
     * Click on Ircchat Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickIrcchatLink() {
        ircchat.click();
        return this;
    }

    /**
     * Click on Join Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickJoinLink() {
        join.click();
        return this;
    }

    /**
     * Click on Jquery License Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickJqueryLicenseLink() {
        jqueryLicense.click();
        return this;
    }

    /**
     * Click on Jquery Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickJqueryLink() {
        jquery.click();
        return this;
    }

    /**
     * Click on Jquery Mobile Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickJqueryMobileLink() {
        jqueryMobile.click();
        return this;
    }

    /**
     * Click on Jquery Ui Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickJqueryUi1Link() {
        jqueryUi1.click();
        return this;
    }

    /**
     * Click on Jquery Ui Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickJqueryUi2Link() {
        jqueryUi2.click();
        return this;
    }

    /**
     * Click on Jquery Ui Cookbook Adam Boduch Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickJqueryUiCookbookAdamBoduchLink() {
        jqueryUiCookbookAdamBoduch.click();
        return this;
    }

    /**
     * Click on Jquery Ui Git Wip Build Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickJqueryUiGitWipBuildLink() {
        jqueryUiGitWipBuild.click();
        return this;
    }

    /**
     * Click on Jquery Ui In Action Tj Vantoll Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickJqueryUiInActionTjLink() {
        jqueryUiInActionTj.click();
        return this;
    }

    /**
     * Click on Jquery Ui Themes Adam Boduch Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickJqueryUiThemesAdamBoduchLink() {
        jqueryUiThemesAdamBoduch.click();
        return this;
    }

    /**
     * Click on Js Foundation Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickJsFoundationLink() {
        jsFoundation.click();
        return this;
    }

    /**
     * Click on Leadership Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickLeadershipLink() {
        leadership.click();
        return this;
    }

    /**
     * Click on Learning Center Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickLearningCenter1Link() {
        learningCenter1.click();
        return this;
    }

    /**
     * Click on Learning Center Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickLearningCenter2Link() {
        learningCenter2.click();
        return this;
    }

    /**
     * Click on Legacy Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickLegacyLink() {
        legacy.click();
        return this;
    }

    /**
     * Click on Members Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickMembersLink() {
        members.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickMenuLink() {
        menu.click();
        return this;
    }

    /**
     * Click on Other Tutorials Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickOtherTutorialsLink() {
        otherTutorials.click();
        return this;
    }

    /**
     * Click on Plugins Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickPluginsLink() {
        plugins.click();
        return this;
    }

    /**
     * Click on Position Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickPositionLink() {
        position.click();
        return this;
    }

    /**
     * Click on Previous Releases Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickPreviousReleasesLink() {
        previousReleases.click();
        return this;
    }

    /**
     * Click on Progressbar Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickProgressbarLink() {
        progressbar.click();
        return this;
    }

    /**
     * Click on Qunit Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickQunitLink() {
        qunit.click();
        return this;
    }

    /**
     * Click on Remove Class Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickRemoveClassLink() {
        removeClass.click();
        return this;
    }

    /**
     * Click on Resizable Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickResizableLink() {
        resizable.click();
        return this;
    }

    /**
     * Click on Roadmap Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickRoadmapLink() {
        roadmap.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickSearchButton() {
        search.click();
        return this;
    }

    /**
     * Click on Selectable Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickSelectableLink() {
        selectable.click();
        return this;
    }

    /**
     * Click on Selectmenu Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickSelectmenuLink() {
        selectmenu.click();
        return this;
    }

    /**
     * Click on Show Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickShowLink() {
        show.click();
        return this;
    }

    /**
     * Click on Sizzle Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickSizzleLink() {
        sizzle.click();
        return this;
    }

    /**
     * Click on Slider Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickSliderLink() {
        slider.click();
        return this;
    }

    /**
     * Click on Sortable Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickSortableLink() {
        sortable.click();
        return this;
    }

    /**
     * Click on Source Code Github Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickSourceCodeGithubLink() {
        sourceCodeGithub.click();
        return this;
    }

    /**
     * Click on Spinner Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickSpinnerLink() {
        spinner.click();
        return this;
    }

    /**
     * Click on Stable Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickStableLink() {
        stable.click();
        return this;
    }

    /**
     * Click on Stack Overflow Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickStackOverflowLink() {
        stackOverflow.click();
        return this;
    }

    /**
     * Click on Style Guides Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickStyleGuidesLink() {
        styleGuides.click();
        return this;
    }

    /**
     * Click on Submit A New Bug Report Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickSubmitANewBugReportLink() {
        submitANewBugReport.click();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickSupport1Link() {
        support1.click();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickSupport2Link() {
        support2.click();
        return this;
    }

    /**
     * Click on Support The Js Foundation Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickSupportTheJsFoundationLink() {
        supportTheJsFoundation.click();
        return this;
    }

    /**
     * Click on Switch Class Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickSwitchClassLink() {
        switchClass.click();
        return this;
    }

    /**
     * Click on Tabs Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickTabsLink() {
        tabs.click();
        return this;
    }

    /**
     * Click on The Jquery Foundation Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickTheJqueryFoundationLink() {
        theJqueryFoundation.click();
        return this;
    }

    /**
     * Click on Theme Wip Build Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickThemeWipBuildLink() {
        themeWipBuild.click();
        return this;
    }

    /**
     * Click on Themes Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickThemesLink() {
        themes.click();
        return this;
    }

    /**
     * Click on Toggle Class Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickToggleClassLink() {
        toggleClass.click();
        return this;
    }

    /**
     * Click on Toggle Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickToggleLink() {
        toggle.click();
        return this;
    }

    /**
     * Click on Tooltip Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickTooltipLink() {
        tooltip.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickTwitter1Link() {
        twitter1.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickTwitter2Link() {
        twitter2.click();
        return this;
    }

    /**
     * Click on 1.12 Upgrade Guide Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickUpgradeGuideLink112() {
        upgradeGuide112.click();
        return this;
    }

    /**
     * Click on Upgrade Guides Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickUpgradeGuidesLink() {
        upgradeGuides.click();
        return this;
    }

    /**
     * Click on Using Jquery Ui Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickUsingJqueryUiLink() {
        usingJqueryUi.click();
        return this;
    }

    /**
     * Click on Web Hosting By Digital Ocean Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickWebHostingByDigitalOceanLink() {
        webHostingByDigitalOcean.click();
        return this;
    }

    /**
     * Click on Web Sites Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickWebSitesLink() {
        webSites.click();
        return this;
    }

    /**
     * Click on Widget Factory Link.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage clickWidgetFactoryLink() {
        widgetFactory.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage fill() {
        setSearchJqueryUi1TextField();
        setSearchJqueryUi2TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Search Jquery Ui Text field.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage setSearchJqueryUi1TextField() {
        return setSearchJqueryUi1TextField(data.get("SEARCH_JQUERY_UI_1"));
    }

    /**
     * Set value to Search Jquery Ui Text field.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage setSearchJqueryUi1TextField(String searchJqueryUi1Value) {
        new Select(searchJqueryUi1).selectByVisibleText(searchJqueryUi1Value);
        return this;
    }

    /**
     * Set default value to Search Jquery Ui Text field.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage setSearchJqueryUi2TextField() {
        return setSearchJqueryUi2TextField(data.get("SEARCH_JQUERY_UI_2"));
    }

    /**
     * Set value to Search Jquery Ui Text field.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage setSearchJqueryUi2TextField(String searchJqueryUi2Value) {
        searchJqueryUi2.sendKeys(searchJqueryUi2Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage submit() {
        clickSearchButton();
        return this;
    }

    /**
     * Unset default value from Search Jquery Ui Drop Down List field.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage unsetSearchJqueryUiDropDownListField() {
        return unsetSearchJqueryUiDropDownListField(data.get("SEARCH_JQUERY_UI"));
    }

    /**
     * Unset value from Search Jquery Ui Drop Down List field.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage unsetSearchJqueryUiDropDownListField(String searchJqueryUiValue) {
        new Select(searchJqueryUi).deselectByVisibleText(searchJqueryUiValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage verifyPageLoaded() {
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
     * @return the JqueryUIPage class instance.
     */
    public JqueryUIPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
