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
public class Mammal extends Animal{
    private int bodyTemp;

    public Mammal(int bodyTemp, String name) {
        super(name);
        this.bodyTemp = bodyTemp;
    }

    public int getTemp()
    {
        return bodyTemp;
    }

    @Override
    public String toString() {
        return "Mammal{" + "bodyTemp=" + bodyTemp + '}';
    }
}
