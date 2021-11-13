package com.ldifbatch.entities.occurance;

import java.util.List;

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
public class Occurance {
	@JsonProperty("AccountNumber")
	private String accountNumber;
	@JsonProperty("Occurance[]")
	private List<SubOccurance> occurance;
	@JsonProperty("NickNames")
	private NickNames nickNames;
}
