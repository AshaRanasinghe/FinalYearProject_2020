package com.syrusit.syrusapplication.Controller;

import com.syrusit.syrusapplication.entity.Employee;
import com.syrusit.syrusapplication.entity.SystemUser;
import com.syrusit.syrusapplication.entity.UserRole;
import com.syrusit.syrusapplication.services.EmployeeService;
import com.syrusit.syrusapplication.services.RoleService;
import com.syrusit.syrusapplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;


@Controller
public class UserController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String loadLoginForm(ModelMap model) {
        model.addAttribute("user", new SystemUser());
        return "Login";
    }

    @RequestMapping(value = {"/registration"}, method = RequestMethod.GET)
    public String loadUserRegistration(ModelMap model) {

        SystemUser user = new SystemUser();
        List<Employee> empList = employeeService.findAll();
        List<UserRole> roleList = roleService.findAll();

        model.addAttribute("user", user);
        model.addAttribute("employeeList", empList);
        model.addAttribute("roleList", roleList);
        return "UserRegistration";
    }

    @RequestMapping(value = {"/registration"}, method = RequestMethod.POST)
    public void saveUser(@Valid SystemUser systemUser, ModelMap model) {

        String password = systemUser.getPassword();

        BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();

        String encodedPassword = bCrypt.encode(password);

        systemUser.setPassword(encodedPassword);

        userService.save(systemUser);


    }


}













