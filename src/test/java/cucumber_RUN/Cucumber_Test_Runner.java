package cucumber_RUN;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
glue = {"cucumber_RUN"}
)
public class Cucumber_Test_Runner {
	
	
}
	
	


