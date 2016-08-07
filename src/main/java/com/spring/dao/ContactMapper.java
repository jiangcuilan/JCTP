package com.spring.dao;

import java.util.List;

import com.spring.model.Contact;

public interface ContactMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Contact record);

    int insertSelective(Contact record);

    Contact selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Contact record);

    int updateByPrimaryKey(Contact record);
    
    public List<Contact> findAll();
}