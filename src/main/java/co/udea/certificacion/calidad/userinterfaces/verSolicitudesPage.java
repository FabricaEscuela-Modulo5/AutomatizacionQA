package co.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class verSolicitudesPage extends PageObject {
    public static final Target TEXTOVERSOLICITUDES  = Target.the("TEXTOVERSOLICITUDES").locatedBy("//*[@id=\"root\"]/div/div/table/thead/tr/th[1]");

}
