package co.com.test.store.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static final Target BTN_SIGN_IN = Target.the("Boton habilitar los campos de registro").located(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]"));
    public static final Target INPUT_USUARIO = Target.the("Input usuario").located(By.xpath("//input[@id='email']"));
    public static final Target INPUT_PASSWORD = Target.the("Input password").located(By.xpath("//input[@id='passwd']"));
    public static final Target BTN_REGISTRO = Target.the("Boton para registrarse").located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]"));
}
