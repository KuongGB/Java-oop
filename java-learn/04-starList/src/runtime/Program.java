
package runtime;

import data.Star;


public class Program {
    public static void main(String[] args) {
        //tạo ra bức tượng(object) đầu tiên từ khuôn(class) Star
        //đối tượng này là anh Sơn Tung
        Star mtp = new Star("Thanh Tung", 1994, "Anh Sai Roi");
        //toán tử new sẽ khởi tạo 1 vùng nhớ lưu object
        //toán tử new là gọi phễu (constructor)
        Star ChiPu = new Star("Chi Pu K", 1993, "Quen Roi");
        mtp.showIn4();
        ChiPu.showIn4();
        
        //những cái properties mà mình thấy được
        System.out.println("Ten cua mtp la "+ mtp.name);
        //mình dùng object (mtp, chiPu) mà mình gọi ra được
        //Properties đó thuộc về Object hay của class
        //Method thuộc về object hay class
        //trong java mình phải đáp ứng tính: đóng gói
        //tăng tính bảo mật
        //đầu tiên là nên để private
        //tạo các getter và setter cho thuộc tính đó
        System.out.println("Ten cua mtp la "+ mtp.getYob());
        
        //muốn fix giá trị
        //  mtp.yob = 1992; sai
        mtp.setYob(1999); //viết đúng
        System.out.println("Ten cua mtp la "+ mtp.getYob());
        
    }
}
