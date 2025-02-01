package com.phone.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.phone.dto.MobileDTO;

public class BaseServiceImpl<T extends BaseDto, D extends BaseDAOInt<T>> implements BaseServiceInt<T> {

	@Autowired
	public D basedao;

	@Transactional(propagation = Propagation.REQUIRED)
	public long add(MobileDTO dto) {
		long pk = basedao.add(dto);
		return pk;
	}

}
