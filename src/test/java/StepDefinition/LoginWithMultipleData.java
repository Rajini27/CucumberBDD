package StepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;

public class LoginWithMultipleData {

    @Given("User is at the login page of the application")
    public void user_is_at_the_login_page_of_the_application() {
        System.out.println("user_is_at_the_login_page_of_the_application");
        
    }
    @When("User logs in with following username and password")
    public void user_logs_in_with_following_username_and_password(DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists();
        for(List<String> list:lists){
            for(String s:list){
                System.out.println("Data:"+s);
            }
        }


    }
    @Then("user should be able to login with correct username and password")
    public void user_should_be_able_to_login_with_correct_username_and_password() {
        System.out.println("user_should_be_able_to_login_with_correct_username_and_password");
        
    }

}
