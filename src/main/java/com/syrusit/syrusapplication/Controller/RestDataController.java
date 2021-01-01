package com.syrusit.syrusapplication.Controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.syrusit.syrusapplication.entity.Category;
import com.syrusit.syrusapplication.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RestDataController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = {"/retrievecategory"},method = RequestMethod.GET)
    public List<Category> getCategoryByName(@RequestParam("json") String requestJSON, HttpSession session){

        List<Category> categoryList = new ArrayList();

        try{
            ObjectMapper mapper = new ObjectMapper();
            String[] values = mapper.readValue(requestJSON,String[].class);

            String vall = values[0];
            categoryList = categoryService.findByName(vall);
        }catch (Exception e){}
        return categoryList;
    }


}
