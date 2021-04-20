package co.com.retotecnico.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Pause implements Interaction {

    private long segundos;

    public Pause(long segundos) {
        this.segundos=segundos*1000;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        InternalSystemClock clock=new InternalSystemClock();
        clock.pauseFor(segundos);
    }

    public static Pause inSeconds(long segundos) {
        return new Pause(segundos);
    }
}
