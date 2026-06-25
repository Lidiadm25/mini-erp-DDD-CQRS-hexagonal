package com.Lidiadm25.mini_erp.domain.customer;
/*
    Inmutable

    Value object  for JSON placeholder API
*/
public record CustomerInfo (
    Long id,
    String name,
    String email,
    String phone,
    String adress,
    String city,
    String zipcode,
    String companyName
){

    public CustomerInfo{
        if(id == null) {
            throw new IllegalArgumentException("Id is not present");
        }
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name is not present");
        }
    }

}
