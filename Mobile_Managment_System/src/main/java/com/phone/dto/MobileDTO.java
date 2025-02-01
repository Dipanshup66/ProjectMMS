package com.phone.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.phone.common.BaseDto;

@Entity
@Table(name = "OM_MOBILE")
public class MobileDTO extends BaseDto {

	@Column(name = "FIRST_NAME", length = 50)
	private String firstName;

	@Column(name = "LAST_NAME", length = 50)
	private String lastName;

	@Column(name = "LOGIN_ID", length = 50)
	private String loginId;

	@Column(name = "PASSWORD", length = 50)
	private String password;

	@Column(name = "MOBILE_NAME", length = 50)
	private String mobileName;

	@Column(name = "MOBILE_COLOUR", length = 50)
	private String mobileColour;

	@Column(name = "MOBILE_VARIANT", length = 50)
	private String mobileVariant;

	@Column(name = "PAYMENT_TYPE", length = 50)
	private String paymentType;

	@Column(name = "PURCHASE_DATE", length = 50)
	private String purchaseDate;

	@Column(name = "BOOKING_PLATFORM", length = 50)
	private String bookingPlatform;

	@Column(name = "AMMOUNT", length = 50)
	private String ammount;

	@Column(name = "IMEI_NUMBER", length = 50)
	public String imeiNumber;

	@Column(name = "BRAND_ID", length = 50)
	public Long brandId;

	@Column(name = "BRAND_NAME", length = 50)
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

	@Override
	public String getValue() {
		return brandName;
	}

}
