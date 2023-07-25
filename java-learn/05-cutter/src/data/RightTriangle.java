package data;
//tam giác vuông là 1 tam giác
//tam giác chưa chắc là tam giác vuông
//đây là mối quan hệ is a
//trước is a là con
//sau là cha

//cha nó có method tính diện tích, chu vi r
//method show thông tin

//ý nghĩa : sao phải nhận cha
//cái gì ng bề trên làm tốt thì dùng lại, đỡ làm lại
//cái gì ng bề trên k tốt thì phải cải thiện hơn
//mà cái gì mình update từ đồ của cha thì cha k đc xài

public class RightTriangle extends Triangle{//hình vuông
    
    //đây là constructor của RightTriangle
    public RightTriangle(double edgeA, double edgeB, double edgeC) {
        super(edgeA, edgeB, Math.sqrt(edgeA*edgeA + edgeB*edgeB));
    }


    //super chính là new cha : => new Triagle
    //Khi tạo tam giác vuông, thì nó đi tạo tam giác thường trc
    //vì lý do này nên object con sẽ có kích thức lớn hơn object cha
    @Override
    public void showProfile(){
        String str = String.format("|RightTriangle|%5.2f|%5.2f|%5.2f|%5.2f|%5.2f|", edgeA, edgeB, edgeC, getArea(), getPerimeter());
        System.out.println(str);
    }
}
//khi có 2 class ké thừa nhau
//object từ class con có bé hơn object từ class cha ko
//class con kế thừa class cha
//là có hết những gì của cha
//ngay cả constructor của con chứa constructor của cha
//nên object tạo từ class con sẽ phải tạo thông qua class cha kèm thêm code riêng của con
//=> object con lớn hơn object cha

//overRide là gì em?
//chỉ xuất hiện trong mối quan hệ is a (cha con)
//xuất hiện khi thằng con muốn độ lại hàm của thằng cha
//con có 1 hàm cùng tên (cùng parameter, khác body)

//vậy overload là gì?
//ko quan tâm mối quan hệ cha con
//2 hàm cùng tên mà khác parameter là overload