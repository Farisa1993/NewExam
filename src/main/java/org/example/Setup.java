package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    void setupdriver(String url){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
      Webdriver driver = new ChromeDriver();
        driver.get(url);
    }

}
