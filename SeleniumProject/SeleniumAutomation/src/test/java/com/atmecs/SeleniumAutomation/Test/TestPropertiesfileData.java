package com.atmecs.SeleniumAutomation.Test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atmecs.readTestData.ReadPropertiesfile;

public class TestPropertiesfileData extends  ReadPropertiesfile {


@Test
	public void getTestData() throws IOException {
	
		 String name = getData("userName");
		 System.out.println(name);
		
	}


}

