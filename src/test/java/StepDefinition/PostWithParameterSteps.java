package StepDefinition;

import io.cucumber.java.en.*;

public class PostWithParameterSteps {

    @When("I type the message as {string} in the text box")
    public void i_type_the_message_as_in_the_text_box(String text) {
        System.out.println(text);
    }
    @When("Click on Post button")
    public void click_on_post_button() {
        System.out.println("click_on_post_button");
    }
    @Then("the message should get posted")
    public void the_message_should_get_posted() {
        System.out.println("the_message_should_get_posted");
    }



    @When("User supply the youtube link as {string} in the text box")
    public void user_supply_the_youtube_link_as_in_the_text_box(String url) {
        System.out.println(url);

    }

    @Then("the video should be have  proper thumbnail.")
    public void the_video_should_be_have_proper_thumbnail() {
        System.out.println("the_video_should_be_have_proper_thumbnail");

    }

}
