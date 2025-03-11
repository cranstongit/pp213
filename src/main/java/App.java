import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean);
        System.out.println(bean1);
        System.out.println("Равны ли bean и bean1? " + (bean == bean1));

        Cat catBean = (Cat) applicationContext.getBean("catmew");
        Cat catBean1 = (Cat) applicationContext.getBean("catmew");
        System.out.println(catBean);
        System.out.println(catBean1);
        System.out.println("Равны ли catBean и catBean1? " + (catBean == catBean1));
    }
}