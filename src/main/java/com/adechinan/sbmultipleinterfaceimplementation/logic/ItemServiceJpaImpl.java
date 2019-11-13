package com.adechinan.sbmultipleinterfaceimplementation.logic;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class ItemServiceJpaImpl implements IItemService {

    private final ItemRepository itemRepository;

    @Override
    public Item save(Item item) {
        log.info("save call in h2");
        return this.itemRepository.save(item);
    }

    @Override
    public List<Item> findAll() {
        log.info("find call from h2");
        return this.itemRepository.findAll();
    }
}
