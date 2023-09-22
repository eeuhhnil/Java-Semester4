package ru.billing.stocklist;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {
    private HashMap<Integer, GenericItem> catalog = new HashMap<>();
    private ArrayList<GenericItem> ALcatalog = new ArrayList<>();

    public void addItem(GenericItem item){
        catalog.put(item.Id, item);
        ALcatalog.add(item);
    }


    public void printItem(){
        for (GenericItem i : ALcatalog)
            System.out.println(i);
    }

    public GenericItem findItemById(int id){
        if(!catalog.containsKey(id))
            return null;
        else
            return catalog.get(id);
    }

    public GenericItem findItemByIdAL(int id){
        for(GenericItem i : ALcatalog)
            if(i.Id == id)
                return i;
        return null;
    }


}
