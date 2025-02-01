package com.phone.service;

import com.phone.common.BaseServiceInt;
import com.phone.dto.MobileDTO;

public interface MobileServiceInt extends BaseServiceInt<MobileDTO> {
	
public void sale(MobileDTO dto);

}
