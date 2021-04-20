package co.com.retotecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/principal.feature",
        tags="",snippets= SnippetType.CAMELCASE,
        glue="co.com.retotecnico.stepdefinitions")
public class Principal {
}
