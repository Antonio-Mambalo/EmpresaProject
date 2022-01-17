package mz.co.ubisse.app.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import mz.co.ubisse.app.domain.model.Empresa;
import mz.co.ubisse.app.repository.EmpresaRepository;

@RestController
public class EmpresaController {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@GetMapping("/empresa")
	public List<Empresa> listarTodos(){
		return empresaRepository.findAll();
	}

	@PostMapping("/empresa")
	@ResponseStatus(HttpStatus.CREATED)
	public Empresa adicionar(@RequestBody Empresa empresa) {
		return empresaRepository.save(empresa);
	}

	

}
