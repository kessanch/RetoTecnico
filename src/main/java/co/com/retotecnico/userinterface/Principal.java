package co.com.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Principal {
    public static final Target BTN_TARIFF = Target.the("Tariff button").locatedBy("//a[text()='Tarifario']");
    public static final Target BTN_PDF = Target.the("PDF button").locatedBy("(//span[@class='bt-content']//a)[2]");
    public static final Target PDF_VIEWER = Target.the("PDF viewer").locatedBy("//pdf-viewer");
}
