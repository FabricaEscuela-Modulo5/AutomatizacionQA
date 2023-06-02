package co.udea.certificacion.calidad.tasks;

import co.udea.certificacion.calidad.interactions.abrirHomologaciones;
import co.udea.certificacion.calidad.interactions.abrirVerSolicitudes;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirHomologaciones implements Task {

    private PageObject page;

    public AbrirHomologaciones(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //interactions
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(abrirHomologaciones.presionarInciarSesion());
    }


    public static AbrirHomologaciones Browser(PageObject page){
        return Tasks.instrumented(AbrirHomologaciones.class,page);
    }
}
