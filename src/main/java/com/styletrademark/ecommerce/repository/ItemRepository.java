package com.styletrademark.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.styletrademark.ecommerce.dto.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
