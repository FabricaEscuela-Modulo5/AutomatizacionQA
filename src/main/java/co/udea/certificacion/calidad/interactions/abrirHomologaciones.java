package co.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static co.udea.certificacion.calidad.userinterfaces.loginPage.BOTONINICIARSESION;
import static co.udea.certificacion.calidad.userinterfaces.loginPage.BOTONSABERMAS;

public class abrirHomologaciones implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTONINICIARSESION));
    }

    public static abrirHomologaciones presionarInciarSesion() {
        return Tasks.instrumented(abrirHomologaciones.class);
    }
}
