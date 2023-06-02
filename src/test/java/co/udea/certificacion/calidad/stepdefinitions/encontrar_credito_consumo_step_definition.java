package co.udea.certificacion.calidad.stepdefinitions;

import co.udea.certificacion.calidad.questions.ValidarHomologaciones;
import co.udea.certificacion.calidad.questions.ValidarTasasYTarifas;
import co.udea.certificacion.calidad.tasks.llenarFormulario;
import co.udea.certificacion.calidad.tasks.AbrirSimulacion;
import co.udea.certificacion.calidad.userinterfaces.personasPage;
import co.udea.certificacion.calidad.userinterfaces.simuladorPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;



public class encontrar_credito_consumo_step_definition {


    @Managed(driver = "edge")
    public WebDriver driver;
    private Actor personaNatural = Actor.named("Juan");

    @Before
    public void preStage() {
        System.setProperty("webdriver.edge.driver",
                "src/test/resources/driver/msedgedriver.exe");

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        personaNatural.can(BrowseTheWeb.with(driver));
    }

    @After
    public void tearDown() {
        if (driver!=null) {
            driver.close();
            driver.quit();
        }
    }

    @Given("que me encuentro en la pagina personas de inicio de sesion")
    public void queMeEncuentroEnLaPaginaPersonas() {
        personaNatural.can(BrowseTheWeb.with(driver));
    }

    @When("inicie sesion y entre al modulo de homologaciones")
    public void encuentreElModuloDeSimulador() {
        personaNatural.attemptsTo(AbrirSimulacion.Browser(new personasPage()));

    }

    @Then("verifico que estoy en el modulo de homologaciones")
    public void verificoQueEstoyEnElSimulador() {
        personaNatural.should(seeThat(ValidarHomologaciones.paginaHomologaciones(), equalTo(true)));
    }

    @When("ingrese satisfactoriamente los campos del formulario")
    public void relleneElFormulario(){
        personaNatural.attemptsTo(llenarFormulario.Simulacion(new simuladorPage()));
    }

    @Then("puedo ver las tasas y tarifas del credito")
    public void leDoyAlBotonSiDeCuantoDineroNecesito(){
        personaNatural.should(seeThat(ValidarTasasYTarifas.paginaResultados(),equalTo(true)));
    }

}

