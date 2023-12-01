package com.herokuapp.theinternet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveTests {

    public void loginTest() {
        // 01 - Create driver
        WebDriver driver = new ChromeDriver(); // Selenium 4 syntax for declare 'driver0 variable.
        sleep(1);

        // `Open` Test Page
        String url = "http://the-internet.herokuapp.com/login";
        driver.get(url);
        sleep(1);

        driver.manage().window().maximize();
        sleep(1);


        // Enter `UserName`
        // Enter `Password`
        // 'Click' Login Button
        // VERIFICATIONS
        // New 'URL'
        // Logout 'button' is visible
        // Succesfull 'Login Message'
    }

    /**
     * DUMB Wait - Stop execution for the given amount of time.
     * @param seconds
     */
    private static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
