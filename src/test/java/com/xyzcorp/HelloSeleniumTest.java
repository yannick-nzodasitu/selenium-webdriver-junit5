package com.xyzcorp;

import io.cucumber.java.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest {

    private ChromeDriver chromeDriver;

    @BeforeAll
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yannick.nzodasitu\\chromedriver_win32\\98\\chromedriver");
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testpage() {

        chromeDriver.get("https://www.google.com/search?q=Behavior-driven&rlz=1C1GCEB_enCA988CA988&oq=beh&aqs=chrome.0.69i59j69i57j69i61.2575j0j4&sourceid=chrome&ie=UTF-8");
        chromeDriver.manage().window().setSize(new Dimension(1920, 1040));
        chromeDriver.findElement(By.cssSelector(".CCgQ5 > span")).click();
        chromeDriver.findElement(By.cssSelector(".css-steigm-MainContent > div > .css-5ph0o-Mask > .css-mf0yu5-ContentWrapper")).click();
    }

    @AfterAll
    public void cleanup() {
        chromeDriver.close();
    }

}
