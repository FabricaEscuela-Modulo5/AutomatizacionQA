package co.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.udea.certificacion.calidad.userinterfaces.homologacionesPage.BOTONVERSOLICITUDES;

public class abrirVerSolicitudes implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTONVERSOLICITUDES));

    }

    public static abrirVerSolicitudes presionarVerSolicitudes() {
        return Tasks.instrumented(abrirVerSolicitudes.class);
    }
}
