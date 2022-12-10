package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerDatabase {
	WebDriver driver;
	List<WebElement> wb;

	public ComputerDatabase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Computer database']")
	WebElement pageHeader;

	@FindBy(xpath = "//a[@id='add']")
	WebElement addComputerButton;

	@FindBy(xpath = "//input[@name='f']")
	WebElement textBox;

	@FindBy(xpath="//input[@id='searchsubmit']")
	WebElement filterByName;
	
	@FindBy(tagName = "table")
	WebElement table;
	
	@FindBy(id="pagination")
	WebElement pagination;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement createComputerIcon;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement computerNameField;
	
	@FindBy(xpath="//select[@id='company']")
	WebElement selectCompany;

	@FindBy(xpath="//div[@class='alert-message warning']")
	WebElement confirmationMessage;
	
	@FindBy(xpath="//section/h1")
	WebElement result;
	
	public String verifyPageHeader() {
		return pageHeader.getText();
	}

	public WebElement verifyAddComputerButton() {
		return addComputerButton;
	}

	public String verifyTextBox() {
		return textBox.getAttribute("placeholder");
	}

	public WebElement verifyTable() {
		return table;
	}

	public WebElement verifyPagination() {
		return pagination;
	}

	public WebElement clickCreateComputerIcon() {
		return createComputerIcon;
	}
	
	public WebElement verifyComputerNameField() {
		return computerNameField;
	}
	
	public WebElement selectCompanyName() {
		return selectCompany;
	}
	
	public WebElement verifySuccessMessage() {
		return confirmationMessage;
	}
	
	public WebElement verifyComputerNameTextBox() {
		return textBox;
	}
	
	public WebElement clickFilterByComputerName() {
		return filterByName;
		
	}
	
	public WebElement verifyResult() {
		return result;
	}
}
