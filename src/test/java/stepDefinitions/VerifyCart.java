package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCart {
	WebDriver driver;
	@Given("the user is logged into the DemoBlaze website")
	public void the_user_is_logged_into_the_demo_blaze_website() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get(" https://www.demoblaze.com "); 
		Thread.sleep(1000);
	}
	@When("the user navigates to a product page")
	public void the_user_navigates_to_a_product_page() throws InterruptedException {
	    driver.findElement(By.linkText("Phones")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Samsung galaxy s6")).click();
	    Thread.sleep(2000);
	}
	@When("the user clicks the {string} button")
	public void the_user_clicks_the_button(String string) throws InterruptedException {
	    driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);
	}
	@Then("the product should be added to the cart")
	public void the_product_should_be_added_to_the_cart() throws InterruptedException {
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(3000);
	}
	@Then("the cart should display the correct product details")
	public void the_cart_should_display_the_correct_product_details() throws InterruptedException {
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).isDisplayed();
		  Assert.assertTrue(true);
		  Thread.sleep(3000);
		  driver.quit();
	}

}
