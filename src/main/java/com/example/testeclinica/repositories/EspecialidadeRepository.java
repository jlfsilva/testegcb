package com.example.testeclinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testeclinica.entities.Especialidade;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long>{
}
