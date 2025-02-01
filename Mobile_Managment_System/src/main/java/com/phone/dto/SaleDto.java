package com.phone.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.phone.common.BaseDto;

@Entity
@Table(name = "OM_SALE")
public class SaleDto extends BaseDto {

	@Column(name = "FIRST_NAME", length = 50)
	private String firstName;

	@Column(name = "LAST_NAME", length = 50)
	private String lastName;

	@Column(name = "ADDRESS", length = 50)
	private String address;

	@Column(name = "DATE", length = 50)
	private String date;

	@Column(name = "SALE_AMMOUNT", length = 50)
	private String saleAmmount;

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

	@Column(name = "BRAND_ID")
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

	public String getSaleAmmount() {
		return saleAmmount;
	}

	public void setSaleAmmount(String saleAmmount) {
		this.saleAmmount = saleAmmount;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
}
