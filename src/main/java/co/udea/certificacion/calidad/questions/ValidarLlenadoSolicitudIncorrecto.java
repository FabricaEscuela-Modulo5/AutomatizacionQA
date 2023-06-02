package co.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.udea.certificacion.calidad.userinterfaces.homologacionesPage.NODATOS;

public class ValidarLlenadoSolicitudIncorrecto implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(NODATOS).viewedBy(actor).asString();
        return(stringTemporal.contains("No hay datos"));
    }

    public static ValidarLlenadoSolicitudIncorrecto tablaSolicitudes() {
        return new ValidarLlenadoSolicitudIncorrecto();
    }
}
