package creationalpatterns;

import creationalpatterns.factorymethod.Product;
import creationalpatterns.singleton.Singleton;
import creationalpatterns.factorymethod.*;
import creationalpatterns.abstractfactory.*;
import creationalpatterns.builder.*;
import creationalpatterns.prototype.*;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Factory Method
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.use();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        productB.use();

        // Abstract Factory
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();
        productA1.use();
        productB1.eat();

        // Builder
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        creationalpatterns.builder.Product builtProduct = builder.getResult();
        builtProduct.show();

        // Prototype
        Prototype prototype = new Prototype();
        Prototype clonedPrototype = prototype.clone();
        clonedPrototype.show();
    }
}
