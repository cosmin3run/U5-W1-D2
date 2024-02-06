package epicode.u5d1;

import epicode.u5d1.entities.Drinks;
import epicode.u5d1.entities.MenuList;
import epicode.u5d1.entities.Pizza;
import epicode.u5d1.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {
    //TOPPINGS
    @Bean
    Toppings getTomato(){
        return new Toppings("Tomato", 92, 0.69);
    }

    @Bean
    Toppings getCheese(){
        return new Toppings("Cheese", 92, 0.69);
    }

    @Bean
    Toppings getHam(){
        return new Toppings("Ham", 35, 0.99);
    }
    @Bean
    Toppings getOnions(){
        return new Toppings("Onions", 22, 0.69);
    }
    @Bean
    Toppings getPineapple(){
        return new Toppings("Pineapple", 24, 0.79);
    }
    @Bean
    Toppings getSalami(){
        return new Toppings("Salami", 68, 0.99);
    }

    //DRINKS

    @Bean
    Drinks getLemonade(){
        return new Drinks("Lemonade (0.33l)", 128, 1.29);
    }
    @Bean
    Drinks getWater(){
        return new Drinks("Water (0.5l)", 0, 1.29);
    }
    @Bean
    Drinks getWine(){
        return new Drinks("Wine (0.75l, 13%)", 607, 1.29);
    }

    //PIZZAS

    @Bean
    Pizza getMargherita(){
        List<String> toppings = new ArrayList<>();
        toppings.add(getTomato().getName());
        toppings.add(getCheese().getName());
        return new Pizza("Margherita", 1104, 4.99, toppings);
    }
    @Bean
    Pizza getHawaiian(){
        List<String> toppings = new ArrayList<>();
        toppings.add(getTomato().getName());
        toppings.add(getCheese().getName());
        toppings.add(getHam().getName());
        toppings.add(getPineapple().getName());
        return new Pizza("Hawaiian pizza", 1024, 6.49, toppings);
    }

    @Bean
    Pizza getSalamiPizza(){
        List<String> toppings = new ArrayList<>();
        toppings.add(getTomato().getName());
        toppings.add(getCheese().getName());
        toppings.add(getCheese().getName());
        toppings.add(getSalami().getName());
        return new Pizza("Salami pizza", 1024, 6.49, toppings);
    }

    @Bean
    MenuList getMenu(){
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(getMargherita());
        pizzas.add(getHawaiian());
        pizzas.add(getSalamiPizza());

        List<Toppings> toppings = new ArrayList<>();
        toppings.add(getSalami());
        toppings.add(getHam());
        toppings.add(getPineapple());
        toppings.add(getOnions());
        toppings.add(getCheese());

        List<Drinks> drinks = new ArrayList<>();
        drinks.add(getLemonade());
        drinks.add(getWater());
        drinks.add(getWine());


        return new MenuList(pizzas, drinks, toppings );
    }

}
