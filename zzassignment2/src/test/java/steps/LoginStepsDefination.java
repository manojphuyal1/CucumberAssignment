package steps;

import org.junit.After;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepsDefination extends TestBase{
	LoginPage loginpage;
	//DatabasePage databasePage;
	
	@Before
	public void beforeRun() {
		initDriver();	
		LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class);
	  //databasePage = new DatabasePage();
	}
	
	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://qa.codefios.com/");
	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String username, String password) {
		loginpage.enterUserName(username);
		loginpage.enterUserName(password);
	}

	
	@When("User clicks on {string}")
	public void user_clicks_on(String string) {
	  loginpage.clickSignInButton();
	   loginpage.clickBankAndCash();
	   loginpage.clickNewAccount();
	   loginpage.clickSubmitButton();
	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
	  loginpage.validationPage();
	  takeScreenshot(driver);
	}
	
	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String string, String string2) {
	    loginpage.AccountTitle.sendKeys(string +  generateRandomNum(999));
	    loginpage.Description.sendKeys(string+  generateRandomNum(9999));
	    loginpage.InitialBalance.sendKeys(string+  generateRandomNum(9999));
	    loginpage.AccountNumber.sendKeys(string+  generateRandomNum(9999));
	    loginpage.ContactPerson.sendKeys(string);
	    loginpage.Phone.sendKeys(string+  generateRandomNum(9999));
	    loginpage.InternetBankingUrl.sendKeys(string);
	
	}


	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
	   loginpage.validationPage();
	}

	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
