package com.phone.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.phone.common.BaseServiceImpl;
import com.phone.dao.BrandDAOInt;
import com.phone.dto.BrandDto;

@Service
@Transactional
public class BrandServiceImpl extends BaseServiceImpl<BrandDto, BrandDAOInt> implements BrandServiceInt {

	@Transactional(propagation = Propagation.REQUIRED)
	public BrandDto authenticate(String loginId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
