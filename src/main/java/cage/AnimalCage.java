package cage;

import animal.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Timer;

public class AnimalCage {
    @Autowired
    @Qualifier("dog")
    public Animal animal;

    @Autowired
     public Timer timer;
}
