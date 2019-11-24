package pl.lait.test;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObjects.MainPage;
public class ReservationNewStyleTest {
	
	WebDriver driver;
	MainPage mp;

	@Before
	public void openPage() {
		System.out.println(" -- Wewnatrz Before");
		driver = Init.getDriver();
		mp = new MainPage(driver);
	}
	
	@Test
	public void loginTest() {
		System.out.println(" -- Wewnatrz Test");
		mp.goToLogininPage();
		mp.logininAs("majkeldzordan", "majkel10");
	}
	
	@Test
	public void fullReservationTest() {
		mp.goToLogininPage();
		mp.logininAs("majkeldzordan", "majkel10");
		
		// ReservationPage
		// ... 1 etap
		// zatwierdzam guzikiem continue
		// konstruktor dla reservation2pag
		// wypełniam 2gi etap
		// zatwierdzam guzikiem
		
	}
	
	
}
