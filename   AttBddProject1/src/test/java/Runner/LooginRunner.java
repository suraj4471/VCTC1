package Runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"\\src\\test\\resources\\LoginFolder\\login.feature"},
		glue= {"steps"}
		
		
		)

public class LooginRunner {

}
