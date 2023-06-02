package co.udea.certificacion.calidad.stepdefinitions;

import co.udea.certificacion.calidad.questions.*;
import co.udea.certificacion.calidad.tasks.*;
import co.udea.certificacion.calidad.userinterfaces.homologacionesPage;
import co.udea.certificacion.calidad.userinterfaces.loginPage;
import co.udea.certificacion.calidad.userinterfaces.tablaPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;



public class homologacion_step_definition {


    @Managed(driver = "edge")
    public WebDriver driver;

    private Actor usuario = Actor.named("Juan");

    @Before
    public void preStage() {
        System.setProperty("webdriver.edge.driver",
                "src/test/resources/driver/msedgedriver.exe");
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        driver = new EdgeDriver(dc);
        driver.manage().window().maximize();
        usuario.can(BrowseTheWeb.with(driver));
    }

    @After
    public void tearDown() {
        if (driver!=null) {
            driver.close();
            driver.quit();
        }
    }

    @Given("que me encuentro en la pagina de inicio de sesion")
    public void queMeEncuentroEnLaPaginaDeInicioDeSesion() {
        usuario.can(BrowseTheWeb.with(driver));
    }

    @When("inicie sesion y entre al modulo de homologaciones")
    public void encuentreElModuloDeHomologaciones() {
        usuario.attemptsTo(AbrirHomologaciones.Browser(new loginPage()));

    }

    @Then("verifico que estoy en el modulo de homologaciones")
    public void verificoQueEstoyEnHomologaciones() {
        usuario.should(seeThat(ValidarHomologaciones.paginaHomologaciones(), equalTo(true)));
    }

    @When("ingrese satisfactoriamente los campos del formulario")
    public void relleneElFormulario(){
        usuario.attemptsTo(llenarFormulario.Simulacion(new homologacionesPage()));
    }

    @Then("puedo ver la solicitud en la tabla")
    public void puedoVerSolicitudTabla(){
        usuario.should(seeThat(ValidarLlenadoSolicitud.tablaSolicitudes(),equalTo(true)));
    }

    @When("ingrese incorrectamente los campos del formulario")
    public void ingresoIncorrectamenteFormulario(){
        usuario.attemptsTo(llenarFormularioIncorrecto.Simulacion(new homologacionesPage()));
    }

    @Then("no puedo ver la solicitud en la tabla")
    public void noVeoLaTablaSolicitud(){
        usuario.should(seeThat(ValidarLlenadoSolicitudIncorrecto.tablaSolicitudes(),equalTo(true)));
    }

    @Then("Puedo eliminar la solicitud de homologacion")
    public void eliminarLaSolicitudDeHomologacion(){
        usuario.attemptsTo(eliminarSolicitud.Eliminar(new tablaPage()));
        driver.switchTo().alert().accept();
    }


    @Then("puedo ver el apartado Ver Solicitudes")
    public void ingresarAVerSolicitudes(){
        usuario.attemptsTo(AbrirVerSolicitudes.PaginaVerSolicitudes(new tablaPage()));
        usuario.should(seeThat(ValidarVerSolicitudes.PaginaVerSolicitudes(),equalTo(true)));
    }

    @Then("Puedo regresar a la pantalla de login")
    public void volverAlLogin(){
        usuario.attemptsTo(volverAlLogin.paginaLogin(new loginPage()));
        usuario.should(seeThat(ValidarLogin.paginaLogin(),equalTo(true)));
    }

}

