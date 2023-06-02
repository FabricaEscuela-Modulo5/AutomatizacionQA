package co.udea.certificacion.calidad.tasks;

import co.udea.certificacion.calidad.interactions.abrirVerSolicitudes;
import co.udea.certificacion.calidad.interactions.botonEliminar;
import co.udea.certificacion.calidad.interactions.regresar;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.udea.certificacion.calidad.interactions.abrirVerSolicitudes;

public class volverAlLogin implements Task{

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(regresar.presionarRegresar());
    }

    public static volverAlLogin paginaLogin(PageObject page){
        return Tasks.instrumented(volverAlLogin.class,page);
    }
}
