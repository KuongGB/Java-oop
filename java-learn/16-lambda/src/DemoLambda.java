//lambda ở trong java đc ví như arrow function trong js
//nhưng cùi hơn
public class DemoLambda {
    public static void main(String[] args) {
        //tạo object từ Human(interface)
        Human tan = new Human() {
            @Override
            public void show() {
                System.out.println("Chao");
            }
        };
        tan.show();
        
        Human diep = () ->{//vẫn là implement cho method show()
            System.out.println("Bye");
        };
        diep.show();
        
        //lambda có argument
        Math sum = (a,b)->{ //có int hay bỏ int cx đc
            return a + b;
        };
        System.out.println(sum.add(5,7));
        Math sum1 = (a,b)-> a + b;
        System.out.println(sum.add(9,7));
    }
}

//JDK7: quy định 1 interface chỉ có 1 method mà thôi
//lambda chỉ xuất hiên từ JDK8 trở lên

//tại sao nên dùng lambda
//1. sẽ cung cấp bản thực hiện giao diện chức năng
//2. viết code ít hơn

//(argument-List) -> {body}
//argument-List: có thể để trống hoặc ko
//-> : arrow token: dùng để liên kết argument với biểu thức body
//body: chứa các khối lệnh
//nếu code chỉ có 1 dòng thì khỏi return

@FunctionalInterface
interface Human{
    public void show(); //abstract
}

//nguyên tắc 1 file java chỉ đc chứa 1 file public(phải trùng tên file)

interface Math{
    public int add(int a, int b);
}

