package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(features={"FeatureFiles"},tags={"@loginwithmultiple"},glue={"stepDefinations"},
monochrome=true,plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/Multiple.html","pretty", "html:target/cucumber-reports"})
public class Runner2 extends AbstractTestNGCucumberTests{

}
