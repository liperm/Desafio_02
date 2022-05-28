package com.br.saks.administrador.administradorservice.repository;

import com.br.saks.administrador.administradorservice.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepository extends JpaRepository<Administrador, Long>{
    
}
