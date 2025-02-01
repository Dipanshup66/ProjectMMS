package com.phone.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phone.common.BaseCtl;
import com.phone.common.DropDownList;
import com.phone.common.OMMSResponse;
import com.phone.dto.BrandDto;
import com.phone.form.BrandForm;
import com.phone.service.BrandServiceInt;

@RestController
@RequestMapping(value = "brand")
public class BrandCtl extends BaseCtl<BrandForm, BrandDto, BrandServiceInt> {

	@Autowired
	public BrandServiceInt branservice;

	@GetMapping("preload")
	public OMMSResponse preload() {
		OMMSResponse res = new OMMSResponse();
		BrandDto dto = new BrandDto();
		List<DropDownList> brandList = branservice.search(dto, 0, 0);
		res.addResult("brandList", brandList);
		return res;

	}

}
