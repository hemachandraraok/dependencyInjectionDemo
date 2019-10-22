import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"target/parallel/features/[CUCABLE:FEATURE].feature"},
        plugin = {"pretty", "json:target/cucumber_reports/[CUCABLE:RUNNER].json"},
        monochrome = true
)
public class CucableJavaTemplate {

}