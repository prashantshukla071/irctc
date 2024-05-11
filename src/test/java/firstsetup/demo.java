package firstsetup;

import org.openqa.selenium.chrome.ChromeDriver;

import com.commonfunctions.commonfunctions;

public class demo extends commonfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
