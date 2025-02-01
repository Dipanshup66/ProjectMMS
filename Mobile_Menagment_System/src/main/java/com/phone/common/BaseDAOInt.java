package com.phone.common;

import com.phone.dto.MobileDTO;

public interface BaseDAOInt<T extends BaseDto> {

	public long add(MobileDTO dto);

	public MobileDTO findByUniqeKey(String attribute, String value);
}
