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
public class Bird extends Animal{
    private int wingspan;

    
    public Bird(int wingspan, String name) {
        super(name);
        this.wingspan = wingspan;
    }

    public int getSpan()
    {
        return wingspan;
    }

    @Override
    public String toString() {
        return "Bird{" + "wingspan=" + wingspan + '}';
    }
}
