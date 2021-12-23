package com.springboot.backend.apirest.models.services;

import com.springboot.backend.apirest.models.dao.IClienteDao;
import com.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService {
    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        return null;
    }

    @Override
    public Cliente save(Cliente cliente) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
