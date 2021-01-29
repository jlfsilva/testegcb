package com.example.testeclinica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testeclinica.entities.Especialidade;
import com.example.testeclinica.repositories.EspecialidadeRepository;

@Service
public class EspecialidadeService {

	@Autowired
	private EspecialidadeRepository repository;
	
	public List<Especialidade> findAll() {
		return repository.findAll();
	}
	
	public Especialidade findById(Long id) {
		Optional<Especialidade> obj = repository.findById(id);
		return obj.get();
	}

	public Especialidade insert(Especialidade obj) {
		return repository.save(obj);
	}
}
