package com.phone.common;

import java.util.List;

import com.phone.dto.MobileDTO;

public interface BaseDAOInt<T extends BaseDto> {

	public long add(T dto);

	public T findByUniqeKey(String attribute, String value);

	public List search(T dto, int pageNo, int pageSize);

	public T findByPk(long pk);
	
	public void delete(T dto);
	
	public void update(T dto);
}
