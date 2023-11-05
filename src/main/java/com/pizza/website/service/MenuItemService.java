package com.pizza.website.service;

import com.pizza.website.model.Menu;
import org.springframework.data.domain.Sort;


public interface MenuItemService {
    Iterable<Menu> findAll(Sort sort);
}
