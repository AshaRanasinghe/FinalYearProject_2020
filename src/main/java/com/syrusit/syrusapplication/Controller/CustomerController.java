package com.syrusit.syrusapplication.Controller;


import com.syrusit.syrusapplication.entity.Customer;
import com.syrusit.syrusapplication.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;


@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

//create the customer
    @RequestMapping(value={"/newCustomer" },method = RequestMethod.GET)
    public String loadCustomer (ModelMap model){

        Customer cusobj = new Customer();
        model.addAttribute("customer", cusobj);

        return "CustomerCreate";

    }

//save the customer
    @RequestMapping(value = {"/newCustomer"},method = RequestMethod.POST)
    public String SaveCustomer (@Valid Customer customer, ModelMap model) {

       // Customer valEmp = customerService.findByNIC(customer.getNic());

     //   System.out.println(valEmp);

        //validation
       // if (bindingResult.hasErrors()){
       //     return "EmployeeRegistration";
       // }
      //  customer.setStatus(true);

        customerService.save(customer);
        List<Customer> cusList = customerService.findAll();
        model.addAttribute("customerList",cusList);
        return "CustomerView";
    }

    //load customer list
    @RequestMapping(value = {"/customer"}, method = RequestMethod.GET)
    public String loadCustomerForm(ModelMap model){

        List<Customer> cusList = customerService.findAll();
        model.addAttribute("customerList",cusList);
        return "CustomerView";
    }

    //load update view of the customer
    @RequestMapping(value = {"edit-customer-{id}"}, method = RequestMethod.GET)
    public String loadUpdateForm(ModelMap model, @PathVariable String id){

        int cusId = Integer.parseInt(id); //convert the id to int

        Customer cusObj = customerService.findById(cusId);
        model.addAttribute("customer",cusObj);
        model.addAttribute("edit", true);
        return "CustomerCreate";
    }

    //view updated view
    @RequestMapping( value = {"edit-customer-{id}"},method = RequestMethod.POST)
    public String updateCustomer(Customer customer,ModelMap model,@PathVariable String id){

        customerService.save(customer);
        List<Customer> cusList = customerService.findAll();
        model.addAttribute("customerList",cusList);
        return "CustomerView";
    }

//delete customer
    @RequestMapping( value = {"delete-customer-{id}"},method = RequestMethod.GET)
    public String deleteCustomer(Customer customer,ModelMap model,@PathVariable String id){

        int cusId = Integer.parseInt(id);

        Customer cusObj = customerService.findById(cusId);
         cusObj.setStatus(false);

        customerService.update(cusObj);
        List<Customer> cusList = customerService.findAll();
        model.addAttribute("customerList",cusList);
        return "CustomerView";
    }
}


