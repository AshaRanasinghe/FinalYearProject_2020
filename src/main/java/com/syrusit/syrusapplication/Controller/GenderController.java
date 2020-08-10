package com.syrusit.syrusapplication.Controller;

import com.syrusit.syrusapplication.entity.Gender;
import com.syrusit.syrusapplication.services.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.ws.RequestWrapper;
@Controller
public class GenderController {

    @Autowired
    private GenderService genderService;

    @RequestMapping(value={"/insertGender"},method = RequestMethod.GET)
    public String insertGender(){


        return "Successfully inserted";

    }


}




