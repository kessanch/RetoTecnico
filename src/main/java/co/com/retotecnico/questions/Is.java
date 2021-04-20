package co.com.retotecnico.questions;

import co.com.retotecnico.userinterface.Principal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Is implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Principal.PDF_VIEWER.resolveFor(actor).isPresent();
    }

    public static Is open(){
        return new Is();
    }
}
