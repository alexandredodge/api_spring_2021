package io.github.alexandre.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.alexandre.clientes.model.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico,Integer>{

}
