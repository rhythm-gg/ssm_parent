package com.test.controller;

import com.test.pojo.Items;
import com.test.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(ModelAndView modelAndView){
        List<Items> itemsList = itemsService.findAll();
        modelAndView.addObject("items",itemsList);
        modelAndView.setViewName("items");
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(Items items){
        itemsService.save(items);
        return "redirect:/items/findAll";
    }

}
