package com.phone.form;

import com.phone.common.BaseDto;
import com.phone.common.BaseForm;
import com.phone.dto.BrandDto;

public class BrandForm extends BaseForm {

	private String name;

	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public BaseDto getDto() {
		BrandDto dto = initDTO(new BrandDto());
		dto.setName(name);
		dto.setDescription(description);
		return dto;
	}
}
