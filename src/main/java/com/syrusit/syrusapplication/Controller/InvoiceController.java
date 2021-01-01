package com.syrusit.syrusapplication.Controller;

import com.syrusit.syrusapplication.entity.Invoice;
import com.syrusit.syrusapplication.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @RequestMapping(value = {"/Invoice"}, method = RequestMethod.GET)
    public String loadEmployee(ModelMap model) {

        Invoice empObject = new Invoice();

        List<Invoice> genderList = invoiceService.findAll();
        model.addAttribute(genderList);
        model.addAttribute("invoice", empObject);

        return "CreateInvoice";
    }
}
