package com.sapient.league.model;

import java.util.List;

public class ResponseDetails<T> {

	private boolean status;

	private List<T> data;

	private List<T> errors;

	public ResponseDetails(boolean status, List<T> data, List<T> errors) {
		this.status = status;
		this.data = data;
		this.errors = errors;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public List<T> getErrors() {
		return errors;
	}

	public void setErrors(List<T> errors) {
		this.errors = errors;
	}

}
