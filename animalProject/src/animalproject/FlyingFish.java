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
public class FlyingFish extends Fish implements ISwim, IFly{

    public FlyingFish(boolean isSaltWater, String name) {
        super(isSaltWater, name);
    }

    @Override
    public void swim() {
        System.out.println("The flying fish swims.");
    }

    @Override
    public void fly() {
        System.out.println("The flying fish flies.");
    }

    @Override
    public String toString() {
        return "FlyingFish{" + getWater() + '}';
    }
}
