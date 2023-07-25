
package data;

import static data.Monkey.RECEPTIVE;
import java.util.Random;

public class Hunter implements StudyEnthusiasts{
    protected String name;
    protected int yob;
    protected double weight;
    protected String gear;
    //do mãi mê nhìn phò mã của mình mà hunter học hành
    //mất tập trung
    public static final double RECEPTIVE = 50;

    public Hunter(String name, int yob, double weight, String gear) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
        this.gear = gear;
    }
    
    public double study() {
        Random rd = new Random();
        return rd.nextDouble()*RECEPTIVE;
    }
    
    public void showLearningOutComes() {
        String str = String.format("Hunter   |%-15s|%4d|%06.2f|%5.2f|%-20s", name, yob, weight, study(), gear);
        System.out.println(str);
    }

    @Override
    public double studyHard() {
        return study()*1.5;    
    }

    @Override
    public void showInfor() {
        String str = String.format("Hunter    |%-15s|%4d|%06.2f|%5.2f|%-20s", name, yob, weight, studyHard(), gear);
        System.out.println(str);    }
}
