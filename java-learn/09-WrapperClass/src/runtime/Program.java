
package runtime;

public class Program {
    public static void main(String[] args) {
        
    
    //tạo biến bình thường
    int numInt = 10; //cấp vùng nhớ trên ram
    //stack 4 byte, có value là 10
    //tên là numInt
    //32bit on off hiển thị số 10
    //00000...0000000110 (tổng các số là 32)
    
    //numInt. vì kích thước quá nhỏ, nên k có method
    //dùng để lưu trữ số 10, kích thước nhẹ
    
    //lưu trữ số 10
    // nhưng dùng WrapperClass
    Integer numInteger = new Integer(10);//auto-boxing
    //bạn đang gói 1 primitive giá trị 10 vào 1 object 
    //primitive datatype trong object của WrapperClass
    //là core(Lõi)
    
    //dùng để lưu trữ và xử lý core bên trong
    //rất nặng cần cân nhắc khi dùng
    //
    Integer numInteger2 = 10; //đc (k cần new)
    
    System.out.println("numInteger = "+numInteger);
    //Khi em in như này thì có 1 cơ chế là auto-unboxing
    //giúp em mở hộp
    
    System.out.println(numInteger == numInteger2);
    //riêng về so sánh thì WrapperClass k auto
    //muốn so sánh 2 Wrapper thì dùng method
    
    System.out.println(numInteger.equals(numInteger2));
    //equal(): thằng a bằng b ko?
    
    System.out.println(numInteger.compareTo(numInteger2));
    //compareTo(): so sánh 
    
    int numInt2 = numInteger + numInteger2; //20
    numInt2 = numInteger2; //auto-unboxing
    //việc tính toán | in vs WrapperClass và Primitive
    //là bth
    //Nhưng so sánh thì cần thông qia method
        }
}