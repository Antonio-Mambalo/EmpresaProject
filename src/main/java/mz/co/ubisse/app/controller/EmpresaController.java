package mz.co.ubisse.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import mz.co.ubisse.app.domain.model.Cliente;
import mz.co.ubisse.app.domain.model.Empresa;
import mz.co.ubisse.app.domain.model.Fornecedor;
import mz.co.ubisse.app.domain.model.Pessoa;
import mz.co.ubisse.app.repository.ClienteRepository;
import mz.co.ubisse.app.repository.EmpresaRepository;
import mz.co.ubisse.app.repository.FornecedorRepository;
import mz.co.ubisse.app.repository.PessoaRepository;

@RestController
public class EmpresaController {
	

	
	@Autowired 
	private ClienteRepository clienteRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private FornecedorRepository fornecedorRepository;

	@Autowired
	private EmpresaRepository empresaRepository;
	
	@GetMapping("/empresa/cliente")
	public List<Cliente> listarCliente(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/empresa/fornecedor")
	public List<Fornecedor> listarFornecedor(){
		return fornecedorRepository.findAll();
	}
	
	

	@PostMapping("/empresa/cliente")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@Valid @RequestBody Cliente cliente) {
		
		
		
		return clienteRepository.save(cliente);
	}
	
	@PostMapping("/empresa/fornecedor")
	public Fornecedor adicionar(@Valid @RequestBody Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);

	

}
}