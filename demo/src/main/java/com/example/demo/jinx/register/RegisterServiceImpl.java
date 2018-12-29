package com.example.demo.jinx.register;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.jinx.Login.LoginEntity;
import com.example.demo.jinx.general.BaseEntity;
import com.example.demo.jinx.general.BaseMapper;
import com.example.demo.jinx.general.Utils;

@Service
public class RegisterServiceImpl implements RegisterService {
	private static final Log logger = LogFactory.getLog(RegisterServiceImpl.class);
	@Autowired
	private RegisterMapper registerMapper;
	@Autowired
	private BaseMapper baseMapper;

	@Override
	public Page<Void> register(RegisterEntity entity) {
		logger.info("entity:" + entity.toString());
		Page<Void> page;
		try {
			entity.setPassword(Utils.stringMD5(entity.getPassword()));
			if(registerMapper.insertUser(entity)==1){
				page = new Page<Void>(0, "注册成功");
			}else{
				page = new Page<Void>(1, "注册失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			page = new Page<Void>(2, "系统异常");
		}
		return page;
	}
	
	@Override
	public Page<Void> checkUserName(String userName) {
		logger.info("userName:" + userName);
		Page<Void> page;
		BaseEntity user; 
		RegisterEntity returnEntity;
		try {
			if (!Utils.checkStrings(userName)) {
				page = new Page<Void>(2, "用户名输入有误");
			} else {
				user = new BaseEntity();
				user.setUserName(userName);
				returnEntity = Utils.wrap(baseMapper.getUser(user), RegisterEntity.class);
				if (returnEntity == null) {
					page = new Page<Void>(0, "用户名可用");
				} else {
					page = new Page<Void>(1, "用户名已存在");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			page = new Page<Void>(3, "系统异常");
		}
		return page;
	}

}
