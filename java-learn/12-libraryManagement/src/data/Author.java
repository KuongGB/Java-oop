
package data;

import java.util.Scanner;

public class Author {
        private String name;
        private String nickname;
        private int yob;
        //tạo phễu ko có đối số

    public Author() {
    }
        
    //tạo phễu có full đối số

    public Author(String name, String nickname, int yob) {
        this.name = name;
        this.nickname = nickname;
        this.yob = yob;
    }
    //tạo phễu có đối số là nickname

    public Author(String nickname) {
        this.nickname = nickname;
    }
    //getter

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getYob() {
        return yob;
    }
    
    //tạo hàm inputInfor(): hàm nhập thông tin
    //inputInfor chỉ nhập name, yob
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên tác giả: ");
        this.name = sc.nextLine();
        System.out.println("Nhập năm sinh của tác giả: ");
        this.yob = Integer.parseInt(sc.nextLine());
    }
    
    //inputInfor sẽ nhâoj vào name, yob, nickname
    //nếu nickname đã có rùi thì nguneg nhập
    public void inputInfor(Author authorList[], int size){
        Scanner sc = new Scanner(System.in);
        //name, yob
        inputInfor();
        System.out.println("Nhập nick name: ");
        while(true){
            String inputNickname = sc.nextLine();
            boolean isFind = false;
            for(int i = 0; i <= size - 1; i++){
                if(authorList[i].getNickname().equals(inputNickname)){
                    isFind = true;
                    break;
                }
            }
            if(isFind){
                System.out.println("Nickname đã có ng dùng");
            }else{
                this.nickname = inputNickname;
                return;
            }
        }
    }
    
    //method: showInfor()
    public void showInfor(){
        String str = String.format("%-10s|%=15s|%4d", name, nickname, yob);
        System.out.println(str);
    }

    Object getNickName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
