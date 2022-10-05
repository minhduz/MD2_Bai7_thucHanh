import Bai1.animal.Animal;
import Bai1.animal.Chicken;
import Bai1.animal.Tiger;
import Bai1.edible.IEdible;
import Bai1.fruit.Apple;
import Bai1.fruit.Fruit;
import Bai1.fruit.Orange;

public class Bai1 {
    public static void main(String[] args) {

        Animal[] animals = new  Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof IEdible){
                IEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}