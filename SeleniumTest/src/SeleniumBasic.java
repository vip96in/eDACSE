import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","G:/ACTS/SoftwareEngg/Tools/geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://localhost:8080/assignment1/index.html";
		driver.get(url);
		System.out.println(driver.getTitle());
		WebElement textBox=driver.findElement(By.id("user"));
		System.out.println(textBox.toString());
		textBox.sendKeys("Random");
		WebElement submitButton=driver.findElement(By.id(""));
		submitButton.click();
		driver.close();
		driver.quit();
		
		
	}
}
