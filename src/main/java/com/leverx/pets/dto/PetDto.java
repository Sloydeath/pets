package com.leverx.pets.dto;

import com.leverx.pets.annotations.ValidName;
import com.leverx.pets.model.Person;
import com.leverx.pets.model.pet.enums.PetType;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Valid
@Data
public class PetDto {
    private Long id;
    @ValidName
    private String name;
    @NotNull
    private PetType petType;
    private Person person;
}
