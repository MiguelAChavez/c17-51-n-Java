package tech.nocountry.c1751njava.petadoption.Pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.nocountry.c1751njava.petadoption.Pet.Pet;
import tech.nocountry.c1751njava.petadoption.Pet.repository.PetRepository;
import tech.nocountry.c1751njava.petadoption.Pet.repository.dao.IPetDao;
import tech.nocountry.c1751njava.petadoption.Pet.service.DTO.PetDTO;
import tech.nocountry.c1751njava.petadoption.Pet.service.DTO.mapper.PetToPetDTO;
import tech.nocountry.c1751njava.petadoption.Pet.service.interfaces.IPetService;

import java.util.List;
import java.util.Optional;

@Service
public class PetService implements IPetService {
    @Autowired
    private IPetDao petDao;
    private PetToPetDTO mapper;


    @Override
    public String savePet(PetDTO petDto) {
        final Pet pet =Pet.builder()
                .user(petDto.getUser())
                .description(petDto.getDescription())
                .age(petDto.getAge())
                .ubication(petDto.getUbication())
                .isState(petDto.isState())
                .request(petDto.getRequest())
                .build();
        return petDao.savePet(pet).getId();
    }

    @Override
    public void deletePet(String id) {
        petDao.deletePet(id);
    }

    @Override
    public Optional<PetDTO> findPetById(String id) {
        return petDao.findPetById(id).map(PetService::)
    }

    @Override
    public List<PetDTO> findAllPets() {
        return null;
    }
}
