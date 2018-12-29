package com.example.demo.jinx.springSecurity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class SSecurityService implements UserDetailsService{
	@Autowired
	private SSecurityMapper sSecurityMapper;

	@Override
	public UserDetails loadUserByUsername(String username) {

		SSecurityUser user = sSecurityMapper.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("The user name does not exist");
		}
		return user;
	}
}
