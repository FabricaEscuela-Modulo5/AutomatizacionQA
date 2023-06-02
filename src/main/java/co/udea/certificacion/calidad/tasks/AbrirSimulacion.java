package co.udea.certificacion.calidad.tasks;

import co.udea.certificacion.calidad.interactions.abrirCreditos;
import co.udea.certificacion.calidad.interactions.abrirSimulacion;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirSimulacion implements Task {

    private PageObject page;

    public AbrirSimulacion(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //interactions
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(abrirCreditos.presionarSaberMas());
        actor.attemptsTo(abrirSimulacion.presionarSimular());

    }


    public static AbrirSimulacion Browser(PageObject page){
        return Tasks.instrumented(AbrirSimulacion.class,page);
    }
}
