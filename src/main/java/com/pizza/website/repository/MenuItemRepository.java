package com.pizza.website.repository;

import com.pizza.website.model.Menu;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MenuItemRepository extends PagingAndSortingRepository <Menu, Long> {
}
