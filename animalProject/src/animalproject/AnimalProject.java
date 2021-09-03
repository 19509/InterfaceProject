/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhicks
 */
public class AnimalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Instantiating animals
         */
        
        Eagle eagle = new Eagle(6, "eagle");
        Penguin penguin = new Penguin(4, "penguin");
        Ostrich ostrich = new Ostrich(5, "ostrich");
        Shark shark = new Shark(true, "shark");
        Bass bass = new Bass(false, "bass");
        FlyingFish flyingfish = new FlyingFish(true, "flying fish");
        Bat bat = new Bat(105, "bat");
        Lion lion = new Lion(101, "lion");
        Dolphin dolphin = new Dolphin(97, "dolphin");
        
        
        /**
         * Instantiating lists
         */
        
        List<Animal> animals = new ArrayList<>();
        List<Bird> birds = new ArrayList<>();
        List<Mammal> mammals = new ArrayList<>();
        List<Fish> fish = new ArrayList<>();
        List<IFly> flyers = new ArrayList<>();
        List<ISwim> swimmers = new ArrayList<>();
        List<IWalk> walkers = new ArrayList<>();
        List<IMakeSound> soundmakers = new ArrayList<>();
        
        
        //Adding animals to animals list
        animals.add(eagle);
        animals.add(penguin);
        animals.add(ostrich);
        animals.add(shark);
        animals.add(bass);
        animals.add(flyingfish);
        animals.add(bat);
        animals.add(lion);
        animals.add(dolphin);
        
        //Adding animals to birds list
        birds.add(eagle);
        birds.add(penguin);
        birds.add(ostrich);
        
        //Adding animals to mammals list
        mammals.add(bat);
        mammals.add(lion);
        mammals.add(dolphin);
        
        //Adding animals to fish list
        fish.add(shark);
        fish.add(bass);
        fish.add(flyingfish);
        
        //Adding animals to flyers list
        flyers.add(bat);
        flyers.add(eagle);
        flyers.add(flyingfish);
        
        //Adding animals to swimmers list
        swimmers.add(dolphin);
        swimmers.add(shark);
        swimmers.add(bass);
        swimmers.add(flyingfish);
        swimmers.add(penguin);
        
        //Adding animals to walkers list
        walkers.add(lion);
        walkers.add(penguin);
        walkers.add(eagle);
        walkers.add(ostrich);
        
        //Adding animals to soundmakers list
        soundmakers.add(lion);
        soundmakers.add(penguin);
        soundmakers.add(eagle);
        soundmakers.add(ostrich);
        soundmakers.add(dolphin);
        soundmakers.add(bat);
        
        
        
        /**
         * Iterating through lists and calls appropriate methods.
         */
        
        for(Animal anml : animals)
        {
            System.out.println(anml.getName());
        }
        
        for(Bird brd : birds)
        {
            System.out.println(brd.toString());
        }
        
        for (Mammal mam : mammals)
        {
            mam.getTemp();
        }
        
        for(Fish fsh : fish)
        {
            fsh.getWater();
        }
        
        for(IFly aml : flyers)
        {
            aml.fly();
        }
        
        for(IWalk wlk : walkers)
        {
            wlk.walk();
        }
        
        for(ISwim swm : swimmers)
        {
            swm.swim();
        }
        
        for(IMakeSound ims : soundmakers)
        {
            ims.makeSound();
        }
    }
}
