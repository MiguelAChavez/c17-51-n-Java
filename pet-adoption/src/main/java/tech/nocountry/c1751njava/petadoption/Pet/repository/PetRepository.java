package tech.nocountry.c1751njava.petadoption.Pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.nocountry.c1751njava.petadoption.Pet.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, String> {
}
