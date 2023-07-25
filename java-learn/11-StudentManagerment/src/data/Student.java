
package data;

import java.util.Scanner;

public class Student extends Person{
    private  String id;
    private double gpa;
    private String email;
    
    //constructor rỗng

    public Student() {
    }
    
    //getter|setter

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if(id != null){
            this.id = id;
            return true;
        }else{
            System.out.println("Vui long dien thong tin !!!");
            return false;
        }
        
    }

    public double getGpa() {
        return gpa;
    }

    public boolean setGpa(double gpa) {
        if(gpa < 0 && gpa > 10){
            return false;
        }
        this.gpa = gpa;
        return true;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email != null){
            this.email = email;
            return true;
        }else{
            System.out.println("Vui long dien thong tin !!!");
            return false;
        }
    }
    
    //method
    @Override
    public void inputInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        //this.id = sc.nextLine();
        /*
        while(true){
            String inputID = sc.nextLine();
            boolean check = setId(inputID);
            if(check == true){
                break;
            }
        }
        */
        while(!setId(sc.nextLine()));
        super.inputInfor(); // gọi hàm nhập của cha
        ////vì cha đã nhập name, gender, yob òi
        System.out.println("Nhập gpa: ");
        //this.gpa = Double.parseDouble(gpa);
        while(!setGpa(Double.parseDouble(sc.nextLine())));
        System.out.println("Nhập email");
        while(!setEmail(sc.nextLine()));
        
        //this.email = sc.nextLine();
        
    }
    @Override
    public void showInfor() {
        String str = String.format("Student |%-10s|%-10s|%-5s|%4d|%5.2f|%-30s", id, name, gender, yob, gpa, email);
        System.out.println(str);
    }

    public boolean hasScholarShip(){
        return this.gpa > 8;
    }
    
}
