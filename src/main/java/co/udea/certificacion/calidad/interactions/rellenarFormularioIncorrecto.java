package co.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.udea.certificacion.calidad.userinterfaces.homologacionesPage.*;
import static co.udea.certificacion.calidad.userinterfaces.homologacionesPage.INPUTCOMENTARIO;

public class rellenarFormularioIncorrecto implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("aaaa").into(INPUTCODIGO));
        actor.attemptsTo(Enter.theValue("Física de campos").into(INPUTMATERIA));
        actor.attemptsTo(Enter.theValue("Ingeniería de sistemas").into(INPUTPROGRAMA));
        actor.attemptsTo(Enter.theValue("2023-2").into(INPUTPERIODO));
        actor.attemptsTo(Enter.theValue("3-").into(INPUTCALIFICACION));
        actor.attemptsTo(Enter.theValue("un comentario").into(INPUTCOMENTARIO));
    }

    public static rellenarFormularioIncorrecto escribirCampos() {
        return Tasks.instrumented(rellenarFormularioIncorrecto.class);
    }
}
