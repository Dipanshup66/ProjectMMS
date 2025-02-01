package com.phone.form;

import com.phone.common.BaseDto;
import com.phone.common.BaseForm;
import com.phone.dto.MobileDTO;

public class MobileForm extends BaseForm {

	private String firstName;

	private String lastName;

	private String loginId;

	private String password;

	private String mobileName;

	private String mobileColour;

	private String mobileVariant;

	private String paymentType;

	private String purchaseDate;

	private String bookingPlatform;

	private String ammount;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

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
		return dto;
	}

}
