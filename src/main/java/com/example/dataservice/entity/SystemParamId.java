package com.example.dataservice.entity;

import java.io.Serializable;
import java.util.Objects;

public class SystemParamId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4720734260421179224L;

	private String paramKey;
	private String paramGroup;

	public SystemParamId() {};
	public SystemParamId(String paramKey, String paramGroup) {
		this.paramKey = paramKey;
		this.paramGroup = paramGroup;
	}

	public String getParamKey() {
		return paramKey;
	}

	public void setParamKey(String paramKey) {
		this.paramKey = paramKey;
	}

	public String getParamGroup() {
		return paramGroup;
	}

	public void setParamGroup(String paramGroup) {
		this.paramGroup = paramGroup;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		SystemParamId that = (SystemParamId) o;
		return Objects.equals(paramKey, that.paramKey) && Objects.equals(paramGroup, that.paramGroup);
	}

	@Override
	public int hashCode() {
		return Objects.hash(paramKey, paramGroup);
	}

}
