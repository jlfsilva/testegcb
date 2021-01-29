package com.example.testeclinica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testeclinica.entities.Medico;
import com.example.testeclinica.repositories.MedicoRepository;

@Service
public class MedicoService {

	@Autowired
	private MedicoRepository repository;
	
	public List<Medico> findAll() {
		return repository.findAll();
	}
	
	public Medico findById(Long id) {
		Optional<Medico> obj = repository.findById(id);
		return obj.get();
	}
}
