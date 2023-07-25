package data;


public class Disc extends Shape{
    
    private final double radius;
    public static final double PI = 3.14;
    //static : xài chung cho tất cả hình tròn ko phải của riêng
    //final: cuối cùng => hằng số ko đc set chỉ đc get
    //hằng số thì full hoa

    public Disc(String owner, String color, double radius) {
        super(owner, color);
        this.radius = radius;
    }
    
    
    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return radius*2*PI;
    }

    @Override
    public void showInfor() {
        String str = String.format("Circle| %-15s|%-15s|%5.2f|%5.2f|%5.2f", 
                owner, color, radius, getArea(), getPerimeter());
        System.out.println(str);
    }
    
}
