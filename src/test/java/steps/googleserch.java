package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class googleserch extends GoogleBase {

	// WebDriver driver;
	
	HomePage hp ;
	@Given("i am on the google homepage")
	public void i_am_on_the_google_homepage() {
		launchBrowser();

		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 * driver.get("https://www.google.com/"); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 */
		// Launching the browser

	}

	@When("i enter search as {string}")
	public void i_enter_search_as(String term) {
		//WebElement serchBx = driver.findElement(By.name("q"));
		//serchBx.sendKeys(term);
		 hp = new HomePage(driver);
		hp.enterSearchItem(term);
	}

	@When("i click on google search button")
	public void i_click_on_google_search_button() {
		//WebElement serhBTN = driver.findElement(By.name("btnK"));
		//serhBTN.submit();
		hp.clickSearchBtn();
		
	}

	@Then("i receive related search results")
	public void i_receive_related_search_results() {
		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(true, title.contains("Google"));

		WebElement results = driver.findElement(By.id("result-stats"));
		System.out.println(results.getText());

		closeBrowser();
	}

}
