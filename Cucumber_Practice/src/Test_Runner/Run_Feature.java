package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="Resources\\Login_Withparameters.feature",glue="Step_Defination",dryRun=true,monochrome=true)

public class Run_Feature {

}
