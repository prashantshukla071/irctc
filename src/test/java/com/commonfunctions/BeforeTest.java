package com.commonfunctions;

import org.openqa.selenium.chrome.ChromeDriver;

public @interface BeforeTest {
	ChromeDriver driver = new ChromeDriver();
	driver.get("");

}
