package com.spring.ctech.petclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.ctech.petclinic.model.Owner;
import com.spring.ctech.petclinic.model.Vet;
import com.spring.ctech.petclinic.service.OwnerService;
import com.spring.ctech.petclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner{

	@Autowired
	private OwnerService ownerService;
	
	@Autowired
	private VetService vetService;
	
	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setFirstName("Chandan");
		owner1.setLastName("Tamang");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Deepak");
		owner2.setLastName("Rawat");
		
		ownerService.save(owner2);
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Deepac");
		vet1.setLastName("Bangarwa");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Pankaj");
		vet2.setLastName("Goswami");
		
		vetService.save(vet2);
	}

}
