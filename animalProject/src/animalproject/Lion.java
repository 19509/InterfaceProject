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
public class Lion extends Mammal implements IMakeSound, IWalk{

    public Lion(int bodyTemp, String name) {
        super(bodyTemp, name);
    }

    @Override
    public void makeSound() {
        System.out.println("The lion goes: Rooaaar");
    }

    @Override
    public void walk() {
        System.out.println("The lion walks");
    }

    @Override
    public String toString() {
        return "Lion{" + getTemp() + '}';
    }
}
