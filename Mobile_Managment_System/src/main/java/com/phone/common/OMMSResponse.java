package com.phone.common;

import java.util.HashMap;
import java.util.Map;

public class OMMSResponse  {

	public static final String INPUT_ERROR = "inputerror";
	public static final String MASSAGE = "massage";
	public static final String DATA = "data";

	public boolean success = false;

	private Map<String, Object> result = new HashMap<String, Object>();

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	public void addInputError(Object value) {
		result.put(INPUT_ERROR, value);
	}

	public void addMassage(Object value) {
		result.put(MASSAGE, value);
	}

	public void addData(Object value) {
		result.put(DATA, value);
	}

	public void addResult(String key, Object value) {
		result.put(key, value);
	}

}
