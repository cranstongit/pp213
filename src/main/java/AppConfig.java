import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="catmew")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setMew("Mew-Mew");
        return cat;
    }
}
/*В классе AppConfig содержится метод,
помеченный аннотацией как бин, этот метод будет выполнен
при запуске и его результат станет объектом, управляемым Спрингом.
 */