package es.powerbutton;

import org.springframework.stereotype.Component;

@Component
public interface PoweredDevice {

    void enable();

    void disable();
}

