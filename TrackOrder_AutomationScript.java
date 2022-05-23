import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrackOrder_AutomationScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// Track Order
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//input[@id='ip_379403698']")).sendKeys("345687643");
		driver.findElement(By.xpath("//input[@id='ip_394711104']")).sendKeys("9325029989");
		//driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
		driver.findElement(By.xpath("//*[@id=\"app-container\"]/div/main/section/form[1]/button")).click();
		

	}

}
