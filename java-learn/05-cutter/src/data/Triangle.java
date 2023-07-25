
package data;


public class Triangle {
    protected double edgeA;
    protected double edgeB;
    protected double edgeC;
    
    //ko đặt các thuộc tính chu vi diện tích ở đây
    //1: khi tạo object thì các thuộc tính ch có giá trị
    //khi ch có gtri thì thuộc tính sẽ chứa giá trị sai
    //2: vid area và perimeter đều có thể tính đc từ 3 cạnh
    //  nếu như mình để sau constructor thì ngta có thể thay đổi giá trị
    //  **** cái nào tính đc từ các thuộc tính thì k nên tạo
    
    //constructor: cái phễu để đúc
    public Triangle(double edgeA, double edgeB, double edgeC){
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }
    //các getter/setter

    public double getEdgeA() {
        return edgeA;
    }

    public void setEdgeA(double edgeA) {
        this.edgeA = edgeA;
    }
    
    public double getEdgeB() {
        return edgeB;
    }

    public void setEdgeB(double edgeB) {
        this.edgeB = edgeB;
    }
    
    public double getEdgeC() {
        return edgeC;
    }

    public void setEdgeC(double edgeC) {
        this.edgeC = edgeC;
    }
    
    //getPerimeter : method lấy chu di
    public double getPerimeter(){
        return edgeA + edgeB + edgeC;
    }
    
    //getArea : method tính diện tích
    public double getArea(){
        double p = getPerimeter()/2; //nửa chu vi
        return Math.sqrt(p * (p - edgeA)*(p - edgeB)*(p - edgeC));
    }
    
    public void showProfile(){
        String str = String.format("|Triangle|%5.2f|%5.2f|%5.2f|%5.2f|%5.2f|", edgeA, edgeB, edgeC, getArea(), getPerimeter());
        System.out.println(str);
    }
}
