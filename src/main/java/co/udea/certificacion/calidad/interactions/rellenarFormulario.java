package co.udea.certificacion.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Random;

import static co.udea.certificacion.calidad.userinterfaces.personasPage.BOTONCONTINUAR;
import static co.udea.certificacion.calidad.userinterfaces.simuladorPage.*;

public class rellenarFormulario implements Interaction {


    private String[] valores = {"1000000","10000000","100000000","250000000","500000000"};
    private String[] meses = {"48","60","72","84"};


    @Override
    public <T extends Actor> void performAs(T actor) {
        int rndValores = new Random().nextInt(valores.length);
        int rndMeses = new Random().nextInt(meses.length);

        actor.attemptsTo(Click.on(BOTONCONTINUAR));
        actor.attemptsTo(Click.on(BOTONRADIALSI));
        actor.attemptsTo(Enter.theValue(valores[rndValores]).into(INPUTMONTO));
        actor.attemptsTo(Enter.theValue(meses[rndMeses]).into(INPUTMESES));
        actor.attemptsTo(Click.on(INPUTFECHA));
        actor.attemptsTo(Click.on(YEAR));
        actor.attemptsTo(Click.on(MONTH));
        actor.attemptsTo(Click.on(DAY));

    }

    public static rellenarFormulario escribirCampos() {
        return Tasks.instrumented(rellenarFormulario.class);
    }

}
