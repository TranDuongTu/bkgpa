package com.tutran.model.common;

import javax.persistence.Embeddable;

@Embeddable
public class CodeObject extends PKObject {
	private static final long serialVersionUID = 9194304210993403879L;
	
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
