package data;


public class RightTriangle extends Triangle{

    public RightTriangle(String owner, String color, double edge1, double edge2) {
        super(owner, color, edge1, edge2, Math.sqrt(edge1*edge1 + edge2*edge2));
    }

    @Override
    public void showInfor() {
        String str = String.format("Triangle| %-15s|%-15s|%5.2f|%5.2f|%5.2f|%5.2f|%5.2f", 
                owner, color, edge1, edge2, edge3, getArea(), getPerimeter());
        System.out.println(str);
    }
    
}
