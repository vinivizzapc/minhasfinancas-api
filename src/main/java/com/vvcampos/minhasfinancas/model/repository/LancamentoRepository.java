package com.vvcampos.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvcampos.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
	
}
