
package data;
//Bộ khuôn để đúc ra các ca sĩ

public class Star {
    //properties: thuộc tính| field| attrubute
    public String name;
    private int yob;
    public String hotSong;
    
    //khi có static thì properties sẽ thuộc về class
    //và nó sẽ sài chung object
    
    //phễu : constructor: hàm dựng khuôn
    //constructor : phải cùng tên với class
    //this: tự truy vấn bản thân(ám chỉ class chứa nó)
    public Star(String name, int yob, String hotSong){
        this.name = name;
        this.yob = yob;
        this.hotSong = hotSong;
    }
    //getter/setter
    public int getYob(){
            return this.yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    
    //method: hành động
    public void showIn4(){
        System.out.println("Ten tui la "+ name +", Tui sinh nam "+ yob + ", Hot song la "+ hotSong);
                
    }
}
