package com.ldifbatch.entities.occurance;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SubOccurance {
	@JsonProperty("SerialNumber")
	private String serialNumber;
	@JsonProperty("OccuranceType")
	private String occuranceType;
	@JsonProperty("OccNumber")
	private String occNumber;
	@JsonProperty("ItemNumber")
	private String itemNumber;
	@JsonProperty("PortType")
	private String portType;
	@JsonProperty("Product[]")
	private ArrayList<Product> products;
	
}
