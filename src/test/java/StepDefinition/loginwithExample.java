package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class loginwithExample {

    private WebDriver driver;
    @Given("User is on Home page")
    public void user_is_on_home_page() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }
    @When("User Navigate to Login Page")
    public void user_navigate_to_login_page() {
        System.out.println("user_navigate_to_login_page");

    }
    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        System.out.println("User name is "+ username +" password is"+ password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

    }
    @Then("Message displayed Login Successfully")
    public void message_displayed_login_successfully() {

        assertEquals("Products",driver.findElement(By.xpath("//span[text()='Products']")).getText());
       // Thread.sleep(2000);
        driver.close();


    }

}
