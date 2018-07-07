package cloud.bastis.guice;

import cloud.bastis.guice.logmod.Logger;
import cloud.bastis.guice.logmod.LoggingModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new LoggingModule());
        Logger lm = injector.getInstance(Logger.class);
        lm.log("hello world");
    }
}
