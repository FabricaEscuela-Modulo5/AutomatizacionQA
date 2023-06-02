package co.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.udea.certificacion.calidad.userinterfaces.homologacionesPage.TEXTOHOMOLOGACIONES;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.udea.certificacion.calidad.userinterfaces.loginPage.BOTONCONTINUAR;
import static co.udea.certificacion.calidad.userinterfaces.loginPage.BOTONINICIARSESION;

public class ValidarLogin implements Question<Boolean>{
    private static final String TEXTOAVALIDARSIMULADOR = "Ingresar";

    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(BOTONINICIARSESION).viewedBy(actor).asString();
        return(stringTemporal.contains(TEXTOAVALIDARSIMULADOR));
    }


    public static co.udea.certificacion.calidad.questions.ValidarLogin paginaLogin() {
        return new co.udea.certificacion.calidad.questions.ValidarLogin();
    }
}
