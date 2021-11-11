package com.ldifbatch.entities;

import org.springframework.ldap.odm.annotations.Entry;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entry(objectClasses = {},base = "ou=Accounts")
public class OudAccountExport {
	
//	@Attribute(name = "objectClass")
//	private String objectClass;//not req
//	
//	@Attribute(name = "nzCoSkyLastModifyTime")
//	private String nzCoSkyLastModifyTime;//req timestamp
//	@Attribute(name = "nzCoSkyDateOfBirth")
//	private String nzCoSkyDateOfBirth;//req timestamp
//	@Attribute(name = "nzCoSkyCreateTime")
//	private String nzCoSkyCreateTime;//req timestamp
//	@Attribute(name = "nzCoSkyStatus")
//	private String nzCoSkyStatus;//req String
//	@Attribute(name = "nzcoskyaccountnumber")
//	private String nzCoSkyCustomerCategory;//req String
//	@Attribute(name = "nzCoSkyCustomerType")
//	private String nzCoSkyCustomerType;//req String
//	@JsonProperty("Subscriber.Subscriber.AccountNumber")
//	@Attribute(name = "nzcoskyaccountnumber")
//	private String nzcoskyaccountnumber;//req String
//	@Attribute(name = "nzCoSkyOccurrences")
//	private String nzCoSkyOccurrences;//not req
//	@Attribute(name = "ds-sync-hist")
//	private String dsSyncHist;//not req
//	@Attribute(name = "entryUUID")
//	private String entryUUID;//not req
//	@Attribute(name = "modifyTimestamp")
//	private String modifyTimestamp;//req timestamp
//	@Attribute(name = "modifiersName")
//	private String modifiersName;//not req
	@JsonProperty("Subscriber")
	private Subscribers subscribers;
}
