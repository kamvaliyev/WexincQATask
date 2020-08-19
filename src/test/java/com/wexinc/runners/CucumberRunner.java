package com.wexinc.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/wexinc/step_definitions",
        features = "src/test/resources",
        dryRun = false,
        strict = true,
        tags = "@search",
        plugin = {
                "html:target/default-report"
        }

)
public class CucumberRunner {


}
