package com.pizza.website.controller;

import com.pizza.website.model.Menu;
import com.pizza.website.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    private MenuItemService menuItemService;

    @GetMapping("/api/menu")
    public Iterable<Menu> findAll(){
        return menuItemService.findAll(Sort.by("name"));
    }
}
