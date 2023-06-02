package co.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.udea.certificacion.calidad.userinterfaces.loginPage.BOTONCONTINUAR;
import static co.udea.certificacion.calidad.userinterfaces.homologacionesPage.TEXTOHOMOLOGACIONES;


public class ValidarHomologaciones implements Question<Boolean> {

    private static final String TEXTOAVALIDARSIMULADOR = "SOLICITUD DE RECONOCIMIENTO";

    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(TEXTOHOMOLOGACIONES).viewedBy(actor).asString();
        return(stringTemporal.contains(TEXTOAVALIDARSIMULADOR));
    }


    public static ValidarHomologaciones paginaHomologaciones() {
        return new ValidarHomologaciones();
    }
}
