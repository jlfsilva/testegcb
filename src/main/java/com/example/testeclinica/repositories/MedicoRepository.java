package com.example.testeclinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testeclinica.entities.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

}
