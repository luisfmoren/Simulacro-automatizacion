package co.com.choucair.pruebaelcolombiano.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/PruebaElColombiano.feature",
        tags = "@scenario2",
        glue = "co.com.choucair.pruebaelcolombiano.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
