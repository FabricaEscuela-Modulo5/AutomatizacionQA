package co.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class simuladorPage extends PageObject {



    public static final Target BOTONRADIALSI = Target.the("Boton radial de si sabe cuanto dinero necesita").located(By.id("opcion-si"));
    public static final Target INPUTMONTO = Target.the("Input de monto a prestar").located(By.id("valor-simulacion"));
    public static final Target INPUTMESES = Target.the("Input de meses de plazo").located(By.id("valor-plazo"));
    public static final Target INPUTFECHA = Target.the("Input de fecha de nacimiento").located(By.id("campo-fecha"));

    public static final Target YEAR  = Target.the("Boton para elegir year").locatedBy("/html/body/div[6]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[1]/td[1]/div[1]");
    public static final Target MONTH  = Target.the("Boton para elegir mes").locatedBy("/html/body/div[6]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]");
    public static final Target DAY  = Target.the("Boton para elegir dia").locatedBy("/html/body/div[6]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[1]/td[2]/div[1]");
    public static final Target BOTONSIMULADOR = Target.the("Boton para simular credito").located(By.id("boton-simular"));

}
