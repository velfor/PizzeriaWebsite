package com.pizza.website.service;

import com.pizza.website.model.Menu;
import com.pizza.website.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class MenuItemServiceImpl implements MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    @Override
    public Iterable<Menu> findAll(Sort sort) {
        return menuItemRepository.findAll(Sort.by("name"));
    }
}
