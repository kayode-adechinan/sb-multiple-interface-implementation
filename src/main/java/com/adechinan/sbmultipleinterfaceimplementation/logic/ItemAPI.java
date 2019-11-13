package com.adechinan.sbmultipleinterfaceimplementation.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/items")
public class ItemAPI {

    @Qualifier("itemServiceInMemoryImpl")
    //@Qualifier("itemServiceJpaImpl")
    @Autowired
    private IItemService iItemService;


    @PostMapping
    public Item save(@RequestBody Item item){
        return this.iItemService.save(item);
    }

    @GetMapping
    public List<Item> findAll(){
        return this.iItemService.findAll();
    }

}
