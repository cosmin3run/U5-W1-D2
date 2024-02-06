package epicode.u5d1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MenuList {
private List<Pizza> pizzas;
private List<Drinks> drinks;
private List<Toppings> toppings;

    public MenuList(List<Pizza> pizzas, List<Drinks> drinks, List<Toppings> toppings) {
        this.pizzas = pizzas;
        this.drinks = drinks;
        this.toppings = toppings;
    }

    public void printMenu(){
        System.out.println("MENU");
        System.out.println("Pizzas");
        this.pizzas.forEach(System.out::println);
        System.out.println();

        System.out.println("Drinks");
        this.drinks.forEach(System.out::println);
        System.out.println();

        System.out.println("Toppings");
        this.toppings.forEach(System.out::println);



    }

    @Override
    public String toString() {
        return "Menu:" +
                pizzas + '\n' +
                 drinks + '\n' +
                toppings +  '\n' ;
    }
}
