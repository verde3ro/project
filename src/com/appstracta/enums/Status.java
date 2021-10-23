package com.appstracta.enums;

public enum Status {
	PENDING("Pendiente"),
	ACTIVE("Activo"),
	INACTIVE("Inactivo"),
	DELETED("Borrado");

	private String value;

	Status(String value) {
		this.value = value;
	}

	private String getValue() {
		return this.value;
	}

}
