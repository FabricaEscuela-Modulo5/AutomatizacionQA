package co.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class homologacionesPage extends PageObject {

    public static final Target TEXTOHOMOLOGACIONES  = Target.the("Titulo pagina").locatedBy("/html/body/div[1]/div/div/div[1]");

    public static final Target TEXTORESULTADOS  = Target.the("Titulo pagina").locatedBy("");

}
