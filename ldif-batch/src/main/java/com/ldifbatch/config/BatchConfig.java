package com.ldifbatch.config;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ldif.LdifReader;
import org.springframework.batch.item.ldif.builder.LdifReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static com.ldifbatch.constants.Constants.ldifFilePath;
@Configuration
public class BatchConfig {
	@Autowired
	ApplicationContext resource;
	@Bean
	LdifReaderBuilder ldifReaderBuilder() {
		return new LdifReaderBuilder();
	}
	@Bean
	LdifReader ldifReader(LdifReaderBuilder builder) {
		builder.resource(resource.getResource(ldifFilePath));
		//builder.saveState(false);
		builder.name("Account");
		LdifReader ldifReader =  builder.build();
		ldifReader.open(new ExecutionContext());
		return ldifReader;
	}
}
