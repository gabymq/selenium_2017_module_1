package com.qalabs.seleniumbasics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class WebDriverFactory {

    public static WebDriver getDriver(String browser) {
        String driversPath = System.getProperty("user.dir") + "/drivers";

        if(browser.toLowerCase().equals("chrome")) {
            File chromeFile = new File(driversPath, "chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", chromeFile.getPath());
            return new ChromeDriver();

        } else if (browser.toLowerCase().equals("firefox")) {
            File firefoxFile = new File(driversPath, "geckodriver.exe");
            System.setProperty("webdriver.gecko.driver",firefoxFile.getPath());
            return new FirefoxDriver();

        } else {
            return null;
        }
    }
}
