package com.springboot.backend.apirest.models.services;

import com.springboot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> findAll(); // LISTAR

    Cliente findById(Long id);

    Cliente save(Cliente cliente);

    void delete(Long id);

}
