package es.fan;

import org.springframework.stereotype.Component;

@Component
public class Fan {

    public void turnOn() {
        System.out.println("es.es.fan.ElectricalFan.turnOn");
    }

    public void turnOff() {
        System.out.println("es.es.fan.ElectricalFan.turnOff");
    }
}