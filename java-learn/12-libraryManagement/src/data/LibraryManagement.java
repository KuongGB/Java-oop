
package data;

import java.util.Scanner;

/*
    class chuyên tạo object giúp quản lý các thứ liên quan đến thư viện
    (danh sách tác giả, sách) các method xử lý 2 ds trên
*/
public class LibraryManagement {
    private static Author authorList[] = new Author[100];
    private static int sizeAuthor = 0;
    private static Book bookList[] = new Book[100];
    private static int sizeBook = 0;
    
    //constructor
    public LibraryManagement() {
    }
    
    //method: addNewBook vào bookList
    public static void addNewBook(){
        Scanner sc = new Scanner(System.in);
        Book newBook = new Book(); //tạo ra cuốn sách
        newBook.inputInfor();  //điền thông tin cho sách
        boolean isFind = false;
        for(int i = 0; i <= sizeBook - 1; i++){
            if(bookList[i].getNickName().equals(newBook.getNickName())){
                isFind = false;
                break;
            }
        }
        if(!isFind){
            System.out.println("Thêm sách mới!!");
            Author newAuthor = new Author(newBook.getNickName());
            newBook.inputInfor();//nhập thêm name, yob
            bookList[sizeBook] = newBook;
            sizeBook++;
        }
        //add sách vào danh sách
        bookList[sizeBook] = newBook;
        sizeBook++;
        System.out.println("Danh sách sách: ");
        newBook.showInfor();
        return;
    }
    //method: thêm mới tác giả
    public static void addNewAuthor(){
        System.out.println("Thêm tác giả mới!!");
        Author newAuthor = new Author();
        newAuthor.inputInfor();//nhập thêm name, yob
        //inputInfor(authorList, size) cho nhập name, nickname cấm trùng
        authorList[sizeAuthor] = newAuthor;
        sizeAuthor++;
    }
    
    //method: printBookList in ra danh sách 
    public static void printBookList(){
        if(sizeBook == 0){
            System.out.println("Nothing to print");
            return;
        }
        for(int i = 0; i <= sizeBook - 1; i++){
            bookList[i].showInfor();
        }
    }
    
    //Method: tìm sách dựa vào nick name
    public static void searchBookByNickName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập nickname muốn tìm: ");
        String inputNickName = sc.nextLine();
        boolean isFind = false;
        for(int i = 0; i <= sizeBook - 1; i++){
            if(bookList[i].getNickName().equals(inputNickName)){
                bookList[i].showInfor();
                isFind = true;
            }
        }
        if(!isFind){
            System.out.println("Nothing to print!!");
        }
    }
    
    public static void printAuthorList(){
        if(sizeAuthor == 0){
            System.out.println("Nothing to print");
            return;
        }
        for(int i = 0; i <= sizeAuthor - 1; i++){
            authorList[i].showInfor();
        }
    }
}

