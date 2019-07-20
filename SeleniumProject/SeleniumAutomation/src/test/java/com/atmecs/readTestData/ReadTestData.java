package com.atmecs.readTestData;

import com.atmecs.ReadExel.ExelFileConfig;
import com.atmecs.ReadExel.FileLocations;


public class ReadTestData {
	public static void main(String[] args) {
		ExelFileConfig filelocation = new ExelFileConfig(FileLocations.filePath);
		String UserName = filelocation.getData("dataSheet", 1, 2);
		System.out.println(UserName);
	}

}
