package com.phone.ctl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phone.common.BaseCtl;
import com.phone.common.OMMSResponse;
import com.phone.dto.SaleDto;
import com.phone.form.SaleForm;
import com.phone.service.MobileServiceInt;
import com.phone.service.SaleServiceInt;

@RestController
@RequestMapping(value = "Sale")
public class SaleCtl extends BaseCtl<SaleForm, SaleDto, SaleServiceInt> {

	@Autowired
	public MobileServiceInt mobileService;

	@Autowired
	public SaleServiceInt saleService;

	@PostMapping("add")
	public OMMSResponse add(@RequestBody @Valid SaleForm form, BindingResult bindingResult) {
		OMMSResponse res = new OMMSResponse();

		SaleDto dto = (SaleDto) form.getDto();
		Long deleteId = form.getId();
		System.out.println("SaleCtl = >" + dto.getMobileName());
		saleService.add(dto);
		res.addData(dto.getId());

		mobileService.delete(deleteId);
		res.addMassage(" product sale........");
		return res;

	}

}
