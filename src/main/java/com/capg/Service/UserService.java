package com.capg.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Model.Users;
import com.capg.Repository.UserRepo;




@Service
public class UserService {
	
	@Autowired
	 UserRepo userrepo;
	
	public Users user(Users userRegObj)
	{
		return userrepo.save(userRegObj);
	}
	


}
