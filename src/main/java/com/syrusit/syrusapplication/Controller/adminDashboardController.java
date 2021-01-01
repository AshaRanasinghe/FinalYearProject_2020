package com.syrusit.syrusapplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Dashboard")
public class adminDashboardController {

    @RequestMapping(value = ("/admin"),method = RequestMethod.GET)
    public String LoadAdminPanel(ModelMap model) {
        return "DashBoard";
    }
    @RequestMapping(value = ("/employee"),method = RequestMethod.GET)
    public String LoadEmployeePanel(ModelMap model) {
        return "EmployeeView";
    }

    @RequestMapping(value = ("/supplier"),method = RequestMethod.GET)
    public String LoadSupplierPanel(ModelMap model) { return "SupplierView"; }

    @RequestMapping(value = ("/purchaseOrder"),method = RequestMethod.GET)
    public String LoadPurchaseorderPanel(ModelMap model) { return "PurchaseOrder"; }
}
