package com.syrusit.syrusapplication.services;


import com.syrusit.syrusapplication.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {

    public void save(Item i);

    public void update(Item i);

    public void delete(Item i);

    public List<Item>findAll();

    public Item findById(int id);

    public Item findByItemName(String name);

    public Item findByStatus(boolean status);

}
