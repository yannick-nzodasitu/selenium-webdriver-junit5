package com.xyzcorp;

import io.cucumber.java.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest {

    private static ChromeDriver chromeDriver;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yannick.nzodasitu\\chromedriver_win32\\98\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testpage() {

        chromeDriver.get("https://www.google.com/");
        chromeDriver.manage().window().setSize(new Dimension(1758, 1070));
        chromeDriver.findElement(By.name("q")).click();
        chromeDriver.findElement(By.name("q")).sendKeys("Behavior Driven Development");
        chromeDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }

    @AfterAll
    public static void cleanup() {
        chromeDriver.close();
    }

}
