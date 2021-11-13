package com.ldifbatch.constants;

public class Constants {
	
	/*
	 * Don't change the readConstraint (for applied logic)
	*/
	public static final Integer readConstraint = 1;
	
	/*
	 * How many data to read at a time....
	 */
	public static final Integer toReadAtATime =readConstraint+1;
	
	/*
	 * File Path Information
	 */
	public static final String ldifFilePath = "classpath:";
	public static final String ldifFileAccount = ldifFilePath+"oudAccountsExport.ldif";
	public static final String ldifFileOccurance = ldifFilePath+"oudOccurrencesExport141021.ldif";
	public static final String ldifFileUser = ldifFilePath+"oudUsersExport141021.ldif";
}
