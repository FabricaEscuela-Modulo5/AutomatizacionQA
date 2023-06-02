package co.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.udea.certificacion.calidad.userinterfaces.homologacionesPage.TEXTORESULTADOS;

public class ValidarSolicitudes implements Question<Boolean> {

    private static final String textoAValidarResultados = "Materia por reconocer";
    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(TEXTORESULTADOS).viewedBy(actor).asString();
       return stringTemporal.contains(textoAValidarResultados);
    }

    public static ValidarSolicitudes paginaResultados() {
        return new ValidarSolicitudes();
    }

}
