package com.phone.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.phone.common.BaseServiceImpl;
import com.phone.dao.MobileDAOImpl;
import com.phone.dto.MobileDTO;

@Service
@Transactional
public class MobileServiceImpl extends BaseServiceImpl<MobileDTO, MobileDAOImpl> implements MobileServiceInt {

	@Transactional(readOnly = true)
	public MobileDTO authenticate(String loginId, String password) {
		MobileDTO dto = basedao.findByUniqeKey("loginId", loginId);
		if (dto != null) {
			if (dto.getPassword().equals(password)) {

				return dto;
			}

		}
		return null;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void sale(MobileDTO dto) {
		basedao.delete(dto);
	}



}
