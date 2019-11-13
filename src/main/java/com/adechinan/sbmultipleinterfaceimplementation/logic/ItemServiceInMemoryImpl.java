package com.adechinan.sbmultipleinterfaceimplementation.logic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
//@Service("itemServiceInMemoryImpl") -> Optional if  @Qualifier value is same as Class name with first letter as lowercase
@Service
public class ItemServiceInMemoryImpl implements IItemService {

    private List<Item> store = new ArrayList<>();

    @Override
    public Item save(Item item) {
        log.info("save call in memory");
        this.store.add(item);
        return item;
    }

    @Override
    public List<Item> findAll() {
        log.info("find call from memory");
        return store;
    }
}
