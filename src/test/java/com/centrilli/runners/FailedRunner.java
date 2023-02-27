package com.centrilli.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "target/rerun.txt",
        features = "com/centrilli/stepDefinitions"

)

public class FailedRunner {


}
