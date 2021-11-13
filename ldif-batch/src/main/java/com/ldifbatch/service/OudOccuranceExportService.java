package com.ldifbatch.service;

import java.util.List;

import com.ldifbatch.entities.occurance.Occurances;

public interface OudOccuranceExportService {
	List<Occurances> getDataFromFile();
}
