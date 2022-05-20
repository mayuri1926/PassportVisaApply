package com.capg.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.Model.Visa;



@Repository
public interface VisaRepo extends JpaRepository<Visa,String> {

	@Query(value="select a from Visa a where a.passportNo=:passportNo")
	List<Visa> findByPassportNo(@Param("passportNo") String passportNo);}
