
package runtime;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        //I. Regex là gì?
        //Regex | Regular Expression | Biểu thức chính quy 
        //Mẫu cho String noi theo 
        /*cách dùng*/
        String str = "SE162149";
        String regex1 = "[Ss][Ee]\\d{9}";
        //ép str phải là 1 cái chuỗi có định dạng là SE123456789
        
        System.out.println(str.matches(regex1));
        
       //1. Ký tự cố định
        // str có phải là "name" hay ko?
        System.out.println(checkString("name", "name")); //true
        System.out.println(checkString("NaMe", "name")); //false
        
       //2. Ko phân biết hoa thường (ignoreCase : ?i)
        System.out.println(checkString("NamE", "(?i)name")); //true
        
       //3. 1 ký tự bất kỳ: "."
        System.out.println(checkString("fname", ".name")); //true
        System.out.println(checkString(".name", ".name")); //true
        System.out.println(checkString("name", ".name"));  //false
        
       //4. lập lại ký tự trước từ 0 đến nhiều lần: "*"
        System.out.println(checkString("my", "m*y"));  //true
            //                          mmmmy | mmy //true
            //                          may | myy //false
        System.out.println(checkString("my", "m(er)*y"));  //true
        //                  my| mery  true
        //                  mey | mry  false

            
       //5. được quyền xuất hiện hoặc ko: "?"
        System.out.println(checkString("my", "ma?y"));  //true
        //                  may | my //true
        //                  mey | maay //false
        System.out.println(checkString("my", "m(ar)?y"));  //true
        //                      my | mary  true
        //                      may | mry  false
       
     //II. Regex character set
      //1.  1 phần tử bất kỳ trong set(tập giá trị) [...];
        System.out.println(checkString("may", "m[are]y")); //true
        //chỉ chọn 1 trong các ký tự trong [...]
      
      //2.  1 ký tự khác các phần tử trong set(tập): [^...]
        System.out.println(checkString("may", "m[^are]y")); // false
        // khác trong [...]
        
      //3. khớp các chữ cái
           //[a-z]: 1 ký tự từ a đến z
           //[A-Z]: 1 ký tự từ A đến Z
           //[a-zA-Z] : 1 ký tự là chứ thường hay hoa
           
      //4.  khớp số:
        // [0-9] : 1 ký tự là số
        
      //5. Giới hạn số lượng ký tự {}
        //{4}: lập lại 4 lần
        //{1, 4}: lập lại từ 1 - 4 lần
        //{1,} | "+": lập lại ít nhất 1 lần hoặc nhiều lần
        //{0,1} | "?" : có hoặc ko
        // {0,} | "*" : ko hoặc có hoặc nhiều lần
            System.out.println(checkString("meay", "m(ea){1,3}y"));// true
            ///             meay | meaeay                    true
            ///             my | mey |maey | meaeaeaeaeay    false
      //6. gom nhóm : ();
      //7. hoặc: |
        System.out.println(checkString("toi ko gay", "toi (ko|co) gay"));
        //      toi ko gay  | toi co gay   true
        //      toi gay                    false
      
   //III.Regex shortHand: cú pháp viết tắt
      //1. khớp với chữ cái hoặc số \w:
        System.out.println(checkString("mey", "m\\wy"));// true
        //                      mey|may|m9y  true
        //                      meay|my|m,y  false
      //2. ký tự khác chữ và số \W:
         System.out.println(checkString("m/y", "m\\Wy"));// true
         //     m/y | m>y    true
         //     mey | m9y    false
      //3. khớp với số [0-9] => \d
      //4. 1 ký tự k phải số  \D
      //5. dấu space => \s
      //6. 1 ký tự khác space => \S
      
      
      
//mấy con thú cưng sẽ có ID theo kiểu là 
//DOG hoặc dog ở đầu
//CAT hoặc cat ở đầu
//sau đó là 5 số nguyên
//"(?i)(cat|dog)\\d{5}"
  
//----
//Try Catch
//error compilation: lỗi trong quá trình biên dịch
//int a = 10  //thiếu ;
//lỗi do mình

// error in runtime: lỗi phát sinh trong quá trình chạy code
    //muốn nhập vào 1 số nguyên
//    scanf
//    trong java mình có 1 class chuyên dùng để nhập 
//    class Scanner chuyên tạo ra các bộ máy giúp ta nhập
        Scanner sc = new Scanner(System.in);
        boolean demo;
    try{ 
        System.out.println("nhập tuôi đi: ");
        int age = sc.nextInt();
        if(age >= 100){
            throw new Exception();
        }
        System.out.println("Tuổi là "+ age);
    }catch(Exception e){
        System.out.println("Mày biết nhập ko vậy?");
    }finally{
        demo = true;
    }
    System.out.println("Demo là "+ demo);
    System.out.println("Kết thúc");
            
//   sc là 1 object có nhiều method phục vụ cho việc nhập
 
    }
    public static boolean checkString(String str, String regex){
        return str.matches(regex);
    }
            
}
