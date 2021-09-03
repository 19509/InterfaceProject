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
public class Penguin extends Bird implements ISwim, IMakeSound, IWalk{

    public Penguin(int wingspan, String name) {
        super(wingspan, name);
    }

    @Override
    public void swim() {
        System.out.println("Penguin swims");
    }

    @Override
    public void makeSound() {
        System.out.println("The penguin goes: mAaH");
    }

    @Override
    public void walk() {
        System.out.println("Penguins do be walkin");
    }

    @Override
    public String toString() {
        return "Penguin{" + getSpan() + '}';
    }
}
