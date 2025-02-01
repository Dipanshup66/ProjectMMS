package com.phone.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.phone.common.BaseDto;

@Entity
@Table(name = "OM_BRAND")
public class BrandDto extends BaseDto {

	@Column(name = "NAME", length = 50)
	private String name;

	@Column(name = "DESCRIPTION", length = 50)
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
	public String getValue() {

		return name;
	}

}
