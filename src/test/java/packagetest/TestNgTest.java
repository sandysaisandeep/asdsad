package packagetest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestNgTest {


@Test

public void sample(){
	
	System.setProperty("webdriver.chrome.driver", "E:\\selenium_softwares\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
}


}
