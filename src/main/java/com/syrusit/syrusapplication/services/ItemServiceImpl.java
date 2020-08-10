package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Item;
import com.syrusit.syrusapplication.repositary.entity.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void save(Item g) {

    }

    @Override
    public void update(Item g) {

    }

    @Override
    public void delete(Item g) {

    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item findById(Integer id) {
        return itemRepository.findById(id).get();
    }
}
