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

public class HomePageUsingPlugin {
    private Map<String, String> data;
    private WebDriver driver;
   

	private int timeout = 15;

    private final String pageLoadedText = "";

    private final String pageUrl = "/Index.html";

    @FindBy(css = "a[href='SignIn.html']")
    @CacheLookup
    private WebElement signIn1;

    @FindBy(id = "btn1")
    @CacheLookup
    private WebElement signIn2;

    @FindBy(css = "#abcd a:nth-of-type(2)")
    @CacheLookup
    private WebElement skipSignIn1;

    @FindBy(id = "btn2")
    @CacheLookup
    private WebElement skipSignIn2;

    public HomePageUsingPlugin() {
    }

    public HomePageUsingPlugin(WebDriver driver) {
        this();
        this.driver = driver;
        
    }

    public HomePageUsingPlugin(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public HomePageUsingPlugin(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Sign In Button.
     *
     * @return the HomePageUsingPlugin class instance.
     */
    public HomePageUsingPlugin clickSignIn1Button() {
        signIn1.click();
        return this;
    }

    /**
     * Click on Sign In Button.
     *
     * @return the HomePageUsingPlugin class instance.
     */
    public HomePageUsingPlugin clickSignIn2Button() {
        signIn2.click();
        return this;
    }

    /**
     * Click on Skip Sign In Button.
     *
     * @return the HomePageUsingPlugin class instance.
     */
    public HomePageUsingPlugin clickSkipSignIn1Button() {
        skipSignIn1.click();
        return this;
    }

    /**
     * Click on Skip Sign In Button.
     *
     * @return the HomePageUsingPlugin class instance.
     */
    public HomePageUsingPlugin clickSkipSignIn2Button() {
        skipSignIn2.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the HomePageUsingPlugin class instance.
     */
    public HomePageUsingPlugin verifyPageLoaded() {
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
     * @return the HomePageUsingPlugin class instance.
     */
    public HomePageUsingPlugin verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
