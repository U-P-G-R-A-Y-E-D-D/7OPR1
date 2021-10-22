package cz.osu.application;

import cz.osu.collections.InventoryEncapsulation;
import cz.osu.collections.InventoryOffspring;
import cz.osu.collections.Register;
import cz.osu.interfaces.InventoryInterface;
import cz.osu.models.Food;
import cz.osu.models.InventoryItem;
import cz.osu.models.Weapon;

public class Main {

    public static void main(String[] args) {
        //InventoryInterface geraltsInventory = new Register(20);
        //InventoryInterface geraltsInventory = new InventoryOffspring();
        InventoryInterface geraltsInventory = new InventoryEncapsulation();

        InventoryItem i1 = new InventoryItem("Broken rake", 1);
        InventoryItem i2 = new Food("Raw meat", 2, 10);
        InventoryItem i3 = new Weapon("Silver sword", 4, 25);

        if(i3 instanceof Weapon){
            System.out.println("je");
        }
        else {
            System.out.println("není");
        }

        geraltsInventory.add(new InventoryItem("Broken rake", 1));
        geraltsInventory.add(new Food("Raw meat", 2, 10));
        geraltsInventory.add(new Food("Raw meat", 2, 10));
        geraltsInventory.add(new Weapon("Silver sword", 4, 25));
        geraltsInventory.add(new Weapon("Steel sword", 4, 13));

        System.out.println(geraltsInventory.info());
        System.out.println("Inventory weight: " + geraltsInventory.getCurrentWeight());
    }
}
