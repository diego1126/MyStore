package co.com.test.store.tasks;

import co.com.test.store.ui.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTks  implements Task {

    private String username;
    private  String password;

    public LoginTks(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Click.on(LoginUI.BTN_SIGN_IN)
                //Enter.theValue(username).into(SignInUI.INPUT_USUARIO),
                //Enter.theValue(password).into(SignInUI.INPUT_PASSWORD),
                //Click.on(SignInUI.BTN_REGISTRO)
        );
    }
    public static LoginTks signInStore(String username, String password) {
        return instrumented(LoginTks.class, username, password) ;

    }
}
