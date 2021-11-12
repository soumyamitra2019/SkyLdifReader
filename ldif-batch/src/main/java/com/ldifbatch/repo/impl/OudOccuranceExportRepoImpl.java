package com.ldifbatch.repo.impl;

import static com.ldifbatch.constants.Constants.toReadAtATime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.naming.directory.Attribute;

import org.springframework.batch.item.ldif.LdifReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ldap.core.LdapAttributes;
import org.springframework.stereotype.Repository;

import com.ldifbatch.repo.OudAccountExportRepo;
import com.ldifbatch.repo.OudOccuranceExportRepo;

@Repository
public class OudOccuranceExportRepoImpl implements OudOccuranceExportRepo {
	//@Autowired
	//ApplicationContext context;
	/*
	 * @Autowired LdapAttributes attributes;
//	 */
//	@Autowired
//	LdifReaderBuilder readerBuilder;
//	@Autowired
	LdifReader ldifReader;
	@Autowired
	public OudOccuranceExportRepoImpl(@Qualifier("Occurance")LdifReader ldifReader) {
		super();
		this.ldifReader = ldifReader;
	}

	@Override
	public List<HashMap<String, String>> getDataFromFile() {
		// LdifReaderBuilder readerBuilder = new LdifReaderBuilder();
//		readerBuilder.resource(context.getResource(filename));
//		readerBuilder.saveState(false);
		//LdifReader ldifReader = readerBuilder.build();
		//ldifReader.open(new ExecutionContext());
		// List<LdapAttributes> ldapAttributes = new ArrayList<>();
		List<HashMap<String, String>> maps = new ArrayList<>();
		try {
			LdapAttributes attributes = ldifReader.read();
			int i = 1;
			while (attributes != null && i <= toReadAtATime) {
				HashMap<String, String> map = new HashMap<>();
				i++;
				Iterator<Attribute> iterator = attributes.getAll().asIterator();
				while (iterator.hasNext()) {
					Attribute attribute = iterator.next();
					String value = attribute.get().toString();
					String key = attribute.getID().toString();
					map.put(key, value);
				}
				maps.add(map); 
				if(i==toReadAtATime)
					break;
				attributes = ldifReader.read();
			}
			System.out.println(maps);
			return maps;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
