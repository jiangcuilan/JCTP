package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.ContactMapper;
import com.spring.model.Contact;

/**
 * Date: 27.08.15
 * Time: 17:23
 *
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 * @author http://mruslan.com
 */
@Service
@Transactional
public class ContactService  {

    @Autowired
    private ContactMapper contactMapper;




    public void save(Contact contact) {
         contactMapper.insertSelective(contact);
    }

    public List<Contact> findAll() {
        return contactMapper.findAll();
    }
}
