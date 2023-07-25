
package data;
//class này là class chứa ds
//và các method giúp xử lý ds

//Viết 1 chtr quản lý thú cưng (DOG | CAT)
    //1. Thêm mới cún
    //2. Thêm mới mèo
    //3. In ra ds thú cưng
    //4. Tìm  kiếm theo tên
            //đưa id tìm vị trí
            //đưa id tìm thú cưng
            //giao tiếp nhận id, từ id tìm thú cưng
    //5. Update thú cưng theo ID
    //6. Remove by ID
    //7. Sort theo trọng lượng
    //8. save file and quit
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
import tool.InputMachine;

public class PetManagement {
    ArrayList<Pet> petList = new ArrayList();
    
    public void addNewDog(){
        boolean isFind;
        String id;
        do{
            id = InputMachine.getString("Input ID: ", "Error \"DXXX\"", "[Dd]\\d{3}").toUpperCase();
            isFind = false;
            for(Pet pet : petList){
                if(pet.getId().equals(id)) isFind = true;
            }    
        }while(isFind);
        
        String owner = InputMachine.getString("Input Owner: ", "This field is required!!");
        String color = InputMachine.getString("Input color: ", "This field is required!!");
        double weight = InputMachine.getAnDou("Input weight: ", "Weight 0 -> 200", 0, 200);
        String necklace = InputMachine.getString("Input necklace: ", "This field is required!!"); 
        Dog newDog = new Dog(id, owner, color, weight, necklace);
        petList.add(newDog);
    }
    
    public void addNewCat(){
        boolean isFind;
        String id;
        do{
            id = InputMachine.getString("Input ID: ", "Error \"CXXX\"", "[Cc]\\c{3}").toUpperCase();
            isFind = false;
            for(Pet pet : petList){
                if(pet.getId().equals(id)) isFind = true;
            }    
        }while(isFind);
        
        String owner = InputMachine.getString("Input Owner: ", "This field is required!!");
        String color = InputMachine.getString("Input color: ", "This field is required!!");
        double weight = InputMachine.getAnDou("Input weight: ", "Weight 0 -> 200", 0, 200);
        String ribbon = InputMachine.getString("Input ribbon: ", "This field is required!!");
        Cat newCat = new Cat(id, owner, color, weight, ribbon);
        petList.add(newCat);
    }
    
    public void showPetList(){
        if(petList.size() == 0){
            System.out.println("Nothing to print");
            return;
        }
        System.out.println("=====Pet List=====");
        for(Pet pet : petList){
            pet.showInfor();
        }
    }
    //tìm: đưa id tìm vị trí
    public int searchPetIndexById(String id){
        for(int i = 0; i <= petList.size()-1; i++){
            if(petList.get(i).getId().equals(id)) return i;
        }
        return -1;
    }
    //tìm: đưa id tìm pet
    public Pet searchPetById(String id){
        int pos = searchPetIndexById(id);
        return petList.get(pos);
    }
    //giao tiếp nhận id, từ id tìm thú cưng
    public void searchPetById(){
        String id = InputMachine.getString("Inpet PetId to find: ", "Wrong!!");
        Pet pet = searchPetById(id);
        if(pet == null){
            System.out.println("Not found!!");
        }else{
            pet.showInfor();
        }
    }
    
    public void updatePetById(){
        String id = InputMachine.getString("Inpet PetId to update: ", "Wrong!!");
        Pet pet = searchPetById(id);
        if(pet == null){
            System.out.println("Not found!!");
        }else{
            System.out.println("Information: ");
            pet.showInfor();
            String owner = InputMachine.getString("Input Owner: ", "This field is required!!");
            String color = InputMachine.getString("Input color: ", "This field is required!!");
            double weight = InputMachine.getAnDou("Input weight: ", "Weight 0 -> 200", 0, 200);
            if(pet instanceof Dog){
                String necklace = InputMachine.getString("Input necklace: ", "This field is required!!");
                pet.setOwner(owner);
                pet.setColor(color);
                pet.setWeight(weight);
                ((Dog) pet).setNecklaces(necklace);
            }else{
                String ribbon = InputMachine.getString("Input ribbon: ", "This field is required!!");
                pet.setOwner(owner);
                pet.setColor(color);
                pet.setWeight(weight);
                ((Cat) pet).setRibbon(ribbon);
            }
        }
    }
    //remove
    public void removePetByID(){
        String id = InputMachine.getString("Inpet PetId to remove: ", "Wrong!!");
        Pet pet = searchPetById(id);
        if(pet == null){
            System.out.println("Not found!!");
        }else{
            pet.showInfor();
            boolean isComfirmed = false;
            String confirm = InputMachine.getString("Input \"delete\" to confirm", "This field is required!!").toUpperCase();
            if(confirm.equals("DELETE")){
                System.out.println("This pet is removed");
                petList.remove(pet);
            }
        }
    }
    
    //sort theo cân nặng
    public void sortPetListByWeight(){
        Comparator<Pet> orderByWeight = new Comparator<Pet>(){
            @Override
            public int compare(Pet t1, Pet t2) {
                if(t1.getWeight() > t2.getWeight()) return 1;
                return -1;
            }
        };
        Collections.sort(petList, orderByWeight);
        this.showPetList();
    }
    
    //loadFile : hàm nhận vào urlFile và load nội dụng trong file
    //mở đc thì true ko đc thì false
    public boolean loadFromFile(String fileName){
        petList.clear(); //xoá các pt trc khi load
        File f = new File(fileName);//từ đường dẫn tạo ra object
        //tạo thnagf đọc file
        try{
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line = reader.readLine();
            while(line != null){
                //xử lý dòng file
                Pet pet;
                StringTokenizer st = new StringTokenizer(line,"|");
                String id = st.nextToken().trim();
                String owner = st.nextToken().trim();
                String color = st.nextToken().trim();
                double weight = Double.parseDouble(st.nextToken().trim());
                String specialNeck = st.nextToken().trim();
                if(id.matches("[Dd]\\d{3}")){
                    pet = new Dog(id, owner, color, weight, specialNeck);
                }else{
                    pet = new Cat(id, owner, color, weight, specialNeck);
                }
                petList.add(pet);
                //xử lý dòng file
                line = reader.readLine(); //đọc dòng tiếp theo
            }
            return true;
        }catch(IOException | NumberFormatException e){
            System.out.println("Error file");
            return false;
        }
        
    }
    //savefile: mở file lưu file, mở đc true ngược lại false
    public boolean saveToFile(String fileName){
        File f = new File(fileName);
        try{
            OutputStreamWriter writter = new OutputStreamWriter(new FileOutputStream(f));
            for(Pet pet : petList){
                writter.write(pet.toString());
                writter.write("\n");
            }
            writter.flush();  //lưu xong mới ngừng
            return true;
        }catch(IOException e){
            System.out.println("Error file");
            return false;
        }
    }
}
