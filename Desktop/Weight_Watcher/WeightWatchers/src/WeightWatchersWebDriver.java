import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WeightWatchersWebDriver {
	
	public static void main(String args[]) { 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://www.weightwatchers.com/us/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Weight Loss Program, Recipes & Help | Weight Watchers";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			 System.out.println("Title Matched");
			 else
			 System.out.println("Title didn't match");
		
		driver.findElement(By.xpath("//a[@id='ela-menu-visitor-desktop-supplementa_find-a-meeting']")).click();
		
		String MeetingactualTitle = driver.getTitle();
		String MeetingexpectedTitle = "Get Schedules & Times Near You";
		if(MeetingactualTitle.contains(MeetingexpectedTitle))
			 System.out.println("Title contains the expected text");
			 else
			 System.out.println("Title didn't did NOT contain the expected text");
		driver.findElement(By.xpath("//input[@id='meetingSearch']")).sendKeys("10011");
		driver.findElement(By.xpath("//span[@class='input-group-btn']/button")).click();
		String Address = driver.findElement(By.xpath("//span[text()='WEIGHT WATCHERS STORE 23RD ST-5TH AVE']")).getText();
		System.out.println("Addres is "+Address);
		String Title = driver.findElement(By.xpath("//div[text()='0.49 mi.']")).getText();
		System.out.println(Title);
		driver.findElement(By.xpath("//span[text()='WEIGHT WATCHERS STORE 23RD ST-5TH AVE']")).click();
		String newAddress = driver.findElement(By.xpath("//span[text()='WEIGHT WATCHERS STORE 23RD ST-5TH AVE']")).getText();
		System.out.println("New Address is "+newAddress);
		if(Address.equals(newAddress))			
			System.out.println("Location name is matching with the first searach results");
		 else
		 System.out.println("Location name is NOT matching with the first searach results");
		Date date=java.util.Calendar.getInstance().getTime();  
		System.out.println(date);
		String currentDate = date.toString();
		System.out.println(currentDate);
		String[] parts = currentDate.split(" ");
		String part1 = parts[0];
		System.out.println(part1);
		List<WebElement> alldays = driver.findElements(By.xpath("//div[@class='meeting-schedule__schedule']"));
		int size = alldays.size();
		
		for(int i=0; i<=size; i++)  { 
			String sValue = alldays.get(i).getText();
			System.out.println(sValue);
			
			if (sValue.equalsIgnoreCase(part1)){
			String currentday =alldays.get(i).getText();
			System.out.println(currentday);
			break;
			}
		}
			
		
	}

}
