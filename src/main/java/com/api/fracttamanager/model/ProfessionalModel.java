package com.api.fracttamanager.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "professionals")
@Getter
@Setter
public class ProfessionalModel {
    @Id
    private String id;
    private String name;
    private String CPF;
    private String phone;
    private String email;
    private Address address;
    private Float commission;
    private String level;
    private String serviceType;

    @Getter
    @Setter
    public class Address {
        private String zipcode;
        private String number;
        private String city;
        private String street;
        private String district;
        private String state;
        private String complement;
    }
}
