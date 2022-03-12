package co.com.test.store.runners.session;

import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/login.feature",
        glue ="co.com.test.store.stepdefinitions",
        snippets= SnippetType.CAMELCASE)
public class LoginRun {
}
