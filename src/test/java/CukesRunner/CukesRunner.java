package CukesRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"/home/marcin/IdeaProjects/Zadanie2/src/test/Resources/example.feature"}
)
public class CukesRunner {}


