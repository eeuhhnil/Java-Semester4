package ru.billing.client;

import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {
    @Override
    public void load(ItemCatalog itemCatalog) throws CatalogLoadException {
        GenericItem item1 = new GenericItem("java", 500.0f, GenericItem.Category.GENERAL);
        FoodItem item2 = new FoodItem(null, "fish", 50.0f, new Date(), (short) 10);
        try {
            itemCatalog.addItem(item1);
            itemCatalog.addItem(item2);

        }
        catch(ItemAlreadyExistsException e){
            e.printStackTrace();
            throw new CatalogLoadException(e);
        }
    }
}