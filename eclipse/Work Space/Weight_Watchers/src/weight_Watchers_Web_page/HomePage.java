package weight_Watchers_Web_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver  driver = new  FirefoxDriver();
		//Navigate to https://www.weightwatchers.com/us/
		driver.get("www.weightwatchers.com/us/");
		
		//Verify loaded page title matches “Weight Loss Program, Recipes & Help | Weight Watchers”
		String PageTitle =driver.getTitle();
		System.out.println(PageTitle);
		//assert (Pagetitle == "Weight Loss Program, Recipes & Help | Weight Watchers");
	}

}
