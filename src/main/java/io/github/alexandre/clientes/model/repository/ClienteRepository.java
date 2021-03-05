package io.github.alexandre.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.alexandre.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
