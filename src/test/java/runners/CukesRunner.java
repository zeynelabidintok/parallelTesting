package runners;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "step_definitions",
        features = "src/main/resources/features",
        tags="@view_orders",
        dryRun = false,
        plugin = "json:target/cucumber2.json"
)
public class CukesRunner {

}
