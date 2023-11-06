package com.pizza.website.service;

import com.pizza.website.model.MenuItem;
import org.springframework.data.domain.Sort;


public interface MenuItemService {
    Iterable<MenuItem> findAll(Sort sort);
}
