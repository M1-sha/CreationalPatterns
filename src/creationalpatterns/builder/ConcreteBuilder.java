package creationalpatterns.builder;

public class ConcreteBuilder extends Builder {
    public void buildPartA() {
        product.setPartA("Part A");
    }

    public void buildPartB() {
        product.setPartB("Part B");
    }
}
