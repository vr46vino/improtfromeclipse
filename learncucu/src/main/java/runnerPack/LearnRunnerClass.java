package runnerPack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "FeatureFile/LearnFeatureFile.feature",glue = "stepDefPack")
public class LearnRunnerClass {
}
