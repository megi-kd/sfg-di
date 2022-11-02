package guru.springframework.sfgdi;

import guru.springframework.sfgdi.services.solid_d.ElectricPowerSwitch;
import guru.springframework.sfgdi.services.solid_d.Switch;
import guru.springframework.sfgdi.services.solid_d.Switchable;
import guru.springframework.sfgdi.services.solid_d.lollevel.Fan;
import guru.springframework.sfgdi.services.solid_d.lollevel.LightBulb;
import org.junit.jupiter.api.Test;


public class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws  Exception {
        Switchable switchableBulb = new LightBulb();
        Switch lightBulbSwitch = new ElectricPowerSwitch(switchableBulb);
        lightBulbSwitch.press();
        lightBulbSwitch.press();

        Switchable switchableFan = new Fan();
        Switch fanSwitch = new ElectricPowerSwitch(switchableFan);
        fanSwitch.press();
        fanSwitch.press();


    }
}
