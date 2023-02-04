package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch extends GoogleBase{
	
	//WebDriver driver;

	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		launchBrowser();
		
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();*/
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		
		WebElement searchBox;
		searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys(string);
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		WebElement searchButton;
		searchButton = driver.findElement(By.className("gNO89b"));
		
		searchButton.click();

	}

	@Then("I recieve related search result")
	public void i_recieve_related_search_result() {
		
		WebElement ResultStats;
		ResultStats = driver.findElement(By.id("result-stats"));
		
		String Results = ResultStats.getText();
		
		System.out.println("===========================================================================================");
		System.out.println(Results);
		System.out.println("===========================================================================================");
		
		//driver.close();
		closeBrowser();
	}

}
