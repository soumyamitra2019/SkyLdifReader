package com.ldifbatch.service.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SequenceWriter;
import com.ldifbatch.entities.mapper.OudOccuranceExportMapper;
import com.ldifbatch.entities.occurance.Occurances;
//import com.ldifbatch.repo.oudOccuranceExportRepo;
import com.ldifbatch.repo.OudOccuranceExportRepo;
import com.ldifbatch.service.OudOccuranceExportService;
@Service
public class OudOccuranceExportServiceImpl implements OudOccuranceExportService {
	@Autowired
	OudOccuranceExportRepo oudOccuranceExportRepo;
	@Override
	public List<Occurances> getDataFromFile() {
		// TODO Auto-generated method stub
		List<Occurances> accountExports = new ArrayList<Occurances>();
		OudOccuranceExportMapper occuranceExportMapper = new OudOccuranceExportMapper(oudOccuranceExportRepo.getDataFromFile());
		accountExports = occuranceExportMapper.getOccurancess();
		//System.out.println(accountExportMapper.getAccountsExports().get(1));
		
		try {
			File file = new File("C:\\Users\\ve00ym279\\Desktop\\oudOccurancesExport.json");
			FileWriter fileWriter = new FileWriter(file,true);
			ObjectMapper objectMapper = new ObjectMapper();
			SequenceWriter seqWriter = objectMapper.writer().writeValues(fileWriter);
			seqWriter.write(occuranceExportMapper.getOccurancess());
//			
//			objectMapper.writeValue(file,//new File("C:\\Users\\ve00ym279\\Desktop\\oudAccountExport.json"),
//					accountExportMapper.getAccountsExports());
//			
//			objectMapper.updateValue(new File("C:\\Users\\ve00ym279\\Desktop\\oudAccountExport.json"), accountExportMapper.getAccountsExports());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("----------");
		//System.out.println(accountExports);
//		System.out.println("----------");
		return accountExports;
	}

}
