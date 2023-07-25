
package data;


public class Square extends Rectangle{
    
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
    }
    
    //tạo thêm 1 cái method riêng của con
    public void draw(){
        System.out.println("ahihi");
    }
    
    @Override
    public void showInfor() {
        String str = String.format("Square| %-15s|%-15s| %5.2f| %5.2f| %5.2f", owner, color, width, getArea(), getPerimeter());
        System.out.println(str);
    }
    
    
}
