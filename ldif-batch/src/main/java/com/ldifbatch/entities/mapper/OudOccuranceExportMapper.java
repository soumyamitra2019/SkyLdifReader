package com.ldifbatch.entities.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.ldifbatch.entities.OudAccountExport;
import com.ldifbatch.entities.Subscriber;
import com.ldifbatch.entities.Subscribers;

import lombok.Data;
import lombok.ToString;
@Data
@ToString
public class OudOccuranceExportMapper {
	List<OudAccountExport> accountsExports;
	
	public OudOccuranceExportMapper() {

	}

	public OudOccuranceExportMapper(List<HashMap<String,String>> maps) {
		OudAccountExport accountsExport;

//		accountsExports = new ArrayList<OudAccountExport>();
		setAccountsExports(new ArrayList<OudAccountExport>());
		
//		System.out.println(maps.get(0));
//		System.out.println(maps.get(1));
//		System.out.println("__________________________________");
		for(int i=0;i<maps.size();i++) {
			accountsExport = new OudAccountExport();
//		accountsExport.setDsSyncHist(maps.get(i).get("dsSyncHist"));
//		accountsExport.setEntryUUID(maps.get(i).get("entryUUID"));
//		accountsExport.setModifiersName(maps.get(i).get("modifiersName"));
//		accountsExport.setModifyTimestamp(maps.get(i).get("modifyTimestamp"));
//		accountsExport.setNzcoskyaccountnumber(maps.get(i).get("nzcoskyaccountnumber"));
//		accountsExport.setNzCoSkyCreateTime(maps.get(i).get("nzCoSkyCreateTime"));
//		accountsExport.setNzCoSkyDateOfBirth(maps.get(i).get("nzCoSkyDateOfBirth"));
//		accountsExport.setNzCoSkyLastModifyTime(maps.get(i).get("nzCoSkyLastModifyTime"));
//		accountsExport.setNzCoSkyOccurrences(maps.get(i).get("nzCoSkyOccurrences"));
//		accountsExport.setNzCoSkyStatus(maps.get(i).get("nzCoSkyStatus"));
//		accountsExport.setObjectClass(maps.get(i).get("objectClass"));
//		Subscribers subscribers = new Subscribers();
//		Subscriber subscriber = new Subscriber();
		accountsExport.setSubscribers(new Subscribers());
		accountsExport.getSubscribers().setSubscriber(new Subscriber());
		accountsExport.getSubscribers().getSubscriber().setAccountNumber(maps.get(i).get("nzcoskyaccountnumber"));
		accountsExport.getSubscribers().getSubscriber().setAccountStatus(maps.get(i).get("nzCoSkyStatus"));
		accountsExport.getSubscribers().getSubscriber().setBillType(maps.get(i).get("nzCoSkyBillType"));
		accountsExport.getSubscribers().getSubscriber().setCustomerCategory(maps.get(i).get("nzCoSkyCustomerCategory"));
		accountsExport.getSubscribers().getSubscriber().setCustomerType(maps.get(i).get("nzCoSkyCustomerType"));
		accountsExport.getSubscribers().getSubscriber().setDob(maps.get(i).get("nzCoSkyDateOfBirth"));
		accountsExport.getSubscribers().getSubscriber().setHouseNumbe("124428270200001nzCoSkyHouseNumber");
	//	accountsExport.getSubscribers().setTransactionDateTime(maps.get(i).get(key));
	//	accountsExport.getSubscribers().setTransactionNumber(transactionNumber);
//		System.out.println();
//		System.out.println();
//		System.out.println();
		//System.out.println(maps.get(i).get("nzcoskyaccountnumber").get));
		//System.out.println(maps.get(i).get("dsSyncHist").get(0));
		getAccountsExports().add(accountsExport);
		//accountsExports.add(i, accountsExport);
		System.out.println(getAccountsExports());
		//accountsExports.add(accountsExport);
		}
	}

}
