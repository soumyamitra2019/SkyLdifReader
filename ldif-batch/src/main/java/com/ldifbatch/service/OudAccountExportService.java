package com.ldifbatch.service;

import java.util.List;

import com.ldifbatch.entities.OudAccountExport;

public interface OudAccountExportService {
	List<OudAccountExport> getDataFromFile();
}
