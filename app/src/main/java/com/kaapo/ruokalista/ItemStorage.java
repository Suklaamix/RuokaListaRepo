package com.kaapo.ruokalista;

import java.util.ArrayList;

public class ItemStorage {
    private static ItemStorage storage = null;
    private ArrayList<Item> itemList;

    private ItemStorage() {
        itemList = new ArrayList<>();
    }

    public static ItemStorage getInstance() {
        if (storage == null) {
            storage = new ItemStorage();
        }
        return storage;
    }

    public ArrayList<Item> getItems() {
        return itemList;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public Item getItemByObject(int object) {
        return itemList.get(object);
    }
    public void removeItem(String id) {
        int i = 0;
        for (Item l : itemList) {
            if (l.getOstos().equals(id)) {
                break;
            }
            i++;
        }
        itemList.remove(i);
    }
}