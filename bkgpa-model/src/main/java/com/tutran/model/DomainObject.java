package com.tutran.model;

import javax.persistence.EmbeddedId;

import org.hibernate.annotations.Entity;

import com.tutran.model.common.PKObject;

@Entity
public abstract class DomainObject {
    private PKObject pk;

    @EmbeddedId
	public PKObject getPk() {
		return pk;
	}

	public void setPk(PKObject pk) {
		this.pk = pk;
	}
}