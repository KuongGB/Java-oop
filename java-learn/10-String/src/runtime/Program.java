package runtime;

import java.util.StringTokenizer;

public class Program {

    public static void main(String[] args){        
        //muốn lưu họ của mình
        String lastName = new String("Trịnh ");
        //tạo bằng new lưu ở heap bth
        String tmp = lastName; //tmp tham chiếu
        //đến vùng nhớ của lastName
        String firstName = new String("Cường ");
        
        //lastName.concat(firstName); //nối // sao k nối??''a
        //code như trên là ch học bài
        
        //String là 1 immutable Class
        //immutable Class: các method k lm thay đổi
        //object, mà sẽ return ra object mới
        lastName = lastName.concat(firstName);
        System.out.println("lastName : "+lastName);
        System.out.println(tmp);
        
        //StringBuilder và StringBuffer là mutable
        //Mutable : method ảnh hưởng đến object
        
        StringBuilder lastName2 = new StringBuilder("Trịnh ");
        StringBuilder tmp2 = lastName2;
        StringBuilder firstName2 = new StringBuilder("Cường ");
        lastName2.append(firstName2); //concat nhưng của StringBuilder
        System.out.println("lastName2 = "+lastName2);
        System.out.println("Tmp2 : "+tmp2);
        
        //StringTokenizer
        String information = "SE162149|Trịnh Cường|2002|10.0"; //POOL
        StringTokenizer st = new StringTokenizer(information, "|");
        System.out.println("Infor: "+information);
        System.out.println(st.countTokens());
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());// băm và return ra khúc bị băm
        }
        System.out.println(st.countTokens());
        System.out.println("st = "+st);
        System.out.println("Infor = "+information); //vì nó là immutable nên nó k đổi
        
        //tìm hiểu về method của String
        checkStringMethod();
        comparationString();
    }
    public static void checkStringMethod()
    {
        //khi dùng String phải để ý method return cái gì
        //vì String là immutable, và nếu như nó return về 1 String
        //điều đó có nghĩa là có thề '.' tiếp được
        String str1 = "Điệp";
        System.out.println(str1.toUpperCase().toLowerCase());
        System.out.println(str1); //vẫn giữ nguyên vì nó là immutable
        str1 = str1.toLowerCase();
        System.out.println("After gan : "+str1);
        
        //nối chuỗi: + | .concat()
        str1 = "Cường";
        String str2 = "vip";
        str1 += str2;
        System.out.println("str1 = "+str1);
        // .length() lấy độ dài
        //tìm chuỗi trong chuỗi .indexOf()
        str1 = "Cường n m vip";
        str2 = " ";
        int pos = str1.indexOf(str2); //5
        System.out.println("pos = "+pos);
        
        //charAt() // return ra ký tự ở vị trí nào đó
        char ch = str1.charAt(pos);
        System.out.println(ch);
        
        //contain: tìm xem có tồn tại k
        str1 = "đẹp";
        boolean isFind = str1.contains(str2); //true
        System.out.println("isFind = "+isFind);
    }
    public static void comparationString(){
        String s0 = new String("CƯỜNG NÈ");
        String s1 = "CƯỜNG NÈ";
        String s2 = "CƯỜNG NÈ";
        String s3 = "cường nè";
        String s4 = new String("CƯỜNG NÈ");
        String s5 = new String("CƯỜNG NÈ");
        
        System.out.println(s0 == s3);
        System.out.println(s1 == s2);
        //tạo bằng pool thì giá trị bằng nhau vì nó trỏ cùng 1 vùng nhớ
        
        //muốn so sánh object thì k dùng ==, như vậy là so địa chỉ
        
        //phải so sánh thông qua method
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));
            //ko quan tâm hoa thường
        System.out.println(s4.compareTo(s5)); //trả ra -1 0 1
        System.out.println(s4.compareToIgnoreCase(s5));
            //k quan tâm hoa thường
    }       
}