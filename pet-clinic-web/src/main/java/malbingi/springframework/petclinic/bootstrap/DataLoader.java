package malbingi.springframework.petclinic.bootstrap;

import malbingi.springframework.petclinic.model.Owner;
import malbingi.springframework.petclinic.model.PetType;
import malbingi.springframework.petclinic.model.Vet;
import malbingi.springframework.petclinic.services.OwnerService;
import malbingi.springframework.petclinic.services.PetTypeService;
import malbingi.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Jan");
        owner1.setLastName("Kowalski");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Anna");
        owner2.setLastName("Jakubowska");
        ownerService.save(owner2);

        System.out.println("Im done with Owners");
        Vet vet1 = new Vet();
        vet1.setFirstName("Jakub");
        vet1.setLastName("Mielarczyk");
        vetService.save(vet1);

        System.out.println("Im done with Vet1");
        Vet vet2 = new Vet();
        vet2.setFirstName("Anna");
        vet2.setLastName("Włodarczyk");
        vetService.save(vet2);
        System.out.println("Im done with Vet2");

    }
}
