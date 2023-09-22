package ru.billing.client;

import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {
    @Override
    public void load(ItemCatalog cat) {
        GenericItem item1 = new GenericItem("java", 500.0f, GenericItem.Category.GENERAL);
        FoodItem item2 =new FoodItem(null,"fish", 50.0f, new Date(), (short) 10);
        cat.addItem(item1);
        cat.addItem(item2);

    }
}
