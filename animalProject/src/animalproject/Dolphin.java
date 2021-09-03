/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject;

/**
 *
 * @author jhicks
 */
public class Dolphin extends Mammal implements ISwim, IMakeSound{

    public Dolphin(int bodyTemp, String name) {
        super(bodyTemp, name);
    }

    @Override
    public void swim() {
        System.out.println("The dolphin swims.");
    }

    @Override
    public void makeSound() {
        System.out.println("The dolphin says: ee ee i i ee");
    }

    @Override
    public String toString() {
        return "Dolphin{" + getTemp() +'}';
    }
}
