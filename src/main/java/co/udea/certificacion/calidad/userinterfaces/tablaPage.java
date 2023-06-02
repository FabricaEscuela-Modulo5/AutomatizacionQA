package co.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class tablaPage extends PageObject {

    public static final Target ELIMINARSOLICITUD = Target.the("Boton eliminar solicitud").locatedBy("/html/body/div/div/div/table/tbody/tr/td[7]/button");

}
