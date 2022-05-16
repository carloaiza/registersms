package com.pro2umanizales.registersms.infrastructure.controllers;

import com.pro2umanizales.registersms.infrastructure.repositories.entities.Register;
import com.pro2umanizales.registersms.infrastructure.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "register")
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @GetMapping
    public List<Register> getAllRegisters()
    {
        return registerService.getAll();
    }

    @PostMapping
    public String saveRegister(@RequestBody Register register)
    {
        registerService.save(register);
        return "Registro adicionado";
    }
}
