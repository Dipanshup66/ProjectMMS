
package com.phone.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.phone.dto.MobileDTO;

public class BaseCtl<F extends BaseForm, T extends BaseDto, S extends BaseServiceInt<T>> {

	@Autowired
	public S baseService;

	@PostMapping("save")
	public OMMSResponse save(@RequestBody F form) {

		OMMSResponse res = new OMMSResponse();
		MobileDTO dto = (MobileDTO) form.getDto();
		baseService.add(dto);
		res.addData(dto.getId());
		res.addMassage("DATAB ADDEDD>>> SUCCESSFULLY>>>>>?>>>>!!!!!!");

		return res;
	}

}
