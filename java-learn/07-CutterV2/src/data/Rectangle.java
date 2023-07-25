package data;
//xác định cha là shape
//thêm những đặc tính riêng của con
//render constructor

public class Rectangle extends Shape{
    protected double width;
    protected double height;

    public Rectangle(String owner, String color, double width, double height) {
        super(owner, color);
        this.width = width;
        this.height = height;
    }

    

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }

    @Override
    public void showInfor() {
        String str = String.format("Rectangle| %-15s|%-15s|%5.2f|%5.2f|%5.2f|%5.2f", 
                owner, color, height, width, getArea(), getPerimeter());
        System.out.println(str);
    }
}
