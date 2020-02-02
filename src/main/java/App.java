import cage.AnimalCage;
import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalCage animalCage = applicationContext.getBean(AnimalCage.class);
        System.out.println(animalCage.animal);
        System.out.println(animalCage.timer);
    }
}