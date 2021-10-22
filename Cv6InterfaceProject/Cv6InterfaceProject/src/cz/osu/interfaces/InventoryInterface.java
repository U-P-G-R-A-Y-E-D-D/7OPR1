package cz.osu.interfaces;

import cz.osu.models.InventoryItem;

public interface InventoryInterface {
    public boolean add(InventoryItem item);
    public int getCurrentWeight();
    public InventoryItem get(int index);
    public String info();
}
