package com.example.reacts.menu;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository repository;

    public List<Menu> getMenus(){
        return repository.findAll(Sort.by(Sort.Direction.ASC, "order"));
    }


}
