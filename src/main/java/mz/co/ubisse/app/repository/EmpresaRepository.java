package mz.co.ubisse.app.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mz.co.ubisse.app.domain.model.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>  {

}
 