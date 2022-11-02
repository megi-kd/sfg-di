package guru.springframework.sfgdi.services.solid_d.lollevel;

import guru.springframework.sfgdi.services.solid_d.Switchable;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light Bulb : turn on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Light Bulb : turn off...");
    }
}
