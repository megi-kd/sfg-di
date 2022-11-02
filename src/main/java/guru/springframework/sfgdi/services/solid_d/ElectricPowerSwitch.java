package guru.springframework.sfgdi.services.solid_d;

public class ElectricPowerSwitch implements Switch{

    public Switchable switchableClient;
    public boolean on;

    public ElectricPowerSwitch(Switchable switchableClient) {
        this.switchableClient = switchableClient;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }
    //calling the turnOn() and turnoff() methods on the interface,
    //which at run time will get invoked on the object passed to the constructor.
    //Now, we can add low-level switchable classes without worrying about modifying the ElectricPowerSwitch class

    public void press() {
        boolean checkOn = isOn();
        if(checkOn) {
            switchableClient.turnOff();
            this.on = false;
        } else {
            switchableClient.turnOn();
            this.on = true;
        }
    }
}
