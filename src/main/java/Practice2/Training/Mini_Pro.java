package Practice2.Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class Mini_Pro {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		
		// ******NAVIGATIOS METHOD**********
		/*
		 * driver.navigate().to("https://www.instagram.com/accounts/login/");
		 * Thread.sleep(3000); driver.navigate().back(); Thread.sleep(3000);
		 * driver.navigate().forward(); Thread.sleep(3000); driver.navigate().refresh();
		 * Thread.sleep(3000);
		 * 
		 * String Title = driver.getTitle(); System.out.println(Title); String URL =
		 * driver.getCurrentUrl(); System.out.println(URL);
		 * 
		 * driver.get("https://www.facebook.com/login/");
		 * 
		 * WebElement Email = driver.findElement(By.id("email"));
		 * 
		 * Email.sendKeys("8680939897");
		 * 
		 * WebElement Password = driver.findElement(By.id("pass"));
		 * Password.sendKeys("Rajselva@007");
		 * 
		 * WebElement Login = driver.findElement(By.name("login")); Login.click();
		 * 
		 * WebElement Sign_up = driver.findElement(By.className("_97w5"));
		 * Sign_up.click(); Thread.sleep(1500); WebElement Fname =
		 * driver.findElement(By.name("firstname")); Fname.sendKeys("Selva");
		 * Thread.sleep(1500); WebElement Sname =
		 * driver.findElement(By.name("lastname")); Sname.sendKeys("Raj");
		 * Thread.sleep(1500); WebElement Mobile =
		 * driver.findElement(By.name("reg_email__")); Mobile.sendKeys("9999999999");
		 * Thread.sleep(1500); WebElement Pass =
		 * driver.findElement(By.id("password_step_input"));
		 * Pass.sendKeys("Rajselva@2326");
		 */

		// *************** Single Dropdown **************/

		/*
		 * WebElement Day = driver.findElement(By.id("day")); Select S = new
		 * Select(Day); S.selectByValue("15");
		 * 
		 * WebElement Month = driver.findElement(By.id("month")); Select S1 = new
		 * Select(Month); S1.selectByIndex(9);
		 * 
		 * WebElement Year = driver.findElement(By.id("year")); Select S2 = new
		 * Select(Year); S2.selectByVisibleText("2023");
		 * 
		 * WebElement Sign_Up = driver.findElement(By.name("websubmit"));
		 * Sign_Up.click();
		 */

		// *************** Multiple Dropdown ***************//

		/*
		 * driver.get("https://demo.automationtesting.in/Alerts.html");
		 * driver.manage().window().maximize();
		 * 
		 * WebElement Multi = driver.findElement(By.id("multiple-select-select"));
		 * Select S3 = new Select(Multi);
		 * 
		 * boolean multiple = S3.isMultiple();
		 * System.out.println("To Check is Multiple " + multiple);
		 * 
		 * S3.selectByVisibleText("Health & Beauty"); S3.selectByIndex(2);
		 * S3.selectByValue("4");
		 * 
		 * System.out.println("******************************");
		 */

		// ***************Get Options********************

		/*
		 * List<WebElement> options = S3.getOptions(); for (WebElement getOptions : options) // Ctrl+2+L 
		 * { 
		 * System.out.println("Get All Options: " + getOptions.getText()); 
		 * }
		 * 
		 * System.out.println("******************************");
		 * 
		 * List<WebElement> allSelectedOptions = S3.getAllSelectedOptions();
		 * for(WebElement selectedOptions : allSelectedOptions) 
		 * {
		 * System.out.println("Get All Selected Options " + selectedOptions.getText());
		 * }
		 * 
		 * System.out.println("******************************");
		 * 
		 * WebElement firstSelectedOption = S3.getFirstSelectedOption(); 
		 * for (WebElement firstOption : allSelectedOptions) 
		 * {
		 * System.out.println("Get First Selected Option " + firstOption.getText()); 
		 * }
		 */

		// **************Alerts*********************
		// ***********Simple*************
		/*
		 * WebElement simpleAlert =
		 * driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		 * 
		 * simpleAlert.click(); driver.switchTo().alert().accept();
		 * System.out.println("Simple Alert accept");
		 * 
		 * // ***************Confirm Alert********
		 * 
		 * WebElement confirmAlert =
		 * driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		 * confirmAlert.click(); WebElement confirmBtn =
		 * driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		 * confirmBtn.click(); driver.switchTo().alert().accept();
		 * System.out.println("Alert accepted"); confirmBtn.click();
		 * driver.switchTo().alert().dismiss(); System.out.println("Alert Dismissed");
		 * 
		 * //**************Alert with Text***********
		 * 
		 * WebElement textAlert =
		 * driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		 * textAlert.click(); WebElement textBtn =
		 * driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		 * textBtn.click(); driver.switchTo().alert().getText();
		 * System.out.println(driver.switchTo().alert().getText());
		 * driver.switchTo().alert().sendKeys("Selvaraj");
		 * driver.switchTo().alert().accept();
		 */
		
		
		
	}

}
