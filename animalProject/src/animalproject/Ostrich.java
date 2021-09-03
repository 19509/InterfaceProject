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
public class Ostrich extends Bird implements IWalk, IMakeSound{

    public Ostrich(int wingspan, String name) {
        super(wingspan, name);
    }

    @Override
    public void walk() {
        System.out.println("Ostriches are fast");
    }

    @Override
    public void makeSound() {
        System.out.println("The ostrich says: uuuongh");
    }

    @Override
    public String toString() {
        return "Ostrich{" + getSpan() + '}';
    }
}
