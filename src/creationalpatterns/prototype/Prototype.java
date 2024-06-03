package creationalpatterns.prototype;

public class Prototype implements Cloneable {
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void show() {
        System.out.println("Prototype cloned!");
    }
}
