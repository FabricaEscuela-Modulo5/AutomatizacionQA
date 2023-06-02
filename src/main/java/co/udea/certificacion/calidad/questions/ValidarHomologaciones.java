package co.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.udea.certificacion.calidad.userinterfaces.personasPage.BOTONCONTINUAR;


public class ValidarHomologaciones implements Question<Boolean> {

    private static final String TEXTOAVALIDARSIMULADOR = "CONTINUAR";

    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(BOTONCONTINUAR).viewedBy(actor).asString();
        return(stringTemporal.contains(TEXTOAVALIDARSIMULADOR));
    }


    public static ValidarHomologaciones paginaHomologaciones() {
        return new ValidarHomologaciones();
    }
}
