package com.syrusit.syrusapplication.Controller;

import Model.Product;
import Model.ProductList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.syrusit.syrusapplication.entity.Item;
import com.syrusit.syrusapplication.entity.PurchaseItem;
import com.syrusit.syrusapplication.entity.PurchaseOrder;
import com.syrusit.syrusapplication.services.ItemService;
import com.syrusit.syrusapplication.services.PurchaseItemService;
import com.syrusit.syrusapplication.services.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/pocontroller") //url of the purchase order controller
public class PurchaseOrderController {

    @Autowired
    private ItemService itemService;
    @Autowired
    PurchaseOrderService purchaseOrderService;
    @Autowired
    PurchaseItemService PurchaseItemService;

    //View purchase order form details
    @RequestMapping(value = {"/neworder"},method = RequestMethod.GET)
    public String newOrder(ModelMap model, HttpSession session){

        PurchaseOrder newOrder = new PurchaseOrder();
        model.addAttribute("PurchaseOrder", newOrder);

        List<Item>  itemList = itemService.findAll();
        Product product = new Product();

        //ProductList productList = new ProductList();

        // session.setAttribute("pList", productList);

        model.addAttribute("itemList",itemList);
        model.addAttribute("product", product);

        return "PurchaseOrder";
    }
    @RequestMapping(value = {"/additem"}, method = RequestMethod.GET)
    public String addItem(ModelMap modelMap,@RequestParam("json") String requestJSON,HttpSession session){
        try {
            ObjectMapper mapper = new ObjectMapper();
            String [] values = mapper.readValue(requestJSON,String[].class);

            Integer itemId = Integer.parseInt(values[0]);
            Integer quantity = Integer.parseInt(values[1]);

            Item itemObj = itemService.findById(itemId);

            Product proObj = new Product();
            proObj.setItem(itemObj);

            proObj.setQuantity(quantity);

            if(session.getAttribute("pList")!= null) {
                ProductList productList = (ProductList) session.getAttribute("pList");
                productList.addProduct(proObj, quantity);

                session.setAttribute("pList", productList);
            }else{
                ProductList  productList = new ProductList();
                productList.addProduct(proObj,quantity);
                session.setAttribute("pList",productList);
         }

        }catch (Exception e){}
        return "redirect:/pocontroller/newOrder";
    }

    @RequestMapping(value = {"/neworder"}, method = RequestMethod.POST)
    public String savePurchaseOrder(@RequestParam("json") String requestJSON, ModelMap modelMap, HttpSession session) {
        try {
            ObjectMapper mapper = new ObjectMapper();
          //String[] values = mapper.readValue(requestJSON, String[].class);
            System.out.println("Purchase Order Star");
            PurchaseOrder purchaseOrder = new PurchaseOrder();
            purchaseOrder.setPONumber("10101010");
            purchaseOrder.setPODate(new Date());
            purchaseOrder.setTotalPrice(150250.00);
            purchaseOrderService.save(purchaseOrder);
            ProductList productList = (ProductList) session.getAttribute("pList");

            for (Product p : productList.getProductList()) {

                PurchaseItem purchaseItem = new PurchaseItem();
                purchaseItem.setPurchaseOrder(purchaseOrder);
                purchaseItem.setItemObj(p.getItem());
                purchaseItem.setQuantity(p.getQuantity());
                PurchaseItemService.save(purchaseItem);
            }
            }catch(Exception e){


        }
            return "PurchaseOrder";
    }
}
