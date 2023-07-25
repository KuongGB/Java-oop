
package data;

public class Cat extends Pet{
    private String ribbon;

    public Cat(String id, String owner, String color, double weight, String ribbon) {
        super(id, owner, color, weight);
        this.ribbon = ribbon;//cả đống này là constructor
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    
    
    @Override
    public void showInfor() {
        String str = String.format("Cat  %-4s|%-10s|%-10s|%-5.2f|%-10s", id, owner, color, weight, ribbon);
        System.out.println(str);
    }

    @Override
    public String toString() {
        String str = String.format("Cat  %-4s|%-10s|%-10s|%-5.2f|%-10s", id, owner, color, weight, ribbon);
        return str;
    }
    
    
    
}
