package guru.springframework.sfgdi.services.solid_l;

public class KidsBicycle implements DeviceWithoutEngine{

    @Override
    public int wheelNumbers() {
        return 3;
    }

    @Override
    public String name() {
        return "Kids 1+";
    }

    @Override
    public double speed() {
        return 30;
    }
}
