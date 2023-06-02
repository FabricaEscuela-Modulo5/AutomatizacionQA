package co.udea.certificacion.calidad.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.udea.certificacion.calidad.interactions.botonEliminar;
import static co.udea.certificacion.calidad.userinterfaces.homologacionesPage.BOTONAGREGAR;

public class eliminarSolicitud  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(botonEliminar.presionarEliminar());
    }

    public static eliminarSolicitud Eliminar(PageObject page){
        return Tasks.instrumented(eliminarSolicitud.class,page);
    }

}
