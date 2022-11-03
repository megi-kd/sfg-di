package guru.springframework.sfgdi.services.solid_l.nok;

public class Car implements  TransportationDevice{

    @Override
    public String name() {
        return "VW car";
    }

    @Override
    public double speed() {
        return 100l;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the car");
    }
}
