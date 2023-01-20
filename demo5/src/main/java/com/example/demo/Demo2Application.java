package com.example.demo;

import java.util.Date;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

	@Autowired
	private PersonneRepository personneRepository;
	public static void main(String[] args) {
SpringApplication.run(Demo2Application.class, args);

}
		
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
Etudiante etudiant=new Etudiante();
etudiant.setNom("Louey3");
etudiant.setNote(14);
etudiant.setDateNaissance(new Date());
personneRepository.save(etudiant);
Enseignante enseignant=new Enseignante();
enseignant.setNom("Professeur");
enseignant.setDateNaissance(new Date());
enseignant.setMatiere("Math");
personneRepository.save(enseignant);
}

}


