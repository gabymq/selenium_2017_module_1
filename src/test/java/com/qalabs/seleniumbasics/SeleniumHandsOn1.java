package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHandsOn1 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";

        // Get correct driver for desire browser
        //descargar gekodriver Firefox
        WebDriver mydriver = WebDriverFactory.getDriver(browser);
       // System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

        mydriver = new FirefoxDriver();
        // Get google home page

        //descargar chromedriver
//         System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/divers/chromedriver.exe");
        mydriver = new ChromeDriver();

        mydriver.get("https://www.google.com.mx");

        // Wait some seconds
        Thread.sleep(5000);

        // Quit web driver
        mydriver.quit();
    }
}






