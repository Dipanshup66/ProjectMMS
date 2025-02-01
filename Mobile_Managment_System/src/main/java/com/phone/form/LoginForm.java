package com.phone.form;

import javax.validation.constraints.NotEmpty;

import com.phone.common.BaseDto;
import com.phone.common.BaseForm;
import com.phone.dto.MobileDTO;

public class LoginForm extends BaseForm {

	@NotEmpty(message = "loginId is Required")
	private String loginId;

	@NotEmpty(message = "password is Required")
	private String password;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public BaseDto getDto() {
		MobileDTO dto = initDTO(new MobileDTO());
		dto.setLoginId(loginId);
		dto.setPassword(password);
		return dto;
	}

}
