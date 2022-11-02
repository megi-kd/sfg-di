package guru.springframework.sfgdi.services.solid_d.nok;

public class ElectricPowerSwitch_NOK {

    public LightBulb_NOK lightBulbNOK;
    public boolean on;

    public ElectricPowerSwitch_NOK(LightBulb_NOK lightBulbNOK, boolean on) {
        this.lightBulbNOK = lightBulbNOK;
        this.on = on;
    }

    public  boolean isOn() {
        return this.on;
    }

    // based on the state, we called the turnOn() and turnOff() methods
    //but NOK is that this class is with direct dependency to LightBulb
    //a switch should be able to turnOn/Off also fan, blender...
    //modifications will be required in the ElectricPowerSwitch class each time we add a new appliance or device.
    public void press() {
        boolean checkOn = isOn();
        if(checkOn) {
            lightBulbNOK.turnOff();
            this.on = false;
        } else {
            lightBulbNOK.turnOn();
            this.on = true;
        }
    }
}
