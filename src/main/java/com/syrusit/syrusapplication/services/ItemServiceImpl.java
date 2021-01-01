package com.syrusit.syrusapplication.services;

import com.syrusit.syrusapplication.entity.Item;
import com.syrusit.syrusapplication.repositary.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void save(Item i) {
        itemRepository.save(i);
    }

    @Override
    public void update(Item i) {
        itemRepository.save(i);
    }

    @Override
    public void delete(Item i) {
    itemRepository.delete(i);
    }

    @Override
    public List<Item> findAll() {
     return itemRepository.findAll();
    }

    @Override
    public Item findById(int id) {
        return itemRepository.findById(id).get();
    }

    @Override
    public Item findByItemName(String name) {
        return null;
    }

    @Override
    public Item findByStatus(boolean status) {
        return null;
    }
}
