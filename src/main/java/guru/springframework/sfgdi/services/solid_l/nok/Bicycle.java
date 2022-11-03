package guru.springframework.sfgdi.services.solid_l.nok;

public class Bicycle implements TransportationDevice {

    @Override
    public String name() {
        return "Capriolo bike";
    }

    @Override
    public double speed() {
        return 0;
    }

    @Override
    public void startEngine() {
        //NOK, in bicycle as transportation device we don't need this method implementation
        //better approach is to separate the transportationDevice interface
        System.out.println("Starting the bicycle ??????");

    }
}
