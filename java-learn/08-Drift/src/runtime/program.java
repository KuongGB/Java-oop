
package runtime;

import data.Rectangle;
import data.Square;


public class program {
    public static void main(String[] args) {
        //khai cha new cha
        Rectangle r1 = new Rectangle("tía", "hồng", 2, 3);
        r1.showInfor(); //chạy method showInfor của ai?
        Square s1 = new Square("con", "đỏ", 3);
        s1.showInfor(); // của con
        Rectangle r2 = new Square("Son", "Cam", 4);
        r2.showInfor(); // của con lun
        
        ///r2.draw được k ??
        //bạn mang danh là cha
        //vùng nhớ của bạn tuy là của con nhưng bạn mang danh là cha
        //nên bạn k đc dùng
        //nhưng rõ ràng mình có method draw
        
        //trong TH khai cha new con
        //mình muốn dùng đồ của con thì mìn dùng bằng cách ép kiểu
        //cách 1: thông qua biến trung gian\
        Square tmp = (Square)s1;
        tmp.draw();
        //cách 2: ko qua Class trung gian
        ((Square)s1).draw();
    }
}
