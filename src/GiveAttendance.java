import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiveAttendance {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Learn\\Attendance\\Driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://mjunction.darwinbox.in/user/login");
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.manage().window().maximize();
String title=driver.getTitle();
if(title.equalsIgnoreCase("mjunction services limited : Login"))
System.out.print("Title Matched");

else
	System.out.print(title);

WebElement Click=driver.findElement(By.xpath("/html/body/div[1]/form/div/div/a"));
Click.click();

WebElement LoginName=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div/form/div[2]/div[1]/input"));
LoginName.sendKeys("abhishek.chakladar@mjunction.in");

WebElement Password=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div/form/div[2]/div[2]/input"));
Password.sendKeys("Test@321!");

WebElement ButtonClick=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div/div/form/div[2]/div[4]/span"));
ButtonClick.click();
Thread.sleep(1000);

//driver.switchTo().alert().dismiss();
WebElement Alert=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/div/div/div/div[5]/button"));
Alert.click();
Thread.sleep(1000);



WebElement ProfileClick=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/header/div[4]/ul/li[3]/div/div/img"));
ProfileClick.click();

//WebElement Logout=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/header/div[4]/ul/li[3]/div/ul/li[4]/a"));
//Logout.click();

//driver.close();




}
}