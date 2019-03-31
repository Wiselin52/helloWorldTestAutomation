package stepDefinition;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class helloWorld {
	WebDriver driver ;
	


	@Given("^User is on Home Page \"([^\"]*)\" on browser \"([^\"]*)\"$")
	public void user_is_on_Home_Page(String url, String browser) throws Throwable {

		DesiredCapabilities caps =  new DesiredCapabilities();
		caps.setCapability("networkConnectionEnabled", true);
        caps.setCapability("browserConnectionEnabled", true);

		if("chrome".equalsIgnoreCase(browser)) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("disable-infobars");
			chromeOptions.addArguments("disable-extensions");
			caps.merge(chromeOptions);
			System.setProperty("webdriver.chrome.driver", "/Users/wiselin/git/helloWorldTestAutomation/HelloWorldAutomation/chromedriver");
			driver = new ChromeDriver(caps);
					
		}else if("firefox".equalsIgnoreCase(browser)) {
			caps.setCapability("marionette", true);
			FirefoxOptions ffOptions = new FirefoxOptions();
			caps.merge(ffOptions);
			driver = new FirefoxDriver(caps);
		}else if("edge".equalsIgnoreCase(browser)) {
			driver = new EdgeDriver(caps);
		}else {
			driver = new InternetExplorerDriver(caps);
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);

	}

	@When("^User Enters Username as \"([^\"]*)\"$")
	public void user_Enters_Username_as(String name) throws Throwable {
		 driver.findElement(By.id("username")).sendKeys(name);;
	}

	@When("^User clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String button) throws Throwable {
		driver.findElement(By.id("btnSubmit")).click();
	}

	@Then("^Message displayed \"([^\"]*)\"$")
	public void message_displayed(String msg) throws Throwable {
		msg.equals(driver.findElement(By.id("demo")).getText());
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		driver.close();
	}
}
