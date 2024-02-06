package epicode.u5d1;

import epicode.u5d1.entities.MenuList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class U5d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5d1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d1Application.class);

		MenuList menuList = (MenuList) ctx.getBean("getMenu");
menuList.printMenu();
	}

}
