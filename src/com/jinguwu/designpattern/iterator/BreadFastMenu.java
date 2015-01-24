package com.jinguwu.designpattern.iterator;

/**
 * Created by jinguwu on 2015/1/18.
 */
public class BreadFastMenu {

    private Item[] items;

    private int currentPosition;

    private static int DINNER_LENGTH = 6;

    public BreadFastMenu() {
        items = new Item[DINNER_LENGTH];
        addItem("Fish", "spicy fish");
        addItem("chicken", "delicious chick");
    }

    private void addItem(String name, String des) {
        Item item = new Item(name, des);
        if(currentPosition >= DINNER_LENGTH){
            System.out.println("dinner is full...");
        }else {
            items[currentPosition] = item;
            currentPosition ++;
        }
    }

    public Iterator createMenuIterator(){
        return new BreadfastMenuIterator(items);
    }
}
