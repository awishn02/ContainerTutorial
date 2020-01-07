package com.awishn02.containers.tutorial.items.dao

import com.awishn02.containers.tutorial.items.models.Item
import java.util.Collections.singletonList

public class ItemsDao {
    public fun getItems(): MutableList<Item> = singletonList(Item(1, "test"))
}
