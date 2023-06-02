package co.udea.certificacion.calidad.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "co.udea.certificacion.calidad.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class encontrar_credito_consumo {

}
