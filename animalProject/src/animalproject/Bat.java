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
public class Bat extends Mammal implements IMakeSound, IFly{

    public Bat(int bodyTemp, String name) {
        super(bodyTemp, name);
    }

    @Override
    public void makeSound() {
        System.out.println("The bat says: squee squee");
    }

    @Override
    public void fly() {
        System.out.println("The bat flies");
    }

    @Override
    public String toString() {
        return "Bat{" + getTemp() + '}';
    }
}
