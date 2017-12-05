package es;

import es.lamp.Lamp;
import es.powerbutton.PoweredDevice;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("adapterlamp")
public class PowerButtonLampAdapte implements PoweredDevice {

    private Lamp lamp;

    public PowerButtonLampAdapte(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void enable() {
        lamp.turnOn();
    }

    @Override
    public void disable() {
        lamp.turnOff();
    }
}