package com.phone.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.phone.common.BaseServiceImpl;
import com.phone.dao.SaleDAOInt;
import com.phone.dto.SaleDto;

@Service
@Transactional
public class SaleServiceImpl extends BaseServiceImpl<SaleDto, SaleDAOInt> implements SaleServiceInt{

	@Transactional(propagation = Propagation.REQUIRED)
	public SaleDto authenticate(String loginId, String password) {
		return null;
	}

	

}
