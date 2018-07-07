package cloud.bastis.guice;

import cloud.bastis.guice.logmod.ConsoleLogger;
import cloud.bastis.guice.logmod.Logger;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

public class LoggingModuleTest {

    @Test
    public void testLoggingModule() {
        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(Logger.class).to(ConsoleLogger.class);
            }
        });
        Logger lm = injector.getInstance(Logger.class);
        lm.log("poop");
    }
}
