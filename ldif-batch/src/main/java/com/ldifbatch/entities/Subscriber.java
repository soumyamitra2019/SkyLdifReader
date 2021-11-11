package com.ldifbatch.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Subscriber {
	@JsonProperty("BillType")
	String billType;
	@JsonProperty("AccountNumber")
	String accountNumber;
	@JsonProperty("CustomerCategory")
	String customerCategory;
	@JsonProperty("CustomerType")
	String customerType;
	@JsonProperty("DOB")
	String dob;
	@JsonProperty("HouseNumbe")
	String houseNumbe;
	@JsonProperty("AccountStatus")
	String accountStatus;
}
