package creationalpatterns.factorymethod;

class ConcreteProductA extends Product {
    @Override
    public void use() {
        System.out.println("Using Product A");
    }
}
