package tech.nocountry.c1751njava.petadoption.User.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.nocountry.c1751njava.petadoption.Pet.Model.Pet;
import tech.nocountry.c1751njava.petadoption.User.Role;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String id;

    private String username;

    private String email;

    private String firstName;

    private String lastName;

    private Role role;

    private String location;

    private Boolean isBanned;
    @JsonIgnore
    private List<Pet> pets;
}
