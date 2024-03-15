package com.hana.service;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;
import com.hana.frame.Service;
import com.hana.repository.CustRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

public class CustService implements Service<String, CustDto> {

    CustRepository repository;

    public CustService(){
        repository = new CustRepository();
    }


    @Override
    public CustDto add(CustDto custDto) throws DuplicatedIdException, Exception {
        return repository.insert(custDto);
    }

    @Override
    public CustDto modify(CustDto custDto) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public Boolean remove(String s) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public List<CustDto> get() throws Exception {
        return null;
    }

    @Override
    public CustDto get(String s) throws NotFoundIdException, Exception {
        return null;
    }
}
