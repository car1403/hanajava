package org.example.app.service;

import org.example.app.dao.CustDao;
import org.example.app.data.CustDto;
import org.example.app.frame.Dao;
import org.example.app.frame.Service;


import java.util.List;

public class CustService implements Service<String, CustDto> {

    Dao<String, CustDto> dao;

    public CustService(){
        dao = new CustDao();
    }


    @Override
    public int add(CustDto custDto) {
        return 0;
    }

    @Override
    public int del(String s) {
        return 0;
    }

    @Override
    public int modify(CustDto custDto) {
        return 0;
    }

    @Override
    public CustDto get(String s) {
        return null;
    }

    @Override
    public List<CustDto> get() {
        return null;
    }
}
