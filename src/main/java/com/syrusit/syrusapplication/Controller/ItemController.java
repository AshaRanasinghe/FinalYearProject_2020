package com.syrusit.syrusapplication.Controller;

import com.syrusit.syrusapplication.entity.Item;
import com.syrusit.syrusapplication.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = {"/newItem"}, method = RequestMethod.GET)
    public String LoadItem(ModelMap model) {

        Item itemObj = new Item();
        model.addAttribute("item", itemObj);
        return "NewItem";
    }
    @RequestMapping(value = {"/newItem"}, method = RequestMethod.POST)
    public String SaveItem(@Valid Item item, BindingResult bindingResult, ModelMap model) {

        Item validateplayer = itemService.findByItemName(item.getName());

        if (validateplayer != null) {
            bindingResult.rejectValue("name", "error.member", "This NIC already exists in the System");
        }
        if (bindingResult.hasErrors()) {
            return "ItemView";
        }
        item.setStatus(true);
        itemService.save(item);
        List<Item> itmList = itemService.findAll();
        model.addAttribute("itemList", itmList);
        return "ItemView";
    }
    @RequestMapping(value = {"/item"}, method = RequestMethod.GET)
    public String LoadItemform(ModelMap model) {
        List<Item> itmList = itemService.findAll();
        model.addAttribute("itemList", itmList);
        return "ItemView";
    }
    @RequestMapping(value = {"/edit-item-{id}"}, method = RequestMethod.GET)
    public String loadUpdateItemForm(@PathVariable String id, ModelMap model) {

        int itmID = Integer.parseInt(id); //convert the id to int

        Item itemOjb = itemService.findById(itmID);

        model.addAttribute("item", itemOjb);
        model.addAttribute("edit", true);
        return "ItemView";
    }
    @RequestMapping(value = {"edit-item-{id}"}, method = RequestMethod.POST)
    public String updateItem(Item item, @PathVariable String id, ModelMap model) {

        itemService.save(item);
        List<Item> itmList = itemService.findAll();
        model.addAttribute("itemList", itmList);
        return "ItemView";
    }
    @RequestMapping(value = {"/delete-supplier-{id}"}, method = RequestMethod.GET)
    public String deleteItem(Item item, @PathVariable String id, ModelMap model) {

        int itemId = Integer.parseInt(id);

        Item itemObj = itemService.findById(itemId);
        itemObj.setStatus(false);

        itemService.delete(itemObj);
        List<Item> itmList = itemService.findAll();
        model.addAttribute("itemList", itmList);
        return "ItemView";
    }
}
