package epicode.u5d1.entities;

import epicode.u5d1.superclass.Element;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Toppings extends Element {
    public Toppings(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                "} "  +'\n';
    }
}
