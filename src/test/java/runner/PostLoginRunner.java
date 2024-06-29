package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/features/Postlogin.feature"},
                glue={"StepDefinition","hooks"},
              // plugin={"pretty","html:target/HtmlReports"})
       //plugin={"pretty","html:target/report.json"})
plugin={"pretty","junit:target/report.xml"} ,tags="@SmokeTest")




public class PostLoginRunner {

}
