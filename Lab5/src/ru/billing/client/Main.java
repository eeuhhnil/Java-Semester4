package ru.billing.client;

import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.sql.Date;

public class Main {
    public static void main(String [] args) throws CatalogLoadException {
        String fileName="D:\\Semester 4\\Java\\Lab5\\src\\ru\\billing\\items.txt";
        ItemCatalog catalog = new ItemCatalog();
        CatalogFileLoader fileLoader = new CatalogFileLoader(fileName);
        fileLoader.load(catalog);
        catalog.printItem();
    }
}
