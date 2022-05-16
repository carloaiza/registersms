package com.pro2umanizales.registersms.infrastructure.services;

import com.pro2umanizales.registersms.infrastructure.repositories.RegisterRepositoryAble;
import com.pro2umanizales.registersms.infrastructure.repositories.entities.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepositoryAble registerRepositoryAble;

    public List<Register> getAll()
    {
        return registerRepositoryAble.findAll();
    }

    public void save(Register register)
    {
        registerRepositoryAble.save(register);
    }

}
