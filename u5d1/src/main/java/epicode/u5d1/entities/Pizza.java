package epicode.u5d1.entities;

import epicode.u5d1.superclass.Element;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pizza extends Element {
    private String description;
    private List<String> toppings;


    public Pizza(String name, int calories, double price) {
        super(name, calories, price);
        this.description = "tomato, cheese ";
    }

    public Pizza(String name, int calories, double price, List<String> toppings) {
        super(name, calories, price);
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings: " + toppings +
                ", name=' " + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                "} " +'\n';
    }
}
