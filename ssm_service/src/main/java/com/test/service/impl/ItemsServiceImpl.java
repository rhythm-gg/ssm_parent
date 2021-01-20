package com.test.service.impl;

import com.test.dao.ItemsDao;
import com.test.pojo.Items;
import com.test.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    @Override
    public int save(Items items) {
        return itemsDao.save(items);
    }

}
