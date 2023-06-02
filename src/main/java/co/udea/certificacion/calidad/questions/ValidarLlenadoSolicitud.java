package co.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.udea.certificacion.calidad.userinterfaces.homologacionesPage.CAMPOTABLA;
import static co.udea.certificacion.calidad.userinterfaces.homologacionesPage.TEXTOHOMOLOGACIONES;

public class ValidarLlenadoSolicitud implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(CAMPOTABLA).viewedBy(actor).asString();
        return(stringTemporal.contains("Fisica de campos"));
    }

    public static ValidarLlenadoSolicitud tablaSolicitudes() {
        return new ValidarLlenadoSolicitud();
    }
}
