import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean.getMessage());
    }
}

/*Класс App содержит метод main, который запускает Спринг при создании контекста.
В контекст мы передаем класс AppConfig, который помечен аннотацией @Configuration
— так Спринг понимает, что это настроечный класс.*/