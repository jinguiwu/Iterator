package com.jinguwu.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinguwu on 2015/1/18.
 */
public class DinnerMenu {
    private List<Item> dinnerItems;

    public DinnerMenu() {
        dinnerItems = new ArrayList<Item>();
        addItem("bread", "sweet bread");
    }

    private void addItem(String name, String des) {
        Item item = new Item(name, des);
        dinnerItems.add(item);
    }

    public Iterator createMenuIterator(){
        return  new DinnerMenuIterator(dinnerItems);
    }
}
