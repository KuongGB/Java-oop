
package tool;

import java.util.Scanner;

public class InputMachine {
    public static Scanner sc = new Scanner(System.in);
    
    //method ép ngta nhập số nguyên
    public static int getAnInt(String inputMsg, String errorMsg){
        System.out.println(inputMsg);
        int number;
        while(true){            
            try{
                number = Integer.parseInt(sc.nextLine());
                return number;
            }catch(Exception e){
                System.out.println(errorMsg);
            }
        }
    }
    
    public static int getAnInt(String inputMsg, String errorMsg, int lowerBound, int upperBound){
        if(lowerBound > upperBound){
            int tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        System.out.println(inputMsg);
        int number;
        while(true){            
            try{
                number = Integer.parseInt(sc.nextLine());
                if(number > upperBound || number < lowerBound){
                    throw new Exception();
                }
                return number;
            }catch(Exception e){
                System.out.println(errorMsg);
                System.out.println(inputMsg);
            }
        }
    }
    
    //method ép ngta nhập số thực
    public static double getAnDou(String inputMsg, String errorMsg){
        System.out.println(inputMsg);
        double number;
        while(true){            
            try{
                number = Double.parseDouble(sc.nextLine());
                return number;
            }catch(Exception e){
                System.out.println(errorMsg);
            }
        }
    }
    
    public static double getAnDou(String inputMsg, String errorMsg, double lowerBound, double upperBound){
        if(lowerBound > upperBound){
            double tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        System.out.println(inputMsg);
        double number;
        while(true){            
            try{
                number = Double.parseDouble(sc.nextLine());
                if(number > upperBound || number < lowerBound){
                    throw new Exception();
                }
                return number;
            }catch(Exception e){
                System.out.println(errorMsg);
                System.out.println(inputMsg);
            }
        }
    }
    
    //method ép nhập String k bỏ trống
    public static String getString(String inputMsg, String errorMsg){
        System.out.println(inputMsg);
        while (true) {
            try{
                String str = sc.nextLine();
                if(str.isEmpty()){
                    throw new Exception();
                }
                return str;
            }catch(Exception e){
                System.out.println(errorMsg);
            }
        }
    }
    
    //method ép nhập String k bỏ trống
    public static String getString(String inputMsg, String errorMsg, String regex){
        System.out.println(inputMsg);
        while (true) {
            try{
                String str = sc.nextLine();
                if(str.isEmpty() || !str.matches(regex)){
                    throw new Exception();
                }
                return str;
            }catch(Exception e){
                System.out.println(errorMsg);
            }
        }
    }
}

