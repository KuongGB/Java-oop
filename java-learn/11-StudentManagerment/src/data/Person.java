//1 class Person
//name, gender, yob
//có constructor rỗng
//có getter/setter
//có hàm inputInfor()
//có showInfor
package data;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String gender;
    protected int yob;
    
    //tạo constructor rỗng
    public Person() {
    }
    
    //getter|setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    
    public void inputInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        this.gender = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        this.yob = Integer.parseInt(sc.nextLine());
    }
    
    public void showInfor(){
        String str = String.format("Person |%-10s|%-10|%4d|", name, gender, yob);
        System.out.println(str);
    }
    
}
