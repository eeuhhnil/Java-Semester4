package ru.billing.client;

import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("----- TASK 1 -----");
        ItemCatalog itemCatalog = new ItemCatalog();
        GenericItem a = new GenericItem("java", 500.0f, GenericItem.Category.GENERAL);
        GenericItem b = new GenericItem("python", 200.0f, GenericItem.Category.GENERAL);
        GenericItem c = new GenericItem("javascript", 100.0f, GenericItem.Category.GENERAL);

        itemCatalog.addItem(a);
        itemCatalog.addItem(b);
        itemCatalog.addItem(c);
        itemCatalog.printItem();

        System.out.println("----- TASK 2 -----");

        long begin = new Date().getTime();
        for(int i = 0; i<100000; i++)
            itemCatalog.findItemById(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: "+(end-begin)); begin = new
                Date().getTime();
        for(int i=0; i<100000;i++)
            itemCatalog.findItemByIdAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: "+(end-begin));

        System.out.println("----- TASK 3 -----");

        CatalogLoader loader = new CatalogStubLoader();
        loader.load(itemCatalog);
        itemCatalog.printItem();

    }
}