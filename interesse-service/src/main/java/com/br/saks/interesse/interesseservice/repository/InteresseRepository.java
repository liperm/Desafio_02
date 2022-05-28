package com.br.saks.interesse.interesseservice.repository;

import java.util.List;
import java.util.Optional;
import com.br.saks.interesse.interesseservice.model.Interesse;
import com.br.saks.interesse.interesseservice.model.InteresseIdentity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteresseRepository extends JpaRepository<Interesse, InteresseIdentity>{
    List<Interesse> findByInteresseIdentityIdCliente(Long idCliente);
    
}