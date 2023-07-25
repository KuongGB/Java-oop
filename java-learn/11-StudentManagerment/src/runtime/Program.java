
//viết chương trình quản lý sinh viên cơ bản
//miêu tả như sau:
//1 class Person
//name, gender, yob
//có constructor rỗng
//có getter/setter
//có hàm inputInfor()
//có showInfor

//Class Student kế thừa Class Person
//id, gpa, email
//có constructor là rỗng
//có getter và setter
//setter cấm truyền vào rỗng, nhập id mà rỗng là ép nhập lại
//showInfor()

//chương trình gồm các tính năng
//nhập sinh viên
//hiển thị thông tin sinh viên
//tìm kiếm theo mã sinh viên
//sort theo tên và hiển thị
//hiển thị thông tin các sinh viên có học bổng (gpa > 8)
//thoát

package runtime;
    
import data.StudentList;
import ui.Menu;


public class Program {
    public static void main(String[] args) {
        Menu menu = new Menu("CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN");
        menu.addNewOption("Thêm mới sinh viên");
        menu.addNewOption("In ra danh sách sinh viên");
        menu.addNewOption("Tìm kiếm sinh viên dựa trên ID");
        menu.addNewOption("Sắp xếp sinh viên theo tên");
        menu.addNewOption("In ra danh sách sinh viên có học bổng");
        menu.addNewOption("Thoát");
        int choice;
        StudentList stl = new StudentList();
        while(true){
            menu.printMenu();
            choice = menu.getChoice();
            switch(choice){
                case  1: {
                    stl.addStudent();
                    break;
                }
                case  2: {
                    stl.showStudentList();
                    break;
                }
                case  3: {
                    stl.findStuById();
                    break;
                }
                case  4: {
                    stl.sortByName();
                    stl.showStudentList();
                    break;
                }
                case  5: {
                    stl.showScholarShipSt();
                    break;
                }
                default : {
                    System.out.println("Bye Bye!!!");
                }
            }
        }
    }
}
