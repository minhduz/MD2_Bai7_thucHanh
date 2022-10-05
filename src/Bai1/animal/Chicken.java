package Bai1.animal;

import Bai1.edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: click! click!";
    }

    @Override
    public String howToEat() {
        return "Could be fry";
    }
}
