package epicode.u5d1;

import epicode.u5d1.entities.*;
import epicode.u5d1.enums.OrderStatus;
import epicode.u5d1.superclass.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
@PropertySource("application.properties")
public class Runner implements CommandLineRunner {
    @Autowired
    private AnnotationConfigApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {

        MenuList menuList = (MenuList) ctx.getBean("getMenu");
        menuList.printMenu();

        System.out.println("Order");
        Table table1 = (Table) ctx.getBean("table1");
        Pizza pizza1 = (Pizza) ctx.getBean("getMargherita");
        Pizza pizza2 = (Pizza) ctx.getBean("getSalamiPizza");
        Drinks drink1 = (Drinks) ctx.getBean("getWater");
        Drinks drink2 = (Drinks) ctx.getBean("getLemonade");
        List<Element> items = new ArrayList<>();
        items.add(pizza1);
        items.add(pizza2);
        items.add(drink1);
        items.add(drink2);

        Orders order = new Orders(table1, items, 1, OrderStatus.IN_PROGRESS, 5, LocalDate.now());
        order.printOrder();

    }
}
