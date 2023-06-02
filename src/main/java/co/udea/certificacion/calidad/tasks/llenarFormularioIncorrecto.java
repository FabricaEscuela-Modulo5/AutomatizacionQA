package co.udea.certificacion.calidad.tasks;

import co.udea.certificacion.calidad.interactions.rellenarFormulario;
import co.udea.certificacion.calidad.interactions.rellenarFormularioIncorrecto;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.udea.certificacion.calidad.userinterfaces.homologacionesPage.BOTONAGREGAR;

public class llenarFormularioIncorrecto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(rellenarFormularioIncorrecto.escribirCampos());
        actor.attemptsTo(Click.on(BOTONAGREGAR));
    }

    public static llenarFormularioIncorrecto Simulacion(PageObject page){
        return Tasks.instrumented(llenarFormularioIncorrecto.class,page);
    }

}
