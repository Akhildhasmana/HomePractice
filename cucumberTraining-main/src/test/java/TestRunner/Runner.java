package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/Loginfeature.feature",
		glue="StepDefination",
		dryRun=false,//it will check the mapping according to the steps given in the step definition and give output in console 
		//if we set dryRun= true// 
		monochrome=true, //used for more readability
		plugin = {"pretty","json:target/cucumber-reports/reports_json.json",
				"html:target/cucumber-reports/reports1.html","junit:target/cucumber-reports/reports_xml.xml"}//to generate report in json
		//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}//to generate report in html
		//plugin = {"pretty","junit:target/cucumber-reports/reports_xml.xml"}
		)
public class Runner {

	//Class should remain empty.


}
