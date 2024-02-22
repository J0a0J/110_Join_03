package com.feb.test.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feb.test.dao.MemberDao;
import com.feb.test.util.Sha512Encoder;

@Service
public class MemberService {

	@Autowired
	private MemberDao memberDao;
	
	public int join(HashMap<String, String> params) {
		
		String pwd = params.get("passwd");
		String rePwd = params.get("repeatPasswd");
		
//		우선, 비밀번호와 확인 비밀번호가 일치하는지 확인. 
		if(!pwd.equals(rePwd)) {
			return -1;
		}
//		일치한다면 비밀번호를 암호화한다. 
		Sha512Encoder encoder = Sha512Encoder.getInstance();
		String passwd = params.get("passwd");
		String encodeTxt = encoder.getSecurePassword(passwd);
		params.put("passwd", encodeTxt);
		
		return memberDao.join(params);
	}

}
