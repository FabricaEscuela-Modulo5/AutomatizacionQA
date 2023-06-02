package co.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.udea.certificacion.calidad.userinterfaces.verSolicitudesPage.TEXTOVERSOLICITUDES;

public class ValidarVerSolicitudes implements Question<Boolean> {
    private static final String textoAValidar = "Estado";
    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(TEXTOVERSOLICITUDES).viewedBy(actor).asString();
        return(stringTemporal.contains(textoAValidar));
    }

    public static ValidarSolicitudes PaginaVerSolicitudes() {
        return new ValidarSolicitudes();
    }

}