
package data;

import java.util.Scanner;


public class Book {
    private String bookName;
    private String createAt;
    private String nickName;
    
    //constructor rỗng
    //và bth
    public Book() {
    }
    
    public Book(String bookName, String createAt, String nickName) {
        this.bookName = bookName;
        this.createAt = createAt;
        this.nickName = nickName;
    }

    //getter và setter

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    //method input
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        this.bookName = sc.nextLine();
        System.out.println("Nhập ngày xuất bản: ");
        this.createAt = sc.nextLine();
        System.out.println("Nhập Nickname của tác giả: ");
        this.nickName = sc.nextLine();
    }
    
    //method showInfor
    public void showInfor(){
        String str = String.format("|%-20s|%-15s|%-10s", bookName,nickName, createAt);
        System.out.println(str);
    }
}
