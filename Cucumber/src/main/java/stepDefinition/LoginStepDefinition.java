/*package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition {

	WebDriver driver;

	@Given("^user is on Free CRM Login Page$")
	public void user_is_on_Free_CRM_Login_Page() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Shubhada/Documents/Selenium jars/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("User is on FreeCRM Login Page");
	}

//this is used when we are giving data at runtime

	// This is used when we are giving data in the feature file
	/*
	 * @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$") public void
	 * user_enters_username_and_password(String username,String password) throws
	 * Exception { driver.findElement(By.name("email")).sendKeys(username);
	 * Thread.sleep(2000);
	 * driver.findElement(By.name("password")).sendKeys(password);
	 * Thread.sleep(2000); }
	 */
	/*
	 * //This is used when we are giving data with examples keyword
	 * 
	 * @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$") public void
	 * user_enters_username_and_password(String username,String password) throws
	 * Exception { driver.findElement(By.name("email")).sendKeys(username);
	 * Thread.sleep(2000);
	 * driver.findElement(By.name("password")).sendKeys(password);
	 * Thread.sleep(2000); }
	 */
/*
	// using data tables

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable table1) throws InterruptedException {
		List<List<String>> data = table1.raw();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		Thread.sleep(2000);
	}

	@Then("^user click on deal menu$")
	public void user_click_on_deal_menu() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[5]/span")).click();
		Thread.sleep(2000);
	}

	@Then("^user click on New button$")
	public void user_click_on_New_button() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/a[3]/button")).click();
		Thread.sleep(2000);
	}

	@Then("^user enters title,description,amount$")
	public void user_enters_title_description_amount(DataTable table2) throws InterruptedException {

		List<List<String>> data = table2.raw();
		driver.findElement(By.name("title")).sendKeys(data.get(0).get(0));
		Thread.sleep(2000);
		driver.findElement(By.name("description")).sendKeys(data.get(0).get(1));
		Thread.sleep(2000);
		driver.findElement(By.name("amount")).sendKeys(data.get(0).get(2));
		Thread.sleep(2000);
	}

	@Then("^user click on save button$")
	public void user_click_on_save_button() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
	}

	@Then("^user clicks on sign in button$")
	public void user_clicks_on_sign_in_button() throws Exception {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
		Thread.sleep(5000);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String HomePageTitle = driver.getTitle();
		System.out.println("Home page title is : " + HomePageTitle);
		String actual = "Cogmento CRM";
		Assert.assertEquals(HomePageTitle, actual);

	}

	@Then("^user close the browser$")
	public void user_close_the_browser() {
		driver.close();
	}
}*/
