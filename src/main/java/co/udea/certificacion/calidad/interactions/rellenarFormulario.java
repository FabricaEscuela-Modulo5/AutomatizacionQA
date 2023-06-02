package co.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Random;

import static co.udea.certificacion.calidad.userinterfaces.homologacionesPage.*;

public class rellenarFormulario implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("123").into(INPUTCODIGO));
        actor.attemptsTo(Enter.theValue("Física de campos").into(INPUTMATERIA));
        actor.attemptsTo(Enter.theValue("Ingeniería de sistemas").into(INPUTPROGRAMA));
        actor.attemptsTo(Enter.theValue("20232").into(INPUTPERIODO));
        actor.attemptsTo(Enter.theValue("3").into(INPUTCALIFICACION));
        actor.attemptsTo(Enter.theValue("un comentario").into(INPUTCOMENTARIO));
    }

    public static rellenarFormulario escribirCampos() {
        return Tasks.instrumented(rellenarFormulario.class);
    }

}
