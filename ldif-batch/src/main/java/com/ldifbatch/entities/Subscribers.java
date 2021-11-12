package com.ldifbatch.entities;

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
@JsonRootName("Subscriber")
public class Subscribers {
	@JsonProperty("Subscriber")
	Subscriber subscriber;
	@JsonProperty("TransactionDateTime")
	String transactionDateTime;
	@JsonProperty("TransactionNo")
	String transactionNumber;
}
