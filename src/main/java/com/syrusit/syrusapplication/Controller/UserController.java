package com.syrusit.syrusapplication.Controller;

import com.syrusit.syrusapplication.entity.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {
    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String loadLoginForm(ModelMap model ){
        model.addAttribute("user",new user());
        return "Login";
    }


}
















