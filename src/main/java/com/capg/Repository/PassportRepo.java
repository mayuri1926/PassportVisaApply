package com.capg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.capg.Model.Passport_Fee;


@Repository
public interface PassportRepo extends JpaRepository<Passport_Fee,Integer> {

}
