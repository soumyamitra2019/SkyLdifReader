package com.ldifbatch.entities.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ldifbatch.entities.occurance.NickNames;
import com.ldifbatch.entities.occurance.Occurance;
import com.ldifbatch.entities.occurance.Occurances;
import com.ldifbatch.entities.occurance.SubOccurance;

import lombok.Data;
import lombok.ToString;
@Data
@ToString
public class OudOccuranceExportMapper {
	List<Occurances> occurancess;
	
	public OudOccuranceExportMapper() {

	}

	public OudOccuranceExportMapper(List<HashMap<String,String>> maps) {
		Occurances occurances;
		occurances = new Occurances();
		setOccurancess(new ArrayList<Occurances>());
		//Occurance occurance;
//		System.out.println(maps.get(0));
//		System.out.println(maps.get(1));
//		System.out.println("__________________________________");
		for(int i=0;i<maps.size();i++) {
		//Occurance occurance = new Occurance();
		occurances.setOccurance(new Occurance());
		occurances.getOccurance().setAccountNumber(maps.get(i).get("nzcoskyaccountnumber"));
		occurances.getOccurance().setNickNames(new NickNames());
		occurances.getOccurance().setOccurance(new ArrayList<SubOccurance>());
		occurances.setInfo("Need to configure mapping");
		//getOccurances().add(occurances);
		//occurancess.add(i, occurances);
		//occurancess.add(occurances);
		getOccurancess().add(occurances);
		System.out.println(getOccurancess());
		//occurancess.add(occurances);
		}
	}

}
