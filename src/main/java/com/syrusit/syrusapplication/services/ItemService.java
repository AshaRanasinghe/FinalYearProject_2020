package com.syrusit.syrusapplication.services;


import com.syrusit.syrusapplication.entity.Item;

import java.util.List;

public interface ItemService {

    public void save(Item g);

    public void update(Item g);

    public void delete(Item g);

    public List<Item> findAll();

    public Item findById(Integer id);
}
