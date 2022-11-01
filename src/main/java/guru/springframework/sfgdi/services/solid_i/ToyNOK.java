package guru.springframework.sfgdi.services.solid_i;

//Toy interface which is ok for toys like : Car, Plane...
// BUT NOK for HouseToy implements Toy, than house needs to implement aslo move, fly...
//Toy interface segregation to Toy, Movable, Flyable.... and many more in future for example Walking for robots..
public interface ToyNOK {

    void setPrice(double price);
    void setColor(String color);
    void move();
    void fly();
}
