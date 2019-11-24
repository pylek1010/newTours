package pl.lait.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.lait.test.Init;

public class MainPage {

	WebDriver driver;
	
	//MainPage
	
	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;
	
	@FindBy(linkText = "REGISTER")
	WebElement registerLink;
	
	//LoginPage
	
	@FindBy(name = "userName")
	WebElement loginInput;
	
	@FindBy(name = "password")
	WebElement passInput;
	
	@FindBy(name = "login")
	WebElement loginBtn;
	
	
	
	public MainPage(WebDriver driver) {
		System.out.println(" -- Wewnatrz konstruktora MainPage");
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		
		
	}
	
	public void goToLogininPage() {
		signOnLink.click();
	}
	
	public void logininAs(String login, String password) {
		loginInput.sendKeys(login);
		passInput.sendKeys(password);
		loginBtn.click();
		
	}
}
