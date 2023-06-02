package co.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.udea.certificacion.calidad.userinterfaces.tablaPage.ELIMINARSOLICITUD;

public class botonEliminar  implements Interaction
{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ELIMINARSOLICITUD));
    }

    public static botonEliminar presionarEliminar() {
        return Tasks.instrumented(botonEliminar.class);
    }
}
