package com.syrusit.syrusapplication.Controller;

import com.syrusit.syrusapplication.entity.Employee;
import com.syrusit.syrusapplication.entity.Gender;
import com.syrusit.syrusapplication.entity.Supplier;
import com.syrusit.syrusapplication.services.SupplierService;
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
@RequestMapping("/supplierController")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;


    @RequestMapping(value = {"/newSupplier"}, method = RequestMethod.GET)
    public String loadSupplier(ModelMap model) {

        Supplier supObject = new Supplier();

        model.addAttribute("supplier", supObject);
        return "Supplier";
   }
    @RequestMapping(value = {"/newSupplier"},method = RequestMethod.POST)
    public String SaveSupplier(@Valid Supplier supplier , BindingResult bindingResult, ModelMap model) {

        Supplier validateplayer =   supplierService.findBySupplierName(supplier.getFirstName());

        if(validateplayer != null){
            bindingResult.rejectValue("firstname", "error.member", "This NIC already exists in the System");
        }
        if (bindingResult.hasErrors()) {
            return "Supplier";
        }
       supplier.setStatus(true);
        supplierService.save(supplier);
        List<Supplier> supList = supplierService.findAll();
        model.addAttribute("supplierList", supList);
        return "SupplierView";
    }
    @RequestMapping(value={"/Supplier"},method = RequestMethod.GET)
    public String LoadSupplierform(ModelMap model){
        List<Supplier> supList = supplierService.findAll();
        model.addAttribute("supplierList", supList);
        return "SupplierView";
    }

    @RequestMapping(value = {"/edit-supplier-{id}"}, method = RequestMethod.GET)
    public String loadUpdateForm(@PathVariable String id,ModelMap model){

        int supId = Integer.parseInt(id); //convert the id to int

        Supplier supObj = supplierService.findById(supId);

        model.addAttribute("supplier",supObj);
        model.addAttribute("edit", true);
        return "Supplier";
    }

    @RequestMapping( value = {"edit-supplier-{id}"},method = RequestMethod.POST)
    public String updateSupplier(Supplier supplier,@PathVariable String id,ModelMap model){

        supplierService.save(supplier);
        List<Supplier> supList = supplierService.findAll();
        model.addAttribute("supplierList",supList);
        return "SupplierView";
    }

    @RequestMapping( value = {"/delete-supplier-{id}"},method = RequestMethod.GET)
    public String deleteSuppier(Supplier supplier,@PathVariable String id,ModelMap model){

        int supId = Integer.parseInt(id);

        Supplier supObj = supplierService.findById(supId);
        supObj.setStatus(false);

        supplierService.delete(supObj);
        List<Supplier> supList = supplierService.findAll();
        model.addAttribute("supplierList",supList);
        return "SupplierView";
    }
}



