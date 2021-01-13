package bai7_abstrach_interface.thuchanh.bai1;

import bai7_abstrach_interface.thuchanh.bai1.edible.Edible;

public abstract class Animal {
    public abstract String makeSound();
}

class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: Cuc ta cuc tac";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tiger: meo meo";
    }


    @Override
    public String howToEat() {
        return "no eat";
    }
}
