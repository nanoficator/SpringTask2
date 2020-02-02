import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);
        HelloWorld helloWorld1 = applicationContext.getBean(HelloWorld.class);
        HelloWorld helloWorld2 = applicationContext.getBean(HelloWorld.class);
        System.out.println(cat1 == cat2);
        System.out.println(helloWorld1 == helloWorld2);
    }
}