package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/loginwithmultipledata.feature",glue={"StepDefinition"},dryRun=true
)
public class LoginRunner {
}
