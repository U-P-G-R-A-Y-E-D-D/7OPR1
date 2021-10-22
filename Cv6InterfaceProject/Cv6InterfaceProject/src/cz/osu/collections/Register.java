package cz.osu.collections;

import cz.osu.interfaces.InventoryInterface;
import cz.osu.models.InventoryItem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Register implements InventoryInterface {
    private InventoryItem[] items;
    private int lastIndex;
    private final int carryCapacity;
    private int currentWeight;

    public Register(int capacity) {
        items = new InventoryItem[capacity];
        lastIndex = -1;
        carryCapacity = 20;
        currentWeight = 0;
    }

    private void increaseLastIndex(){
        lastIndex++;
    }

    private void decreaseLastIndex(){
        lastIndex--;
    }

    @Override
    public boolean add(InventoryItem item) {
        if(lastIndex + 1 < items.length && currentWeight + item.getWeight() <= carryCapacity){
            increaseLastIndex();
            items[lastIndex] = item;
            currentWeight += item.getWeight();
            return true;
        }
        return false;
    }

    @Override
    public int getCurrentWeight() {
        return currentWeight;
    }

    @Override
    public InventoryItem get(int index) {
        if(index >= 0 && index <= lastIndex){
            return items[index];
        }
        return null;
    }

    @Override
    public String info() {
        List<String> strings = new ArrayList();
        for (int i = 0; i <= lastIndex; i++) {
            strings.add("{"+items[i]+"}");
        }
        return strings.toString();
    }
}
