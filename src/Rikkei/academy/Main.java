package Rikkei.academy;

import Rikkei.academy.animal.Animal;
import Rikkei.academy.animal.Chicken;
import Rikkei.academy.animal.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for (Animal animal:animals) {
            System.out.println(animal.makeSound());
        }
    }
}
