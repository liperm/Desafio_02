package com.br.saks.cliente.clienteservice.repository;

import com.br.saks.cliente.clienteservice.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}

