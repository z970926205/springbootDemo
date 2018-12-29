package com.example.demo.jinx.personal;

import com.example.demo.jinx.general.BaseEntity;

public interface PersonalService {

	public Page<Void> updatePersonal(BaseEntity entity);
	public Page<Void> checkUserName(String userName);
}
