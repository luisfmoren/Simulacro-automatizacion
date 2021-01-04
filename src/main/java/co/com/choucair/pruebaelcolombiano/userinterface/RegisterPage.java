package co.com.choucair.pruebaelcolombiano.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

    public static final Target  BUTTON_REGISTER = Target.the("Button register")
            .located(By.id("registro"));

    public static final Target  INPUT_NAME = Target.the("input name")
            .located(By.id("ctl00__cphPrincipal_txtPrimerNombre"));

    public static final Target  INPUT_LAST_NAME = Target.the("input last name")
            .located(By.id("ctl00__cphPrincipal_txtPrimerApellido"));

    public static final Target  INPUT_EMAIL = Target.the("input EMAIL")
            .located(By.id("ctl00__cphPrincipal_txtCorreoElectronico"));

        public static final Target  INPUT_PASSWORD = Target.the("input password")
            .located(By.id("ctl00__cphPrincipal_txtClave"));

    public static final Target  INPUT_CONFIRM_PASSWORD = Target.the("input confirm password")
            .located(By.id("ctl00__cphPrincipal_txtConfirmarClave"));

    public static final Target  CHECK_HEANDLINES = Target.the("check heandlines")
            .located(By.id("ctl00__cphPrincipal_chkRecibirTitulares"));


    public static final Target  CHECK_THIRD_PARTIES = Target.the("check third parties")
            .located(By.id("ctl00__cphPrincipal_chkUsoInfoTerceros"));

    public static final Target TEXT_CONFIRM = Target.the("Text confirm page")
            .located(By.xpath("//*[@id='ctl00__cphPrincipal_ctl00']/div/center/div/h1"));
}
