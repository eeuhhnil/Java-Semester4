package ru.billing.client;

import ru.billing.stocklist.ItemCatalog;
import ru.itmo.exceptions.CatalogLoadException;

import java.io.FileNotFoundException;

public interface CatalogLoader {
    public void load(ItemCatalog cat) throws CatalogLoadException, FileNotFoundException;
}
