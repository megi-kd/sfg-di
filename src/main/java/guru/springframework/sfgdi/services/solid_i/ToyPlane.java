package guru.springframework.sfgdi.services.solid_i;

public class ToyPlane implements  Toy, Movable, Flyable {
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
        System.out.println("Plane is moving.");
    }

    @Override
    public void fly() {
        System.out.print("Plane is flying.");
    }

    @Override
    public String toString() {
        return "Flying ToyPlane{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
