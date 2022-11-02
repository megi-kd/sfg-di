package guru.springframework.sfgdi.services.solid_d;

//this abstraction in form of interface will allow to have more type of switches, like remote as well
public interface Switch {

    boolean isOn();
    void press();
}
