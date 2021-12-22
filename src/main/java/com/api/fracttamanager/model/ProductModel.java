package com.api.fracttamanager.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "products")
@Getter
@Setter
public class ProductModel {
    @Id
    private String id;
    private String name;
    private String type;
    private String unit;
    private Float quantity;
    private String category;
    private Integer minLevel;
    private Float purchasePrice;
    private Float salePrice;
    private String creationDate;
    private String expirationDate;

}
