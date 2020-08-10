package com.syrusit.syrusapplication.Controller;

import Model.Product;
import com.syrusit.syrusapplication.entity.Item;
import com.syrusit.syrusapplication.entity.PurchaseOrder;
import com.syrusit.syrusapplication.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PurchaseOrderController {

    @Autowired
    private ItemService itemService;


    @RequestMapping(value = {"/neworder"},method = RequestMethod.GET)
    public String newOrder(ModelMap model){

        PurchaseOrder newOrder = new PurchaseOrder();
        model.addAttribute("PurchaseOrder",newOrder);
        List<Item> itemList= itemService.findAll();

        Product product= new Product();

        model.addAttribute("itemList",itemList);
        model.addAttribute("product",product);

        return "PurchaseOrder";
    }
}
