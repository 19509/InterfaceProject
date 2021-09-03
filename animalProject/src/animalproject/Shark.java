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
public class Shark extends Fish implements ISwim{

    public Shark(boolean isSaltWater, String name) {
        super(isSaltWater, name);
    }

    @Override
    public void swim() {
        System.out.println("The shark swims.");
    }

    @Override
    public String toString() {
        return "Shark{" + getWater() + '}';
    }
}
