package cloud.bastis.guice.logmod;

import cloud.bastis.guice.logmod.FileLogger;
import cloud.bastis.guice.logmod.Logger;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

@Singleton
public class LoggingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Logger.class).to(FileLogger.class);
    }

}
