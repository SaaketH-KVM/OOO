package com.Saaketh.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Saaketh.fleetapp.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
