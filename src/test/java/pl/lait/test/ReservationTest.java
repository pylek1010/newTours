package pl.lait.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReservationTest {

	WebDriver driver;

	@Before
	public void openPage() {
		driver = Init.getDriver();
	}

	@Test
	public void reserveFlight() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("majkeldzordan");
		driver.findElement(By.name("password")).sendKeys("majkel10");
		driver.findElement(By.name("login")).click();
		
		String oneWayRadioXpath = "/html/body/div/table/tbody/tr/td[2]/table/"
				+ "tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/"
				+ "form/table/tbody/tr[2]/td[2]/b/font/input[2]";
		
		driver.findElement(By.xpath(oneWayRadioXpath)).click();
		
		WebElement passCount = driver.findElement(By.name("passCount"));
		Select passCountSelect = new Select(passCount);
		passCountSelect.selectByVisibleText("2");
		
		WebElement fromPort = driver.findElement(By.name("fromPort"));
		Select fromPortSelect = new Select(fromPort);
		fromPortSelect.selectByVisibleText("London");
		
		WebElement fromMonth = driver.findElement(By.name("fromMonth"));
		Select fromMonthSelect = new Select(fromMonth);
		fromMonthSelect.selectByVisibleText("October");
		
		WebElement fromDay = driver.findElement(By.name("fromDay"));
		Select fromDaySelect = new Select(fromDay);
		fromDaySelect.selectByVisibleText("15");
		
		WebElement toPort = driver.findElement(By.name("toPort"));
		Select toPortSelect = new Select(toPort);
		toPortSelect.selectByVisibleText("Sydney");
		
		WebElement toMonth = driver.findElement(By.name("toMonth"));
		Select toMonthSelect = new Select(toMonth);
		toMonthSelect.selectByVisibleText("December");
		
		WebElement toDay = driver.findElement(By.name("toDay"));
		Select toDaySelect = new Select(toDay);
		toDaySelect.selectByVisibleText("16");
		
		String oneWayRadioXpath2 = "/html/body/div/table/tbody/tr/td[2]"
				+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody"
				+ "/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]";
		
		driver.findElement(By.xpath(oneWayRadioXpath2)).click();
		
		WebElement theAirline = driver.findElement(By.name("airline"));
		Select theAirlineSelect = new Select(theAirline);
		theAirlineSelect.selectByVisibleText("Unified Airlines");
		
		driver.findElement(By.name("findFlights")).click();
	}

	//@After
	public void tearDown() {
		driver.close();
	}

}
