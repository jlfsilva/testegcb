package com.example.testeclinica.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.testeclinica.entities.Especialidade;
import com.example.testeclinica.entities.Medico;
import com.example.testeclinica.repositories.EspecialidadeRepository;
import com.example.testeclinica.repositories.MedicoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private EspecialidadeRepository especialidadeRepository;
	
	@Autowired
	private MedicoRepository medicoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Especialidade e1 = new Especialidade(null, "ALERGOLOGIA");
		Especialidade e2 = new Especialidade(null, "ANGIOLOGIA");
		Especialidade e3 = new Especialidade(null, "BUCO MAXILO");
		Especialidade e4 = new Especialidade(null, "CARDIOLOGIA CLÍNICA");
		Especialidade e5 = new Especialidade(null, "CARDIOLOGIA INFANTIL");
		Especialidade e6 = new Especialidade(null, "CIRURGIA CABEÇA E PESCOÇO");
		Especialidade e7 = new Especialidade(null, "CIRURGIA CARDÍACA");
		Especialidade e8 = new Especialidade(null, "CIRURGIA DE TÓRAX");
		
		especialidadeRepository.saveAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8));
		
		Medico m1 = new Medico(null, "Carlos Roberto", "12.000.25", "1120169188", "11974069856", "08440525", "Rua bárbara Pereira de Alencar", "175", null, "Jardim Lageado", "São Paulo", "SP");
		
		medicoRepository.save(m1);
		
		m1.getEspecialidades().addAll(Arrays.asList(e1, e8));
		
		medicoRepository.save(m1);
	}

}
