package com.example.demo.jinx.Login;

import com.example.demo.jinx.general.BaseEntity;

public interface LoginService {

	public Page<Void> checkUserName(String userName);
	public Page<Void> login(BaseEntity entity);
}
