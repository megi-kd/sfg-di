package guru.springframework.sfgdi.services.solid_l;

public class Car implements DeviceWithEngine {


    @Override
    public String name() {
        return "VW car";
    }

    @Override
    public double speed() {
        return 200;
    }

    @Override
    public void startEngigne() {
        System.out.println("Starting the engine");
    }
}
