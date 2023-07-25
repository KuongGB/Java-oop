
package data;

public class Dog extends Pet{
        private String necklaces;

    public Dog(String id, String owner, String color, double weight, String necklaces) {
        super(id, owner, color, weight);
        this.necklaces = necklaces;
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

    public String getNecklaces() {
        return necklaces;
    }

    public void setNecklaces(String necklaces) {
        this.necklaces = necklaces;
    }
    
    
    @Override
    public void showInfor() {
        String str = String.format("Dog  %-4s|%-10s|%-10s|%-5.2f|%-10s", id, owner, color, weight, necklaces);
        System.out.println(str);
    }

    @Override
    public String toString() {
        String str = String.format("Dog  %-4s|%-10s|%-10s|%-5.2f|%-10s", id, owner, color, weight, necklaces);
        return str;
    }
    
    
}
