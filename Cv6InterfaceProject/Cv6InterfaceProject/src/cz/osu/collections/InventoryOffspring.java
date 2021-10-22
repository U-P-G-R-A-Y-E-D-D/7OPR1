package cz.osu.collections;

import cz.osu.interfaces.InventoryInterface;
import cz.osu.models.InventoryItem;

import java.util.ArrayList;
import java.util.List;

public class InventoryOffspring extends ArrayList<InventoryItem> implements InventoryInterface {
    private int currentWeight = 0;
    private final int carryCapacity = 20;

    @Override
    public boolean add(InventoryItem inventoryItem) {
        if(currentWeight + inventoryItem.getWeight() <= carryCapacity){
            currentWeight += inventoryItem.getWeight();
            return super.add(inventoryItem);
        }
        return false;
    }

    @Override
    public int getCurrentWeight() {
        return currentWeight;
    }

    @Override
    public String info() {
        List<String> strings = new ArrayList();
        for (InventoryItem ii : this) {
            strings.add("{"+ii+"}");
        }
        return strings.toString();
    }
}
