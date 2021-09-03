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
public class Fish extends Animal{
    private boolean isSaltWater;

    public Fish(boolean isSaltWater, String name) {
        super(name);
        this.isSaltWater = isSaltWater;
    }

    public boolean getWater()
    {
        return isSaltWater;
    }

    @Override
    public String toString() {
        return "Fish{" + "isSaltWater=" + isSaltWater + '}';
    }
}
