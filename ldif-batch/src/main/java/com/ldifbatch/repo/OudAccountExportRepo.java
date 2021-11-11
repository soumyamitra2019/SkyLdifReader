package com.ldifbatch.repo;

import java.util.HashMap;
import java.util.List;

public interface OudAccountExportRepo {/*
										 * List<HashMap<String, String>> getDataFromFile(String filename);
										 */
	/*
	 * List<HashMap<String, String>> getDataFromFile(LdifReaderBuilder
	 * readerBuilder);
	 */
	List<HashMap<String, String>> getDataFromFile();
}
