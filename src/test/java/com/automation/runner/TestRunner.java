package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Feature",
        glue = "com.automation.steps",
        plugin={"html:target/resources.html","json:target/cucumber.json"}
)
public class TestRunner {
}