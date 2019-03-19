package com.offerapi.domain;

public class PublicEnum {

	public enum StatusType {
		ACTIVE("Active"), CANCELLED("Cancelled");

		private String description;

		StatusType (String desc) {
			this.description = desc;
		}

		public String getDescription() {
			return this.description;
		}
	}
}
