package com.example.reacts.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

@RequestMapping("/api")
public class MenuController {

    @Autowired
    public MenuService service;

    @GetMapping("/menu/getMenus")
    public @ResponseBody List<Menu> menuList(){
        List<Menu> menuList = service.getMenus();
        return menuList;
    }
}
