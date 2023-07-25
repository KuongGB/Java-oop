
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Program {
    public static void main(String[] args) {
        playWithArrayList();
        cpyHacking();
        playWithQueue();
    }
    public static void playWithArrayList(){
        //ArrayList là 1 đại diện của List
        
        //ArrayList là 1 túi hàng hiệu dùng để triễn khai tính năng của List interface
        // giống mảng bth nhưng có khả năng co giản đc
        
        //thông thường ngta phải khai báo kích thước khi tạo mảng cùi
        Integer arrIntPrimitive[] = new Integer[10]; // phải có 10
        //phải code z mới đc vì nó k co giản đc
        //nếu dùng ít hơn thì mình vẫn duyệt đến 10
        //là ko đc
        //nếu em xài nhiều hơn thì bị xung đột bộ nhớ
        
        //ArrayList Collection cho phép em tnagw giảm kích thước
        //nên lúc tạo em k cần kích thước
        ArrayList<Integer> arrIntList = new ArrayList<Integer>();
        List<Integer> arrIntListV2 = new ArrayList<>();//như này cx ok
        //khai cha new con
        
        //---
        //nó chỉ lưu object thôi, k chơi với primitive
        //object thì có kích thước bất thường, nên nó tăng giảm 1 cách bất thường
        //vì mảng co giản nên nó có tên là Dynamic array(mảng động)
        
        //thêm pt vào mảng .add();
        arrIntList.add(new Integer(3));
        arrIntList.add(new Integer(5));
        arrIntList.add(2); //tự hiểu new Integer(2); => auto-boxing
        System.out.println("arrIntList là " + arrIntList); ///[] : mảng rỗng
        
        //add() thêm theo index
        arrIntList.add(0,3);
        arrIntList.add(1,5);
        arrIntList.add(2,4);
        arrIntList.add(1,4);
        System.out.println("arrIntList là " + arrIntList);//[3,4,5,4]
        
        //addAll(): nhét 1 ds vào mảng
        arrIntListV2.add(9);
        arrIntListV2.add(19);
        arrIntList.addAll(arrIntListV2);
        //arrIntList.addAll(2, arrIntListV2);   //[3,4,9,19,5,4]
        System.out.println("ArrIntList là "+arrIntList);
        //[3,4,5,4,9,19]
        
        //---
        //dùng asList chuyển mảng thành ArrayList
        //array -> arrayList
        Integer arrDemo[] = {3,5,7}; //auto-boxing
        ArrayList<Integer> arrConverse = new ArrayList<>(Arrays.asList(arrDemo));
        System.out.println("arrConverse là " + arrConverse); //[3,5,7]
        
        
        //--
        //tạo mảng thường từ ArrayList
        //ArrayList -> array clone
        Integer[] numList = new Integer[arrConverse.size()];
        arrConverse.toArray(numList);
        //System.out.println("numList là "+numList); // mảng cùi k có toString()
        System.out.println("numList: ");
        for(Integer numItem : numList){
            System.out.println(numItem);
        }
        
        //chuyển ArrayList -> String bằng toString();
        String str = arrConverse.toString();
        System.out.println("str= "+str);
        
        //get() truy cập phần tử theo index
        System.out.println("arrConverse.get(1) là "+arrConverse.get(1));//5
        //set() set lại giá trị ở vị trí nào đó
        arrConverse.set(2, 9);
        System.out.println("arrConverse là "+ arrConverse);//[3,5,9]
        
        //swap giá trị ở vtri 1 và 2
        Integer tmp = arrConverse.get(0);
        arrConverse.set(0, arrConverse.get(1));
        arrConverse.set(1, tmp);
        System.out.println("arrConverse là "+arrConverse); //[5,3,9]
        
        //------
        //iterable: tính khả duyệt(khả lập)
        //là 1 object định nghĩa 1 trình tự và giá trị
        //có thể trả về tiếp theo trc khi kết thúc thì gọi là iterator
        Iterator<Integer> it = arrConverse.iterator();
        //.hasNext() //ủa trong Collection có còn thằng nào để duyệt k
        
        System.out.println(it.hasNext());//true//[9,5,3]
        System.out.println(it.next()); //lôi thằng đầu tiên là 9
        System.out.println(it.next()); //5
        System.out.println(it.next()); //3
        //System.out.println(it.next());//lỗi
        System.out.println(it.hasNext()); //false
        
        //HOF : High Order Function
        // Currying, LexicalScoping, CallBackHell, JS
        
        //.remove(); xoá phần tử
        System.out.println("arrConverse là "+arrConverse); //[5,3,9]
        //xoá số 9
        arrConverse.remove(2);
        System.out.println("arrConverse là "+arrConverse); //[5,3]
        
        //.removeAll() | clear() xoá hết
        //.size() lấy ra độ dài!! tại sao k là length mà là size?
        //for hay fore
        //sắp xếp các phần tử trong mảng để dành tý nói
        
        //một vài cái method đặc biệt của arrayList
        //clone(): tạo một ArrayList mới có cùng phần tử và kích thước và dung lượng
        ArrayList<Integer> demoClone = (ArrayList)arrConverse.clone();
        System.out.println("DemoClone = " + demoClone);
        //đây chỉ là shallow coppy
        
        //contain(): tìm kiếm phần tử có tồn tại trong list hay k
        //   return true/false
        //notifyCapacity(): chuẩn đoán được con arrayList có thể chứa bn phần tử
        // 
        //isEmpty(): hỏi list có bị rỗng , return true/false
        //indexOf(): tìm kiếm phần tử và trả ra index, nếu k có thì return -1;
        //trimToSize(): giảm dung lượng arr về kích thước hiện tại của nó
        
    }

    public static void cpyHacking(){
        ArrayList<Student> studentList = new ArrayList<>();
        Student hung = new Student("The Hung");
        studentList.add(hung);
        studentList.add(new Student("Tuan Kiet"));
        
        //show
        System.out.println("Show student list:");
        for(Student student : studentList){
            student.showInfor();
        }
        hung.setName("The Bao");
        System.out.println("Show student list:");
        for(Student student : studentList){
            student.showInfor();
        }
        
        //clone thử nè
        ArrayList<Student> cloneStudentList = (ArrayList)studentList.clone();
        System.out.println("Show clone student list:");
        for(Student student : cloneStudentList){
            student.showInfor();
        }
        cloneStudentList.get(0).setName("The Tam");
        System.out.println("Show clone student list:");
        for(Student student : cloneStudentList){
            student.showInfor();
        }
        System.out.println("Show student list:");
        for(Student student : studentList){
            student.showInfor();
        }
        //hiện tượng 1 thằng clone, mà thằng gốc và thằng clone đều cùng trỏ đến 1 object
        //ngta gọi là shallow copy
        //tức là copy ch full, còn dính đây mơ rể má
        
        //deepCopy là copy sâu, đã cắt đứt đc dây mơ rễ má, k còn liên kết với nhau
        
    }
    
    public static void playWithQueue(){
        Queue<Integer> numList = new LinkedList<>();
        //numList thuộc bộ Queue đc khai triển bằng LinkedList
        numList.offer(3);//true or false
        numList.add(1);//true or exception
        numList.offer(5);
        numList.add(4);
        System.out.println("Numlist = " + numList);
        
        //đây là hàng đợi: phải đợi đến lượt
        // k cho phép lấy phần tử ở giữa hàng đc
        //queue đều k có get/set
        //mình chỉ có thể truy xuất 1 đầu mà thôi
        
        //khi mình dùng queue thì thường k quan tâm số lượng 
        //chỉ quan tâm khi nào xong thì thôi
        //duyệt từ đầu tới đâu loại tới đó
        //nó sẽ dừng khi thấy null(hết hàng)
        System.out.println("Check = "+ numList.element());
        System.out.println("Check = "+ numList.peek());
        System.out.println("Numlist = " + numList);
        
        //remove| poll lấy ra thằng đầu tiên
        //xoá luôn
        System.out.println("Numlist = " + numList);
        System.out.println("Numlist = " + numList.remove());
        System.out.println("Numlist = " + numList.remove());
        System.out.println("Numlist = " + numList.poll());
        System.out.println("Numlist = " + numList.remove());
        System.out.println("Numlist = " + numList);
        
        numList.offer(3);//true or false
        numList.add(1);//true or exception
        numList.offer(5);
        numList.add(4);
        System.out.println("Numlist = " + numList);
        //xây dựng 1 anh nhân viên bán hàng
        while(true){
            Integer tmp = numList.poll();//lấy thằng đầu
            //đồng thời loại ra
            if(tmp == null){
                break;
            }
            tmp =+ 2;
            System.out.println("Tmp = " + tmp);
        }
    }
}

class Student{
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showInfor(){
        System.out.println(name);
    }
}

