package guru.springframework.sfgdi.services.solid_i;

public class ToyCar implements  Toy, Movable{
    double price;
    String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("Start moving the car.");
    }

    @Override
    public String toString() {
        return "Movable ToyCar{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
