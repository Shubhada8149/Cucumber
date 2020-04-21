package testRunner;


	import org.junit.runner.RunWith;
	import cucumber.api.junit.Cucumber;
	import cucumber.api.CucumberOptions;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				
				//features = "E://eclipse-workspace//Cucumber//src//main//java//features//login.feature",  //the path of the feature files
				//features = "E://eclipse-workspace//Cucumber//src//main//java//features//deal_details.feature",
				//features = "E://eclipse-workspace//Cucumber//src//main//java//features//deal_detail_map.feature",
				features = "C://Users//Shubhada//git//Cucumber//Cucumber//src//main//java//features//tagging.feature",
				
				glue = {"stepDefinition"}, //the path of the step definition files
				plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
				monochrome = true, //display the console output in a proper readable format
				strict = true, //it will check if any step is not defined in step definition file
				dryRun = false ,//to check the mapping is proper between feature file and step def file
				tags = {"@SmokeTest" , "~@RegressionTest", "~@EndToEnd"}	
				//tags = {"@SmokeTest","@RegressionTest"}
				)
		
		public class TestRunner {
			
			
	}



