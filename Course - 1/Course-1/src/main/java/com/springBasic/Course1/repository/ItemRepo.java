package com.springBasic.Course1.repository;

import com.springBasic.Course1.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface ItemRepo extends JpaRepository<Item,Integer>{

    List<Item> findAllByItemNameEqualsAndActiveStateEquals(String itemName, boolean activeState);
}
