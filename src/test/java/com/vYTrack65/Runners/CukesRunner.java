package com.vYTrack65.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //feature, tag, glue, plugin, dryrun

        plugin = {"html:target/cucumber-report.html", "json:target/json-report.json",
        "rerun:target/rerun-report.txt"},

        features = "src\\test\\resources\\feature" , // from feature
        glue= "com\\vYTrack65\\Step_Definition", // from step definition
        dryRun = false,
        tags= ""




)

public class CukesRunner {


}
