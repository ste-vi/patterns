package org.stevi.gof.facade;

public class EngineFacadeImpl implements EngineFacade {

    private final Injector injector = new Injector();
    private final IgnitionSystem ignitionSystem = new IgnitionSystem();

    @Override
    public void start() {
        injector.injectFuel();
        ignitionSystem.ignite();
    }
}
