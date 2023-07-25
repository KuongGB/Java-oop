
package main;


public class Program {
    public static void main(String[] args) {
       /*
        trong Java người ta có đến 2 cách lưu trữ dữ liệu
        1-Primitive Datatype : Kiểu dữ liệu nguyên thuỷ
        dùng 1 lượng nhỏ bộ nhớ để biểu diễn 1 giá tị ko thể chia nhỏ đc
        
        có 8 loại dữ liệu nguyên thuỷ
        1-byte   (1 byte)   số nguyên rất nhỏ
        2-short  (2 byte)  số nguyên hơi nhỏ
        3-int    (4 byte)  số nguyên nhỏ
        4-long   (8 byte)  số nguyên lớn
        5-float  (4 byte)  số thực nhỏ
        6-double (8 byte)  số thực lớn
        7-char   (2 byte)  ký tự có dấu | hỗ trợ unicode
        8-boolean(1 bit | quá nhỏ để chỉ định) true|false
        //----Chưa học tới
        //Mỗi 1 primitive có tương ứng 1 tham chiếu gọi là
        //WrapperClass (Class trai bao)
        //--Lưu ý
        //Khi nói về giá trị mặc định (default value) ở biến 
        //primitive
        //sẽ là 0 (đối với kiểu số và chữ) cần lưu ý số thực
        //sẽ là false với boolean
        */ 
       char c = 65;
       System.out.println("biến c chứa " + c); //ln line new
       System.out.printf("biến c chứa %c\n", c);
       System.out.format("biến c chứa %c\n", c);
       //ta có 1 kiểu dữ liệu mới là byte
       //byte: số nguyên cực nhỏ  -128 -> 127
       byte numByte = -128;
        System.out.println("Biến numByte chứa " + numByte);
        int numInt = 12345;
        float numFloat = 123F;
        //trong java só thực thì ta float và double
        //nhưng java nó ưu tiên hiểu double
        //-> vì vậy dùng float thì phải đi kèm f|F để báo
        //hiệu cho java biết con số thực đó là float
        float a; //a sẽ là 0F
        //double
        double numDouble = 123.5;
        //vì nó hiểu số thực là double r
        //nên bạn dung thêm f|F|d|D ko dùng thì vẫn được ko sao cả
        
        //sử dụng biến
        //numInt = numByte;
        //gán giá trị của numBute vào numInt
        //numByte = numInt; // sai
        //2-reference datatype, object datatype: tham chiếu
        //kiểu dữ liệu do ng dùng tự định nghĩa
        //Object datatype được tạo từ nhiều primitive datatype
        //dùng để miêu tả nhiều đặc điểm của đối tượng (object) 
        //tạo kiểu dữ liệu Student(age, name, mark)
        
        //hackingPrimitive
        /*
            java luôn ưu tiên số kiểu int
        nếu em tạo cái gì đó số nguyên mà k lớn hơn int thì nó mặc định là int
        dù có lớn hơn vẫn mặc định là int
        */
        long numLong = 10_000_000_000L;
        int num1 = 0xFA;
        //0x là tiền tố / prefix ám chỉ con sô nguyên được biểu diễn dưới dạng hexa(16)
        System.out.println("num1 = "+ num1);
        int num2 = 076;
        //0 là tiền tố / prefix ám chỉ con số nguyên được
        //biểu diễn dưới dạng octal(8)
        System.out.println("num2 = "+ num2);
        //anh có nhậm đc giá trị là 76 ?
    }
}
