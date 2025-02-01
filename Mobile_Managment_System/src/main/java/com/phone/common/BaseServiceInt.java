package com.phone.common;

import java.util.List;

import com.phone.dto.MobileDTO;

public interface BaseServiceInt<T extends BaseDto> {

	public long add(T dto);

	public T authenticate(String loginId, String password);

	public List search(T dto, int pageNo, int pageSize);
	
	public T findById(long id);
	
	public void delete(long id);
	
	public void update(T dto);
}
