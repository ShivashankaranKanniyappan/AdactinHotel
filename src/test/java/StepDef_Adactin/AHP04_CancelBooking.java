package StepDef_Adactin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass_Shiva.BaseClass;
import io.cucumber.java.en.*;

public class AHP04_CancelBooking extends BaseClass {
	
	@When("User clicks the Booked Itinerary")
	public void userClicksTheBookedItinerary() {
	   findElementXpath("//a[normalize-space()='Booked Itinerary']").click();
	}
	@When("User select the order ID to delete")
	public void userSelectTheOrderIDToDelete() throws InterruptedException {
		
		List<WebElement> firstRow = driver.findElements(By.xpath("//tr[@align='center']/td"));
		for (WebElement header : firstRow) {
			String text = header.getText();
			System.out.println(text);
		}
		findElementXpath("//tr[3]/td[3]//input[@id='btn_id_1298761']").click();
	}
	@When("select OK in alert")
	public void selectOKInAlert() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	}
	@Then("Booking should be deleted")
	public void bookingShouldBeDeleted() {
		
	}

}
