package com.phone.ctl;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phone.common.BaseCtl;
import com.phone.common.OMMSResponse;
import com.phone.dto.BrandDto;
import com.phone.dto.MobileDTO;
import com.phone.form.LoginForm;
import com.phone.form.MobileForm;
import com.phone.service.BrandServiceInt;
import com.phone.service.MobileServiceInt;

@RestController
@RequestMapping(value = "Mobile")
public class MobileCtl extends BaseCtl<MobileForm, MobileDTO, MobileServiceInt> {

	public MobileServiceInt mobileservice;

	@Autowired
	BrandServiceInt brandService;
	
	@GetMapping("logout")
	public OMMSResponse lougot(HttpSession session) {
		OMMSResponse res = new OMMSResponse();
		session.invalidate();
		res.addMassage("logout successfull");
		return res;
		
	}

	@PostMapping("saveMobile")
	public OMMSResponse save(@RequestBody @Valid MobileForm form, BindingResult bindingResult) {

		OMMSResponse res = validate(bindingResult);
		if (!res.success) {
			return res;
		}

		System.out.println("brandd id>> " + form.getBrandId());
		System.out.println("brand name>> " + form.getBrandName());
		long brandId = form.getBrandId();
		String brandName = null;
		BrandDto brandDTO = brandService.findById(brandId);
		brandName = brandDTO.getName();

		MobileDTO dto = (MobileDTO) form.getDto();
		dto.setBrandId(brandId);
		dto.setBrandName(brandName);

		if (dto.getId() != null && dto.getId() > 0) {

			baseService.update(dto);
			res.addMassage("DATA UPDATED SUCCESSFULLY.....>>>>>>>>!!!!");
		} else {

			baseService.add(dto);
			res.addData(dto.getId());
			res.addMassage("DATAB ADDEDD>>> SUCCESSFULLY>>>>>?>>>>!!!!!!");
		}
		return res;
	}

	@PostMapping("login")
	public OMMSResponse authenticate(@RequestBody @Valid LoginForm form, BindingResult bindingResult, HttpSession session) {

		OMMSResponse res = validate(bindingResult);

		if (!res.isSuccess()) {
			return res;
		}

		MobileDTO dto = baseService.authenticate(form.getLoginId(), form.getPassword());

		if (dto != null) {
//			session.setAttribute("user", dto.getFirstName());
			res.addData(dto);
		} else {
			res.setSuccess(false);
			res.addMassage("LoginId & Password is Invalid");
		}
		return res;

	}

}
