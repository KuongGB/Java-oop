/*
    mình có nhiệm vụ phổ cập kiến thức cho các loại vật trong hoang giả
    ngày đầu đi dạy, mình được gặp được ngựa, khỉ
    
 */
package runtime;

import data.Herbivore;
import data.Horse;
import data.Hunter;
import data.Monkey;
import data.StudyEnthusiasts;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Monkey m1 = new Monkey("Rafiki", 1998, 210);
        Monkey m2 = new Monkey("Abu", 1994, 30);
        Herbivore h1 = new Horse("Rarity", 2015, 0, "none");
        Horse h2 = new Horse("Roach", 2019, 170, "gray");
        
        
        //anh bàn riêng về nhà Herbivore
        //trong 1 ngay mùa đông trời lạnh
        //có 1 bạn thú nhỏ xin vào lớp
        //bạn rất chậm hiền và ăn lá cây
        //biết bạn ăn lá => herbivore
        //nhưng k biết rõ là con gì
        //=> anonymous
        
        Herbivore xxx = new Herbivore("Chậm chạp", 2021, 4) {
            @Override
            public double study() {
                return 80;
            }

            @Override
            public void showLearningOutComes() {
            String str = String.format("XXX      |%-15s|%4d|%06.2f|%5.2f|", name, yob, weight, study());
            System.out.println(str);
            }
        };
        
        //tạo mảng chứa các con này
        Herbivore studentList[] = {m1,m2,h1,h2, xxx};
        //
        for(Herbivore item : studentList){
            item.showLearningOutComes();
        }
        //thấy lớp học vui quá mấy a thợ săn cx muốn học cùng
        //bác thợ săn muốn gia nhập vào cx với các em động vật ăn cỏ
        //vậy làm sao để lưu trữ đc bác thợ săn
        Hunter hun1 = new Hunter("Thợ săn vượn", 1999, 0,"Nỏ");
        Hunter hun2 = new Hunter("Mắt diều hâu", 1999, 0, "Cung");
        hun1.showLearningOutComes();
        hun2.showLearningOutComes();
        
        System.out.println("Sau khi có clb mới");
        StudyEnthusiasts newStudentList [] = new StudyEnthusiasts[5];
        //newStudentList[0] = m1; //vì khỉ k tham gia nên k đc
        //newStudentList[0] = h1; // h1 mang danh là Herbivore nên ko đc vào dù là Horse
        
        newStudentList[0] = (Horse)h1;
        newStudentList[1] = h2;
        newStudentList[2] = hun1;
        newStudentList[3] = hun2;
        
        //có 1 con lười nhưng lại siêng học
        //tạo cái khuôn (class) con lười, 
        
        newStudentList[4] = new StudyEnthusiasts() {
            @Override
            public double studyHard() {
                return new Random().nextDouble()*100;
            }

            @Override
            public void showInfor() {
                String str = String.format("XXXXX    |%-15s|%4d|%06.2f|%5.2f|", "FLASH", 2016, 70f, studyHard());
                System.out.println(str);    
            }
        };
        
        //in ra danh sách 
        for(StudyEnthusiasts student : newStudentList){
            student.showInfor();
        }
    }
}

