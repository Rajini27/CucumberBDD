package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostLoginSteps {
    @Given("User should be logged in and should be present on his wall")
    public void userShouldBeLoggedInAndShouldBePresentOnHisWall() {
        System.out.println("userShouldBeLoggedInAndShouldBePresentOnHisWall");
    }

    @When("I type the message in the box")
    public void iTypeTheMessageInTheBox() {
        System.out.println("iTypeTheMessageInTheBox");
    }

    @And("Click on the Post button")
    public void clickOnThePostButton() {
        System.out.println("clickOnThePostButton");
    }

    @Then("the message should be posted")
    public void theMessageShouldBePosted() {
        System.out.println("theMessageShouldBePosted");
        System.out.println("theMessageShouldBePosted1");
        System.out.println("theMessageShouldBePosted2");
        System.out.println("theMessageShouldBePosted3");
    }



    @Given("User should be logged in and should be present at its own wall")
    public void user_should_be_logged_in_and_should_be_present_at_its_own_wall() {
        System.out.println("user_should_be_logged_in_and_should_be_present_at_its_own_wall");
    }
    @When("User supply the youtube link in the text box")
    public void user_supply_the_youtube_link_in_the_text_box() {
        System.out.println("user_supply_the_youtube_link_in_the_text_box");

    }



    @Then("Then video should get posted on the user wall")
    public void then_video_should_get_posted_on_the_user_wall() {
        System.out.println("then_video_should_get_posted_on_the_user_wall");

    }
    @Then("the video should have proper thumbnail")
    public void the_video_should_have_proper_thumbnail() {
        System.out.println("the_video_should_have_proper_thumbnail");

    }
}
