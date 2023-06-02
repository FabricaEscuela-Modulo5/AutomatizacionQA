package co.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.udea.certificacion.calidad.userinterfaces.homologacionesPage.BOTONREGRESAR;

public class regresar implements  Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTONREGRESAR));

    }

    public static co.udea.certificacion.calidad.interactions.regresar presionarRegresar() {
        return Tasks.instrumented(co.udea.certificacion.calidad.interactions.regresar.class);
    }
}
