package com.phone.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.phone.common.BaseDto;
import com.phone.common.BaseForm;
import com.phone.dto.MobileDTO;

public class MobileForm extends BaseForm {

	@NotEmpty(message = "mobileName is required")
	private String mobileName;

	@NotEmpty(message = "mobileColour is required")
	private String mobileColour;

	@NotEmpty(message = "mobileVariant is required")
	private String mobileVariant;

	@NotEmpty(message = "paymentType is required")
	private String paymentType;

	@NotEmpty(message = "purchaseDate is required")
	private String purchaseDate;

	@NotEmpty(message = "bookingPlatform is required")
	private String bookingPlatform;

	@NotEmpty(message = "ammount is required")
	private String ammount;

	@NotEmpty(message = "imeiNuber is required")
	public String imeiNumber;

	public Long brandId;

	private String brandName;

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getImeiNumber() {
		return imeiNumber;
	}

	public void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getMobileColour() {
		return mobileColour;
	}

	public void setMobileColour(String mobileColour) {
		this.mobileColour = mobileColour;
	}

	public String getMobileVariant() {
		return mobileVariant;
	}

	public void setMobileVariant(String mobileVariant) {
		this.mobileVariant = mobileVariant;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getBookingPlatform() {
		return bookingPlatform;
	}

	public void setBookingPlatform(String bookingPlatform) {
		this.bookingPlatform = bookingPlatform;
	}

	public String getAmmount() {
		return ammount;
	}

	public void setAmmount(String ammount) {
		this.ammount = ammount;
	}

	@Override
	public BaseDto getDto() {
		MobileDTO dto = initDTO(new MobileDTO());
		dto.setMobileName(mobileName);
		dto.setMobileColour(mobileColour);
		dto.setMobileVariant(mobileVariant);
		dto.setPaymentType(paymentType);
		dto.setPurchaseDate(purchaseDate);
		dto.setBookingPlatform(bookingPlatform);
		dto.setAmmount(ammount);
		dto.setImeiNumber(imeiNumber);
		dto.setBrandId(brandId);
		dto.setBrandName(brandName);
		return dto;
	}

}
