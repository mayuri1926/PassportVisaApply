package com.capg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.Model.Users;





@Repository
public interface UserRepo extends JpaRepository<Users , String>{

}
