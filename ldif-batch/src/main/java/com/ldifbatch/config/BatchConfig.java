package com.ldifbatch.config;

import static com.ldifbatch.constants.Constants.ldifFileAccount;
import static com.ldifbatch.constants.Constants.ldifFileOccurance;
import static com.ldifbatch.constants.Constants.ldifFileUser;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ldif.LdifReader;
import org.springframework.batch.item.ldif.builder.LdifReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
public class BatchConfig {
	@Autowired
	ApplicationContext resource;
	@Bean
	LdifReaderBuilder ldifReaderBuilder() {
		return new LdifReaderBuilder();
	}
	@Bean(name = "Account")
	LdifReader ldifReaderAccount(LdifReaderBuilder builder) {
		//Resource r = new FileSystemResource("");
		builder.resource(resource.getResource(ldifFileAccount));
		//builder.saveState(false);
		builder.name("Account");
		LdifReader ldifReader =  builder.build();
		ldifReader.open(new ExecutionContext());
		return ldifReader;
	}
	@Primary
	@Bean(name = "Occurance")
	LdifReader ldifReaderOccurance(LdifReaderBuilder builder) {
		System.out.println("hihihihihihihih");
		//Resource r = new FileSystemResource("");
		builder.resource(resource.getResource(ldifFileOccurance));
		//builder.saveState(false);
		builder.name("Account");
		LdifReader ldifReader =  builder.build();
		ldifReader.open(new ExecutionContext());
		return ldifReader;
	}
	@Bean(name = "Users")
	LdifReader ldifReaderUsers(LdifReaderBuilder builder) {
		System.out.println("hihihihihihihih");
		//Resource r = new FileSystemResource("");
		builder.resource(resource.getResource(ldifFileUser));
		//builder.saveState(false);
		builder.name("Account");
		LdifReader ldifReader =  builder.build();
		ldifReader.open(new ExecutionContext());
		return ldifReader;
	}
}
