package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature_files/Ionic.feature", glue = "Step_definitions", 
                  dryRun = false, monochrome = true)

public class Runner_Class {

}
