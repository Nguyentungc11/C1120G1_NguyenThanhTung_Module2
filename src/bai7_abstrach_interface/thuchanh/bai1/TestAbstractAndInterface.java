package bai7_abstrach_interface.thuchanh.bai1;

import bai7_abstrach_interface.thuchanh.bai1.edible.Edible;
import bai7_abstrach_interface.thuchanh.bai1.fruit.Apple;
import bai7_abstrach_interface.thuchanh.bai1.fruit.Fruit;
import bai7_abstrach_interface.thuchanh.bai1.fruit.Orange;

public class TestAbstractAndInterface {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for(Animal animal:animals){
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
