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

	@FindBy(tagName = "table")
	WebElement table;
	
	@FindBy(id="pagination")
	WebElement pagination;

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

}
