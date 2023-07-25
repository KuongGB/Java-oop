
package runtime;
//quản lý danh sách các hình tam giác
//vuông - đều - thường

import data.RightTriangle;
import data.Triangle;


public class Program {
    public static void main(String[] args) {
        //tạo tam giác thường
        Triangle tr1 = new Triangle(3,7,5);
        //tam giác vuông
        RightTriangle tr2;
        tr2 = new RightTriangle(3, 4, 5);
        
        Triangle trList[] = new Triangle[2];
        trList[0] = tr1;
        trList[1] = tr2;
        
//        for(int i = 0; i <= trList.length - 1; i++){
//           trList[i].showProfile();
//        }

//    for each      
        for (Triangle item: trList){
            item.showProfile();
        }
    }
}
