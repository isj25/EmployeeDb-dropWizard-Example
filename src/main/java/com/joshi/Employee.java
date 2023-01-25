package com.joshi;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class Employee {
    @NotNull
    private Integer id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String country;

    public Employee() {
    }

    public Employee(Integer id, String firstName, String lastName, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    @Override
    public String toString(){
        return "Employee : " + this.getFirstName()+" "+ this.getLastName() + "from "+ this.getCountry();
    }
}
