package page;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Page
{
	public static FirefoxDriver driver;
	public void Setup()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
	}
    public void setup()
    {
    	driver.get("www.facebook.com");
    }
}
