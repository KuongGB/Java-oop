//Herbivore: động vật ăn cỏ
package data;

public abstract class Herbivore {
    protected String name;
    protected int yob;
    protected double weight;
    
    //constructor

    public Herbivore(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }
    
    //getter và setter

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYob() {
        return yob;
    }
    public void setYob(int yob) {
        this.yob = yob;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    //mỗi một Herbivore có cách học khác nhau
    //ngựa cười hí hí
    //thỏ vừa học vừa nhảy
    //khỉ thì bắt chước //mimic
    //có hàm tên study => abstract
    public abstract double study();
    //vì cách học khác nhau nên mỗi con show kết quả khác nhau
    public abstract void showLearningOutComes();
    
}
