
package data;

//tạo ra 1 class

import java.util.Scanner;
import static jdk.nashorn.internal.runtime.Debug.id;

//chuyên tạo ra các tủ chứa đựng hồ sơ học sinh
public class StudentList {
    public static int max = 100;
    private static Student stl[] = new Student[max];
    private static int size = 0;
    //constructor
    public StudentList(){
        
    }
    //thêm sv
    public static void addStudent(){
        System.out.println("Add Student: ");
        Student newStudent = new Student();
        newStudent.inputInfor();
        stl[size] = newStudent;
        size++;
    }
    //hiển thị thông tin sv
    public static void showStudentList(){
        System.out.println("Student List");
        if(size == 0){
            System.out.println("Nothing to print");
            return;  //void (đơn giản ngừng thôi)
        }
        for(int i = 0; i <= size - 1; i++){
            stl[i].showInfor();      
        }
    }
    //tìm kiếm theo mảng sv
    //đưa id nhận về vị trí trong mảng
    public static int findPosById(String id){ 
        for(int i = 0; i <= size - 1; i++){
            if(stl[i].getId().equalsIgnoreCase(id)){
                return i;
            }
        }
        return -1;
    }
    //đưa id nhận về object
    public static Student findStuById(String id){
        int pos = findPosById(id);
        if(pos == -1) return null;
        return stl[pos];  
    }
    //đưa id nhân về đầy đủ thông tin
    public static void findStuById(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Id: ");
        String inputId = sc.nextLine();
        Student st = findStuById(inputId);
        if(st == null){
            System.out.println("This id is invalid");
        }else{
            System.out.println("Infor of student :");
            st.showInfor();
        }
    }
    //sort theo tên
    public static void sortByName(){
        if(size == 0){
            return;
        }
        for(int i = 0; i <= size - 2; i++){
            for(int j = i+1; i <= size - 1; j++){
                if(stl[i].getName().compareToIgnoreCase(stl[j].getName()) > 0){
                      //swap
                      Student studentTmp = stl[i];
                      stl[i] = stl[j];
                      stl[j] = studentTmp;
                }
            }
        }
    }
    
    //hiển thị thông tin sv có học bổng >8
    public static void showScholarShipSt(){
        for(int i = 0; i <= size - 1; i++){
            if(stl[i].hasScholarShip()){
               stl[i].showInfor();
            }
        }
    }
}
