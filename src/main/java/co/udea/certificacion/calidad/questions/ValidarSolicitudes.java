package co.udea.certificacion.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class ValidarSolicitudes implements Question<Boolean> {

    private static final String textoAValidarResultados = "Materia por reconocer";
    @Override
    public Boolean answeredBy(Actor actor) {
       return true;
    }

    public static ValidarSolicitudes paginaResultados() {
        return new ValidarSolicitudes();
    }

}
