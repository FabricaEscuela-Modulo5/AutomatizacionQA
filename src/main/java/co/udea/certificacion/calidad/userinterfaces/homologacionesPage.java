package co.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class homologacionesPage extends PageObject {

    public static final Target TEXTOHOMOLOGACIONES  = Target.the("Titulo pagina").locatedBy("/html/body/div[1]/div/div/div[1]");

    public static final Target INPUTCODIGO = Target.the("Input de codigo").located(By.name("codigo"));
    public static final Target INPUTMATERIA = Target.the("Input de materia").located(By.name("materia"));
    public static final Target INPUTPROGRAMA= Target.the("Input de programa").located(By.name("programa"));
    public static final Target INPUTPERIODO = Target.the("Input de periodo").located(By.name("periodo"));
    public static final Target INPUTCALIFICACION = Target.the("Input de calificacion").located(By.name("calificacion"));
    public static final Target INPUTCOMENTARIO = Target.the("Input de comentario").located(By.name("comentario"));
    public static final Target BOTONAGREGAR = Target.the("Boton agregar").located(By.name("agregar"));
    public static final Target CAMPOTABLA = Target.the("Campo materia de la tabla").locatedBy("/html/body/div/div/div/table/tbody/tr/td[2]");
    public static final Target NODATOS = Target.the("campo de no datos").locatedBy("/html/body/div/div/div/table/tbody/td");


    public static final Target BOTONREGRESAR = Target.the("Boton de regresar").locatedBy("/html/body/div/div/div/div[4]/a[2]/button");
    public static final Target BOTONVERSOLICITUDES = Target.the("Boton ver solicitudes").locatedBy("/html/body/div/div/div/div[4]/a[1]/button");
}
