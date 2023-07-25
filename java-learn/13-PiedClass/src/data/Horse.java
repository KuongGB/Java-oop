//Ngựa
package data;

import java.util.Random;

public class Horse extends Herbivore {
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
    
}
//về làm tiếp monkey
//và muốn sức tiếp thu 70%