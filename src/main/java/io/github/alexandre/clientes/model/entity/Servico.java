package io.github.alexandre.clientes.model.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false,length = 255)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")//DEFINE QUE A TABELA SERVIÇO TERÁ UMA CHAVE ESTRANGEIRA
	private Cliente cliente;
	
	@Column
	private BigDecimal valor;
}
