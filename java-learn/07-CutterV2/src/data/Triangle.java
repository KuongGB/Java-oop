
package data;

import static java.lang.Math.sqrt;


public class Triangle extends Shape{

    protected double edge1;
    protected double edge2;
    protected double edge3;

    public Triangle(String owner, String color, double edge1, double edge2, double edge3) {
        super(owner, color);
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }
       
    
    @Override
    public double getArea() {
        double p = (edge1 + edge2 + edge3)/2;
        return sqrt(p*(p-edge1)*(p-edge2)*(p-edge3));
    }

    @Override
    public double getPerimeter() {
        return edge1 + edge2 + edge3;
    }

    @Override
    public void showInfor() {
        String str = String.format("Triangle| %-15s|%-15s|%5.2f|%5.2f|%5.2f|%5.2f|%5.2f", 
                owner, color, edge1, edge2, edge3, getArea(), getPerimeter());
        System.out.println(str);
    }
    
}
