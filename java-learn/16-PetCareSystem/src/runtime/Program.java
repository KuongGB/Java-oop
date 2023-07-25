
package runtime;

import data.PetManagement;
import tool.InputMachine;
import ui.Menu;

public class Program {
    public static void main(String[] args) {
        //tạo menu
        String urlFile = "D:\\HocAnhDiep\\k17F1MasterJava\\16-PetCareSystem\\petList.txt";
        Menu mn = new Menu("Pet care system");
        mn.addNewOption("Add new dog");
        mn.addNewOption("Add new cat");
        mn.addNewOption("Show Pet List");
        mn.addNewOption("Search pet by id");
        mn.addNewOption("Update pet by id");
        mn.addNewOption("Remove pet by id");
        mn.addNewOption("Show pet list order by weight");
        mn.addNewOption("Save file and quit");
        //tao PetManagement
        PetManagement pm = new PetManagement();
        pm.loadFromFile(urlFile);
        int op;
        while(true){
            mn.print();
            op = mn.getChoice();
            switch(op){
                case 1 : {
                    pm.addNewDog();
                    break;
                }
                case 2 : {
                    pm.addNewCat();
                    break;
                }
                case 3 : {
                    pm.showPetList();
                    break;
                }
                case 4 : {
                    pm.searchPetById();
                    break;
                }
                case 5 : {
                    pm.updatePetById();
                    break;
                }
                case 6 : {
                    pm.removePetByID();
                    break;
                }
                case 7 : {
                    pm.sortPetListByWeight();
                    break;
                }
                case 8 : {
                    pm.saveToFile(urlFile);
                    System.out.println("Good bye, see ya!!!");
                    return;
                }
            }
        }
        
    }
}

/*
    Viết 1 chtr quản lý thú cưng (DOG | CAT)
    1. Thêm mới cún
    2. Thêm mới mèo
    3. In ra ds thú cưng
    4. Tìm  kiếm theo tên
    5. Update thú cưng theo ID
    6. Remove by ID
    7. Sort theo trọng lượng
    8. save file and quit
    
    khi thêm mới id của pet k được trùng với id ở trong danh sách
    id của pet phải thỏa theo format "D001| C001"
    một con Pet có nhửng thuộc tính owner , color, weight, BMI
    
    Dog: necklace
    Cat: ribbon

    yêu cầu chung: nhập chuẩn | nhập bậy bạ là chữi

*/