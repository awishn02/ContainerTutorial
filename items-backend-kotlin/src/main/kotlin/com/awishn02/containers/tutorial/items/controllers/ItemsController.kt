package com.awishn02.containers.tutorial.items.controllers

import com.awishn02.containers.tutorial.items.dao.ItemsDao
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ItemsController {
    val itemsDao = ItemsDao()

    @GetMapping("/items")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
        itemsDao.getItems()
}
