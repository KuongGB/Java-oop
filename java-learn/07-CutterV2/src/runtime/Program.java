package runtime;

//lưu trữ các hình tròn, tam giác, vuông, chữ nhật

import data.Disc;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

public class Program {
    public static void main(String[] args) {
        //Khai con new con
        Rectangle r1 = new Rectangle("Cuong", "Trang", 2, 4);
        //Khai cha new cha
        Square s1 = new Square("Cuong", "Den", 3);
        //Khai cha new con
        Rectangle s2 = new Square("Con", "Vang", 6);
        
        //Khai con new cha - ko được// Phải có cha mới có con
        //Square s3 = new Rectangle("Daddy", "Tim", 2, 3);
        
        Shape d1 = new Disc("Cuong", "Hong", 4);
        
        //tạo danh sách các hình
        Shape ds[] = new Shape[5];
        ds[0] = r1;
        ds[1] = s1;
        ds[2] = s2;
        ds[3] = d1;
        ds[4] = new Triangle("Cuong", "Do", 3, 4, 5);
        
        for (Shape item : ds) {
            item.showInfor();
        }
        //
        //nếu h em có 1 hình, mà e cắt chơi chơi em ko biết nó là hình gì
        //em cắt 1 lần, ko tạo lại, cắt bằng tay
        //cắt nhanh
        //tạo 1 cái à, tạo khuôn thì lâu, mà ko biết đặt tên, nhưng nó là Shape
        //Vì tính đc area và peri, tô màu đc
        //Abstract class thì k tạo đc object
        //nhưng nếu ta ngoan cố tạo, thì ta phải biết kỹ thuật
        //"mượn gió bẻ măng" - anonymor Class(vô danh)
        Shape XXX = new Shape("XXX", "Cham"){
            @Override
            public double getArea() {
                return 100;
            }
            
            @Override
            public double getPerimeter() {
                return 70;
            }
            
            @Override
            public void showInfor() {
                String str = String.format("XXX    |%-15s|%-15s|%5.2f|%5.2f", owner, color, getArea(), getPerimeter());
            }
        };
        XXX.showInfor();
    }
}
//về vấn đề kế thừa: nguyên tắc bất hiếu
// cha sẽ cho con hết nhưng gì cha có
// con được tạo ra từ cha + code riêng của con
//về abstract class 
//  thì ko tạo đc object bằng cách bình thường
//  abstract class có 2 cách tạo object:
// 1- Thông qua class trung gian (kế thừa), ví dụ shape k tự tạo được -> rectangle
//    Rectangle kế thừa và vá lỗ (implement) -> tạo được object
// 2- Thông qua anonymour
//   ==> ý nghĩa | khi nào cần?
//      Muốn tạo object ko thông qua khuôn or ko biết tên là gì
//      Muốn tạo object nhanh từ abstract class mà k cần class trung gian
//      Ưu điểm nhanh với số lượng ít
//      ko tạo nhiều được (nếu k copy)

//cách nhận biết dùng anonymour:
//  - Mọi thứ đang có quy trình thì đột nhiên xuất hiện 1 thằng phá quy trình