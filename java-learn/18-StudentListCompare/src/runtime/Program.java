
package runtime;

import data.StudentV1;
import data.StudentV2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        sortV1();
        sortV2();
    }
    
    public static void sortV1(){
        //tạo ds sinh viên
        ArrayList<StudentV1> studentListV1 = new ArrayList<>();
        studentListV1.add(new StudentV1("SE0001", "Le","An", 8.2));
        studentListV1.add(new StudentV1("SE0005", "Nguyen","Binh", 7));
        studentListV1.add(new StudentV1("SE0002", "Ly","Dung", 9));
        studentListV1.add(new StudentV1("SE0004", "Tran","Cuong", 5));
        studentListV1.add(new StudentV1("SE0003", "Vo","Em", 9.9));
        
        //giờ mính muốn sort, mình có thể thông qua comparator
        //khi ta so sánh 2 đối tượng trong 1 ds
        //comparator là trọng tài đứng ra xem ai thắng thua
        //Comparator là 1 interface có 1 method
        //   compareTo: nhận vào 2 object r so sánh theo tiêu chí gì đó
        // return -1 hoặc 1
        //Collections sẽ tự sort luôm
        
        //tạo ra comparator
        /*
        Comparator orderById = new Comparator<StudentV1>() {
            @Override
            public int compare(StudentV1 t1, StudentV1 t2) {
                if(t1.getId().compareTo(t2.getId()) > 0){
                    return 1;
                }
                return -1;
            }
        };
        Collections.sort(studentListV1, orderById);
        */
        Collections.sort(studentListV1,new Comparator<StudentV1>(){
            @Override
            public int compare(StudentV1 t1, StudentV1 t2) {
                return t1.getLastName().compareTo(t2.getLastName());
            }
        });
        System.out.println("Show list:");
        for(StudentV1 student : studentListV1){
            student.showInfor();
        }
    }
    
    public static void sortV2(){
        //tạo ds sinh viên
        ArrayList<StudentV2> studentListV2 = new ArrayList<>();
        studentListV2.add(new StudentV2("SE0001", "Le","An", 8.2));
        studentListV2.add(new StudentV2("SE0005", "Nguyen","Binh", 7));
        studentListV2.add(new StudentV2("SE0002", "Ly","Dung", 9));
        studentListV2.add(new StudentV2("SE0004", "Tran","Cuong", 5));
        studentListV2.add(new StudentV2("SE0003", "Vo","Em", 9.9));
        
        Collections.sort(studentListV2);
        Collections.reverse(studentListV2);
        
        System.out.println("Show list:");
        for(StudentV2 student : studentListV2){
            student.showInfor();
        }
    }
}
