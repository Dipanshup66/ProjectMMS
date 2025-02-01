package com.phone.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.phone.dto.MobileDTO;

public abstract class BaseServiceImpl<T extends BaseDto, D extends BaseDAOInt<T>> implements BaseServiceInt<T> {

	@Autowired
	public D basedao;

	@Transactional(propagation = Propagation.REQUIRED)
	public long add(T dto) {

			long pk = basedao.add(dto);
			return pk;

	}

	@Transactional(readOnly = true)
	public List search(T dto, int pageNo, int pageSize) {
		List list = basedao.search(dto, pageNo, pageSize);
		return list;
	}

	@Transactional(readOnly = true)
	public T findById(long id) {
		T dto = basedao.findByPk(id);
		return dto;
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(long id) {
		T dto = findById(id);
		basedao.delete(dto);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(T dto) {
		basedao.update(dto);
	}
	

	
}
