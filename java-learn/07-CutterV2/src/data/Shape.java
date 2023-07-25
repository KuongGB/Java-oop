package data;

//class cha chỉ có những thứ chung của các con
public abstract class Shape {
    protected String owner;
    protected String color;
//      private double edge;// ko được vì hình tròn k có cạnh 


//constructor

    public Shape(String owner, String color) {
        this.owner = owner;
        this.color = color;
    }
    
//getter//setter

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //tạo tính diện tích tính chu vi
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void showInfor();
    
}
