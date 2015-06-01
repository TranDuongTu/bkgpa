package com.tutran.model.common;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PKObject implements Serializable {
	private static final long serialVersionUID = 3208889350821143192L;

	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
