
package ui;
//Menu chuyên tạo menu, giúp quản lý ds các lựa chọn

import java.util.ArrayList;
import tool.InputMachine;



public class Menu {
    public String title;
    public ArrayList<String> optionList = new ArrayList<>();

    public Menu(String title) {
        this.title = title;
    }
    
    public void addNewOption(String newOption){
        optionList.add(newOption);
    }
    
    public void print(){
        int count = 1;
        System.out.println("--------------"+title+"--------------");
        for(String option : optionList){
            System.out.println(count +"."+ option);
            count++;
        }
    }
    
    public int getChoice(){
        int choice = InputMachine.getAnInt("Input your option: ", "Error!!", 1, optionList.size());
        return choice;
    }
}
