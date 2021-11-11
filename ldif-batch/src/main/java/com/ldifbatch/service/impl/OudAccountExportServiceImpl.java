package com.ldifbatch.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ldifbatch.entities.OudAccountExport;
import com.ldifbatch.entities.mapper.OudAccountExportMapper;
import com.ldifbatch.repo.OudAccountExportRepo;
import com.ldifbatch.service.OudAccountExportService;
@Service
public class OudAccountExportServiceImpl implements OudAccountExportService {
	@Autowired
	OudAccountExportRepo oudAccountExportRepo;
	@Override
	public List<OudAccountExport> getDataFromFile() {
		// TODO Auto-generated method stub
		List<OudAccountExport> accountExports = new ArrayList<OudAccountExport>();
		OudAccountExportMapper accountExportMapper = new OudAccountExportMapper(oudAccountExportRepo.getDataFromFile());
		accountExports = accountExportMapper.getAccountsExports();
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			objectMapper.writeValue(new File("C:\\Users\\ve00ym279\\Desktop\\oudAccountExport.json"),
					accountExportMapper.getAccountsExports());
//			objectMapper.updateValue(new File("C:\\Users\\ve00ym279\\Desktop\\oudAccountExport.json"), accountExportMapper.getAccountsExports());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------");
		System.out.println(accountExports);
		System.out.println("----------");
		return accountExports;
	}

}
