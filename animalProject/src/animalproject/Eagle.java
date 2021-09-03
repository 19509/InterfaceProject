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
public class Eagle extends Bird implements IWalk, IFly, IMakeSound{

    public Eagle(int wingspan, String name) {
        super(wingspan, name);
    }

    
    @Override
    public void walk() {
        System.out.println("More of a waddle, really.");
    }

    @Override
    public void fly() {
        System.out.println("Eagles fly");
    }

    @Override
    public void makeSound() {
        System.out.println("The eagle says: Caw");
    }

    @Override
    public String toString() {
        return "Eagle{" + getSpan() + '}';
    }
}
