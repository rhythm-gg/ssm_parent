package com.test.dao;

import com.test.pojo.Items;

import java.util.List;

public interface ItemsDao {

    List<Items> findAll();

    int save(Items items);
}
