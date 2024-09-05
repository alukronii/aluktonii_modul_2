package homework.homework1.zoo;

import homework.homework1.zoo.animal.Bird;
import homework.homework1.zoo.animal.Dog;
import homework.homework1.zoo.animal.Tiger;

public class Runner {
    public static void main(String[] args) {
        Zoo<Tiger, Tiger, Bird> zoo1 = new Zoo<>(new Tiger(),new Tiger(),new Bird());
        Tiger animal1 = zoo1.getAnimal1();
        Tiger animal2 = zoo1.getAnimal2();
        Bird animal3 = zoo1.getAnimal3();
        animal1.growl();
        animal2.growl();
        animal3.fly();

        System.out.println("__________________");

        Zoo<Dog, Dog, Dog> zoo2 = new Zoo<>(new Dog(),new Dog(),new Dog());
        Dog animal4 = zoo2.getAnimal1();
        Dog animal5 = zoo2.getAnimal2();
        Dog animal6 = zoo2.getAnimal3();
        animal4.bark();
        animal5.bark();
        animal6.bark();

        System.out.println("__________________");

        Zoo<Bird, Bird, Tiger> zoo3 = new Zoo<>(new Bird(), new Bird(), new Tiger());
        Bird animal7 = zoo3.getAnimal1();
        Bird animal8 = zoo3.getAnimal2();
        Tiger animal9 = zoo3.getAnimal3();
        animal7.fly();
        animal8.fly();
        animal9.growl();
    }
}
