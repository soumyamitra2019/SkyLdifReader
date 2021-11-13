package com.ldifbatch.entities.occurance;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

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
@JsonRootName("Occurances")
public class Occurances {
	@JsonProperty("Infomation : <Alert>")
	private String info;
	@JsonProperty("Occurances")
	private Occurance occurance;
}
