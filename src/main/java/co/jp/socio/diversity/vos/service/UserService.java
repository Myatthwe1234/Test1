package co.jp.socio.diversity.vos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.jp.socio.diversity.vos.repository.UserRepository;

@Service
public class UserService{
	
	@Autowired
    UserRepository userRepo;

	
	

}
