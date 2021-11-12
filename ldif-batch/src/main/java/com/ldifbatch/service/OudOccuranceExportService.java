package com.ldifbatch.service;

import java.util.List;

import com.ldifbatch.entities.OudAccountExport;

public interface OudOccuranceExportService {
	List<OudAccountExport> getDataFromFile();
}
