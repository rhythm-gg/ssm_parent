package com.test.service;

import com.test.pojo.Items;

import java.util.List;

public interface ItemsService {
    List<Items> findAll();

    int save(Items items);
}
