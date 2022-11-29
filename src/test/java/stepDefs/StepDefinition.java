package stepDefs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ComputerDatabase;

public class StepDefinition extends BaseTest {

	public void setUp() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("./testData/Config.properties");
		prop.load(fis);
	}

	@Given("I login to Computer Database {string}")
	public void i_login_to_computer_database(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		cd = new ComputerDatabase(driver);
		driver.get(url);

	}

	@Given("verify the title as {string}")
	public void verify_the_title_as(String string) {
		String pageTitle = driver.getTitle();
		Assert.assertTrue(pageTitle.equalsIgnoreCase("Computers database"));
		System.out.println("The title is " + pageTitle);
	}

	@Given("verify the page header is same as the title")
	public void verify_the_page_header_is_same_as_the_title() {
		String pageHeader = cd.verifyPageHeader();
		Assert.assertEquals(pageHeader, "Computer database");
		System.out.println("The page Header is " + pageHeader);
	}

	@Given("validate if {string} is visible")
	public void validate_if_is_visible(String string) {
		String text = cd.verifyTextBox();
		Assert.assertTrue(text != null);
		System.out.println("The text is " + text + " visible");
	}

	@Given("validate if {string} button is visible")
	public void validate_if_button_is_visible(String string) {
		WebElement button = cd.verifyAddComputerButton();
		Assert.assertTrue(button.isEnabled());
		System.out.println("This button " + button.getText() + " is visible");
	}

	@Given("validate if table is visible")
	public void validate_if_table_is_visible() {
		WebElement table = cd.verifyTable();
		Assert.assertTrue(table.isDisplayed());
		System.out.println("The table is visible");
	}

	@Given("validate if headers are visible")
	public void validate_if_headers_are_visible(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		/*
		 * // For other transformations you can register a DataTableType. List <String>
		 * headers = dataTable.asList(); String headerOne = headers.get(0);
		 * System.out.println(headerOne); String header1=cd.verifyHeader();
		 * System.out.println(header1); Assert.assertEquals(headerOne,header1 );
		 * 
		 * 
		 */
		/* cd.verifyHeader(); */
		List<String> headers = dataTable.asList();
		Thread.sleep(4000);

		String header1 = driver.findElement(By.xpath("//th[1]/a")).getText();
		String header2 = driver.findElement(By.xpath("//th[2]/a")).getText();
		String header3 = driver.findElement(By.xpath("//th[3]/a")).getText();
		String header4 = driver.findElement(By.xpath("//th[4]/a")).getText();

		System.out.println(driver.findElement(By.xpath("//th[1]/a")).getText());
		System.out.println(driver.findElement(By.xpath("//th[2]/a")).getText());
		System.out.println(driver.findElement(By.xpath("//th[3]/a")).getText());
		System.out.println(driver.findElement(By.xpath("//th[4]/a")).getText());

		Assert.assertEquals(header1, headers.get(0));
		Assert.assertEquals(header2, headers.get(1));
		Assert.assertEquals(header3, headers.get(2));
		Assert.assertEquals(header4, headers.get(3));

	}
	
	@Given("validate if pagination is visible")
	public void validate_if_pagination_is_visible() {
		WebElement pagination = cd.verifyPagination();
		Assert.assertTrue(pagination.isDisplayed());
		System.out.println("The pagination is visible");
	    
	}


}
