//UI : user interface: giao diện người dùng
package ui;
//Menu: 1 class đứng ra chuyên tạo object
    //có nhiệm vụ quản lý me
import java.util.Scanner;

    //quản lý các option trong menu
    //kèm theo đó là các method xử lí menu
    //(thêm option| thu thập lựa chọn của ng dùng| ép ng dung nhập đúng lựa chọn

public class Menu {
    private static String title;
    private static String optionList[] = new String[100];
    private static int size = 0;
    
    //constructor nhận vào tên của menu
    public Menu(String title) {
        this.title = title;
    }
    //method: thêm nhưng option
    public static void addNewOption(String newOption){
        optionList[size] = newOption;
        size++;
    }
    //Method: in ra các lựa chọn trong menu
    public static void printMenu(){
        System.out.println("-------------------------------");
        System.out.println(title);
        for(int i = 0; i <= size - 1; i++){
            String str = String.format("%d.  %s", i+1, optionList[i]);
            System.out.println(str);
        }
    }
    //method: xin lựa chọn từ ng dùng
    public static int getChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập lựa chọn: ");
        while(true){
            try{
                int choice = Integer.parseInt(sc.nextLine());
                if(choice < 1 || choice > size){
                    throw new Exception();
                }
                return choice;
            }catch(Exception e){
                System.out.println("Vui lòng nhập từ 1 -"+size+" nha: ");
            }
        }
    }
}
