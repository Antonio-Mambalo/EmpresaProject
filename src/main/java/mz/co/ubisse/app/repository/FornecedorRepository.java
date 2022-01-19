package mz.co.ubisse.app.repository;

import org.springframework.stereotype.Repository;

import mz.co.ubisse.app.domain.model.Fornecedor;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>  {

}
