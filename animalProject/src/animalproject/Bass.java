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
public class Bass extends Fish implements ISwim{

    public Bass(boolean isSaltWater, String name) {
        super(isSaltWater, name);
    }
    
    @Override
    public void swim() {
        System.out.println("The bass swims.");
    }

    @Override
    public String toString() {
        return "Bass{" + getWater() + '}';
    }
}
