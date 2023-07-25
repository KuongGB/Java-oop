//Ngựa
package data;

import java.util.Random;

public class Horse extends Herbivore implements StudyEnthusiasts{
    //ngựa lúc học toàn cười hí hí
    //cao nhất là 30%
    public static final double RECEPTIVE = 30;
    //con ngựa này đặc biệt khác nhỉ
    //có yên
    private String colorSaddle;  //màu yên ngựa
    
    //constructor

    public Horse(String name, int yob, double weight, String colorSaddle) {
        super(name, yob, weight);
        this.colorSaddle = colorSaddle;
    }

    @Override
    public double study() {
        Random rd = new Random();
        return rd.nextDouble()*RECEPTIVE;
    }

    @Override
    public void showLearningOutComes() {
        String str = String.format("Horse    |%-15s|%4d|%06.2f|%5.2f|%-10s", name, yob, weight, study(), colorSaddle);
        System.out.println(str);
    }

    @Override
    public double studyHard() {
        return study()*1.5;
    }

    @Override
    public void showInfor() {
        String str = String.format("Horse    |%-15s|%4d|%06.2f|%5.2f|%-10s", name, yob, weight, studyHard(), colorSaddle);
        System.out.println(str);
    }
    
}
//Hunter
//Thằng khỉ thì nó sợ hàng nóng của bác thợ săn nên nó, quyết tâm không tham gia
//mà 1 thằng sợ súng hơn mù chữ thì k thể nào là 1 StudyEnthusiasts
