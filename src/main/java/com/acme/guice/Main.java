package com.acme.guice;

import com.acme.guice.logmod.Logger;
import com.acme.guice.logmod.LoggingModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new LoggingModule());
        Logger lm = injector.getInstance(Logger.class);
        lm.log("hello world");
    }
}
