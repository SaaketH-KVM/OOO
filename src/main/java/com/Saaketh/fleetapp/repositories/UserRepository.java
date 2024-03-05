package com.Saaketh.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Saaketh.fleetapp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
