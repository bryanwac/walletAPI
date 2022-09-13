package com.wallet.response;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Response<T> {

	private T data;
	private ArrayList<String> errors;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
		
	
}
