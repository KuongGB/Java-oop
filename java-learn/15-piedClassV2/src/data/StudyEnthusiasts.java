
package data;
//StudentEnthusiasts : hội những ng ham học
//nếu bác thợ săn đến lớp chỉ tập trung học ko thèm nhìn con ngựa
//thì bác là 1 ng ham mê học
//nếu ngựa và khỉ tập trung học k quan tâm đến cái gì khác thì
//khỉ và ngựa là con vật ham học
//là 1 StudentEnthusiasts thì phải ham học

//interface là gì: 1 class đặc biệt
//class này k quan tâm đến thuộc tính

//k cần constructor
//ko cần getter và setter

//class này chỉ chứa abstract method mà thôi, dù cho ko thêm từ khoá abstract thì 
//vẫn hiểu là abstract

public interface StudyEnthusiasts {
    //hội này ai cx có thể tham gia
    //=> ko quan tâm đặc điểm
    //nếu có 1 thuộc tính thfi sài chung
    //cho tất cả thành viên
    int FEE = 500; //initialValue
    //vì là interface nên viết z là tự hiểu của chung == public static int FEE = 500;
    //vì nhưng biến trong này có sẵn giá trị khi khởi tạo và là hằng số
    //nên nó k cần constructor
    public double studyHard();
    public void showInfor();
}
