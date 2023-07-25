
package data;

import java.util.Random;

public class Monkey extends Herbivore{

    public static final double RECEPTIVE = 70;

    public Monkey(String name, int yob, double weight) {
        super(name, yob, weight);
    }
    
    
    
    @Override
    public double study() {
        Random rd = new Random();
        return rd.nextDouble()*RECEPTIVE;
    }

    @Override
    public void showLearningOutComes() {
        String str = String.format("Monkey   |%-15s|%4d|%06.2f|%5.2f|", name, yob, weight, study());
        System.out.println(str);
    }
    
}
