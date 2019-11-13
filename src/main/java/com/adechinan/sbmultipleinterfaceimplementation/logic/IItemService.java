package com.adechinan.sbmultipleinterfaceimplementation.logic;

import java.util.List;

public interface IItemService {
    Item save(Item item);

    List<Item> findAll();
}
