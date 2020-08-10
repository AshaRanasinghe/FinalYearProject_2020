package com.syrusit.syrusapplication.Controller;


import com.syrusit.syrusapplication.entity.Employee;
import com.syrusit.syrusapplication.entity.Gender;
import com.syrusit.syrusapplication.services.EmployeeService;
import com.syrusit.syrusapplication.services.GenderService;
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
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private GenderService genderService;
    @RequestMapping(value = {"/newemployee"}, method = RequestMethod.GET)
    public String loadEmployee(ModelMap model) {

        Employee empObject = new Employee();

        List<Gender> genderList = genderService.findAll();
        model.addAttribute(genderList);
        model.addAttribute("employee", empObject);

        return "EmployeeRegistration";
    }

    @RequestMapping(value = {"/newemployee"}, method = RequestMethod.POST)
    public String saveEmployee(@Valid Employee employee, BindingResult bindingResult, ModelMap model){

        //checking if the NIC is already existing or not

        //Employee valEmp = employeeService.findByNic(employee.getNic());

   //     System.out.println(valEmp);

        //validation
        if (bindingResult.hasErrors()){
            return "EmployeeRegistration";
        }
        employee.setStatus(true);
        employeeService.save(employee);
        List<Employee> empList = employeeService.findAll();
        model.addAttribute("employeeList",empList);
        return "EmployeeView";
    }

    @RequestMapping(value = {"/employee"}, method = RequestMethod.GET)
    public String loadEmployeeForm(ModelMap model){
        List<Employee> empList = employeeService.findAll();
        model.addAttribute("employeeList",empList);
        return "EmployeeView";
    }

    @RequestMapping(value = {"edit-employee-{id}"}, method = RequestMethod.GET)
    public String loadUpdateForm(ModelMap model, @PathVariable String id){

        int empId = Integer.parseInt(id); //convert the id to int

        Employee empObj = employeeService.findById(empId);
        model.addAttribute("employee",empObj);
        model.addAttribute("edit", true);
        return "EmployeeRegistration";
    }

    @RequestMapping( value = {"edit-employee-{id}"},method = RequestMethod.POST)
    public String updateEmployee(Employee employee,ModelMap model,@PathVariable String id){

        employeeService.save(employee);
        List<Employee> empList = employeeService.findAll();
        model.addAttribute("employeeList",empList);
        return "EmployeeView";
    }

    @RequestMapping( value = {"delete-employee-{id}"},method = RequestMethod.GET)
    public String deleteEmployee(Employee employee,ModelMap model,@PathVariable String id){

        int empId = Integer.parseInt(id);

        Employee empObj = employeeService.findById(empId);

        empObj.setStatus(false);

        employeeService.update(empObj);
        List<Employee> empList = employeeService.findAll();
        model.addAttribute("employeeList",empList);
        return "EmployeeView";
    }

}
