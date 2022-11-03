package guru.springframework.sfgdi.services.solid_l;

public class Bicycle implements  DeviceWithoutEngine {

    @Override
    public String name() {
        return "Capriolo bicycle";
    }

    @Override
    public double speed() {
        return 60;
    }

    @Override
    public int wheelNumbers() {
        return 2;
    }
}
