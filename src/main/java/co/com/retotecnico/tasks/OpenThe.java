package co.com.retotecnico.tasks;

import static co.com.retotecnico.userinterface.Principal.*;

import co.com.retotecnico.interactions.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class OpenThe implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_TARIFF), Pause.inSeconds(1), Click.on(BTN_TARIFF),
                Click.on(BTN_PDF));

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public static OpenThe pdf(){
        return Tasks.instrumented(OpenThe.class);
    }
}
