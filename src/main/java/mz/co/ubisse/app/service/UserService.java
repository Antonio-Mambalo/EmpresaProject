package mz.co.ubisse.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.co.ubisse.app.domain.model.Empresa;
import mz.co.ubisse.app.repository.EmpresaRepository;

@Service
public class UserService {

	@Autowired
	private EmpresaRepository userRepository;
	
	public List<String> buscaDadosBanco(){
		List<String> nomes = new ArrayList<>();
		System.out.println("Chamou metodo busca");
		return nomes;
	}
	
	public void deletaDados() {
		System.out.println("Chamou o delete") ;
		userRepository.deleteById(1L);
	}
}
