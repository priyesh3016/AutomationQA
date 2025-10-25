package SDET.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		String option=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement  dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(option);
		driver.findElement(By.name("enter-name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
	    String text=  driver.switchTo().alert().getText();

	     if(text.contains(option))
	     {
	    System.out.println("Alert message success");
	     }
	     else
	    System.out.println("Something wrong with execution");
	}


}
