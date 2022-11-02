package guru.springframework.sfgdi.services.solid_d.lollevel;

import guru.springframework.sfgdi.services.solid_d.Switchable;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan : turn on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan : turn off...");
    }
}
