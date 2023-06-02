package co.udea.certificacion.calidad.tasks;

import co.udea.certificacion.calidad.interactions.abrirVerSolicitudes;
import co.udea.certificacion.calidad.interactions.botonEliminar;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.udea.certificacion.calidad.interactions.abrirVerSolicitudes;

public class AbrirVerSolicitudes implements Task {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(abrirVerSolicitudes.presionarVerSolicitudes());
    }

    public static AbrirVerSolicitudes PaginaVerSolicitudes(PageObject page){
        return Tasks.instrumented(AbrirVerSolicitudes.class,page);
    }
}


