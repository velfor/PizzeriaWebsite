package com.pizza.website.repository;

import com.pizza.website.model.MenuItem;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MenuItemRepository extends PagingAndSortingRepository <MenuItem, Long> {
}
