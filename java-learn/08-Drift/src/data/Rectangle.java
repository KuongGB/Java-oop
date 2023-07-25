
package data;


public class Rectangle {
    protected String owner;
    protected String color;
    protected double width;
    protected double height;
    //constructor

    public Rectangle(String owner, String color, double width, double height) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.height = height;
    }
    //method riêng của Class
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width + height) * 2;
    }
    public void showInfor(){
        String str = String.format("Rectangle| %-15s|%-15s| %5.2f| %5.2f| %5.2f| %5.2f", owner, color, width, height, getArea(), getPerimeter());
        System.out.println(str);
    }
}

