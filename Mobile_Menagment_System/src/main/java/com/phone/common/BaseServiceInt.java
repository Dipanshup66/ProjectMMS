package com.phone.common;

import com.phone.dto.MobileDTO;

public interface BaseServiceInt<T extends BaseDto> {
	
	public long add(MobileDTO dto);
	
	

}
